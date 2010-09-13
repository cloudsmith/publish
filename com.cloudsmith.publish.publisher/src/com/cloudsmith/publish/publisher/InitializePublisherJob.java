/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.publisher;

import org.eclipse.b3.beelang.ui.LazyLoadTrigger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Job that loads everything needed to edit.
 * 
 */
public class InitializePublisherJob extends Job {

	/**
	 * @param name
	 */
	public InitializePublisherJob() {
		super("Initializing Repository Builder");
		setPriority(INTERACTIVE);
		setUser(false);
		setSystem(false);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		new LazyLoadTrigger();
		return Status.OK_STATUS;
	}

}
