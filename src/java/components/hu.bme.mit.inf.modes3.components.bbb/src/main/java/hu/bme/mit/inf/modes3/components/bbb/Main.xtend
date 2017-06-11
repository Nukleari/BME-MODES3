package hu.bme.mit.inf.modes3.components.bbb

import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentDescriptorWithParameter
import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentRegistry
import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentState
import hu.bme.mit.inf.modes3.messaging.communication.factory.CommunicationStackFactory
import java.util.ArrayList
import org.slf4j.impl.SimpleLoggerFactory
import hu.bme.mit.inf.modes3.messaging.communication.enums.TurnoutState

class Main {


	def static void main(String[] args) {
		val loggerFactory = new SimpleLoggerFactory
		val logger = loggerFactory.getLogger(Main.name)

		val registry = new ArgumentRegistry(loggerFactory)
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("config", "The ID of the component", String))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("address", "The ID of the component", String))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("id", "The ID of the component", String))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("pubPort", "The ID of the component", Integer))
		registry.registerArgumentWithOptions(
			new ArgumentDescriptorWithParameter("repPort", "The ID of the component", Integer))

		registry.parseArguments(args);

		val communicationStack = CommunicationStackFactory::createMQTTStack(registry, loggerFactory)
		val list = new ArrayList<BBBComponent>();
		

		for (var int i = 1; i < 7; i++) {
			list.add(new BBBComponent(i, communicationStack, loggerFactory))
		}

		Thread.sleep(2000)
		
		list.get(1).onTurnoutCommand(0, TurnoutState.DIVERGENT)
		
		FileHelper.fileReader(list)
		
		
		
		
		
		// set all segment to disabled
		/*for (BBBComponent bb : list) {
			for (int segmentID : bb.segmentControllers.keySet) {
				bb.onSegmentCommand(segmentID, SegmentState.DISABLED);
				print(segmentID)
			}
		}
		
		*/
		/*
		Thread.sleep(2000);

		// set all segment to enabled
		for (BBBComponent bb : list) {
			for (int segmentID : bb.segmentControllers.keySet) {
				bb.onSegmentCommand(segmentID, SegmentState.ENABLED);
				Thread.sleep(100);
			}
		}

		Thread.sleep(1000);
		*/

//		// set all segment to disabled
//		for (BBBComponent bb : list) {
//			for (int segmentID : bb.segmentControllers.keySet) {
//				bb.onSegmentCommand(segmentID, SegmentState.DISABLED);
//				Thread.sleep(100);
//			}
//		} 
	}

}
