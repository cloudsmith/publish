package com.cloudsmith.publish.publisher.actions;

import java.io.InputStream;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.cloudsmith.publish.publisher.ActionConstants;
import com.cloudsmith.publish.publisher.IImageKeys;

/**
 * Opens "README.txt" in read only editor.
 */
public class OpenReadmeAction extends Action implements IWorkbenchWindowActionDelegate {

	public static class ResourceInput implements IStorageEditorInput {
		private IStorage storage;

		ResourceInput(IStorage storage) {
			this.storage = storage;
		}

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof ResourceInput))
				return false;
			return ((ResourceInput) obj).storage.equals(storage);
		}

		public boolean exists() {
			return true;
		}

		public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
			return null;
		}

		public ImageDescriptor getImageDescriptor() {
			return null;
		}

		public String getName() {
			return storage.getName();
		}

		public IPersistableElement getPersistable() {
			return null;
		}

		public IStorage getStorage() {
			return storage;
		}

		public String getToolTipText() {
			return "Getting started instructions";
		}
	}

	static class ResourceStorage implements IStorage {
		private String resourcePath;

		ResourceStorage(String resourcePath) {
			this.resourcePath = resourcePath;
		}

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof ResourceStorage))
				return false;
			return resourcePath.equals(((ResourceStorage) obj).resourcePath);
		}

		@SuppressWarnings("rawtypes")
		@Override
		public Object getAdapter(Class adapter) {
			return null;
		}

		public InputStream getContents() throws CoreException {
			return this.getClass().getResourceAsStream(resourcePath);
		}

		public IPath getFullPath() {
			return null;
		}

		public String getName() {
			int firstCharIdx = resourcePath.lastIndexOf("/");
			return resourcePath.substring(firstCharIdx < 0
					? 0
					: firstCharIdx + 1);
		}

		public boolean isReadOnly() {
			return true;
		}
	}

	private IWorkbenchWindow window;

	/**
	 * Creates a new action for opening a local file.
	 */
	public OpenReadmeAction(IWorkbenchWindow window) {
		super("Show README");
		this.window = window;
		setEnabled(true);
		setId("publisher.openReadme");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
			"com.cloudsmith.publish.publisher", IImageKeys.README));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
		window = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		IWorkbenchPage page = window.getActivePage();
		IStorage storage = new ResourceStorage("/resources/README.txt");
		IEditorInput input = new ResourceInput(storage);
		// URL readmeURL = Activator.getDefault().getBundle().getResource("/resources/README.txt");
		// URI readmeURI;
		// readmeURI = URI.createPlatformResourceURI("com.cloudsmith.publish.publisher/resources/README.txt", true);

		// IFileStore fileStore = null;
		try {
			// fileStore = EFS.getStore(readmeURI);
			// input = new FileEditorInput(EFS.g);
			// URIEditorInput input = new URIEditorInput(readmeURI);
			page.openEditor(input, ActionConstants.TEXT_EDITOR_ID);
			// page.openEditor(new FileStoreEditorInput(fileStore), ActionConstants.TEXT_EDITOR_ID);
		}
		catch(CoreException e) {
			// String name = fileStore == null
			// ? readmeURI.toString()
			// : fileStore.getName();
			String msg = NLS.bind(IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, storage.getName());
			IDEWorkbenchPlugin.log(msg, e.getStatus());
			MessageDialog.open(MessageDialog.ERROR, window.getShell(), "Open README file", msg, SWT.SHEET);
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
