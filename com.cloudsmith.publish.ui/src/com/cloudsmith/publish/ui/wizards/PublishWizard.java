package com.cloudsmith.publish.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.b3.backend.core.IResultStatus;
import org.eclipse.b3.build.ui.commands.CmdUnitOfWork;
import org.eclipse.b3.build.ui.commands.ConfigurableWizardDialog;
import org.eclipse.b3.build.ui.commands.ICmdWizard;
import org.eclipse.be.build.ui.wizards.StatusPage;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;

import com.cloudsmith.publish.ui.Activator;

public class PublishWizard extends Wizard implements ICmdWizard {

	private CmdUnitOfWork cmdUnitOfWork;
	private IStatus result;
	private OutputSelectionPage outputSelectionPage;

	public PublishWizard() {
		setNeedsProgressMonitor(true);
		setHelpAvailable(true);
		setWindowTitle("Publish Repository");
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
		// check if this is a close (i.e. a finish on the status page)
		if (getContainer().getCurrentPage() != outputSelectionPage)
			return true; // work all done.

		// makes sure dirty editors are saved and widget values saved for next
		// invocation
		outputSelectionPage.finish();

		// TODO: Set the options from the outputSelection page in cmdUnitOfWork
		Map<String, String> propertyMap = cmdUnitOfWork.getPropertyMap();
		propertyMap.put("b3.output.dir",
				outputSelectionPage.getDestinationValue());
		propertyMap.put("b3.output.overwrite",
				outputSelectionPage.getOverwriteExistingValue());

		try {
			getContainer().run(true, true, cmdUnitOfWork);
			result = cmdUnitOfWork.getResult();
		} catch (InvocationTargetException e1) {
			result = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Invocation of command handler failed", e1);
		} catch (InterruptedException e1) {
			result = Status.CANCEL_STATUS;
		}
		IStatus reportStatus = result;
		if (result.isOK() && result instanceof IResultStatus
				&& ((IResultStatus) result).getResult() instanceof IStatus)
			reportStatus = (IStatus) ((IResultStatus) result).getResult();

		StatusPage page = new StatusPage(reportStatus) {
			@Override
			protected void setHeaderForOk() {
				setTitle("Repository published");
			}
		};
		this.addPage(page);
		IWizardContainer container = getContainer();
		if (container instanceof ConfigurableWizardDialog)
			((ConfigurableWizardDialog) container).configureButtonsForEndPage();

		container.showPage(page);
		// screwed up, a "false" will keep the wizard open
		return false;
	}

	@Override
	public void setCmdWork(CmdUnitOfWork work) {
		this.cmdUnitOfWork = work;
	}

	/**
	 * Called to determine if it is meaningful to report an "ok" status or not.
	 * The default rule is that if the message is a variant of "ok" (case
	 * insensitive), or is empty, false is returned. All other messages result
	 * in a display.
	 * 
	 * @param status
	 * @return
	 */
	protected boolean shouldThisStatusBeReported(IStatus status) {
		if (!(status.matches(IStatus.OK) || status.matches(IStatus.INFO)))
			return false; // error or cancel
		String msg = status.getMessage();
		if (msg == null || msg.length() < 1)
			return false; // nothing to display
		if (status.getMessage().compareToIgnoreCase("ok") == 0)
			return false; // no valuable info to display
		return true;
	}
}
