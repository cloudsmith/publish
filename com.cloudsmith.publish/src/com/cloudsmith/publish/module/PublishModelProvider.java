/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.module;

import org.eclipse.emf.ecore.EClass;

import com.cloudsmith.publish.PublishFactory;
import com.google.inject.Provider;

/**
 * A Guice Provider making it possible to bind to creation of model based classes
 * in the Publish model.
 * 
 * @param <T>
 */
public class PublishModelProvider<T> implements Provider<T> {
	static <T> Provider<T> create(Class<T> type, EClass eclass) {
		return new PublishModelProvider<T>(type, eclass);
	}

	final Class<T> type;

	final EClass eclass;

	public PublishModelProvider(Class<T> type, EClass eclass) {
		this.type = type;
		this.eclass = eclass;
	}

	public T get() {
		return type.cast(PublishFactory.eINSTANCE.create(eclass));
	}
}
