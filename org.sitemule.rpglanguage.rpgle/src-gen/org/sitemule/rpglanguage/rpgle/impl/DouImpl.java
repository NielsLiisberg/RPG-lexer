/**
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.rpgle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sitemule.rpglanguage.rpgle.Code;
import org.sitemule.rpglanguage.rpgle.Dou;
import org.sitemule.rpglanguage.rpgle.RpglePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dou</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.DouImpl#getDou <em>Dou</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.DouImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DouImpl extends StmtImpl implements Dou
{
  /**
   * The cached value of the '{@link #getDou() <em>Dou</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDou()
   * @generated
   * @ordered
   */
  protected org.sitemule.rpglanguage.rpgle.Boolean dou;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected EList<Code> code;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DouImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RpglePackage.Literals.DOU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.sitemule.rpglanguage.rpgle.Boolean getDou()
  {
    return dou;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDou(org.sitemule.rpglanguage.rpgle.Boolean newDou, NotificationChain msgs)
  {
    org.sitemule.rpglanguage.rpgle.Boolean oldDou = dou;
    dou = newDou;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpglePackage.DOU__DOU, oldDou, newDou);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDou(org.sitemule.rpglanguage.rpgle.Boolean newDou)
  {
    if (newDou != dou)
    {
      NotificationChain msgs = null;
      if (dou != null)
        msgs = ((InternalEObject)dou).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpglePackage.DOU__DOU, null, msgs);
      if (newDou != null)
        msgs = ((InternalEObject)newDou).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpglePackage.DOU__DOU, null, msgs);
      msgs = basicSetDou(newDou, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpglePackage.DOU__DOU, newDou, newDou));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Code> getCode()
  {
    if (code == null)
    {
      code = new EObjectContainmentEList<Code>(Code.class, this, RpglePackage.DOU__CODE);
    }
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RpglePackage.DOU__DOU:
        return basicSetDou(null, msgs);
      case RpglePackage.DOU__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RpglePackage.DOU__DOU:
        return getDou();
      case RpglePackage.DOU__CODE:
        return getCode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RpglePackage.DOU__DOU:
        setDou((org.sitemule.rpglanguage.rpgle.Boolean)newValue);
        return;
      case RpglePackage.DOU__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends Code>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RpglePackage.DOU__DOU:
        setDou((org.sitemule.rpglanguage.rpgle.Boolean)null);
        return;
      case RpglePackage.DOU__CODE:
        getCode().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RpglePackage.DOU__DOU:
        return dou != null;
      case RpglePackage.DOU__CODE:
        return code != null && !code.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DouImpl