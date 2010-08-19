package com.cloudsmith.publish.publisher.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IStatus;
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
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.cloudsmith.publish.publisher.ActionConstants;
import com.cloudsmith.publish.publisher.Activator;
import com.cloudsmith.publish.publisher.IImageKeys;

public class Newb3FileAction extends Action implements IWorkbenchWindowActionDelegate {

	public static final long copyStream(InputStream source, OutputStream dest, int bufferSize) throws IOException {
		int bytes;
		long total;
		byte[] buffer;

		buffer = new byte[bufferSize];
		total = 0;
		while((bytes = source.read(buffer)) != -1) {
			// Technically, some read(byte[]) methods may return 0 and we cannot
			// accept that as an indication of EOF.

			if(bytes == 0) {
				bytes = source.read();
				if(bytes < 0)
					break;
				dest.write(bytes);
				dest.flush();
				++total;
				continue;
			}

			dest.write(buffer, 0, bytes);
			dest.flush();
			total += bytes;
		}

		return total;
	}

	private IWorkbenchWindow window;

	public Newb3FileAction(IWorkbenchWindow window) {
		super("New");
		this.window = window;
		setEnabled(true);
		setId("publisher.newb3File");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
			"com.cloudsmith.publish.publisher", IImageKeys.NEW));
	}

	public void dispose() {
		window = null;
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	@Override
	public void run() {

		File newFile = null;
		try {
			// TODO: This strategy creates horrible temp names that are visible
			newFile = File.createTempFile("untitled", ".b3");
		}
		catch(IOException e) {
			String msg = "Cannot create a temporary file";
			IDEWorkbenchPlugin.log(msg, new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
			MessageDialog.open(MessageDialog.ERROR, window.getShell(), "New b3", msg, SWT.SHEET);
			return;
		}

		InputStream is = this.getClass().getResourceAsStream("/resources/newStackTemplate.b3");

		try {
			FileOutputStream fos = new FileOutputStream(newFile);

			try {
				copyStream(is, fos, 4096);
			}
			catch(IOException e) {
				String msg = "Cannot copy template script to newly created file";
				IDEWorkbenchPlugin.log(msg, new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
				MessageDialog.open(MessageDialog.ERROR, window.getShell(), "New b3", msg, SWT.SHEET);
				return;
			}
			finally {
				try {
					if(is != null)
						is.close();

					if(fos != null)
						fos.close();
				}
				catch(IOException e) {
					// ignore
				}
			}
		}
		catch(FileNotFoundException e) {
			String msg = "Cannot find " + newFile.toString();
			IDEWorkbenchPlugin.log(msg, new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
			MessageDialog.open(MessageDialog.ERROR, window.getShell(), "New b3", msg, SWT.SHEET);
			return;
		}

		IFileStore fileStore = EFS.getLocalFileSystem().fromLocalFile(newFile);
		IFileInfo fetchInfo = fileStore.fetchInfo();
		if(fetchInfo.exists()) {
			IWorkbenchPage page = window.getActivePage();
			try {
				// open the editor on the file
				page.openEditor(new FileStoreEditorInput(fileStore), ActionConstants.BEELANG_EDITOR_ID);
			}
			catch(PartInitException e) {
				String msg = NLS.bind(IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, fileStore.getName());
				IDEWorkbenchPlugin.log(msg, e.getStatus());
				MessageDialog.open(MessageDialog.ERROR, window.getShell(), "Open b3 files", msg, SWT.SHEET);
				return;
			}
		}
	}

	public void run(IAction action) {
		run();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

}
