/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Dow#getDow <em>Dow</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Dow#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDow()
 * @model
 * @generated
 */
public interface Dow extends Stmt
{
  /**
   * Returns the value of the '<em><b>Dow</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dow</em>' containment reference.
   * @see #setDow(org.sitemule.rpglanguage.rpgle.Boolean)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDow_Dow()
   * @model containment="true"
   * @generated
   */
  org.sitemule.rpglanguage.rpgle.Boolean getDow();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.Dow#getDow <em>Dow</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dow</em>' containment reference.
   * @see #getDow()
   * @generated
   */
  void setDow(org.sitemule.rpglanguage.rpgle.Boolean value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link org.sitemule.rpglanguage.rpgle.Code}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDow_Code()
   * @model containment="true"
   * @generated
   */
  EList<Code> getCode();

} // Dow
