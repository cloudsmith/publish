package com.cloudsmith.publish.ui.wizards;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;

public class OutputSelectionPage extends AbstractWizardPage implements Listener {

	// widgets
	private Combo destinationNameField;

	private Button destinationBrowseButton;

	protected Button overwriteExistingFilesCheckbox;

	// messages
	// this message is the message shown inside the directory selection dialog
	// (shown in cocoa ui at least).
	private static final String SELECT_DESTINATION_MESSAGE = "Select directory for output";

	// this message is the title of the dialog for directory selection (not
	// always shown - not in cocoa at least)
	private static final String SELECT_DESTINATION_TITLE = "Select directory for outout";

	// constants
	protected static final int SIZING_TEXT_FIELD_WIDTH = 250;

	protected static final int COMBO_HISTORY_LENGTH = 5;

	// dialog id constants
	private static final String STORE_DESTINATION_NAMES_ID = "WizardOutputSelectionPage.STORE_DESTINATION_NAMES_ID"; //$NON-NLS-1$

	private static final String STORE_OVERWRITE_EXISTING_FILES_ID = "WizardOutputSelectionPage.STORE_OVERWRITE_EXISTING_FILES_ID"; //$NON-NLS-1$

	public OutputSelectionPage() {
		super("outputSelectionPage");
		setTitle("Repository Generation Details");
		setDescription("Specify directory location and options for repository generation output");
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		composite.setFont(parent.getFont());

		createDestinationGroup(composite);
		createOptionsGroup(composite);
		restoreWidgetValues(); // ie.- subclass hook

		updateWidgetEnablements();
		setPageComplete(determinePageCompletion());
		setErrorMessage(null); // should not initially have error message

		setControl(composite);
	}

	/**
	 * Should be called by an enclosing wizard to: 1. make sure all dirty
	 * editors are saved 2. all fields on the destination page are saved (for
	 * next invocation)
	 * 
	 * This page does *not* perform the actual operation.
	 * 
	 * @return boolean
	 */
	public boolean finish() {
		// make sure the specified directory exists (or prompt to create it).
		ensureDirectoryExists(new File(getDestinationValue()));

		// Save dirty editors if possible but do not stop if not all are saved
		saveDirtyEditors();
		// about to invoke the operation so save our state
		saveWidgetValues();

		return true;
	}

	/**
	 * Returns the value of the selected directory (path) as a String.
	 * 
	 * @return java.lang.String
	 */
	public String getDestinationValue() {
		return destinationNameField.getText().trim();
	}

	/**
	 * Returns the value of the "overwrite existing" option as a boolean string.
	 * 
	 * @return
	 */
	public String getOverwriteExistingValue() {
		return Boolean.toString(overwriteExistingFilesCheckbox.getSelection());
	}

	/**
	 * Handle all events and enablements for widgets in this page
	 * 
	 * @param e
	 *            Event
	 */
	@Override
	public void handleEvent(Event e) {
		Widget source = e.widget;

		if (source == destinationBrowseButton) {
			handleDestinationBrowseButtonPressed();
		}

		updatePageCompletion();
	}

	/**
	 * Add the passed value to self's destination widget's history
	 * 
	 * @param value
	 *            java.lang.String
	 */
	protected void addDestinationItem(String value) {
		destinationNameField.add(value);
	}

	/**
	 * Adds an entry to a history, while taking care of duplicate history items
	 * and excessively long histories. The assumption is made that all histories
	 * should be of length
	 * <code>WizardDataTransferPage.COMBO_HISTORY_LENGTH</code>.
	 * 
	 * @param history
	 *            the current history
	 * @param newEntry
	 *            the entry to add to the history
	 */
	protected void addToHistory(List<String> history, String newEntry) {
		history.remove(newEntry);
		history.add(0, newEntry);

		// since only one new item was added, we can be over the limit
		// by at most one item
		if (history.size() > COMBO_HISTORY_LENGTH) {
			history.remove(COMBO_HISTORY_LENGTH);
		}
	}

