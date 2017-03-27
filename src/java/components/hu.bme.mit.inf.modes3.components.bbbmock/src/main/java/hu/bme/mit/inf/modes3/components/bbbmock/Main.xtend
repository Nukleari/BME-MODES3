package hu.bme.mit.inf.modes3.components.bbbmock


import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentDescriptorWithParameter
import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentRegistry
import hu.bme.mit.inf.modes3.messaging.communication.factory.CommunicationStackFactory
import java.net.InetAddress
import org.slf4j.impl.SimpleLoggerFactory
import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentState

class Main {

	def static void main(String[] args) {
		val loggerFactory = new SimpleLoggerFactory
		val logger = loggerFactory.getLogger(Main.name)

		val registry = new ArgumentRegistry(loggerFactory)
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("config", "The ID of the component", String))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("address", "The ID of the component", String))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("id", "The ID of the component", String))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("pubPort", "The ID of the component", Integer))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("repPort", "The ID of the component", Integer))

		registry.parseArguments(args);

//		val hostname = InetAddress.getLocalHost().getHostName();
//		logger.info("Hostname: " + hostname);
//		val turnoutID = Integer.valueOf(hostname.replace('t', ''));

		val communicationStack = CommunicationStackFactory::createMQTTStack(registry, loggerFactory)
		
		val bbb = new BBBComponent(1, communicationStack, loggerFactory)
		
		new Thread( new Runnable() {
			
			override run() {
				
				var state = SegmentState.DISABLED;
				
				while( true ) {
					bbb.onSegmentCommand(12, state);
					if( state == SegmentState.DISABLED )  {
						state = SegmentState.ENABLED;
					} else 	if( state == SegmentState.ENABLED )  {
						state = SegmentState.DISABLED;
					}
					
					Thread.sleep(500);								
				}
			}
			
		}).start();
		bbb.run // run on main thread
	}

}
