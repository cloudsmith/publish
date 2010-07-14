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

import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.cloudsmith.publish.GEMActions;
import com.cloudsmith.publish.GEMPublisher;
import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEM Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.GEMPublisherImpl#getGemActions <em>Gem Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GEMPublisherImpl extends PublisherImpl implements GEMPublisher {
	/**
	 * The cached value of the '{@link #getGemActions() <em>Gem Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGemActions()
	 * @generated
	 * @ordered
	 */
	protected GEMActions gemActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GEMPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetGemActions(GEMActions newGemActions, NotificationChain msgs) {
		GEMActions oldGemActions = gemActions;
		gemActions = newGemActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.GEM_PUBLISHER__GEM_ACTIONS, oldGemActions, newGemActions);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
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
			case PublishPackage.GEM_PUBLISHER__GEM_ACTIONS:
				return getGemActions();
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
			case PublishPackage.GEM_PUBLISHER__GEM_ACTIONS:
				return basicSetGemActions(null, msgs);
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
			case PublishPackage.GEM_PUBLISHER__GEM_ACTIONS:
				return gemActions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PublishPackage.Literals.GEM_PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public GEMActions getGemActions() {
		// create on demand and remember it being used
		if(gemActions == null) {
			gemActions = PublishFactory.eINSTANCE.createGEMActions();
			getUsedPackages().add(gemActions);
		}
		return gemActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installGEM() {
		return getGemActions().installGEM();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallGEM() {
		return getGemActions().uninstallGEM();
	}

	@Override
	public BuildSet write(BuildUnit unit) {
		if(getWhenConfiguring().size() == 0)
			getWhenConfiguring().add(installGEM());
		if(getWhenUnconfiguring().size() == 0)
			getWhenUnconfiguring().add(uninstallGEM());

		return super.write(unit);
	}

} // GEMPublisherImpl
