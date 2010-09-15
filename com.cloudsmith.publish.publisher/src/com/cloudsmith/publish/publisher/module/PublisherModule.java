package com.cloudsmith.publish.publisher.module;

import org.eclipse.b3.ui.contentassist.IProposalCustomizer;

import com.cloudsmith.publish.publisher.PublisherProposalCustomizer;
import com.google.inject.AbstractModule;

public class PublisherModule extends AbstractModule {
	@Override
	public void configure() {

		bindPublihserProposalCustomizer();

	}

	protected void bindPublihserProposalCustomizer() {
		// binds a customizer that filters keyword proposals
		bind(IProposalCustomizer.class).to(PublisherProposalCustomizer.class);
	}

}
