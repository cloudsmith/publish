package com.cloudsmith.publish.module;

import org.eclipse.emf.ecore.EClass;

import com.cloudsmith.publish.ExtNativeActions;
import com.cloudsmith.publish.GEMActions;
import com.cloudsmith.publish.GEMPublisher;
import com.cloudsmith.publish.NativeActions;
import com.cloudsmith.publish.NativePublisher;
import com.cloudsmith.publish.PublishPackage;
import com.cloudsmith.publish.Publisher;
import com.cloudsmith.publish.RPMActions;
import com.cloudsmith.publish.RPMPublisher;
import com.cloudsmith.publish.RepositoryPublisher;
import com.cloudsmith.publish.RubyActions;
import com.cloudsmith.publish.RubyPublisher;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;

public class PublishModule extends AbstractModule {
	@Override
	public void configure() {

		bindGEMActions();
		bindGEMPublisher();

		bindNativeActions();
		bindPublisher();

		bindExtNativeActions();
		bindNativePublisher();

		bindRepositoryPublisher();

		bindRPMActions();
		bindRPMPublisher();

		bindRubyPublisher();
		bindRubyActions();

	}

	protected void bindExtNativeActions() {
		bind(ExtNativeActions.class).toProvider(
			publishModelProvider(ExtNativeActions.class, PublishPackage.Literals.EXT_NATIVE_ACTIONS));
	}

	protected void bindGEMActions() {
		bind(GEMActions.class).toProvider(publishModelProvider(GEMActions.class, PublishPackage.Literals.GEM_ACTIONS));
	}

	protected void bindGEMPublisher() {
		bind(GEMPublisher.class).toProvider(
			publishModelProvider(GEMPublisher.class, PublishPackage.Literals.GEM_PUBLISHER));
	}

	protected void bindNativeActions() {
		bind(NativeActions.class).toProvider(
			publishModelProvider(NativeActions.class, PublishPackage.Literals.NATIVE_ACTIONS));
	}

	protected void bindNativePublisher() {
		bind(NativePublisher.class).toProvider(
			publishModelProvider(NativePublisher.class, PublishPackage.Literals.NATIVE_PUBLISHER));
	}

	protected void bindPublisher() {
		bind(Publisher.class).toProvider(publishModelProvider(Publisher.class, PublishPackage.Literals.PUBLISHER));
	}

	protected void bindRepositoryPublisher() {
		bind(RepositoryPublisher.class).toProvider(
			publishModelProvider(RepositoryPublisher.class, PublishPackage.Literals.REPOSITORY_PUBLISHER));
	}

	protected void bindRPMActions() {
		bind(RPMActions.class).toProvider(publishModelProvider(RPMActions.class, PublishPackage.Literals.RPM_ACTIONS));
	}

	protected void bindRPMPublisher() {
		bind(RPMPublisher.class).toProvider(
			publishModelProvider(RPMPublisher.class, PublishPackage.Literals.RPM_PUBLISHER));
	}

	protected void bindRubyActions() {
		bind(RubyActions.class).toProvider(
			publishModelProvider(RubyActions.class, PublishPackage.Literals.RUBY_ACTIONS));
	}

	protected void bindRubyPublisher() {
		bind(RubyPublisher.class).toProvider(
			publishModelProvider(RubyPublisher.class, PublishPackage.Literals.RUBY_PUBLISHER));
	}

	<T> Provider<T> publishModelProvider(Class<T> type, EClass eclass) {
		return new PublishModelProvider<T>(type, eclass);
	}

}
