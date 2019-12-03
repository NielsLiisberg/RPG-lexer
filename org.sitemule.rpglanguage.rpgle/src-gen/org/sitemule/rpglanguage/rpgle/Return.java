/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Return#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Stmt
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.sitemule.rpglanguage.rpgle.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getReturn_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // Return
