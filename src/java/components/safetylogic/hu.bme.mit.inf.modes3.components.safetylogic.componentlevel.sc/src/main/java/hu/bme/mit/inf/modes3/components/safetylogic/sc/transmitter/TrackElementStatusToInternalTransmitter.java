package hu.bme.mit.inf.modes3.components.safetylogic.sc.transmitter;

import java.util.Map;
import java.util.TreeMap;

import org.yakindu.scr.section.ISectionStatemachine;
import org.yakindu.scr.turnout.ITurnoutStatemachine;

import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentOccupancy;
import hu.bme.mit.inf.modes3.messaging.communication.enums.TurnoutState;
import hu.bme.mit.inf.modes3.messaging.communication.state.interfaces.ISegmentOccupancyChangeListener;
import hu.bme.mit.inf.modes3.messaging.communication.state.interfaces.ITrackElementStateRegistry;
import hu.bme.mit.inf.modes3.messaging.communication.state.interfaces.ITurnoutStateChangeListener;

public class TrackElementStatusToInternalTransmitter implements ISegmentOccupancyChangeListener, ITurnoutStateChangeListener {

	protected final Map<Integer, ISectionStatemachine> localSections = new TreeMap<>();
	protected final Map<Integer, ITurnoutStatemachine> localTurnouts = new TreeMap<>();

	public TrackElementStatusToInternalTransmitter(ITrackElementStateRegistry stateProvider) {
		stateProvider.setSegmentOccupancyChangeListener(this);
		stateProvider.setTurnoutStateChangeListener(this);
	}

	public void registerSectionStatemachine(int id, ISectionStatemachine statemachine) {
		localSections.put(id, statemachine);
	}

	public void registerTurnoutStatemachine(int id, ITurnoutStatemachine statemachine) {
		localTurnouts.put(id, statemachine);
	}

	@Override
	public void onTurnoutStateChange(int id, TurnoutState oldValue, TurnoutState newValue) {
		if (localTurnouts.containsKey(id)) {
			ITurnoutStatemachine sm = localTurnouts.get(id);
			switch (newValue) {
			case STRAIGHT:
				sm.getSCITurnout().raiseTurnoutStraight();
				break;
			case DIVERGENT:
				sm.getSCITurnout().raiseTurnoutDivergent();
				break;
			}
		}
	}

	@Override
	public void onSegmentOccupancyChange(int id, SegmentOccupancy oldValue, SegmentOccupancy newValue) {
		if (localTurnouts.containsKey(id)) {
			ITurnoutStatemachine sm = localTurnouts.get(id);
			switch (newValue) {
			case FREE:
				sm.getSCITrain().raiseUnoccupy();
				break;
			case OCCUPIED:
				sm.getSCITrain().raiseOccupy();
				break;
			}
		} else if (localSections.containsKey(id)) {
			ISectionStatemachine sm = localSections.get(id);
			switch (newValue) {
			case FREE:
				sm.getSCITrain().raiseUnoccupy();
				break;
			case OCCUPIED:
				sm.getSCITrain().raiseOccupy();
				break;
			}
		}
	}

}
