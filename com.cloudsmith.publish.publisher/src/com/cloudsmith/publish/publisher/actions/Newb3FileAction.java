package com.cloudsmith.publish.publisher.actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import com.cloudsmith.publish.publisher.ActionConstants;
import com.cloudsmith.publish.publisher.Activator;

public class Newb3FileAction  extends Action implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	@Override
	public void run(IAction action) {
		
		File newFile = null;
		try {
			newFile = File.createTempFile("untitled", ".b3");
		} catch (IOException e) {
			String msg =  "Cannot create a temporary file";
			IDEWorkbenchPlugin.log(msg, new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
			MessageDialog.open(MessageDialog.ERROR,window.getShell(), "New b3", msg, SWT.SHEET);
		}
		
		IFileStore fileStore =  EFS.getLocalFileSystem().fromLocalFile(newFile);
		IFileInfo fetchInfo = fileStore.fetchInfo();
		if (fetchInfo.exists()) {
			IWorkbenchPage page =  window.getActivePage();
			try {
		        // open the editor on the file
		        page.openEditor(new FileStoreEditorInput(fileStore), ActionConstants.BEELANG_EDITOR_ID);
			} catch (PartInitException e) {
				String msg =  NLS.bind(IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, fileStore.getName());
				IDEWorkbenchPlugin.log(msg,e.getStatus());
				MessageDialog.open(MessageDialog.ERROR,window.getShell(), "Open b3 files", msg, SWT.SHEET);
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void dispose() {
		window =  null;
	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window =  window;
	}

}
