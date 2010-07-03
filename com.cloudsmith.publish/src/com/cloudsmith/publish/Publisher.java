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
package com.cloudsmith.publish;

import java.util.Map;

import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.metadata.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.publish.Publisher#getId <em>Id</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#isSingleton <em>Singleton</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getVersion <em>Version</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getCopyrightText <em>Copyright Text</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getCopyrightURL <em>Copyright URL</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getLicenseText <em>License Text</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getLicenseURL <em>License URL</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getRuntimeFilter <em>Runtime Filter</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getProperties <em>Properties</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getWhenInstalling <em>When Installing</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getWhenUninstalling <em>When Uninstalling</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getWhenConfiguring <em>When Configuring</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getWhenUnconfiguring <em>When Unconfiguring</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getName <em>Name</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getUnit <em>Unit</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getProvides <em>Provides</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getRequires <em>Requires</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getMetaRequires <em>Meta Requires</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getUsedPackages <em>Used Packages</em>}</li>
 * <li>{@link com.cloudsmith.publish.Publisher#getNativeActions <em>Native Actions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.publish.PublishPackage#getPublisher()
 * @model abstract="true"
 * @generated
 */
public interface Publisher extends INativeActions {
	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Text</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_CopyrightText()
	 * @model
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Returns the value of the '<em><b>Copyright URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright URL</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Copyright URL</em>' attribute.
	 * @see #setCopyrightURL(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_CopyrightURL()
	 * @model
	 * @generated
	 */
	String getCopyrightURL();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>License Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Text</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>License Text</em>' attribute.
	 * @see #setLicenseText(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_LicenseText()
	 * @model
	 * @generated
	 */
	String getLicenseText();

	/**
	 * Returns the value of the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License URL</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>License URL</em>' attribute.
	 * @see #setLicenseURL(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_LicenseURL()
	 * @model
	 * @generated
	 */
	String getLicenseURL();

	/**
	 * Returns the value of the '<em><b>Meta Requires</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Requires</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Meta Requires</em>' reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_MetaRequires()
	 * @model
	 * @generated
	 */
	EList<RequiredCapability> getMetaRequires();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Native Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Actions</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Native Actions</em>' containment reference.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_NativeActions()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	NativeActions getNativeActions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(Map)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Properties()
	 * @model dataType="org.eclipse.b3.p2.Map<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map<String, String> getProperties();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Provides()
	 * @model
	 * @generated
	 */
	EList<Capability> getProvides();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Requires()
	 * @model
	 * @generated
	 */
	EList<RequiredCapability> getRequires();

	/**
	 * Returns the value of the '<em><b>Runtime Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Filter</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Runtime Filter</em>' attribute.
	 * @see #setRuntimeFilter(String)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_RuntimeFilter()
	 * @model
	 * @generated
	 */
	String getRuntimeFilter();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(BuildUnit)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Unit()
	 * @model
	 * @generated
	 */
	BuildUnit getUnit();

	/**
	 * Returns the value of the '<em><b>Used Packages</b></em>' containment reference list.
	 * The list contents are of type {@link com.cloudsmith.publish.ActionPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Packages</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Used Packages</em>' containment reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_UsedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionPackage> getUsedPackages();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Version()
	 * @model dataType="org.eclipse.b3.build.Version"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Returns the value of the '<em><b>When Configuring</b></em>' containment reference list.
	 * The list contents are of type {@link com.cloudsmith.publish.PublisherAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Configuring</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>When Configuring</em>' containment reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_WhenConfiguring()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublisherAction> getWhenConfiguring();

	/**
	 * Returns the value of the '<em><b>When Installing</b></em>' containment reference list.
	 * The list contents are of type {@link com.cloudsmith.publish.PublisherAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Installing</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>When Installing</em>' containment reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_WhenInstalling()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublisherAction> getWhenInstalling();

	/**
	 * Returns the value of the '<em><b>When Unconfiguring</b></em>' containment reference list.
	 * The list contents are of type {@link com.cloudsmith.publish.PublisherAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Unconfiguring</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>When Unconfiguring</em>' containment reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_WhenUnconfiguring()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublisherAction> getWhenUnconfiguring();

	/**
	 * Returns the value of the '<em><b>When Uninstalling</b></em>' containment reference list.
	 * The list contents are of type {@link com.cloudsmith.publish.PublisherAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Uninstalling</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>When Uninstalling</em>' containment reference list.
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_WhenUninstalling()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublisherAction> getWhenUninstalling();

	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(boolean)
	 * @see com.cloudsmith.publish.PublishPackage#getPublisher_Singleton()
	 * @model
	 * @generated
	 */
	boolean isSingleton();

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getCopyrightURL <em>Copyright URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Copyright URL</em>' attribute.
	 * @see #getCopyrightURL()
	 * @generated
	 */
	void setCopyrightURL(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getLicenseText <em>License Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>License Text</em>' attribute.
	 * @see #getLicenseText()
	 * @generated
	 */
	void setLicenseText(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getLicenseURL <em>License URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>License URL</em>' attribute.
	 * @see #getLicenseURL()
	 * @generated
	 */
	void setLicenseURL(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Map<String, String> value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getRuntimeFilter <em>Runtime Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Runtime Filter</em>' attribute.
	 * @see #getRuntimeFilter()
	 * @generated
	 */
	void setRuntimeFilter(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#isSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Singleton</em>' attribute.
	 * @see #isSingleton()
	 * @generated
	 */
	void setSingleton(boolean value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(BuildUnit value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.publish.Publisher#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	BuildSet write(BuildUnit unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	BuildSet write(BuildUnit unit, BuildSet output);

} // Publisher
