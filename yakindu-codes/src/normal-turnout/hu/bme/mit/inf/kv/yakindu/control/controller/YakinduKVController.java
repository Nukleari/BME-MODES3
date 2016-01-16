package hu.bme.mit.inf.kv.yakindu.control.controller;

import hu.bme.mit.inf.kv.yakindu.control.sm.ITraceableStatemachine;
import hu.bme.mit.inf.kv.yakindu.control.sm.Section;
import hu.bme.mit.inf.kv.yakindu.control.sm.TraceableStatemachine;
import hu.bme.mit.inf.kv.yakindu.control.trace.StatemachineTraceMonitor;
import hu.bme.mit.inf.kv.yakindu.control.transmitter.CommunicationServer;
import hu.bme.mit.inf.kv.yakindu.control.transmitter.DistributedMessageTransmitter;
import hu.bme.mit.inf.kv.yakindu.control.transmitter.GeneralTransmitter;
import hu.bme.mit.inf.kv.yakindu.control.transmitter.SmEventDispatcher;

import java.util.HashSet;
import java.util.Set;

import hu.bme.mit.inf.kvcontrol.bpextension.requests.enums.Direction;

/**
 *
 * @author benedekh
 */
public class YakinduKVController implements IYakinduKVController {

    private static final int RUNCYCLE_INITIAL_ITERATION_LOOPS = 3;
    private static final int RUNCYCLE_ITERATION_LOOPS = 20;

    private static boolean TRACE_LOG_ENABLED = false;

    private final ITraceableStatemachine statemachine;
    private final Set<Section> managedSections;

    private final GeneralTransmitter generalTransmitter;
    private final DistributedMessageTransmitter distributedTransmitter;
    private final CommunicationServer communicationServer;
    private final SmEventDispatcher eventDispatcher;

    private StatemachineTraceMonitor traceMonitor;

    public static void setTraceLogEnabled(boolean traceLogEnabled) {
        TRACE_LOG_ENABLED = traceLogEnabled;
    }

