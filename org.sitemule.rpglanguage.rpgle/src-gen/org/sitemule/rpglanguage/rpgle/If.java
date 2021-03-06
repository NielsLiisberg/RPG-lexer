/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.If#getIfcode <em>Ifcode</em>}</li>
 * </ul>
 *
 * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getIf()
 * @model
 * @generated
 */
public interface If extends Ifblock
{
  /**
   * Returns the value of the '<em><b>Ifcode</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifcode</em>' containment reference list.
   * @see org.sitemule.rpglanguage.rpgle.RpglePackage#getIf_Ifcode()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getIfcode();

} // If
