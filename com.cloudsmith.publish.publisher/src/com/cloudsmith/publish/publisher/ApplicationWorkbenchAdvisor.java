package com.cloudsmith.publish.publisher;

import org.eclipse.b3.beelang.ui.xtext.linked.ExtLinkedXtextEditor;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "com.cloudsmith.publish.publisher.perspective";

	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	@Override
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#initialize(org.eclipse.ui.application.IWorkbenchConfigurer)
	 */
	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#postStartup()
	 */
	@Override
	public void postStartup() {
		// Clean "untitled" area
		//
		try {
			cleanUntitledArea();
		}
		catch(CoreException e) {
			// what to do here?
			e.printStackTrace();
		}
		InitializePublisherJob job = new InitializePublisherJob();
		job.schedule();
	}

	private void cleanUntitledArea() throws CoreException {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		// get, or create project if non existing
		IProject project = ws.getRoot().getProject(ExtLinkedXtextEditor.AUTOLINK_PROJECT_NAME);
		boolean newProject = false;
		if(!project.exists()) {
			project.create(null);
			newProject = true;
		}
		if(!project.isOpen()) {
			project.open(null);
			project.setHidden(true);
		}

		if(newProject)
			project.setDefaultCharset(ExtLinkedXtextEditor.ENCODING_UTF8, new NullProgressMonitor());
		IFolder untitledFolder = project.getFolder("untitled");
		if(!untitledFolder.exists())
			return; // nothing to clear
		for(IResource r : untitledFolder.members()) {
			if(r.isLinked())
				r.delete(true, new NullProgressMonitor());
		}

	}
}
