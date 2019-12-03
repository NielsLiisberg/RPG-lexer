/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.For#getVar <em>Var</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.For#getFrom <em>From</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.For#getTo <em>To</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.For#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getFor()
 * @model
 * @generated
 */
public interface For extends Stmt
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Dcls)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getFor_Var()
   * @model
   * @generated
   */
  Dcls getVar();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.For#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Dcls value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Expression)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getFor_From()
   * @model containment="true"
   * @generated
   */
  Expression getFrom();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.For#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Expression value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Expression)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getFor_To()
   * @model containment="true"
   * @generated
   */
  Expression getTo();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.For#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Expression value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link org.sitemule.rpglanguage.rpgle.Code}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getFor_Code()
   * @model containment="true"
   * @generated
   */
  EList<Code> getCode();

} // For