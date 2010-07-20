package com.cloudsmith.publish.ui.module;

import org.eclipse.b3.beelang.ui.xtext.linked.IExtXtextEditorCustomizer;

import com.cloudsmith.publish.ui.editor.PublishExtXtextEditorCustomizer;
import com.google.inject.AbstractModule;

public class PublishUiModule extends AbstractModule {

	protected void bindEditorCustomizer() {
		bind(IExtXtextEditorCustomizer.class).to(PublishExtXtextEditorCustomizer.class);
	}
	
	@Override
	protected void configure() {
		bindEditorCustomizer();
	}

}
