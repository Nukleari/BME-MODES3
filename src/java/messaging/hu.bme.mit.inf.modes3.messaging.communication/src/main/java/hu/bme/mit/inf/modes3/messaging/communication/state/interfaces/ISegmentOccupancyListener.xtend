package hu.bme.mit.inf.modes3.messaging.communication.state.interfaces

import hu.bme.mit.inf.modes3.messaging.messages.enums.SegmentOccupancy

interface ISegmentOccupancyListener {
	def void onSegmentOccupancy(int id, SegmentOccupancy state);
}
