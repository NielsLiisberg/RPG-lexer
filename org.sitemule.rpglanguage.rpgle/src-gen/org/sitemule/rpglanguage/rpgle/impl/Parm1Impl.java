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

import org.sitemule.rpglanguage.rpgle.Expression;
import org.sitemule.rpglanguage.rpgle.Parm1;
import org.sitemule.rpglanguage.rpgle.Parm2;
import org.sitemule.rpglanguage.rpgle.RpglePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parm1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.Parm1Impl#getParms <em>Parms</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.Parm1Impl#getParm <em>Parm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Parm1Impl extends ParmlistImpl implements Parm1
{
  /**
   * The cached value of the '{@link #getParms() <em>Parms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParms()
   * @generated
   * @ordered
   */
  protected EList<Parm2> parms;

  /**
   * The cached value of the '{@link #getParm() <em>Parm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParm()
   * @generated
   * @ordered
   */
  protected Expression parm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Parm1Impl()
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
    return RpglePackage.Literals.PARM1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parm2> getParms()
  {
    if (parms == null)
    {
      parms = new EObjectContainmentEList<Parm2>(Parm2.class, this, RpglePackage.PARM1__PARMS);
    }
    return parms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getParm()
  {
    return parm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParm(Expression newParm, NotificationChain msgs)
  {
    Expression oldParm = parm;
    parm = newParm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpglePackage.PARM1__PARM, oldParm, newParm);
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
  public void setParm(Expression newParm)
  {
    if (newParm != parm)
    {
      NotificationChain msgs = null;
      if (parm != null)
        msgs = ((InternalEObject)parm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpglePackage.PARM1__PARM, null, msgs);
      if (newParm != null)
        msgs = ((InternalEObject)newParm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpglePackage.PARM1__PARM, null, msgs);
      msgs = basicSetParm(newParm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpglePackage.PARM1__PARM, newParm, newParm));
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
      case RpglePackage.PARM1__PARMS:
        return ((InternalEList<?>)getParms()).basicRemove(otherEnd, msgs);
      case RpglePackage.PARM1__PARM:
        return basicSetParm(null, msgs);
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
      case RpglePackage.PARM1__PARMS:
        return getParms();
      case RpglePackage.PARM1__PARM:
        return getParm();
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
      case RpglePackage.PARM1__PARMS:
        getParms().clear();
        getParms().addAll((Collection<? extends Parm2>)newValue);
        return;
      case RpglePackage.PARM1__PARM:
        setParm((Expression)newValue);
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
      case RpglePackage.PARM1__PARMS:
        getParms().clear();
        return;
      case RpglePackage.PARM1__PARM:
        setParm((Expression)null);
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
      case RpglePackage.PARM1__PARMS:
        return parms != null && !parms.isEmpty();
      case RpglePackage.PARM1__PARM:
        return parm != null;
    }
    return super.eIsSet(featureID);
  }

} //Parm1Impl