	/**
	 * Adds an entry to a history, while taking care of duplicate history items
	 * and excessively long histories. The assumption is made that all histories
	 * should be of length
	 * <code>WizardDataTransferPage.COMBO_HISTORY_LENGTH</code>.
	 * 
	 * @param history
	 *            the current history
	 * @param newEntry
	 *            the entry to add to the history
	 */
	protected String[] addToHistory(String[] history, String newEntry) {
		java.util.ArrayList<String> l = new java.util.ArrayList<String>(
				Arrays.asList(history));
		addToHistory(l, newEntry);
		String[] r = new String[l.size()];
		l.toArray(r);
		return r;
	}

	/**
	 * Create the export destination specification widgets
	 * 
	 * @param parent
	 *            org.eclipse.swt.widgets.Composite
	 */
	protected void createDestinationGroup(Composite parent) {

		Font font = parent.getFont();
		// destination specification group
		Composite destinationSelectionGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		destinationSelectionGroup.setLayout(layout);
		destinationSelectionGroup.setLayoutData(new GridData(
				GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
		destinationSelectionGroup.setFont(font);

		Label destinationLabel = new Label(destinationSelectionGroup, SWT.NONE);
		destinationLabel.setText("Generate in directory");
		destinationLabel.setFont(font);

		// destination name entry field
		destinationNameField = new Combo(destinationSelectionGroup, SWT.SINGLE
				| SWT.BORDER);
		destinationNameField.addListener(SWT.Modify, this);
		destinationNameField.addListener(SWT.Selection, this);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		destinationNameField.setLayoutData(data);
		destinationNameField.setFont(font);

		// destination browse button
		destinationBrowseButton = new Button(destinationSelectionGroup,
				SWT.PUSH);
		destinationBrowseButton.setText("Browse");
		destinationBrowseButton.addListener(SWT.Selection, this);
		destinationBrowseButton.setFont(font);
		setButtonLayoutData(destinationBrowseButton);

		new Label(parent, SWT.NONE); // vertical spacer
	}

	/**
	 * Create the options specification widgets.
	 * 
	 * @param parent
	 *            org.eclipse.swt.widgets.Composite
	 */
	protected void createOptionsGroup(Composite parent) {
		// options group
		Group optionsGroup = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		optionsGroup.setLayout(layout);
		optionsGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL));
		optionsGroup.setText("Options");
		optionsGroup.setFont(parent.getFont());

		createOptionsGroupButtons(optionsGroup);
	}

	/**
	 * Create the buttons in the options group.
	 */

	protected void createOptionsGroupButtons(Group optionsGroup) {

		Font font = optionsGroup.getFont();
		createOverwriteExisting(optionsGroup, font);

	}

	/**
	 * Create the button for checking if we should ask if we are going to
	 * overwrite existing files.
	 * 
	 * @param optionsGroup
	 * @param font
	 */
	protected void createOverwriteExisting(Group optionsGroup, Font font) {
		// overwrite... checkbox
		overwriteExistingFilesCheckbox = new Button(optionsGroup, SWT.CHECK
				| SWT.LEFT);
		overwriteExistingFilesCheckbox.setText("Overwrite existing");
		overwriteExistingFilesCheckbox.setFont(font);
		// set default to true (can be overridden by saved state).
		overwriteExistingFilesCheckbox.setSelection(true);
	}

	/**
	 * Returns whether this page is complete. This determination is made based
	 * upon the current contents of this page's controls. Subclasses wishing to
	 * include their controls in this determination should override the hook
	 * methods <code>validateSourceGroup</code> and/or
	 * <code>validateOptionsGroup</code>.
	 * 
	 * @return <code>true</code> if this page is complete, and
	 *         <code>false</code> if incomplete
	 * @see #validateSourceGroup
	 * @see #validateOptionsGroup
	 */
	protected boolean determinePageCompletion() {
		boolean complete = validateDestinationGroup() && validateOptionsGroup();

		// Avoid draw flicker by not clearing the error
		// message unless all is valid.
		if (complete) {
			setErrorMessage(null);
		}

		return complete;
	}

