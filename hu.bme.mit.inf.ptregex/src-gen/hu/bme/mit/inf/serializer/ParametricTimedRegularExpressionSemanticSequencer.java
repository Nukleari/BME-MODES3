/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.inf.serializer;

import com.google.inject.Inject;
import hu.bme.mit.inf.parametricTimedRegularExpression.Alphabet;
import hu.bme.mit.inf.parametricTimedRegularExpression.And;
import hu.bme.mit.inf.parametricTimedRegularExpression.Any;
import hu.bme.mit.inf.parametricTimedRegularExpression.Cardinality;
import hu.bme.mit.inf.parametricTimedRegularExpression.Choice;
import hu.bme.mit.inf.parametricTimedRegularExpression.Event;
import hu.bme.mit.inf.parametricTimedRegularExpression.ExpressionDeclaration;
import hu.bme.mit.inf.parametricTimedRegularExpression.FixIntParameter;
import hu.bme.mit.inf.parametricTimedRegularExpression.FixStringParameter;
import hu.bme.mit.inf.parametricTimedRegularExpression.Functor;
import hu.bme.mit.inf.parametricTimedRegularExpression.Inverse;
import hu.bme.mit.inf.parametricTimedRegularExpression.ParametricTimedRegularExpressionPackage;
import hu.bme.mit.inf.parametricTimedRegularExpression.Plus;
import hu.bme.mit.inf.parametricTimedRegularExpression.RegexModel;
import hu.bme.mit.inf.parametricTimedRegularExpression.Sequence;
import hu.bme.mit.inf.parametricTimedRegularExpression.SingletonParameter;
import hu.bme.mit.inf.parametricTimedRegularExpression.Star;
import hu.bme.mit.inf.parametricTimedRegularExpression.TimedExpression;
import hu.bme.mit.inf.parametricTimedRegularExpression.Var;
import hu.bme.mit.inf.parametricTimedRegularExpression.VarParameter;
import hu.bme.mit.inf.services.ParametricTimedRegularExpressionGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ParametricTimedRegularExpressionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ParametricTimedRegularExpressionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ParametricTimedRegularExpressionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ParametricTimedRegularExpressionPackage.ALPHABET:
				sequence_Alphabet(context, (Alphabet) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.ANY:
				sequence_Any(context, (Any) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.CARDINALITY:
				sequence_MultExpression(context, (Cardinality) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.CHOICE:
				sequence_Choice(context, (Choice) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.EXPRESSION_DECLARATION:
				sequence_ExpressionDeclaration(context, (ExpressionDeclaration) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.FIX_INT_PARAMETER:
				sequence_FixIntParameter(context, (FixIntParameter) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.FIX_STRING_PARAMETER:
				sequence_FixStringParameter(context, (FixStringParameter) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.FUNCTOR:
				sequence_Functor(context, (Functor) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.INVERSE:
				sequence_Inverse(context, (Inverse) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.PLUS:
				sequence_MultExpression(context, (Plus) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.REGEX_MODEL:
				sequence_RegexModel(context, (RegexModel) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.SINGLETON_PARAMETER:
				sequence_SingletonParameter(context, (SingletonParameter) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.STAR:
				sequence_MultExpression(context, (Star) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.TIMED_EXPRESSION:
				sequence_TimedExpression(context, (TimedExpression) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			case ParametricTimedRegularExpressionPackage.VAR_PARAMETER:
				sequence_VarParameter(context, (VarParameter) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Alphabet returns Alphabet
	 *
	 * Constraint:
	 *     (functors+=Functor functors+=Functor*)?
	 */
	protected void sequence_Alphabet(ISerializationContext context, Alphabet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Choice returns And
	 *     Choice.Choice_1_0 returns And
	 *     Sequence returns And
	 *     Sequence.Sequence_1_0 returns And
	 *     MultExpression returns And
	 *     MultExpression.Star_1_0_0 returns And
	 *     MultExpression.Plus_1_1_0 returns And
	 *     MultExpression.Cardinality_1_2_0 returns And
	 *     ParenExpression returns And
	 *
	 * Constraint:
	 *     (elements+=And_And_1_0 elements+=Choice+)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Any
	 *     And returns Any
	 *     And.And_1_0 returns Any
	 *     Choice returns Any
	 *     Choice.Choice_1_0 returns Any
	 *     Sequence returns Any
	 *     Sequence.Sequence_1_0 returns Any
	 *     MultExpression returns Any
	 *     MultExpression.Star_1_0_0 returns Any
	 *     MultExpression.Plus_1_1_0 returns Any
	 *     MultExpression.Cardinality_1_2_0 returns Any
	 *     ParenExpression returns Any
	 *     Any returns Any
	 *
	 * Constraint:
	 *     {Any}
	 */
	protected void sequence_Any(ISerializationContext context, Any semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Choice
	 *     And returns Choice
	 *     And.And_1_0 returns Choice
	 *     Choice returns Choice
	 *     Choice.Choice_1_0 returns Choice
	 *     Sequence returns Choice
	 *     Sequence.Sequence_1_0 returns Choice
	 *     MultExpression returns Choice
	 *     MultExpression.Star_1_0_0 returns Choice
	 *     MultExpression.Plus_1_1_0 returns Choice
	 *     MultExpression.Cardinality_1_2_0 returns Choice
	 *     ParenExpression returns Choice
	 *
	 * Constraint:
	 *     (elements+=Choice_Choice_1_0 elements+=Sequence+)
	 */
	protected void sequence_Choice(ISerializationContext context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Event
	 *     And returns Event
	 *     And.And_1_0 returns Event
	 *     Choice returns Event
	 *     Choice.Choice_1_0 returns Event
	 *     Sequence returns Event
	 *     Sequence.Sequence_1_0 returns Event
	 *     MultExpression returns Event
	 *     MultExpression.Star_1_0_0 returns Event
	 *     MultExpression.Plus_1_1_0 returns Event
	 *     MultExpression.Cardinality_1_2_0 returns Event
	 *     ParenExpression returns Event
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (functor=[Functor|ID] (parameters+=Parameter parameters+=Parameter*)?)
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionDeclaration returns ExpressionDeclaration
	 *
	 * Constraint:
	 *     (name=ID (vars+=Var vars+=Var*)? body=Expression)
	 */
	protected void sequence_ExpressionDeclaration(ISerializationContext context, ExpressionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns FixIntParameter
	 *     FixParameter returns FixIntParameter
	 *     FixIntParameter returns FixIntParameter
	 *
	 * Constraint:
	 *     body=INT
	 */
	protected void sequence_FixIntParameter(ISerializationContext context, FixIntParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.FIX_INT_PARAMETER__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.FIX_INT_PARAMETER__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFixIntParameterAccess().getBodyINTTerminalRuleCall_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns FixStringParameter
	 *     FixParameter returns FixStringParameter
	 *     FixStringParameter returns FixStringParameter
	 *
	 * Constraint:
	 *     body=STRING
	 */
	protected void sequence_FixStringParameter(ISerializationContext context, FixStringParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.FIX_STRING_PARAMETER__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.FIX_STRING_PARAMETER__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFixStringParameterAccess().getBodySTRINGTerminalRuleCall_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Functor returns Functor
	 *
	 * Constraint:
	 *     (name=ID arity=INT?)
	 */
	protected void sequence_Functor(ISerializationContext context, Functor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Inverse
	 *     And returns Inverse
	 *     And.And_1_0 returns Inverse
	 *     Choice returns Inverse
	 *     Choice.Choice_1_0 returns Inverse
	 *     Sequence returns Inverse
	 *     Sequence.Sequence_1_0 returns Inverse
	 *     MultExpression returns Inverse
	 *     MultExpression.Star_1_0_0 returns Inverse
	 *     MultExpression.Plus_1_1_0 returns Inverse
	 *     MultExpression.Cardinality_1_2_0 returns Inverse
	 *     ParenExpression returns Inverse
	 *     Inverse returns Inverse
	 *
	 * Constraint:
	 *     (excludes+=Event excludes+=Event*)
	 */
	protected void sequence_Inverse(ISerializationContext context, Inverse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Cardinality
	 *     And returns Cardinality
	 *     And.And_1_0 returns Cardinality
	 *     Choice returns Cardinality
	 *     Choice.Choice_1_0 returns Cardinality
	 *     Sequence returns Cardinality
	 *     Sequence.Sequence_1_0 returns Cardinality
	 *     MultExpression returns Cardinality
	 *     MultExpression.Star_1_0_0 returns Cardinality
	 *     MultExpression.Plus_1_1_0 returns Cardinality
	 *     MultExpression.Cardinality_1_2_0 returns Cardinality
	 *     ParenExpression returns Cardinality
	 *
	 * Constraint:
	 *     (body=MultExpression_Cardinality_1_2_0 n=INT)
	 */
	protected void sequence_MultExpression(ISerializationContext context, Cardinality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.CARDINALITY__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.CARDINALITY__BODY));
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.CARDINALITY__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.CARDINALITY__N));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultExpressionAccess().getCardinalityBodyAction_1_2_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getMultExpressionAccess().getNINTTerminalRuleCall_1_2_2_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Plus
	 *     And returns Plus
	 *     And.And_1_0 returns Plus
	 *     Choice returns Plus
	 *     Choice.Choice_1_0 returns Plus
	 *     Sequence returns Plus
	 *     Sequence.Sequence_1_0 returns Plus
	 *     MultExpression returns Plus
	 *     MultExpression.Star_1_0_0 returns Plus
	 *     MultExpression.Plus_1_1_0 returns Plus
	 *     MultExpression.Cardinality_1_2_0 returns Plus
	 *     ParenExpression returns Plus
	 *
	 * Constraint:
	 *     body=MultExpression_Plus_1_1_0
	 */
	protected void sequence_MultExpression(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.PLUS__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.PLUS__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultExpressionAccess().getPlusBodyAction_1_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Star
	 *     And returns Star
	 *     And.And_1_0 returns Star
	 *     Choice returns Star
	 *     Choice.Choice_1_0 returns Star
	 *     Sequence returns Star
	 *     Sequence.Sequence_1_0 returns Star
	 *     MultExpression returns Star
	 *     MultExpression.Star_1_0_0 returns Star
	 *     MultExpression.Plus_1_1_0 returns Star
	 *     MultExpression.Cardinality_1_2_0 returns Star
	 *     ParenExpression returns Star
	 *
	 * Constraint:
	 *     body=MultExpression_Star_1_0_0
	 */
	protected void sequence_MultExpression(ISerializationContext context, Star semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.STAR__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.STAR__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultExpressionAccess().getStarBodyAction_1_0_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RegexModel returns RegexModel
	 *
	 * Constraint:
	 *     (alphabet=Alphabet? declarations+=ExpressionDeclaration+)
	 */
	protected void sequence_RegexModel(ISerializationContext context, RegexModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Sequence
	 *     And returns Sequence
	 *     And.And_1_0 returns Sequence
	 *     Choice returns Sequence
	 *     Choice.Choice_1_0 returns Sequence
	 *     Sequence returns Sequence
	 *     Sequence.Sequence_1_0 returns Sequence
	 *     MultExpression returns Sequence
	 *     MultExpression.Star_1_0_0 returns Sequence
	 *     MultExpression.Plus_1_1_0 returns Sequence
	 *     MultExpression.Cardinality_1_2_0 returns Sequence
	 *     ParenExpression returns Sequence
	 *
	 * Constraint:
	 *     (elements+=Sequence_Sequence_1_0 elements+=MultExpression+)
	 */
	protected void sequence_Sequence(ISerializationContext context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns SingletonParameter
	 *     SingletonParameter returns SingletonParameter
	 *
	 * Constraint:
	 *     {SingletonParameter}
	 */
	protected void sequence_SingletonParameter(ISerializationContext context, SingletonParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns TimedExpression
	 *     And returns TimedExpression
	 *     And.And_1_0 returns TimedExpression
	 *     Choice returns TimedExpression
	 *     Choice.Choice_1_0 returns TimedExpression
	 *     Sequence returns TimedExpression
	 *     Sequence.Sequence_1_0 returns TimedExpression
	 *     MultExpression returns TimedExpression
	 *     MultExpression.Star_1_0_0 returns TimedExpression
	 *     MultExpression.Plus_1_1_0 returns TimedExpression
	 *     MultExpression.Cardinality_1_2_0 returns TimedExpression
	 *     ParenExpression returns TimedExpression
	 *     TimedExpression returns TimedExpression
	 *
	 * Constraint:
	 *     (body=Expression timeout=INT)
	 */
	protected void sequence_TimedExpression(ISerializationContext context, TimedExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.TIMED_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.TIMED_EXPRESSION__BODY));
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.TIMED_EXPRESSION__TIMEOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.TIMED_EXPRESSION__TIMEOUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimedExpressionAccess().getBodyExpressionParserRuleCall_1_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getTimedExpressionAccess().getTimeoutINTTerminalRuleCall_4_0(), semanticObject.getTimeout());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns VarParameter
	 *     VarParameter returns VarParameter
	 *
	 * Constraint:
	 *     var=[Var|ID]
	 */
	protected void sequence_VarParameter(ISerializationContext context, VarParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.VAR_PARAMETER__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.VAR_PARAMETER__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarParameterAccess().getVarVarIDTerminalRuleCall_0_1(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ParametricTimedRegularExpressionPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParametricTimedRegularExpressionPackage.Literals.VAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
