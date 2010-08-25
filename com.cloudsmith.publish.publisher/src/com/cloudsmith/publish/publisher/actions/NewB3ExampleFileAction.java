/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.publisher.actions;

import org.eclipse.ui.IWorkbenchWindow;

public class NewB3ExampleFileAction extends Newb3FileAction {

	public NewB3ExampleFileAction(IWorkbenchWindow window) {
		super(window, "New Example");
	}

	@Override
	protected String getTemplateFileName() {
		return "/resources/stackExample_1.b3";

	}
}
