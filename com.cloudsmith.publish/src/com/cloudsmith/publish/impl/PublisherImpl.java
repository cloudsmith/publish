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

import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.Publisher;

import com.cloudsmith.publish.PublisherAction;
import java.util.Collection;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.B3ContextAccess;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.EffectiveUnitFacade;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.equinox.p2.metadata.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getId <em>Id</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#isSingleton <em>Singleton</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getVersion <em>Version</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getCopyrightText <em>Copyright Text</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getCopyrightURL <em>Copyright URL</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getLicenseText <em>License Text</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getLicenseURL <em>License URL</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getRuntimeFilter <em>Runtime Filter</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getProperties <em>Properties</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getWhenInstalling <em>When Installing</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getWhenUninstalling <em>When Uninstalling</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getWhenConfiguring <em>When Configuring</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getWhenUnconfiguring <em>When Unconfiguring</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getName <em>Name</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getProvides <em>Provides</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getRequires <em>Requires</em>}</li>
 * <li>{@link com.cloudsmith.publish.impl.PublisherImpl#getMetaRequires <em>Meta Requires</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class PublisherImpl extends EObjectImpl implements Publisher {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightText() <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCopyrightText()
	 * @generated
	 * @ordered
	 */
	protected String copyrightText = COPYRIGHT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightURL() <em>Copyright URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCopyrightURL()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightURL() <em>Copyright URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCopyrightURL()
	 * @generated
	 * @ordered
	 */
	protected String copyrightURL = COPYRIGHT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseText() <em>License Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicenseText()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseText() <em>License Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicenseText()
	 * @generated
	 * @ordered
	 */
	protected String licenseText = LICENSE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseURL() <em>License URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicenseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseURL() <em>License URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicenseURL()
	 * @generated
	 * @ordered
	 */
	protected String licenseURL = LICENSE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeFilter() <em>Runtime Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRuntimeFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeFilter() <em>Runtime Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRuntimeFilter()
	 * @generated
	 * @ordered
	 */
	protected String runtimeFilter = RUNTIME_FILTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> properties;

	/**
	 * The cached value of the '{@link #getWhenInstalling() <em>When Installing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWhenInstalling()
	 * @generated
	 * @ordered
	 */
	protected EList<PublisherAction> whenInstalling;

	/**
	 * The cached value of the '{@link #getWhenUninstalling() <em>When Uninstalling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWhenUninstalling()
	 * @generated
	 * @ordered
	 */
	protected EList<PublisherAction> whenUninstalling;

	/**
	 * The cached value of the '{@link #getWhenConfiguring() <em>When Configuring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWhenConfiguring()
	 * @generated
	 * @ordered
	 */
	protected EList<PublisherAction> whenConfiguring;

	/**
	 * The cached value of the '{@link #getWhenUnconfiguring() <em>When Unconfiguring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWhenUnconfiguring()
	 * @generated
	 * @ordered
	 */
	protected EList<PublisherAction> whenUnconfiguring;

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
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected BuildUnit unit;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> provides;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> requires;

	/**
	 * The cached value of the '{@link #getMetaRequires() <em>Meta Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMetaRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> metaRequires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildUnit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction chmod(String targetDir, String targetFile, String permissions, String options) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction cleanupCopy(String source, String target) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction cleanupZip(String source, String target) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction copy(String source, String target, boolean overwrite) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PublishPackage.PUBLISHER__ID:
				return getId();
			case PublishPackage.PUBLISHER__SINGLETON:
				return isSingleton();
			case PublishPackage.PUBLISHER__VERSION:
				return getVersion();
			case PublishPackage.PUBLISHER__COPYRIGHT_TEXT:
				return getCopyrightText();
			case PublishPackage.PUBLISHER__COPYRIGHT_URL:
				return getCopyrightURL();
			case PublishPackage.PUBLISHER__LICENSE_TEXT:
				return getLicenseText();
			case PublishPackage.PUBLISHER__LICENSE_URL:
				return getLicenseURL();
			case PublishPackage.PUBLISHER__RUNTIME_FILTER:
				return getRuntimeFilter();
			case PublishPackage.PUBLISHER__PROPERTIES:
				return getProperties();
			case PublishPackage.PUBLISHER__WHEN_INSTALLING:
				return getWhenInstalling();
			case PublishPackage.PUBLISHER__WHEN_UNINSTALLING:
				return getWhenUninstalling();
			case PublishPackage.PUBLISHER__WHEN_CONFIGURING:
				return getWhenConfiguring();
			case PublishPackage.PUBLISHER__WHEN_UNCONFIGURING:
				return getWhenUnconfiguring();
			case PublishPackage.PUBLISHER__NAME:
				return getName();
			case PublishPackage.PUBLISHER__UNIT:
				if(resolve)
					return getUnit();
				return basicGetUnit();
			case PublishPackage.PUBLISHER__PROVIDES:
				return getProvides();
			case PublishPackage.PUBLISHER__REQUIRES:
				return getRequires();
			case PublishPackage.PUBLISHER__META_REQUIRES:
				return getMetaRequires();
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
			case PublishPackage.PUBLISHER__WHEN_INSTALLING:
				return ((InternalEList<?>) getWhenInstalling()).basicRemove(otherEnd, msgs);
			case PublishPackage.PUBLISHER__WHEN_UNINSTALLING:
				return ((InternalEList<?>) getWhenUninstalling()).basicRemove(otherEnd, msgs);
			case PublishPackage.PUBLISHER__WHEN_CONFIGURING:
				return ((InternalEList<?>) getWhenConfiguring()).basicRemove(otherEnd, msgs);
			case PublishPackage.PUBLISHER__WHEN_UNCONFIGURING:
				return ((InternalEList<?>) getWhenUnconfiguring()).basicRemove(otherEnd, msgs);
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
			case PublishPackage.PUBLISHER__ID:
				return ID_EDEFAULT == null
						? id != null
						: !ID_EDEFAULT.equals(id);
			case PublishPackage.PUBLISHER__SINGLETON:
				return singleton != SINGLETON_EDEFAULT;
			case PublishPackage.PUBLISHER__VERSION:
				return VERSION_EDEFAULT == null
						? version != null
						: !VERSION_EDEFAULT.equals(version);
			case PublishPackage.PUBLISHER__COPYRIGHT_TEXT:
				return COPYRIGHT_TEXT_EDEFAULT == null
						? copyrightText != null
						: !COPYRIGHT_TEXT_EDEFAULT.equals(copyrightText);
			case PublishPackage.PUBLISHER__COPYRIGHT_URL:
				return COPYRIGHT_URL_EDEFAULT == null
						? copyrightURL != null
						: !COPYRIGHT_URL_EDEFAULT.equals(copyrightURL);
			case PublishPackage.PUBLISHER__LICENSE_TEXT:
				return LICENSE_TEXT_EDEFAULT == null
						? licenseText != null
						: !LICENSE_TEXT_EDEFAULT.equals(licenseText);
			case PublishPackage.PUBLISHER__LICENSE_URL:
				return LICENSE_URL_EDEFAULT == null
						? licenseURL != null
						: !LICENSE_URL_EDEFAULT.equals(licenseURL);
			case PublishPackage.PUBLISHER__RUNTIME_FILTER:
				return RUNTIME_FILTER_EDEFAULT == null
						? runtimeFilter != null
						: !RUNTIME_FILTER_EDEFAULT.equals(runtimeFilter);
			case PublishPackage.PUBLISHER__PROPERTIES:
				return properties != null;
			case PublishPackage.PUBLISHER__WHEN_INSTALLING:
				return whenInstalling != null && !whenInstalling.isEmpty();
			case PublishPackage.PUBLISHER__WHEN_UNINSTALLING:
				return whenUninstalling != null && !whenUninstalling.isEmpty();
			case PublishPackage.PUBLISHER__WHEN_CONFIGURING:
				return whenConfiguring != null && !whenConfiguring.isEmpty();
			case PublishPackage.PUBLISHER__WHEN_UNCONFIGURING:
				return whenUnconfiguring != null && !whenUnconfiguring.isEmpty();
			case PublishPackage.PUBLISHER__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case PublishPackage.PUBLISHER__UNIT:
				return unit != null;
			case PublishPackage.PUBLISHER__PROVIDES:
				return provides != null && !provides.isEmpty();
			case PublishPackage.PUBLISHER__REQUIRES:
				return requires != null && !requires.isEmpty();
			case PublishPackage.PUBLISHER__META_REQUIRES:
				return metaRequires != null && !metaRequires.isEmpty();
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
			case PublishPackage.PUBLISHER__ID:
				setId((String) newValue);
				return;
			case PublishPackage.PUBLISHER__SINGLETON:
				setSingleton((Boolean) newValue);
				return;
			case PublishPackage.PUBLISHER__VERSION:
				setVersion((Version) newValue);
				return;
			case PublishPackage.PUBLISHER__COPYRIGHT_TEXT:
				setCopyrightText((String) newValue);
				return;
			case PublishPackage.PUBLISHER__COPYRIGHT_URL:
				setCopyrightURL((String) newValue);
				return;
			case PublishPackage.PUBLISHER__LICENSE_TEXT:
				setLicenseText((String) newValue);
				return;
			case PublishPackage.PUBLISHER__LICENSE_URL:
				setLicenseURL((String) newValue);
				return;
			case PublishPackage.PUBLISHER__RUNTIME_FILTER:
				setRuntimeFilter((String) newValue);
				return;
			case PublishPackage.PUBLISHER__PROPERTIES:
				setProperties((Map<String, String>) newValue);
				return;
			case PublishPackage.PUBLISHER__WHEN_INSTALLING:
				getWhenInstalling().clear();
				getWhenInstalling().addAll((Collection<? extends PublisherAction>) newValue);
				return;
			case PublishPackage.PUBLISHER__WHEN_UNINSTALLING:
				getWhenUninstalling().clear();
				getWhenUninstalling().addAll((Collection<? extends PublisherAction>) newValue);
				return;
			case PublishPackage.PUBLISHER__WHEN_CONFIGURING:
				getWhenConfiguring().clear();
				getWhenConfiguring().addAll((Collection<? extends PublisherAction>) newValue);
				return;
			case PublishPackage.PUBLISHER__WHEN_UNCONFIGURING:
				getWhenUnconfiguring().clear();
				getWhenUnconfiguring().addAll((Collection<? extends PublisherAction>) newValue);
				return;
			case PublishPackage.PUBLISHER__NAME:
				setName((String) newValue);
				return;
			case PublishPackage.PUBLISHER__UNIT:
				setUnit((BuildUnit) newValue);
				return;
			case PublishPackage.PUBLISHER__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends Capability>) newValue);
				return;
			case PublishPackage.PUBLISHER__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequiredCapability>) newValue);
				return;
			case PublishPackage.PUBLISHER__META_REQUIRES:
				getMetaRequires().clear();
				getMetaRequires().addAll((Collection<? extends RequiredCapability>) newValue);
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
	protected EClass eStaticClass() {
		return PublishPackage.Literals.PUBLISHER;
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
			case PublishPackage.PUBLISHER__ID:
				setId(ID_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__COPYRIGHT_TEXT:
				setCopyrightText(COPYRIGHT_TEXT_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__COPYRIGHT_URL:
				setCopyrightURL(COPYRIGHT_URL_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__LICENSE_TEXT:
				setLicenseText(LICENSE_TEXT_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__LICENSE_URL:
				setLicenseURL(LICENSE_URL_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__RUNTIME_FILTER:
				setRuntimeFilter(RUNTIME_FILTER_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__PROPERTIES:
				setProperties((Map<String, String>) null);
				return;
			case PublishPackage.PUBLISHER__WHEN_INSTALLING:
				getWhenInstalling().clear();
				return;
			case PublishPackage.PUBLISHER__WHEN_UNINSTALLING:
				getWhenUninstalling().clear();
				return;
			case PublishPackage.PUBLISHER__WHEN_CONFIGURING:
				getWhenConfiguring().clear();
				return;
			case PublishPackage.PUBLISHER__WHEN_UNCONFIGURING:
				getWhenUnconfiguring().clear();
				return;
			case PublishPackage.PUBLISHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PublishPackage.PUBLISHER__UNIT:
				setUnit((BuildUnit) null);
				return;
			case PublishPackage.PUBLISHER__PROVIDES:
				getProvides().clear();
				return;
			case PublishPackage.PUBLISHER__REQUIRES:
				getRequires().clear();
				return;
			case PublishPackage.PUBLISHER__META_REQUIRES:
				getMetaRequires().clear();
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
	public String getCopyrightText() {
		return copyrightText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCopyrightURL() {
		return copyrightURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLicenseText() {
		return licenseText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLicenseURL() {
		return licenseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RequiredCapability> getMetaRequires() {
		if(metaRequires == null) {
			metaRequires = new EObjectResolvingEList<RequiredCapability>(
				RequiredCapability.class, this, PublishPackage.PUBLISHER__META_REQUIRES);
		}
		return metaRequires;
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
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getProvides() {
		if(provides == null) {
			provides = new EObjectResolvingEList<Capability>(Capability.class, this, PublishPackage.PUBLISHER__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RequiredCapability> getRequires() {
		if(requires == null) {
			requires = new EObjectResolvingEList<RequiredCapability>(
				RequiredCapability.class, this, PublishPackage.PUBLISHER__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRuntimeFilter() {
		return runtimeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildUnit getUnit() {
		if(unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject) unit;
			unit = (BuildUnit) eResolveProxy(oldUnit);
			if(unit != oldUnit) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, PublishPackage.PUBLISHER__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PublisherAction> getWhenConfiguring() {
		if(whenConfiguring == null) {
			whenConfiguring = new EObjectContainmentEList<PublisherAction>(
				PublisherAction.class, this, PublishPackage.PUBLISHER__WHEN_CONFIGURING);
		}
		return whenConfiguring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PublisherAction> getWhenInstalling() {
		if(whenInstalling == null) {
			whenInstalling = new EObjectContainmentEList<PublisherAction>(
				PublisherAction.class, this, PublishPackage.PUBLISHER__WHEN_INSTALLING);
		}
		return whenInstalling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PublisherAction> getWhenUnconfiguring() {
		if(whenUnconfiguring == null) {
			whenUnconfiguring = new EObjectContainmentEList<PublisherAction>(
				PublisherAction.class, this, PublishPackage.PUBLISHER__WHEN_UNCONFIGURING);
		}
		return whenUnconfiguring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PublisherAction> getWhenUninstalling() {
		if(whenUninstalling == null) {
			whenUninstalling = new EObjectContainmentEList<PublisherAction>(
				PublisherAction.class, this, PublishPackage.PUBLISHER__WHEN_UNINSTALLING);
		}
		return whenUninstalling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction link(String targetDir, String linkTarget, String linkName, boolean force) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction mkdir(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction remove(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction rmdir(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCopyrightText(String newCopyrightText) {
		String oldCopyrightText = copyrightText;
		copyrightText = newCopyrightText;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__COPYRIGHT_TEXT, oldCopyrightText, copyrightText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCopyrightURL(String newCopyrightURL) {
		String oldCopyrightURL = copyrightURL;
		copyrightURL = newCopyrightURL;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__COPYRIGHT_URL, oldCopyrightURL, copyrightURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets values from unit (if not already set).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void setDefaultsFromUnit(BuildUnit unit) throws Throwable {
		BExecutionContext ctx = B3ContextAccess.get();
		EffectiveUnitFacade facade = unit.getEffectiveFacade(ctx);

		// set defaults from the unit
		setUnit(unit);

		if(getVersion() == null)
			setVersion(unit.getVersion());

		// ID is name in p2 namespace, "name" is a property on an IU for "human readable"
		if(getId() == null)
			setId(unit.getName());

		// Not needed, this is a property see cs issue #903
		if(getName() == null) {
			setName(unit.getName());
		}
		// REMEMBER: Modify requirements from UNIT to IU when creating IU metadata
		if(getMetaRequires().size() == 0) {
			for(EffectiveRequirementFacade effective : facade.getMetaRequiredCapabilities())
				getMetaRequires().add(effective.getRequirement());
		}

		if(getRequires().size() == 0) {
			for(EffectiveRequirementFacade effective : facade.getRequiredCapabilities())
				getRequires().add(effective.getRequirement());
		}
		if(getProvides().size() == 0) {
			for(EffectiveCapabilityFacade effective : facade.getProvidedCapabilities())
				getProvides().add(effective.getProvidedCapability());
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PublishPackage.PUBLISHER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLicenseText(String newLicenseText) {
		String oldLicenseText = licenseText;
		licenseText = newLicenseText;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__LICENSE_TEXT, oldLicenseText, licenseText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLicenseURL(String newLicenseURL) {
		String oldLicenseURL = licenseURL;
		licenseURL = newLicenseURL;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__LICENSE_URL, oldLicenseURL, licenseURL));
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
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PublishPackage.PUBLISHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProperties(Map<String, String> newProperties) {
		Map<String, String> oldProperties = properties;
		properties = newProperties;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRuntimeFilter(String newRuntimeFilter) {
		String oldRuntimeFilter = runtimeFilter;
		runtimeFilter = newRuntimeFilter;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__RUNTIME_FILTER, oldRuntimeFilter, runtimeFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSingleton(boolean newSingleton) {
		boolean oldSingleton = singleton;
		singleton = newSingleton;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnit(BuildUnit newUnit) {
		BuildUnit oldUnit = unit;
		unit = newUnit;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PublishPackage.PUBLISHER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PublishPackage.PUBLISHER__VERSION, oldVersion, version));
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
		result.append(" (id: ");
		result.append(id);
		result.append(", singleton: ");
		result.append(singleton);
		result.append(", version: ");
		result.append(version);
		result.append(", copyrightText: ");
		result.append(copyrightText);
		result.append(", copyrightURL: ");
		result.append(copyrightURL);
		result.append(", licenseText: ");
		result.append(licenseText);
		result.append(", licenseURL: ");
		result.append(licenseURL);
		result.append(", runtimeFilter: ");
		result.append(runtimeFilter);
		result.append(", properties: ");
		result.append(properties);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherAction unZip(String source, String target) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildSet write(BuildUnit unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildSet write(BuildUnit unit, BuildSet output) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // PublisherImpl
