package com.cloudsmith.publish.publisher;

import java.io.File;
import java.io.IOException;

import org.eclipse.b3.beelang.ui.xtext.linked.TmpFileStoreEditorInput;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

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
			try {
				openEmptyUntitled();
			}
			finally {

			}
		}

	}

	@Override
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1000, 700));
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(true);
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
		// TODO Auto-generated method stub
		memento.putBoolean("com.cloudsmith.publish.virgin", false);
		return super.saveState(memento);
	}

	/**
	 * Performs the creation of a new empty "untitled" .b3 file.
	 */
	private void openEmptyUntitled() {
		if(!virginState)
			return;
		File newFile = null;
		try {
			newFile = File.createTempFile("untitled", ".b3");
		}
		catch(IOException e) {
			String msg = "Cannot create a temporary file";
			IDEWorkbenchPlugin.log(msg, new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
			return;
		}

		IFileStore fileStore = EFS.getLocalFileSystem().fromLocalFile(newFile);
		IFileInfo fetchInfo = fileStore.fetchInfo();
		if(fetchInfo.exists()) {
			// IWorkbenchPage page = window.getActivePage();
			try {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();

				// IWorkbenchPage page = getWorkbenchConfigurer().getWorkbench().getActiveWorkbenchWindow().getActivePage();
				// open the editor on the file
				page.openEditor(new TmpFileStoreEditorInput(fileStore), ActionConstants.BEELANG_EDITOR_ID);
			}
			catch(PartInitException e) {
				String msg = NLS.bind(IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, fileStore.getName());
				IDEWorkbenchPlugin.log(msg, e.getStatus());
				return;
			}
		}
	}
}
