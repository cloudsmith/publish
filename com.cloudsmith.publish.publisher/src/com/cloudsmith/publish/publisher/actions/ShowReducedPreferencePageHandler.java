/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.publisher.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author Karel Brezina
 * 
 */
public class ShowReducedPreferencePageHandler extends AbstractHandler {

	private static final String[] displayedIds = {
			"org.eclipse.b3.BeeLang.editor", "org.eclipse.b3.BeeLang", "org.eclipse.b3.BeeLang.templates",
			"org.eclipse.b3.BeeLang.coloring", "org.eclipse.ui.preferencePages.GeneralTextEditor",
			"org.eclipse.ui.editors.preferencePages.QuickDiff", "org.eclipse.ui.editors.preferencePages.Accessibility",
			"org.eclipse.ui.editors.preferencePages.LinkedModePreferencePage" };

	public final Object execute(final ExecutionEvent event) {
		final IWorkbenchWindow activeWorkbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);

		final Shell shell;
		if(activeWorkbenchWindow == null) {
			shell = null;
		}
		else {
			shell = activeWorkbenchWindow.getShell();
		}

		final PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
			shell, displayedIds[0], displayedIds, null);
		dialog.open();

		return null;
	}
}
