/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.b3export;

import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.build.engine.IKludgyImportProvider;

import com.google.inject.internal.Lists;

/**
 * Adds 'use xxx' publisher specific interfaces available as defaults.
 * 
 */
public class UseThesePublisherInterfaces implements IKludgyImportProvider {

	public UseThesePublisherInterfaces() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.engine.IKludgyImportProvider#getImports()
	 */
	// @Override
	public List<B3JavaImport> getImports() {
		List<B3JavaImport> result = Lists.newArrayList();
		B3JavaImport o = null;

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.RPM");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.GEM");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.Publishable");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.CSource");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.Native");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.GEMPublisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.RPMPublisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.RubyRuntime");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.RubyPublisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.RepositoryDefinition");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.RepositoryPublisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.Publisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.NativePublisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.PHPPublisher");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.PHPRuntime");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.PHPPackage");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.Pear");

		result.add(o = B3backendFactory.eINSTANCE.createB3JavaImport());
		o.setQualifiedName("com.cloudsmith.publish.Pecl");

		return result;
	}

}
