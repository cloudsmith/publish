package com.cloudsmith.publish.publisher.actions;

import java.net.URL;

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

	/**
	 * The id of the browser instance used to show the readme.
	 */
	private static final String README_BROWSER_ID = "readmeBrowser";

	/**
	 * Reference to the 'readme.html' delivered by the help plugin.
	 */
	private static final String README_TOPIC_CONTENT_REFERENCE = "/com.cloudsmith.publish.help/help/README.html";

	public static void showReadmeInBrowser() {
		IWorkbenchHelpSystem hs = PlatformUI.getWorkbench().getHelpSystem();
		try {
			URL url = hs.resolve(README_TOPIC_CONTENT_REFERENCE, true);
			IWorkbenchBrowserSupport bs = PlatformUI.getWorkbench().getBrowserSupport();

			bs.createBrowser(
				IWorkbenchBrowserSupport.AS_EDITOR, README_BROWSER_ID, "README", "Getting started instructions").openURL(
				url);
		}
		catch(PartInitException e) {
			e.printStackTrace();

		}
	}

	/**
	 * Creates a new action for opening a local file.
	 */
	public OpenReadmeAction(IWorkbenchWindow window) {
		super("Show README");
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
		// empty
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		// empty - do not need the window
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		showReadmeInBrowser();
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