    @Override
    public void remSectionLock(Direction direction) {
        Thread event = new Thread();
        switch (direction) {
            case TOP:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCITurnout().raiseRemSectionLockFromTop();
                    }
                };
                break;
            case DIVERGENT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCITurnout().raiseRemSectionLockFromDivergent();
                    }
                };
                break;
            case STRAIGHT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCITurnout().raiseRemSectionLockFromStraight();
                    }
                };
                break;
        }
        eventDispatcher.addEvent(event);
    }

    @Override
    public void remShortSectionLock(Direction direction) {

    }

    @Override
    public void remPassageAllowed(Direction direction) {
        Thread event = new Thread();
        switch (direction) {
            case TOP:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseRemPassageAllowedFromTop();
                    }
                };
                break;
            case DIVERGENT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseRemPassageAllowedFromDivergent();
                    }
                };
                break;
            case STRAIGHT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseRemPassageAllowedFromStraight();
                    }
                };
                break;
        }
        eventDispatcher.addEvent(event);
    }

    @Override
    public void remPassageDenied(Direction direction) {
        Thread event = new Thread();
        switch (direction) {
            case TOP:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseRemPassageDeniedFromTop();
                    }
                };
                break;
            case DIVERGENT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseRemPassageDeniedFromDivergent();
                    }
                };
                break;
            case STRAIGHT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseRemPassageDeniedFromStraight();
                    }
                };
                break;
        }
        eventDispatcher.addEvent(event);
    }

    @Override
    public void revokeLock() {
        eventDispatcher.addEvent(new Thread() {
            @Override
            public void run() {
                statemachine.getSCISections().raiseRevokeLock();
            }
        });
    }

    @Override
    public void turnoutIsDivergent() {
        eventDispatcher.addEvent(new Thread() {
            @Override
            public void run() {
                statemachine.getSCITurnout().raiseTurnoutDivergent();
            }
        });
    }

    @Override
    public void turnoutIsStraight() {
        eventDispatcher.addEvent(new Thread() {
            @Override
            public void run() {
                statemachine.getSCITurnout().raiseTurnoutStraight();
            }
        });
    }

    @Override
    public void sectionIsFree(int sectionId) {
        Thread event = new Thread();
        Direction direction = getDirectionBySectionId(sectionId);
        switch (direction) {
            case TOP:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseTopFree();
                    }
                };
                break;
            case DIVERGENT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseDivergentFree();
                    }
                };
                break;
            case STRAIGHT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseStraightFree();
                    }
                };
                break;
        }
        eventDispatcher.addEvent(event);
    }

    @Override
    public void sectionIsOccupied(int sectionId) {
        Thread event = new Thread();
        Direction direction = getDirectionBySectionId(sectionId);
        switch (direction) {
            case TOP:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseTopOccupied();
                    }
                };
                break;
            case DIVERGENT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseDivergentOccupied();
                    }
                };
                break;
            case STRAIGHT:
                event = new Thread() {
                    @Override
                    public void run() {
                        statemachine.getSCISections().raiseStraightOccupied();
                    }
                };
                break;
        }
        eventDispatcher.addEvent(event);
    }

    @Override
    public void turnoutIsFree() {
        eventDispatcher.addEvent(new Thread() {
            @Override
            public void run() {
                statemachine.getSCITurnout().setIsOccupied(false);
            }
        });
    }

    @Override
    public void turnoutIsOccupied() {
        eventDispatcher.addEvent(new Thread() {
            @Override
            public void run() {
                statemachine.getSCITurnout().setIsOccupied(true);
            }
        });
    }

    @Override
    public void simulateStatemachine() {
        for (int i = 0; i < RUNCYCLE_ITERATION_LOOPS; ++i) {
            statemachine.runCycle();
            if (TRACE_LOG_ENABLED) {
                traceMonitor.updateActiveStates();
            }
        }
    }

    public YakinduKVController(TraceableStatemachine statemachine) {
        this.statemachine = statemachine;
        this.managedSections = new HashSet<>();

        int managedTurnoutId = (int) statemachine.getSCITurnout().getTurnoutId();
        int managedTurnoutSectionId = (int) statemachine.getSCITurnout().getTurnoutSectionId();

        initializeManagedSections();

        generalTransmitter = new GeneralTransmitter(managedTurnoutId,
                managedTurnoutSectionId, managedSections, this);
        distributedTransmitter = new DistributedMessageTransmitter(this);
        communicationServer = new CommunicationServer(managedTurnoutId,
                distributedTransmitter);
        eventDispatcher = new SmEventDispatcher(this);

        generalTransmitter.setName(GeneralTransmitter.class.getName());
        distributedTransmitter.setName(
                DistributedMessageTransmitter.class.getName());
        communicationServer.setName(CommunicationServer.class.getName());
        eventDispatcher.setName(SmEventDispatcher.class.getName());

        if (TRACE_LOG_ENABLED) {
            traceMonitor = new StatemachineTraceMonitor(statemachine);
        }
    }

    public void start() {
        statemachine.enter();
        for (int i = 0; i < RUNCYCLE_INITIAL_ITERATION_LOOPS; ++i) {
            statemachine.runCycle();
        }

        eventDispatcher.start();
        generalTransmitter.start();
        distributedTransmitter.start();
        communicationServer.start();
    }

    private void initializeManagedSections() {
        int topSectionId = (int) this.statemachine.getSCISectionTop().getSectionId();
        int divergentSectionId = (int) this.statemachine.getSCISectionDivergent().getSectionId();
        int straightSectionId = (int) this.statemachine.getSCISectionStraight().getSectionId();

        if (topSectionId > -1) {
            this.managedSections.add(new Section(Direction.TOP, topSectionId));
        }
        if (divergentSectionId > -1) {
            this.managedSections.add(new Section(Direction.DIVERGENT,
                    divergentSectionId));
        }
        if (straightSectionId > -1) {
            this.managedSections.add(new Section(Direction.STRAIGHT,
                    straightSectionId));
        }
    }

    private Direction getDirectionBySectionId(int sectionId) {
        for (Section section : managedSections) {
            if (section.getSectionId() == sectionId) {
                return section.getDirection();
            }
        }
        return null;
    }

}