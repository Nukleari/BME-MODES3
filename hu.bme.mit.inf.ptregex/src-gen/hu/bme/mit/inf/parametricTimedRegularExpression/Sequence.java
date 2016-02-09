/**
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.inf.parametricTimedRegularExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.parametricTimedRegularExpression.Sequence#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.parametricTimedRegularExpression.ParametricTimedRegularExpressionPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Expression
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.parametricTimedRegularExpression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see hu.bme.mit.inf.parametricTimedRegularExpression.ParametricTimedRegularExpressionPackage#getSequence_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElements();

} // Sequence
