package hu.bme.mit.inf.modes3.test

import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Segment
import hu.bme.mit.inf.modes3.messaging.communication.factory.CommunicationStackFactory
import hu.bme.mit.inf.safetylogic.event.ModelUtil
import hu.bme.mit.inf.safetylogic.event.SafetyLogic
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.slf4j.helpers.NOPLoggerFactory
import org.slf4j.impl.SimpleLoggerFactory
import org.junit.Ignore

// FIXME: reimplement this test with the new transport

class IntegrationTest {
//	var SafetyLogic sl
//	var Thread slThread
//
//	var ModelUtil model
//	var Thread physicalThread
//	var Thread arduinoThread
//	var Thread bbbThread
//	
//
//	@Before def void before() {
//		
//		System.setProperty(org.slf4j.impl.SimpleLogger.LOG_FILE_KEY, "System.out")
//		sl = new SafetyLogic(CommunicationStackFactory::createLocalStack, new SimpleLoggerFactory())
//		slThread = new Thread(sl)
//
//		model = new ModelUtil(new NOPLoggerFactory)
//		physicalThread = new Thread(new PhysicalEnvironmentOrchestrator(model.model))
//		arduinoThread = new Thread(new SegmentOccupancyReaderMock(CommunicationStackFactory::createLocalStack, model.model, new SimpleLoggerFactory))
//		bbbThread = new Thread(new BBBModelComponent(CommunicationStackFactory::createLocalStack, model.model, new SimpleLoggerFactory))
//		model.model.sections.filter[it instanceof Segment].map[it as Segment].forEach[isEnabled = true]
//	}
//
//	@Ignore
//	@Test def void integrationTest() {
//		synchronized(model) {
//			Assert.assertEquals(true, (model.model.sections.findFirst[id == 24] as Segment).isEnabled)
//			Assert.assertEquals(true, (model.model.sections.findFirst[id == 29] as Segment).isEnabled)
//		}
//		slThread.start
//		bbbThread.start
//		physicalThread.start
//		arduinoThread.start
//
//		Thread.sleep(3000)
//	
//		synchronized(model) {
//			Assert.assertEquals(false, (model.model.sections.findFirst[id == 24] as Segment).isEnabled)
//			Assert.assertEquals(false, (model.model.sections.findFirst[id == 29] as Segment).isEnabled)
//		}
//	}
}