	/**
	 * Attempts to ensure that the specified directory exists on the local file
	 * system. Answers a boolean indicating success.
	 * 
	 * @return boolean
	 * @param directory
	 *            java.io.File
	 */
	protected boolean ensureDirectoryExists(File directory) {
		if (!directory.exists()) {
			if (!queryYesNoQuestion("Directory does not exist. Do you want to create it?")) {
				return false;
			}

			if (!directory.mkdirs()) {
				displayErrorDialog("Creation of directory failed!");
				// giveFocusToDestination();
				return false;
			}
		}

		return true;
	}

	/**
	 * Set the current input focus to self's destination entry field
	 */
	protected void giveFocusToDestination() {
		destinationNameField.setFocus();
	}

	/**
	 * Open an appropriate destination browser so that the user can specify a
	 * source to import from
	 */
	protected void handleDestinationBrowseButtonPressed() {
		DirectoryDialog dialog = new DirectoryDialog(getContainer().getShell(),
				SWT.SAVE | SWT.SHEET);
		dialog.setMessage(SELECT_DESTINATION_MESSAGE);
		dialog.setText(SELECT_DESTINATION_TITLE);
		dialog.setFilterPath(getDestinationValue());
		String selectedDirectoryName = dialog.open();

		if (selectedDirectoryName != null) {
			setErrorMessage(null);
			setDestinationValue(selectedDirectoryName);
		}
	}

	/**
	 * Hook method for restoring widget values to the values that they held last
	 * time this wizard was used to completion.
	 */
	protected void restoreWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			String[] directoryNames = settings
					.getArray(STORE_DESTINATION_NAMES_ID);
			if (directoryNames == null) {
				return; // ie.- no settings stored
			}

			// destination
			setDestinationValue(directoryNames[0]);
			for (int i = 0; i < directoryNames.length; i++) {
				addDestinationItem(directoryNames[i]);
			}

			// options
			overwriteExistingFilesCheckbox.setSelection(settings
					.getBoolean(STORE_OVERWRITE_EXISTING_FILES_ID));

		}
	}

	/**
	 * Hook method for saving widget values for restoration by the next instance
	 * of this class.
	 */
	protected void saveWidgetValues() {
		// update directory names history
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			String[] directoryNames = settings
					.getArray(STORE_DESTINATION_NAMES_ID);
			if (directoryNames == null) {
				directoryNames = new String[0];
			}

			directoryNames = addToHistory(directoryNames, getDestinationValue());
			settings.put(STORE_DESTINATION_NAMES_ID, directoryNames);

			// options
			settings.put(STORE_OVERWRITE_EXISTING_FILES_ID,
					overwriteExistingFilesCheckbox.getSelection());

		}
	}

	/**
	 * Set the contents of the receivers destination specification widget to the
	 * passed value
	 * 
	 */
	protected void setDestinationValue(String value) {
		destinationNameField.setText(value);
	}

	/**
	 * Determine if the page is complete and update the page appropriately.
	 */
	protected void updatePageCompletion() {
		boolean pageComplete = determinePageCompletion();
		setPageComplete(pageComplete);
		if (pageComplete) {
			setErrorMessage(null);
		}
	}

	/**
	 * Check if widgets are enabled or disabled by a change in the dialog.
	 */
	protected void updateWidgetEnablements() {

		boolean pageComplete = determinePageCompletion();
		setPageComplete(pageComplete);
		if (pageComplete) {
			setMessage(null);
		}
	}

	/**
	 * Answer a boolean indicating whether the receivers destination
	 * specification widgets currently all contain valid values.
	 */
	protected boolean validateDestinationGroup() {
		String destinationValue = getDestinationValue();
		if (destinationValue.length() == 0) {
			setMessage("No output directory specified");
			return false;
		}
		// TODO: Add more sanity checks such as preventing generating into the
		// installed app

		return true;
	}

	/**
	 * Returns whether this page's options group's controls currently all
	 * contain valid values.
	 * <p>
	 * The <code>WizardDataTransferPage</code> implementation of this method
	 * returns <code>true</code>. Subclasses may reimplement this hook method.
	 * </p>
	 * 
	 * @return <code>true</code> indicating validity of all controls in the
	 *         options group
	 */
	protected boolean validateOptionsGroup() {
		// TODO: if there are more complex options - add validation here
		return true;
	}
}
