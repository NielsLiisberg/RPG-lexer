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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sitemule.rpglanguage.rpgle.Dclproc;
import org.sitemule.rpglanguage.rpgle.Dcls;
import org.sitemule.rpglanguage.rpgle.Expression;
import org.sitemule.rpglanguage.rpgle.Parmlist;
import org.sitemule.rpglanguage.rpgle.RpglePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.ExpressionImpl#getIntval <em>Intval</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.ExpressionImpl#getStrval <em>Strval</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.ExpressionImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.ExpressionImpl#getProcval <em>Procval</em>}</li>
 *   <li>{@link org.sitemule.rpglanguage.rpgle.impl.ExpressionImpl#getParmlist <em>Parmlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The default value of the '{@link #getIntval() <em>Intval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntval()
   * @generated
   * @ordered
   */
  protected static final int INTVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntval() <em>Intval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntval()
   * @generated
   * @ordered
   */
  protected int intval = INTVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getStrval() <em>Strval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrval()
   * @generated
   * @ordered
   */
  protected static final String STRVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrval() <em>Strval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrval()
   * @generated
   * @ordered
   */
  protected String strval = STRVAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Dcls var;

  /**
   * The cached value of the '{@link #getProcval() <em>Procval</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcval()
   * @generated
   * @ordered
   */
  protected Dclproc procval;

  /**
   * The cached value of the '{@link #getParmlist() <em>Parmlist</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParmlist()
   * @generated
   * @ordered
   */
  protected EList<Parmlist> parmlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return RpglePackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIntval()
  {
    return intval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntval(int newIntval)
  {
    int oldIntval = intval;
    intval = newIntval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpglePackage.EXPRESSION__INTVAL, oldIntval, intval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStrval()
  {
    return strval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrval(String newStrval)
  {
    String oldStrval = strval;
    strval = newStrval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpglePackage.EXPRESSION__STRVAL, oldStrval, strval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dcls getVar()
  {
    if (var != null && var.eIsProxy())
    {
      InternalEObject oldVar = (InternalEObject)var;
      var = (Dcls)eResolveProxy(oldVar);
      if (var != oldVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpglePackage.EXPRESSION__VAR, oldVar, var));
      }
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dcls basicGetVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(Dcls newVar)
  {
    Dcls oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpglePackage.EXPRESSION__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dclproc getProcval()
  {
    if (procval != null && procval.eIsProxy())
    {
      InternalEObject oldProcval = (InternalEObject)procval;
      procval = (Dclproc)eResolveProxy(oldProcval);
      if (procval != oldProcval)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpglePackage.EXPRESSION__PROCVAL, oldProcval, procval));
      }
    }
    return procval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dclproc basicGetProcval()
  {
    return procval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcval(Dclproc newProcval)
  {
    Dclproc oldProcval = procval;
    procval = newProcval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpglePackage.EXPRESSION__PROCVAL, oldProcval, procval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parmlist> getParmlist()
  {
    if (parmlist == null)
    {
      parmlist = new EObjectContainmentEList<Parmlist>(Parmlist.class, this, RpglePackage.EXPRESSION__PARMLIST);
    }
    return parmlist;
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
      case RpglePackage.EXPRESSION__PARMLIST:
        return ((InternalEList<?>)getParmlist()).basicRemove(otherEnd, msgs);
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
      case RpglePackage.EXPRESSION__INTVAL:
        return getIntval();
      case RpglePackage.EXPRESSION__STRVAL:
        return getStrval();
      case RpglePackage.EXPRESSION__VAR:
        if (resolve) return getVar();
        return basicGetVar();
      case RpglePackage.EXPRESSION__PROCVAL:
        if (resolve) return getProcval();
        return basicGetProcval();
      case RpglePackage.EXPRESSION__PARMLIST:
        return getParmlist();
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
      case RpglePackage.EXPRESSION__INTVAL:
        setIntval((Integer)newValue);
        return;
      case RpglePackage.EXPRESSION__STRVAL:
        setStrval((String)newValue);
        return;
      case RpglePackage.EXPRESSION__VAR:
        setVar((Dcls)newValue);
        return;
      case RpglePackage.EXPRESSION__PROCVAL:
        setProcval((Dclproc)newValue);
        return;
      case RpglePackage.EXPRESSION__PARMLIST:
        getParmlist().clear();
        getParmlist().addAll((Collection<? extends Parmlist>)newValue);
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
      case RpglePackage.EXPRESSION__INTVAL:
        setIntval(INTVAL_EDEFAULT);
        return;
      case RpglePackage.EXPRESSION__STRVAL:
        setStrval(STRVAL_EDEFAULT);
        return;
      case RpglePackage.EXPRESSION__VAR:
        setVar((Dcls)null);
        return;
      case RpglePackage.EXPRESSION__PROCVAL:
        setProcval((Dclproc)null);
        return;
      case RpglePackage.EXPRESSION__PARMLIST:
        getParmlist().clear();
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
      case RpglePackage.EXPRESSION__INTVAL:
        return intval != INTVAL_EDEFAULT;
      case RpglePackage.EXPRESSION__STRVAL:
        return STRVAL_EDEFAULT == null ? strval != null : !STRVAL_EDEFAULT.equals(strval);
      case RpglePackage.EXPRESSION__VAR:
        return var != null;
      case RpglePackage.EXPRESSION__PROCVAL:
        return procval != null;
      case RpglePackage.EXPRESSION__PARMLIST:
        return parmlist != null && !parmlist.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (intval: ");
    result.append(intval);
    result.append(", strval: ");
    result.append(strval);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
