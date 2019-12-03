/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dou</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Dou#getDou <em>Dou</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Dou#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDou()
 * @model
 * @generated
 */
public interface Dou extends Stmt
{
  /**
   * Returns the value of the '<em><b>Dou</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dou</em>' containment reference.
   * @see #setDou(org.sitemule.rpglanguage.rpgle.Boolean)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDou_Dou()
   * @model containment="true"
   * @generated
   */
  org.sitemule.rpglanguage.rpgle.Boolean getDou();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.Dou#getDou <em>Dou</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dou</em>' containment reference.
   * @see #getDou()
   * @generated
   */
  void setDou(org.sitemule.rpglanguage.rpgle.Boolean value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link org.sitemule.rpglanguage.rpgle.Code}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDou_Code()
   * @model containment="true"
   * @generated
   */
  EList<Code> getCode();

} // Dou