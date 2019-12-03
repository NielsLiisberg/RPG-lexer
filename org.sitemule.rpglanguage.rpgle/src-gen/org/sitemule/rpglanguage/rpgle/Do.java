/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.Do#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDo()
 * @model
 * @generated
 */
public interface Do extends Stmt
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link org.sitemule.rpglanguage.rpgle.Code}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getDo_Code()
   * @model containment="true"
   * @generated
   */
  EList<Code> getCode();

} // Do