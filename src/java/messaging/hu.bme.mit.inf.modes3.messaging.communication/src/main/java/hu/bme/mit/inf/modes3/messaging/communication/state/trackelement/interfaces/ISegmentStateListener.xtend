package hu.bme.mit.inf.modes3.messaging.communication.state.trackelement.interfaces

import hu.bme.mit.inf.modes3.messaging.messages.enums.SegmentState

interface ISegmentStateListener {
	def void onSegmentState(int id, SegmentState state)
}
