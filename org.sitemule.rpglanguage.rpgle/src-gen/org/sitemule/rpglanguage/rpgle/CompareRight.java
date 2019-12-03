/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.CompareRight#getSpec <em>Spec</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.CompareRight#getIntval2 <em>Intval2</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.CompareRight#getStrval2 <em>Strval2</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.CompareRight#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.CompareRight#getBif2 <em>Bif2</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.CompareRight#getCmp <em>Cmp</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight()
 * @model
 * @generated
 */
public interface CompareRight extends Compare2
{
  /**
   * Returns the value of the '<em><b>Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec</em>' attribute.
   * @see #setSpec(String)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight_Spec()
   * @model
   * @generated
   */
  String getSpec();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.CompareRight#getSpec <em>Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spec</em>' attribute.
   * @see #getSpec()
   * @generated
   */
  void setSpec(String value);

  /**
   * Returns the value of the '<em><b>Intval2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intval2</em>' attribute.
   * @see #setIntval2(int)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight_Intval2()
   * @model
   * @generated
   */
  int getIntval2();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.CompareRight#getIntval2 <em>Intval2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intval2</em>' attribute.
   * @see #getIntval2()
   * @generated
   */
  void setIntval2(int value);

  /**
   * Returns the value of the '<em><b>Strval2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strval2</em>' attribute.
   * @see #setStrval2(String)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight_Strval2()
   * @model
   * @generated
   */
  String getStrval2();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.CompareRight#getStrval2 <em>Strval2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strval2</em>' attribute.
   * @see #getStrval2()
   * @generated
   */
  void setStrval2(String value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' reference.
   * @see #setVar2(Dcls)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight_Var2()
   * @model
   * @generated
   */
  Dcls getVar2();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.CompareRight#getVar2 <em>Var2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(Dcls value);

  /**
   * Returns the value of the '<em><b>Bif2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bif2</em>' containment reference.
   * @see #setBif2(Bif)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight_Bif2()
   * @model containment="true"
   * @generated
   */
  Bif getBif2();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.CompareRight#getBif2 <em>Bif2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bif2</em>' containment reference.
   * @see #getBif2()
   * @generated
   */
  void setBif2(Bif value);

  /**
   * Returns the value of the '<em><b>Cmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmp</em>' containment reference.
   * @see #setCmp(Compare2)
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getCompareRight_Cmp()
   * @model containment="true"
   * @generated
   */
  Compare2 getCmp();

  /**
   * Sets the value of the '{@link org.sitemule.rpglanguage.rpgle.CompareRight#getCmp <em>Cmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmp</em>' containment reference.
   * @see #getCmp()
   * @generated
   */
  void setCmp(Compare2 value);

} // CompareRight
