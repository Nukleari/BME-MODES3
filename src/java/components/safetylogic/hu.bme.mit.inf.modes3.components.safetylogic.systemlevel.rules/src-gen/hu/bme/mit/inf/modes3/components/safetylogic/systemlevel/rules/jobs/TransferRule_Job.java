package hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.rules.jobs;

import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.rules.message.EasterEggMessageSender;
import org.eclipse.viatra.cep.core.api.patterns.IObservableComplexEventPattern;
import org.eclipse.viatra.cep.core.api.rules.CepJob;
import org.eclipse.viatra.transformation.evm.api.Activation;
import org.eclipse.viatra.transformation.evm.api.Context;
import org.eclipse.viatra.transformation.evm.api.event.ActivationState;

@SuppressWarnings("all")
public class TransferRule_Job extends CepJob<IObservableComplexEventPattern> {
  public TransferRule_Job(final ActivationState activationState) {
    super(activationState);
  }
  
  @Override
  public void execute(final Activation<? extends IObservableComplexEventPattern> ruleInstance, final Context context) {
    System.out.println("TRANSFER ON STATION!");
    EasterEggMessageSender.INSTANCE.sendMessage("TRANSFER ON STATION!");
  }
  
  @Override
  public void handleError(final Activation<? extends IObservableComplexEventPattern> ruleInstance, final Exception exception, final Context context) {
    //not gonna happen
  }
}
