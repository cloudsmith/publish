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

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.backend.evaluator.B3ContextAccess;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.ResolutionInfo;
import org.eclipse.b3.build.UnitResolutionInfo;
import org.eclipse.b3.build.core.adapters.ResolutionInfoAdapterFactory;
import org.eclipse.b3.build.repository.IBuildUnitResolver;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.cloudsmith.publish.PublishFactory;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.PublisherAction;
import com.cloudsmith.publish.RubyActions;
import com.cloudsmith.publish.RubyPublisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.RubyPublisherImpl#getRubyActions <em>Ruby Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RubyPublisherImpl extends PublisherImpl implements RubyPublisher {
	/**
	 * The cached value of the '{@link #getRubyActions() <em>Ruby Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRubyActions()
	 * @generated
	 * @ordered
	 */
	protected RubyActions rubyActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RubyPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRubyActions(RubyActions newRubyActions, NotificationChain msgs) {
		RubyActions oldRubyActions = rubyActions;
		rubyActions = newRubyActions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PublishPackage.RUBY_PUBLISHER__RUBY_ACTIONS, oldRubyActions, newRubyActions);
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
			case PublishPackage.RUBY_PUBLISHER__RUBY_ACTIONS:
				return getRubyActions();
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
			case PublishPackage.RUBY_PUBLISHER__RUBY_ACTIONS:
				return basicSetRubyActions(null, msgs);
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
			case PublishPackage.RUBY_PUBLISHER__RUBY_ACTIONS:
				return rubyActions != null;
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
		return PublishPackage.Literals.RUBY_PUBLISHER;
	}

	/**
	 * Returns the value of a property (on the form "a.b.c") as it was set when resolving the given unit.
	 * If property was not set, then check the regular context (i.e. "now").
	 * If no context is available (unit testing?) the property is looked up using system properties directly.
	 * 
	 * @param unit
	 * @param property
	 * @return
	 */
	private String getPropertyInTheContextUnitWasResolved(BuildUnit unit, String propertyName, String defaultValue) {
		// need the context to get resolution scope key
		BExecutionContext ctx = B3ContextAccess.get();
		if(ctx != null) {
			Object result = null;
			try {
				// Get the current resolution scope
				IBuildUnitResolver scopeKey = ctx.getInjector().getInstance(IBuildUnitResolver.class);

				// Get the resolution info associated with the unit
				ResolutionInfo rinfo = ResolutionInfoAdapterFactory.eINSTANCE.adapt(unit).getAssociatedInfo(scopeKey);
				if(rinfo.getStatus().isOK() && rinfo instanceof UnitResolutionInfo) {
					UnitResolutionInfo urinfo = (UnitResolutionInfo) rinfo;
					ctx = urinfo.getContext();
					result = ctx.getValue("${" + propertyName + "}");
				}
			}
			catch(B3NoSuchVariableException e) {
				result = null;
			}
			catch(B3EngineException e) {
				return null;
			}
			return (result == null || !(result instanceof String))
					? defaultValue
					: (String) result;
		}
		return System.getProperty(propertyName, defaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public RubyActions getRubyActions() {
		// create on demand and remember it being used
		if(rubyActions == null) {
			rubyActions = PublishFactory.eINSTANCE.createRubyActions();
			getUsedPackages().add(rubyActions);
		}
		return rubyActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installPassenger(String server) {
		return getRubyActions().installPassenger(server);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction installRubyEnterpriseFromCSource() {
		return getRubyActions().installRubyEnterpriseFromCSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallPassenger(String server) {
		return getRubyActions().uninstallPassenger(server);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PublisherAction uninstallRubyEnterpriseFromCSource() {
		return getRubyActions().uninstallRubyEnterpriseFromCSource();
	}

	@Override
	public BuildSet write(BuildUnit unit) {
		/*
		 * BExecutionContext ctx = B3ContextAccess.get();
		 * EffectiveUnitFacade unitFacade;
		 * try {
		 * unitFacade = unit.getEffectiveFacade(ctx);
		 * ctx = unitFacade.getContext();
		 * server = (String) ctx.getValue("${com.cloudsmith.stack.runtime.ruby.webserver}");
		 * }
		 * catch(Throwable e) {
		 * throw new Error(e.getMessage(), e);
		 * }
		 */
		// TODO: change "BROKEN" to wanted über-default... (useful while testing to keep it like this)
		String server = getPropertyInTheContextUnitWasResolved(
			unit, "com.cloudsmith.stack.runtime.ruby.webserver", "BROKEN");
		if(getWhenInstalling().size() == 0) {
			getWhenInstalling().add(installRubyEnterpriseFromCSource());
			getWhenInstalling().add(installPassenger(server));
		}
		if(getWhenUninstalling().size() == 0) {
			getWhenUninstalling().add(uninstallRubyEnterpriseFromCSource());
			getWhenUninstalling().add(uninstallPassenger(server));
		}

		return super.write(unit);
	}

} // RubyPublisherImpl
