package com.cloudsmith.publish.publisher.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;

public class ReducedPreferencesAction extends Action implements IWorkbenchWindowActionDelegate {
	// private static final String[] displayedIds = {
	// "org.eclipse.b3.BeeLang.editor", "org.eclipse.b3.BeeLang", "org.eclipse.b3.BeeLang.templates",
	// "org.eclipse.b3.BeeLang.coloring", //
	// "org.eclipse.ui.preferencePages.GeneralTextEditor", //
	// "org.eclipse.ui.editors.preferencePages.QuickDiff", //
	// "org.eclipse.ui.editors.preferencePages.Accessibility", //
	// "org.eclipse.ui.editors.preferencePages.LinkedModePreferencePage", //
	// };

	public static void removeUnwantedPreferences() {
		PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();

		// move the b3 syntax coloring and template to root
		promoteChildrenToRoot(pm, "org.eclipse.b3.BeeLang");

		// "workbench" is the "general" node - attempt to move all subnodes to root
		IPreferenceNode general = pm.find("org.eclipse.ui.preferencePages.Workbench");
		if(general != null) {
			for(IPreferenceNode node : general.getSubNodes())
				pm.addToRoot(node);
		}

		// move "text editor" children to root
		// IPreferenceNode textEditorsNode = pm.find("org.eclipse.ui.preferencePages.GeneralTextEditor");
		// pm.addToRoot(textEditorsNode);
		promoteChildrenToRoot(pm, "org.eclipse.ui.preferencePages.Editors");

		pm.remove("org.eclipse.ui.preferencePages.ContentTypes");
		pm.remove("org.eclipse.ui.preferencePages.FileEditors");
		pm.remove("org.eclipse.ui.preferencePages.GeneralTextEditor/org.eclipse.ui.editors.preferencePages.Spelling");
		pm.remove("org.eclipse.ui.preferencePages.GeneralTextEditor/org.eclipse.ui.editors.preferencePages.HyperlinkDetectorsPreferencePage");
		pm.remove("org.eclipse.ui.preferencePages.Keys");
		pm.remove("org.eclipse.ui.preferencePages.Workbench");
		pm.remove("org.eclipse.ui.preferencePages.Workspace");
		pm.remove("org.eclipse.ui.preferencePages.Views/org.eclipse.ui.preferencePages.Decorators");
		pm.remove("org.eclipse.ui.preferencePages.Perspectives");
		pm.remove("org.eclipse.compare.internal.ComparePreferencePage");
		pm.remove("org.eclipse.help.ui.browsersPreferencePage");
		pm.remove("org.eclipse.help.ui.contentPreferencePage");
		pm.remove("org.eclipse.team.ui.TeamPreferences");
	}

	private static void promoteChildrenToRoot(PreferenceManager pm, String id) {
		IPreferenceNode general = pm.find(id);
		if(general != null) {
			for(IPreferenceNode node : general.getSubNodes())
				pm.addToRoot(node);
		}
		pm.remove(id);

	}

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

		removeUnwantedPreferences();
		// final PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
		// shell, displayedIds[0], displayedIds, null);
		final PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(shell, null, null, null);
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
	public void selectionChanged(IAction action, ISelection selection) {
		// do nothing, this action is not related to current selection.
	}
}
