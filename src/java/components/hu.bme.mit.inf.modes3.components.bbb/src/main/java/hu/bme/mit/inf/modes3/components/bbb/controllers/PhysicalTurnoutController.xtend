package hu.bme.mit.inf.modes3.components.bbb.controllers

import hu.bme.mit.inf.modes3.components.bbb.config.ExpanderConfigInterpreter
import hu.bme.mit.inf.modes3.components.gpiomanager.Gpio
import hu.bme.mit.inf.modes3.components.gpiomanager.Gpio.InputStateListener
import hu.bme.mit.inf.modes3.components.gpiomanager.Gpio.Level
import hu.bme.mit.inf.modes3.components.gpiomanager.GpioManager
import hu.bme.mit.inf.modes3.components.gpiomanager.GpioNotConfiguratedException
import hu.bme.mit.inf.modes3.messaging.communication.enums.TurnoutState
import org.slf4j.ILoggerFactory
import org.slf4j.Logger

class PhysicalTurnoutController implements InputStateListener {
	
	public interface ITurnoutStateChangedListener {
		
		def void onStateChanged(TurnoutState newState);
	}

	/**
	 * for each turnout controller, we have to use four gpio pins:
	 * two for control the turnout itself, and other two to get info
	 * about the current state
	 */
//	Gpio straightControl;
//
//	Gpio divergentControl;
//
//	Gpio straightState;
//
//	Gpio divergentState;
//	
	PhysicalTurnoutController.ITurnoutStateChangedListener listener;

	private final static int TURNOUT_IMPULSE_WIDTH = 200;

	val Logger logger
	
	String expander

	TurnoutState state
	
	new(ExpanderConfigInterpreter pinout, String expander, ILoggerFactory factory) {
		this.expander = expander;
		logger = factory.getLogger(PhysicalTurnoutController.name);
//		val String[] pins = pinout.getHeaderPins(expander);
//		try {
//			straightControl = GpioManager.getGpio(pins.get(0), Gpio.Direction.OUT);
//			divergentControl = GpioManager.getGpio(pins.get(1), Gpio.Direction.OUT);
//
//			straightState = GpioManager.getGpio(pins.get(2), Gpio.Direction.IN);
//			divergentState = GpioManager.getGpio(pins.get(3), Gpio.Direction.IN);
//		} catch (GpioNotConfiguratedException ex) {
//			// TODO this exception should be handled correctly!
//			logger.debug("GPIO pin could not be setted!", ex);
//		}
		
		// there will be only one listener for both input, therefore we could handle the change
		// correctly
//		straightState.addInputStateListener(this);
//		divergentState.addInputStateListener(this);
	}
	
	def setTurnoutStateChangedListener(ITurnoutStateChangedListener listener) {
		this.listener = listener;
	}
	
	def getTurnoutState() {
		return state;
		
//		if( straightState.level == Level.HIGH ) {
//			
//			if( divergentState.level == Level.LOW ) {
//				// the turnout switch correctly to straight position, sending message
//				return TurnoutState.STRAIGHT;
//			} else {
//				// TODO what should we do, if both of the inputs are high??
//				return TurnoutState.ILLEGAL;
//			}
//			
//		} else {
//			
//			if( divergentState.level == Level.HIGH ) {
//				// the turnout switch correctly to divergent position, sending message
//				return TurnoutState.DIVERGENT;
//			} else {
//				// TODO what should we do, if both of the inputs are low??
//				return TurnoutState.ILLEGAL;
//			}
//		}
	}

	def setTurnoutState(TurnoutState state) {

		this.state = state;

	}
	
	override levelStateChanged(Level newLevel) {
		logger.info('''level state changed! expander: «expander»''');
		listener?.onStateChanged(turnoutState);
	}
	
}
