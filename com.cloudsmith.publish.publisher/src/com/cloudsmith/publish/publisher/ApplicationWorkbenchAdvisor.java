package com.cloudsmith.publish.publisher;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.beelang.ui.xtext.linked.ExtLinkedXtextEditor;
import org.eclipse.b3.beelang.ui.xtext.linked.TmpFileStoreEditorInput;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.part.FileEditorInput;

import com.cloudsmith.publish.publisher.actions.ReducedPreferencesAction;

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
		ReducedPreferencesAction.removeUnwantedPreferences();
		InitializePublisherJob job = new InitializePublisherJob();
		job.schedule();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.WorkbenchAdvisor#restoreState(org.eclipse.ui.IMemento)
	 */
	@Override
	public IStatus restoreState(IMemento memento) {
		IStatus status = super.restoreState(memento);
		return status;
	}

	private void cleanUntitledArea() throws CoreException {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		// Collect open untitled files
		List<IFile> keep = new ArrayList<IFile>();
		IEditorReference[] editorReferences = this.getWorkbenchConfigurer().getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
		for(IEditorReference er : editorReferences) {
			IEditorInput input = er.getEditorInput();
			if(input instanceof FileEditorInput) {
				IFile f = ((FileEditorInput) input).getFile();
				String untitled = f.getPersistentProperty(TmpFileStoreEditorInput.UNTITLED_PROPERTY);
				if(untitled != null && "true".equals(untitled))
					keep.add(f);
			}
		}
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
			if(r.isLinked()) {
				if(!keep.contains(r))
					r.delete(true, new NullProgressMonitor());
			}
		}

	}

}
