package hu.bme.mit.inf.modes3.messaging.communication.state.trackelement.interfaces

import hu.bme.mit.inf.modes3.messaging.messages.enums.SegmentOccupancy
import hu.bme.mit.inf.modes3.messaging.messages.enums.SegmentState
import hu.bme.mit.inf.modes3.messaging.messages.enums.TurnoutState

interface ITrackElementStateSender {
	def void sendSegmentOccupation(int id, SegmentOccupancy state)

	def void sendSegmentState(int id, SegmentState state)

	def void sendTurnoutState(int id, TurnoutState state)
}
