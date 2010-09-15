/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package com.cloudsmith.publish.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.cloudsmith.publish.ActionPackage;
import com.cloudsmith.publish.ActionParameter;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.PublisherActionImpl#getName <em>Name</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherActionImpl#getParameters <em>Parameters</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherActionImpl#getActionPackage <em>Action Package</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherActionImpl#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PublisherActionImpl extends EObjectImpl implements PublisherAction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionParameter> parameters;

	/**
	 * The cached value of the '{@link #getActionPackage() <em>Action Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getActionPackage()
	 * @generated
	 * @ordered
	 */
	protected ActionPackage actionPackage;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PublisherActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionPackage basicGetActionPackage() {
		return actionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case PublishPackage.PUBLISHER_ACTION__NAME:
				return getName();
			case PublishPackage.PUBLISHER_ACTION__PARAMETERS:
				return getParameters();
			case PublishPackage.PUBLISHER_ACTION__ACTION_PACKAGE:
				if(resolve)
					return getActionPackage();
				return basicGetActionPackage();
			case PublishPackage.PUBLISHER_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case PublishPackage.PUBLISHER_ACTION__PARAMETERS:
				return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case PublishPackage.PUBLISHER_ACTION__NAME:
				return isSetName();
			case PublishPackage.PUBLISHER_ACTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PublishPackage.PUBLISHER_ACTION__ACTION_PACKAGE:
				return actionPackage != null;
			case PublishPackage.PUBLISHER_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null
						? getQualifiedName() != null
						: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case PublishPackage.PUBLISHER_ACTION__NAME:
				setName((String) newValue);
				return;
			case PublishPackage.PUBLISHER_ACTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ActionParameter>) newValue);
				return;
			case PublishPackage.PUBLISHER_ACTION__ACTION_PACKAGE:
				setActionPackage((ActionPackage) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case PublishPackage.PUBLISHER_ACTION__NAME:
				unsetName();
				return;
			case PublishPackage.PUBLISHER_ACTION__PARAMETERS:
				getParameters().clear();
				return;
			case PublishPackage.PUBLISHER_ACTION__ACTION_PACKAGE:
				setActionPackage((ActionPackage) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionPackage getActionPackage() {
		if(actionPackage != null && actionPackage.eIsProxy()) {
			InternalEObject oldActionPackage = (InternalEObject) actionPackage;
			actionPackage = (ActionPackage) eResolveProxy(oldActionPackage);
			if(actionPackage != oldActionPackage) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, PublishPackage.PUBLISHER_ACTION__ACTION_PACKAGE, oldActionPackage,
						actionPackage));
			}
		}
		return actionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ActionParameter> getParameters() {
		if(parameters == null) {
			parameters = new EObjectContainmentEList<ActionParameter>(
				ActionParameter.class, this, PublishPackage.PUBLISHER_ACTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getQualifiedName() {
		String s = getActionPackage().getName();
		if(s == null || "".equals(s))
			return getName();
		return s + "." + getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setActionPackage(ActionPackage newActionPackage) {
		ActionPackage oldActionPackage = actionPackage;
		actionPackage = newActionPackage;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER_ACTION__ACTION_PACKAGE, oldActionPackage,
				actionPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER_ACTION__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		if(nameESet)
			result.append(name);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, PublishPackage.PUBLISHER_ACTION__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.PUBLISHER_ACTION;
	}

} // PublisherActionImpl
