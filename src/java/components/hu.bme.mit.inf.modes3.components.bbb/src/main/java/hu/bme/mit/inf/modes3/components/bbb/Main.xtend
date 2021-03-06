package hu.bme.mit.inf.modes3.components.bbb

import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentDescriptorWithParameter
import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentRegistry
import hu.bme.mit.inf.modes3.messaging.communication.factory.CommunicationStackFactory
import java.net.InetAddress
import org.slf4j.impl.SimpleLoggerFactory

class Main {

	def static void main(String[] args) {
		val loggerFactory = new SimpleLoggerFactory
		val logger = loggerFactory.getLogger(Main.name)

		val registry = new ArgumentRegistry(loggerFactory)
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("config", "The configuration used", String))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("id", "The ID of the component", String))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("address", "The address of the transport server", String))
		registry.registerArgumentWithOptions(new ArgumentDescriptorWithParameter("port", "The oprt used by the transport server", Integer))

		registry.parseArguments(args);

		val hostname = InetAddress.getLocalHost().getHostName();
		logger.info("Hostname: " + hostname);
		val turnoutID = Integer.valueOf(hostname.split("\\.").get(0).replace('t', ''));

		val communicationStack = CommunicationStackFactory::createMQTTStack(registry, loggerFactory)
		
		val bbb = new BBBComponent(turnoutID, communicationStack, loggerFactory)
		bbb.run // run on main thread
	}

}
