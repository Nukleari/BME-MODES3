package hu.bme.mit.inf.modes3.components.trackelementstatus

import hu.bme.mit.inf.modes3.components.common.AbstractRailRoadCommunicationComponent
import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentOccupancy
import hu.bme.mit.inf.modes3.messaging.communication.enums.TurnoutState
import hu.bme.mit.inf.modes3.messaging.communication.factory.CommunicationStack
import hu.bme.mit.inf.modes3.messaging.communication.state.interfaces.ISegmentOccupancyChangeListener
import hu.bme.mit.inf.modes3.messaging.communication.state.interfaces.ITurnoutStateChangeListener
import java.util.Map
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import org.slf4j.ILoggerFactory

class TrackSupervisor extends AbstractRailRoadCommunicationComponent implements ISegmentOccupancyChangeListener, ITurnoutStateChangeListener {

	var ConcurrentMap<Integer, SegmentOccupancy> segmentOccupancyStatuses
	var ConcurrentMap<Integer, TurnoutState> turnoutStatuses

	val StatusReporter segmentStatusReporter
	val StatusReporter turnoutStatusReporter

	new(CommunicationStack railwayTrackStack, CommunicationStack segmentStatusStack,
		CommunicationStack turnoutStatusStack, ILoggerFactory factory) {
		super(railwayTrackStack, factory)
		super.locator.trackElementStateRegistry.segmentOccupancyChangeListener = this
		super.locator.trackElementStateRegistry.turnoutStateChangeListener = this

		this.segmentStatusReporter = new StatusReporter(segmentStatusStack, factory)
		this.turnoutStatusReporter = new StatusReporter(turnoutStatusStack, factory)

		this.segmentOccupancyStatuses = new ConcurrentHashMap<Integer, SegmentOccupancy>
		this.turnoutStatuses = new ConcurrentHashMap<Integer, TurnoutState>
	}

	override onSegmentOccupancyChange(int id, SegmentOccupancy oldValue, SegmentOccupancy newValue) {
		putStatusInMapAndSendMessage(id, newValue, segmentOccupancyStatuses, segmentStatusReporter)
	}

	override onTurnoutStateChange(int id, TurnoutState oldValue, TurnoutState newValue) {
		putStatusInMapAndSendMessage(id, newValue, turnoutStatuses, turnoutStatusReporter)
	}

	private def <T> putStatusInMapAndSendMessage(int id, T status, Map<Integer, T> map, StatusReporter statusReporter) {
		map.put(id, status)
		statusReporter.sendStatusMessage(id, status.toString.toLowerCase)
	}

	override run() {
		Thread.currentThread.join
	}

}
