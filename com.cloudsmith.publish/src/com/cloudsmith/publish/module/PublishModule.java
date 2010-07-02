package com.cloudsmith.publish.module;

import org.eclipse.emf.ecore.EClass;
import com.cloudsmith.publish.GEMActions;
import com.cloudsmith.publish.GEMPublisher;
import com.cloudsmith.publish.NativeActions;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.Publisher;
import com.cloudsmith.publish.RPMActions;
import com.cloudsmith.publish.RPMPublisher;
import com.cloudsmith.publish.RepositoryPublisher;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;

public class PublishModule extends AbstractModule {
	<T> Provider<T> publishModelProvider(Class<T> type, EClass eclass) {
		return new PublishModelProvider<T>(type, eclass);
	}

	protected void bindNativeActions() {
		bind(NativeActions.class).toProvider(
				publishModelProvider(NativeActions.class, PublishPackage.Literals.NATIVE_ACTIONS));
	}
	protected void bindGEMActions() {
		bind(GEMActions.class).toProvider(
				publishModelProvider(GEMActions.class, PublishPackage.Literals.GEM_ACTIONS));
	}
	protected void bindRPMActions() {
		bind(RPMActions.class).toProvider(
				publishModelProvider(RPMActions.class, PublishPackage.Literals.RPM_ACTIONS));
	}
	protected void bindPublisher() {
		bind(Publisher.class).toProvider(
				publishModelProvider(Publisher.class, PublishPackage.Literals.PUBLISHER));
	}
	protected void bindRPMPublisher() {
		bind(RPMPublisher.class).toProvider(
				publishModelProvider(RPMPublisher.class, PublishPackage.Literals.RPM_PUBLISHER));
	}
	protected void bindGEMPublisher() {
		bind(GEMPublisher.class).toProvider(
				publishModelProvider(GEMPublisher.class, PublishPackage.Literals.GEM_PUBLISHER));
	}
	protected void bindRepositoryPublisher() {
		bind(RepositoryPublisher.class).toProvider(
				publishModelProvider(RepositoryPublisher.class, PublishPackage.Literals.REPOSITORY_PUBLISHER));
	}

	@Override
	protected void configure() {
		bindNativeActions();
		bindPublisher();
		
		bindRPMActions();
		bindRPMPublisher();

		bindGEMPublisher();
		bindGEMActions();
		
		bindRepositoryPublisher();
	}


}
