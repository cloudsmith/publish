package com.cloudsmith.publish.ui.wizards;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractWizardPage extends WizardPage {

	protected AbstractWizardPage(String pageName) {
		super(pageName);
	}

	protected AbstractWizardPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	/**
	 * Creates a new label with a bold font.
	 * 
	 * @param parent
	 *            the parent control
	 * @param text
	 *            the label text
	 * @return the new label control
	 */
	protected Label createPlainLabel(Composite parent, String text) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(text);
		label.setFont(parent.getFont());
		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		label.setLayoutData(data);
		return label;
	}

	/**
	 * Creates a horizontal spacer line that fills the width of its container.
	 * 
	 * @param parent
	 *            the parent control
	 */
	protected void createSpacer(Composite parent) {
		Label spacer = new Label(parent, SWT.NONE);
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.BEGINNING;
		spacer.setLayoutData(data);
	}

	/**
	 * Display an error dialog with the specified message.
	 * 
	 * @param message
	 *            the error message
	 */
	protected void displayErrorDialog(String message) {
		MessageDialog.open(MessageDialog.ERROR, getContainer().getShell(),
				getErrorDialogTitle(), message, SWT.SHEET);
	}

	protected String getErrorDialogTitle() {
		return "Error";
	}

	/**
	 * Displays a Yes/No question to the user with the specified message and
	 * returns the user's response.
	 * 
	 * @param message
	 *            the question to ask
	 * @return <code>true</code> for Yes, and <code>false</code> for No
	 */
	protected boolean queryYesNoQuestion(String message) {
		MessageDialog dialog = new MessageDialog(getContainer().getShell(),
				"Question", (Image) null, message, MessageDialog.NONE,
				new String[] { IDialogConstants.YES_LABEL,
						IDialogConstants.NO_LABEL }, 0) {
			@Override
			protected int getShellStyle() {
				return super.getShellStyle() | SWT.SHEET;
			}
		};
		// ensure yes is the default

		return dialog.open() == 0;
	}

	/**
	 * Save any editors that the user wants to save before running page.
	 * 
	 * @return boolean if the save was successful.
	 */
	protected boolean saveDirtyEditors() {
		return PlatformUI.getWorkbench().saveAllEditors(true);
	}
}
