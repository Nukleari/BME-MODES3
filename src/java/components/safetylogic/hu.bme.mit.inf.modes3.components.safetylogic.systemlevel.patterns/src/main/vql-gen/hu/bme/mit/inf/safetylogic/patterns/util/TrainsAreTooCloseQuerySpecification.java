/**
 * Generated from platform:/resource/hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.patterns/src/main/java/hu/bme/mit/inf/safetylogic/patterns/SafetyPatterns.vql
 */
package hu.bme.mit.inf.safetylogic.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.safetylogic.patterns.util.CurrentlyConnectedQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TrainsAreTooCloseMatcher in a type-safe way.
 * 
 * @see TrainsAreTooCloseMatcher
 * @see TrainsAreTooCloseMatch
 * 
 */
@SuppressWarnings("all")
final class TrainsAreTooCloseQuerySpecification extends BaseGeneratedEMFQuerySpecification<ViatraQueryMatcher<IPatternMatch>> {
  private TrainsAreTooCloseQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TrainsAreTooCloseQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ViatraQueryMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public ViatraQueryMatcher instantiate() throws ViatraQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newEmptyMatch() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newMatch(final Object... parameters) {
    throw new UnsupportedOperationException();
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TrainsAreTooCloseQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link TrainsAreTooCloseQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TrainsAreTooCloseQuerySpecification INSTANCE = new TrainsAreTooCloseQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TrainsAreTooCloseQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pOffender = new PParameter("Offender", "hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Train", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pVictim = new PParameter("Victim", "hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Train", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pOffender, parameter_pVictim);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.safetylogic.patterns.trainsAreTooClose";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Offender","Victim");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_Offender = body.getOrCreateVariableByName("Offender");
      		PVariable var_Victim = body.getOrCreateVariableByName("Victim");
      		PVariable var_OffenderPosition = body.getOrCreateVariableByName("OffenderPosition");
      		PVariable var_VictimPosition = body.getOrCreateVariableByName("VictimPosition");
      		new TypeConstraint(body, new FlatTuple(var_Offender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
      		new TypeConstraint(body, new FlatTuple(var_Victim), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_Offender, parameter_pOffender),
      		   new ExportedParameter(body, var_Victim, parameter_pVictim)
      		));
      		// 	Train.currentlyOn(Offender, OffenderPosition)
      		new TypeConstraint(body, new FlatTuple(var_Offender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_Offender, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train", "currentlyOn")));
      		new Equality(body, var__virtual_0_, var_OffenderPosition);
      		// 	Train.currentlyOn(Victim, VictimPosition)
      		new TypeConstraint(body, new FlatTuple(var_Victim), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_Victim, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.safetylogic.railroadmodel", "Train", "currentlyOn")));
      		new Equality(body, var__virtual_1_, var_VictimPosition);
      		// 	find currentlyConnected(VictimPosition, OffenderPosition)
      		new PositivePatternCall(body, new FlatTuple(var_VictimPosition, var_OffenderPosition), CurrentlyConnectedQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
