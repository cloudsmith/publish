package com.cloudsmith.publish.publisher.actions;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.cloudsmith.publish.publisher.ActionConstants;
import com.cloudsmith.publish.publisher.Activator;
import com.cloudsmith.publish.publisher.IImageKeys;

/**
 * Standard action for opening an editor on local file(s).
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 */
public class OpenLocalb3FileAction extends Action implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	// dialog id constants
	private static final String STORE_LAST_OPENED_DIRECTORY_ID = "OpenLocalb3FileAction.STORE_LAST_OPENED_DIRECTORY_ID"; //$NON-NLS-1$

	private String filterPath;

	/**
	 * Creates a new action for opening a local file.
	 */
	public OpenLocalb3FileAction(IWorkbenchWindow window) {
		super("Open...");
		this.window = window;
		setEnabled(true);
		setId("publisher.openb3Files");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
			"com.cloudsmith.publish.publisher", IImageKeys.OPEN));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
		window = null;
		filterPath = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
		filterPath = System.getProperty("user.home"); //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		filterPath = Activator.getDefault().getDialogSettings().get(STORE_LAST_OPENED_DIRECTORY_ID);
		if(filterPath == null)
			filterPath = System.getProperty("user.home"); //$NON-NLS-1$

		FileDialog dialog = new FileDialog(window.getShell(), SWT.OPEN | SWT.MULTI);
		dialog.setText(IDEWorkbenchMessages.OpenLocalFileAction_title);
		dialog.setFilterPath(filterPath);
		dialog.setFilterExtensions(new String[] { "*.b3" });
		dialog.open();
		String[] names = dialog.getFileNames();

		if(names != null) {
			filterPath = dialog.getFilterPath();
			Activator.getDefault().getDialogSettings().put(STORE_LAST_OPENED_DIRECTORY_ID, filterPath);

			int numberOfFilesNotFound = 0;
			StringBuffer notFound = new StringBuffer();
			for(int i = 0; i < names.length; i++) {
				IFileStore fileStore = EFS.getLocalFileSystem().getStore(new Path(filterPath));
				fileStore = fileStore.getChild(names[i]);
				IFileInfo fetchInfo = fileStore.fetchInfo();
				if(!fetchInfo.isDirectory() && fetchInfo.exists()) {
					IWorkbenchPage page = window.getActivePage();
					try {
						// open the editor on the file
						page.openEditor(new FileStoreEditorInput(fileStore), ActionConstants.BEELANG_EDITOR_ID);
					}
					catch(PartInitException e) {
						String msg = NLS.bind(
							IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, fileStore.getName());
						IDEWorkbenchPlugin.log(msg, e.getStatus());
						MessageDialog.open(MessageDialog.ERROR, window.getShell(), "Open b3 files", msg, SWT.SHEET);
					}
				}
				else {
					if(++numberOfFilesNotFound > 1)
						notFound.append('\n');
					notFound.append(fileStore.getName());
				}
			}

			if(numberOfFilesNotFound > 0) {
				String msgFmt = numberOfFilesNotFound == 1
						? IDEWorkbenchMessages.OpenLocalFileAction_message_fileNotFound
						: IDEWorkbenchMessages.OpenLocalFileAction_message_filesNotFound;
				String msg = NLS.bind(msgFmt, notFound.toString());
				MessageDialog.open(MessageDialog.ERROR, window.getShell(), "Open b3 files", msg, SWT.SHEET);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
}
