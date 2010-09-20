package com.cloudsmith.publish.publisher.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.cloudsmith.publish.publisher.IImageKeys;

/**
 * Opens "README.txt" in read only editor.
 */
public class OpenReadmeAction extends Action implements IWorkbenchWindowActionDelegate {

	// public static class ResourceInput implements IStorageEditorInput {
	// private IStorage storage;
	//
	// public ResourceInput(IStorage storage) {
	// this.storage = storage;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if(!(obj instanceof ResourceInput))
	// return false;
	// return ((ResourceInput) obj).storage.equals(storage);
	// }
	//
	// public boolean exists() {
	// return true;
	// }
	//
	// public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
	// return null;
	// }
	//
	// public ImageDescriptor getImageDescriptor() {
	// return null;
	// }
	//
	// public String getName() {
	// return storage.getName();
	// }
	//
	// public IPersistableElement getPersistable() {
	// return null;
	// }
	//
	// public IStorage getStorage() {
	// return storage;
	// }
	//
	// public String getToolTipText() {
	// return "Getting started instructions";
	// }
	// }

	// public static class ResourceStorage implements IStorage {
	// private String resourcePath;
	//
	// public ResourceStorage(String resourcePath) {
	// this.resourcePath = resourcePath;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if(!(obj instanceof ResourceStorage))
	// return false;
	// return resourcePath.equals(((ResourceStorage) obj).resourcePath);
	// }
	//
	// @SuppressWarnings("rawtypes")
	// @Override
	// public Object getAdapter(Class adapter) {
	// return null;
	// }
	//
	// public InputStream getContents() throws CoreException {
	// return this.getClass().getResourceAsStream(resourcePath);
	// }
	//
	// public IPath getFullPath() {
	// return null;
	// }
	//
	// public String getName() {
	// int firstCharIdx = resourcePath.lastIndexOf("/");
	// return resourcePath.substring(firstCharIdx < 0
	// ? 0
	// : firstCharIdx + 1);
	// }
	//
	// public boolean isReadOnly() {
	// return true;
	// }
	// }

	public static void showReadmeInBrowser() {
		URI uri = URI.createPlatformPluginURI("/com.cloudsmith.publish.publisher/resources/README.txt", true);
		IWorkbenchHelpSystem hs = PlatformUI.getWorkbench().getHelpSystem();
		// URI readmeURI = new URI("platform:/com.cloudsmith.publish.publisher/")
		try {
			URL url = new URL(uri.toString());
			url = hs.resolve("/com.cloudsmith.publish.help/help/README.html", true);
			// url = new URL("http://www.svd.se");
			IWorkbenchBrowserSupport bs = PlatformUI.getWorkbench().getBrowserSupport();

			bs.createBrowser("readmeBrowser").openURL(url);
		}
		catch(PartInitException e) {
			e.printStackTrace();

		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// private IWorkbenchWindow window;

	/**
	 * Creates a new action for opening a local file.
	 */
	public OpenReadmeAction(IWorkbenchWindow window) {
		super("Show README");
		// this.window = window;
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
		// window = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		// this.window = window;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		showReadmeInBrowser();
		// IWorkbenchPage page = window.getActivePage();
		// IStorage storage = new ResourceStorage("/resources/README.txt");
		// IEditorInput input = new ResourceInput(storage);
		// try {
		// IEditorPart editor = page.openEditor(input, ActionConstants.TEXT_EDITOR_ID, true);
		// editor.setFocus();
		// if(editor instanceof TextEditor) {
		// ((TextEditor) editor).isSaveAsAllowed();
		// }
		// }
		// catch(CoreException e) {
		// String msg = NLS.bind(IDEWorkbenchMessages.OpenLocalFileAction_message_errorOnOpen, storage.getName());
		// IDEWorkbenchPlugin.log(msg, e.getStatus());
		// MessageDialog.open(MessageDialog.ERROR, window.getShell(), "Open README file", msg, SWT.SHEET);
		// }

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
