/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectblock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Selectblock#getWhen <em>When</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Selectblock#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getSelectblock()
 * @model
 * @generated
 */
public interface Selectblock extends Stmt
{
  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(When)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getSelectblock_When()
   * @model containment="true"
   * @generated
   */
  When getWhen();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.Selectblock#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(When value);

  /**
   * Returns the value of the '<em><b>Other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' containment reference.
   * @see #setOther(Other)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getSelectblock_Other()
   * @model containment="true"
   * @generated
   */
  Other getOther();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.Selectblock#getOther <em>Other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other</em>' containment reference.
   * @see #getOther()
   * @generated
   */
  void setOther(Other value);

} // Selectblock
