package com.cloudsmith.publish.publisher.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.dialogs.PreferencesUtil;

public class ReducedPreferencesAction extends Action implements IWorkbenchWindowActionDelegate {
	private static final String[] displayedIds = {
			"org.eclipse.b3.BeeLang.editor", "org.eclipse.b3.BeeLang", "org.eclipse.b3.BeeLang.templates",
			"org.eclipse.b3.BeeLang.coloring", "org.eclipse.ui.preferencePages.GeneralTextEditor",
			"org.eclipse.ui.editors.preferencePages.QuickDiff", "org.eclipse.ui.editors.preferencePages.Accessibility",
			"org.eclipse.ui.editors.preferencePages.LinkedModePreferencePage" };

	private IWorkbenchWindow window;

	public ReducedPreferencesAction(IWorkbenchWindow window) {
		super("Preferences");
		this.window = window;
		setEnabled(true);
		// MUST set id to this well known identity to make the "menu reorg for mac" work
		setId("preferences");
	}

	public void dispose() {
		window = null;
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	@Override
	public void run() {
		final Shell shell;
		if(window == null) {
			shell = null;
		}
		else {
			shell = window.getShell();
		}

		final PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
			shell, displayedIds[0], displayedIds, null);
		dialog.open();
	}

	public void run(IAction action) {
		run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// do nothing, this action is not related to current selection.
	}

}
