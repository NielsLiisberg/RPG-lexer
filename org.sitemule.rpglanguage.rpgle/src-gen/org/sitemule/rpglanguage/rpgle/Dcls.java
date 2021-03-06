/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Dcls#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Dcls#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDcls()
 * @model
 * @generated
 */
public interface Dcls extends Declare
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' containment reference.
   * @see #setDatatype(Datatype)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDcls_Datatype()
   * @model containment="true"
   * @generated
   */
  Datatype getDatatype();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.Dcls#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(Datatype value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(Options)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDcls_Options()
   * @model containment="true"
   * @generated
   */
  Options getOptions();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.Dcls#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(Options value);

} // Dcls
