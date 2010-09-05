/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.ui.wizards;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.b3.build.ui.commands.StatusReportHelper;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * A page that displays status information
 * 
 */
public class StatusPage extends WizardPage {
	private IStatus status;
	private Label imageLabel;
	private Label messageLabel;
	private Text text;
	private StatusReportHelper reportHelper = new StatusReportHelper();
	private int reportType = REPORT_DETAIL_NONE;
	private static final int REPORT_DETAIL_NONE = 0;
	private static final int REPORT_DETAIL_STACKTRACE = 1;
	private static final int REPORT_DETAIL_STATUS = 2;

	/**
	 * Size of the text in lines.
	 */
	private static final int TEXT_LINE_COUNT = 15;

	/**
	 * @param status
	 *            the status to report
	 */
	protected StatusPage(IStatus status) {
		super("status");
		this.status = status;
		if (status.isOK() || status.matches(IStatus.INFO))
			setHeaderForOk();
		else if (status.matches(IStatus.ERROR))
			setHeaderForError();
		else if (status.matches(IStatus.WARNING))
			setHeaderForWarning();
		else if (status.matches(IStatus.CANCEL))
			setHeaderForWarning();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		composite.setFont(parent.getFont());

		createMessageArea(composite);
		configureDetailReporting(composite);
		setControl(composite);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#getPreviousPage()
	 */
	@Override
	public IWizardPage getPreviousPage() {

		return null;
	}

	protected void configureDetailReporting(Composite composite) {

		if (status.matches(IStatus.ERROR)) {
			if (reportHelper.shouldThisErrorBeReportedWithStackTrace(status)) {
				reportType = REPORT_DETAIL_STACKTRACE;
				setMessage("Please report this error!", IStatus.ERROR);
			} else
				reportType = REPORT_DETAIL_STATUS;
		}
		if (reportType != REPORT_DETAIL_NONE)
			createDetailArea(composite);

	}

	/**
	 * Create this dialog's drop-down list component.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	protected void createDetailArea(Composite parent) {
		// create the list
		text = new Text(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		text.setFont(parent.getFont());

		// print the stacktrace in the text field
		if (reportType == REPORT_DETAIL_STACKTRACE) {
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				PrintStream ps = new PrintStream(baos);
				status.getException().printStackTrace(ps);
				ps.flush();
				baos.flush();
				text.setText(baos.toString());
			} catch (IOException e) {
			}
		} else {
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				PrintStream ps = new PrintStream(baos);
				printStatusOnStream(status, ps);
				ps.flush();
				baos.flush();
				text.setText(baos.toString());
			} catch (IOException e) {
			}
		}

		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL
				| GridData.GRAB_VERTICAL);
		data.heightHint = text.getLineHeight() * TEXT_LINE_COUNT;
		// data.horizontalSpan = 2;
		text.setLayoutData(data);
	}

	protected void setHeaderForCancel() {
		setTitle("Operation canceled");
	}

	protected void setHeaderForError() {
		setTitle("Error");
	}

	protected void setHeaderForOk() {
		setTitle("Operation succeeded");
	}

	protected void setHeaderForWarning() {
		setTitle("Warning");
	}

	private void createMessageArea(Composite composite) {
		// create composite
		// create image
		Image image = composite.getShell().getDisplay()
				.getSystemImage(getIconID());

		if (image != null) {
			imageLabel = new Label(composite, SWT.NULL);
			image.setBackground(imageLabel.getBackground());
			imageLabel.setImage(image);
			GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.BEGINNING)
					.applyTo(imageLabel);
		}
		// create message
		String msg = getStatusMessage();
		if (msg != null) {
			messageLabel = new Label(composite, SWT.WRAP);
			messageLabel.setText(msg);
			GridDataFactory
					.fillDefaults()
					.align(SWT.FILL, SWT.BEGINNING)
					.grab(true, false)
					.hint(convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH),
							SWT.DEFAULT).applyTo(messageLabel);
		}
	}

	private int getIconID() {
		if (status.matches(IStatus.ERROR))
			return SWT.ICON_ERROR;
		// warnings and cancel shown with warning icon
		if (status.matches(IStatus.WARNING) || status.matches(IStatus.CANCEL))
			return SWT.ICON_WARNING;
		return SWT.ICON_INFORMATION;
	}

	private String getStatusMessage() {
		if (status.matches(IStatus.CANCEL)
				&& "cancel".equals(status.getMessage()))
			return "Output produced by the operation may not be valid.";
		return status.getMessage();
	}

	private void indent(PrintStream ps, int indentLevel) {
		for (int i = 0; i < indentLevel * 4; i++)
			ps.print(' ');
	}

	/**
	 * Prints the exception message.
	 * 
	 * @param t
	 * @param ps
	 * @param indentLevel
	 */
	private void printExceptionOnStream(Throwable t, PrintStream ps,
			int indentLevel) {
		if (t == null || t.getMessage() == null)
			return;
		indent(ps, indentLevel);
		ps.println(t.getMessage());
	}

	private void printStatusOnStream(IStatus status, PrintStream ps) {
		// skip the first message as it is already displayed in the message area
		printStatusOnStream(status, ps, -1, true);
	}

	private void printStatusOnStream(IStatus status, PrintStream ps,
			int indentLevel, boolean skipMessage) {
		if (!skipMessage) {
			indent(ps, indentLevel);
			ps.println(status.getMessage());
		}
		if (status.isMultiStatus()) {
			for (IStatus s : status.getChildren())
				printStatusOnStream(s, ps, indentLevel + 1, false);
		} else {
			Throwable t = status.getException();
			if (t instanceof CoreException) {
				printStatusOnStream(((CoreException) t).getStatus(), ps,
						indentLevel + 1, false);
			} else {
				printExceptionOnStream(t, ps, indentLevel + 1);
			}
		}
	}
}
