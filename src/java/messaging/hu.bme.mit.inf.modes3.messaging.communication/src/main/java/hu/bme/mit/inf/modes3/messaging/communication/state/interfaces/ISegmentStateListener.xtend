package hu.bme.mit.inf.modes3.messaging.communication.state.interfaces

import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentState

interface ISegmentStateListener {
	def void onSegmentState(int id, SegmentState state);
}
