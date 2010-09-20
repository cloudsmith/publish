package com.cloudsmith.publish.publisher;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.cloudsmith.publish.publisher.actions.NewB3ExampleFileAction;
import com.cloudsmith.publish.publisher.actions.Newb3FileAction;
import com.cloudsmith.publish.publisher.actions.OpenReadmeAction;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	private Boolean virginState = Boolean.TRUE;

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	@Override
	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowCreate()
	 */
	@Override
	public void postWindowCreate() {
		// if there are no open files, create a new untitled file and open it
		IWorkbenchWindow window = this.getWindowConfigurer().getWindow();
		IEditorReference[] editorReferences = window.getActivePage().getEditorReferences();
		if(editorReferences.length < 1) {
			openExample();
			// openEmptyUntitled();
			openReadme();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowOpen()
	 */
	@Override
	public void postWindowOpen() {
		if(!virginState)
			return;
		// Bring the browser with the README to the top
		IWorkbenchWindow window = this.getWindowConfigurer().getWindow();
		IEditorReference[] editorReferences = window.getActivePage().getEditorReferences();
		for(IEditorReference ref : editorReferences) {
			if("org.eclipse.ui.browser.editor".equals(ref.getId())) {
				window.getActivePage().bringToTop(ref.getPart(true));
			}
		}
	}

	@Override
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1000, 700));
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(true);
		// to show progress in the status footer
		configurer.setShowProgressIndicator(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#restoreState(org.eclipse.ui.IMemento)
	 */
	@Override
	public IStatus restoreState(IMemento memento) {
		Boolean virgin = memento.getBoolean("com.cloudsmith.publish.virgin");
		if(virgin != null)
			virginState = virgin;
		return super.restoreState(memento);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#saveState(org.eclipse.ui.IMemento)
	 */
	@Override
	public IStatus saveState(IMemento memento) {
		memento.putBoolean("com.cloudsmith.publish.virgin", false);
		return super.saveState(memento);
	}

	// CURRENTLY UNUSED: but we may want to switch back to opening an empty file..
	// /**
	// * Performs the creation of a new empty "untitled" .b3 file.
	// */
	// private void openEmptyUntitled() {
	// if(!virginState)
	// return;
	// Newb3FileAction.newB3File(Newb3FileAction.RESOURCES_NEW_STACK_TEMPLATE_B3);
	// }

	/**
	 * Performs the creation of a new empty "untitled" .b3 file.
	 */
	private void openExample() {
		if(!virginState)
			return;
		Newb3FileAction.newB3File(NewB3ExampleFileAction.RESOURCES_STACK_EXAMPLE);
	}

	private void openReadme() {
		if(!virginState)
			return;
		OpenReadmeAction.showReadmeInBrowser();
	}

}
