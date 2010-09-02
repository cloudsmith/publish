package com.cloudsmith.publish.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.build.ui.commands.CmdUnitOfWork;
import org.eclipse.b3.build.ui.commands.ICmdWizard;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.Wizard;

import com.cloudsmith.publish.ui.Activator;

public class PublishWizard extends Wizard implements ICmdWizard {

	private CmdUnitOfWork cmdUnitOfWork;
	private IStatus result;
	private OutputSelectionPage outputSelectionPage;

	public PublishWizard() {
		setNeedsProgressMonitor(true);
		setHelpAvailable(true);
		setWindowTitle("Generate Repository");
		setDefaultPageImageDescriptor(Activator.getDefault()
				.getImageDescriptor(Activator.IImageKeys.PUBLISH_WIZ_ICON));
		// for persistence of wizard values
		setDialogSettings(Activator.plugin.getDialogSettings());
	}

	@Override
	public void addPages() {
		outputSelectionPage = new OutputSelectionPage();
		addPage(outputSelectionPage);
	}

	@Override
	public IStatus getResult() {
		return result;
	}

	@Override
	public boolean performFinish() {
		// makes sure dirty editors are saved and widget values saved for next
		// invocation
		outputSelectionPage.finish();

		// TODO: Set the options from the outputSelection page in cmdUnitOfWork

		try {
			getContainer().run(true, true, cmdUnitOfWork);
			result = cmdUnitOfWork.getResult();
		} catch (InvocationTargetException e1) {
			result = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Invocation of command handler failed", e1);
		} catch (InterruptedException e1) {
			result = Status.CANCEL_STATUS;
		}
		return true;
	}

	@Override
	public void setCmdWork(CmdUnitOfWork work) {
		this.cmdUnitOfWork = work;
	}

}
