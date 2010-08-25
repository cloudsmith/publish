package com.cloudsmith.publish.publisher;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.util.Util;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.IWorkbenchHelpContextIds;
import org.eclipse.ui.internal.WorkbenchMessages;
import org.eclipse.ui.internal.handlers.IActionCommandMappingService;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.provisional.application.IActionBarConfigurer2;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import com.cloudsmith.publish.publisher.actions.NewB3ExampleFileAction;
import com.cloudsmith.publish.publisher.actions.Newb3FileAction;
import com.cloudsmith.publish.publisher.actions.OpenLocalb3FileAction;
import com.cloudsmith.publish.publisher.actions.ReducedPreferencesAction;

// NOTE: See org.eclipse.ui.internal.ide.WorkbenchActionBuilder for how the same is done in the IDE
/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 * 
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.

	private IWorkbenchAction saveAction;

	private IWorkbenchAction saveToolbarAction;

	private IWorkbenchAction saveAsAction;

	private IWorkbenchAction saveAllAction;

	private IWorkbenchAction revertAction;

	private IAction preferencesAction;

	private IWorkbenchAction aboutAction;

	private IWorkbenchAction quitAction;

	private IWorkbenchAction closeAction;

	private IWorkbenchAction closeAllAction;

	private IAction newFileAction;

	private IAction newFileToolbarAction;

	private IAction openFileAction;

	private IAction openFileToolbarAction;

	private Separator preferenceSeparator;

	private ActionContributionItem preferencesActionItem;

	private ActionContributionItem quitActionItem;

	@SuppressWarnings("unused")
	private MenuManager fileMenu;

	private IWorkbenchAction helpContentsAction;

	private IWorkbenchAction helpSearchAction;

	@SuppressWarnings("unused")
	private MenuManager helpMenu;

	private IWorkbenchAction undoAction;

	private IWorkbenchAction redoAction;

	private IWorkbenchAction cutAction;

	private IWorkbenchAction copyAction;

	private IWorkbenchAction pasteAction;

	private IWorkbenchAction deleteAction;

	private IWorkbenchAction selectAllAction;

	private IWorkbenchAction findReplaceAction;

	private final IWorkbenchWindow window;

	@SuppressWarnings("unused")
	private MenuManager editMenu;

	private boolean isDisposed;

	private ActionContributionItem aboutActionItem;

	private NewB3ExampleFileAction newExampleFileAction;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
		window = configurer.getWindowConfigurer().getWindow();
	}

	@Override
	public void dispose() {
		if(isDisposed)
			return;
		isDisposed = true;
		// set all actions and remembered menus to null
		saveAction = null;
		saveToolbarAction = null;
		saveAsAction = null;
		saveAllAction = null;
		revertAction = null;
		preferencesAction = null;
		aboutAction = null;
		aboutActionItem = null;
		quitAction = null;
		closeAction = null;
		closeAllAction = null;
		newFileAction = null;
		newFileToolbarAction = null;
		openFileAction = null;
		openFileToolbarAction = null;
		preferenceSeparator = null;
		preferencesActionItem = null;
		quitActionItem = null;
		fileMenu = null;
		helpContentsAction = null;
		helpSearchAction = null;
		helpMenu = null;
		undoAction = null;
		redoAction = null;
		cutAction = null;
		copyAction = null;
		pasteAction = null;
		deleteAction = null;
		selectAllAction = null;
		findReplaceAction = null;
		editMenu = null;
		newExampleFileAction = null;
		super.dispose();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
	 */
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
		IActionBarConfigurer2 actionBarConfigurer = (IActionBarConfigurer2) getActionBarConfigurer();
		IToolBarManager fileToolBar = actionBarConfigurer.createToolBarManager();

		fileToolBar.add(newFileToolbarAction);
		fileToolBar.add(openFileToolbarAction);
		fileToolBar.add(saveToolbarAction);
		fileToolBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

		coolBar.add(actionBarConfigurer.createToolBarContributionItem(fileToolBar, "publisher.toolbar"));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		menuBar.add(fileMenu = createFileMenu());
		menuBar.add(editMenu = createEditMenu());
		// Disabled as this seems to create an empty space in the top level menu bar
		// menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menuBar.add(helpMenu = createHelpMenu());

		// Set things invisible that are moved to Apple menu by OSX Cocoa fragment
		enhanceForMacOsx();
	}

	@Override
	protected void makeActions(IWorkbenchWindow window) {

		// standard actions
		register(saveAction = ActionFactory.SAVE.create(window));
		register(saveToolbarAction = ActionFactory.SAVE.create(window));

		// saveToolbarAction.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
		// "com.cloudsmith.publish.publisher", IImageKeys.SAVE_32));
		// saveToolbarAction.setDisabledImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
		// "com.cloudsmith.publish.publisher", IImageKeys.SAVE_32));

		register(saveAsAction = ActionFactory.SAVE_AS.create(window));
		register(saveAllAction = ActionFactory.SAVE_ALL.create(window));
		register(aboutAction = ActionFactory.ABOUT.create(window));

		// TODO: Set the image of "about" to the application icon
		// BELOW IS HOW IT IS DONE IN THE IDE...
		// aboutAction
		// .setImageDescriptor(IDEInternalWorkbenchImages
		// .getImageDescriptor(IDEInternalWorkbenchImages.IMG_OBJS_DEFAULT_PROD));

		register(quitAction = ActionFactory.QUIT.create(window));
		register(closeAction = ActionFactory.CLOSE.create(window));
		register(closeAllAction = ActionFactory.CLOSE_ALL.create(window));
		register(revertAction = ActionFactory.REVERT.create(window));
		register(helpContentsAction = ActionFactory.HELP_CONTENTS.create(window));
		register(helpSearchAction = ActionFactory.HELP_SEARCH.create(window));

		register(undoAction = ActionFactory.UNDO.create(window));
		register(redoAction = ActionFactory.REDO.create(window));
		register(cutAction = ActionFactory.CUT.create(window));
		register(copyAction = ActionFactory.COPY.create(window));
		register(pasteAction = ActionFactory.PASTE.create(window));
		register(deleteAction = ActionFactory.DELETE.create(window));
		register(selectAllAction = ActionFactory.SELECT_ALL.create(window));
		register(findReplaceAction = ActionFactory.FIND.create(window));

		// application specific actions
		register(newFileAction = new Newb3FileAction(window));
		register(newExampleFileAction = new NewB3ExampleFileAction(window));
		register(newFileToolbarAction = new Newb3FileAction(window));

		// newFileToolbarAction.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
		// "com.cloudsmith.publish.publisher", IImageKeys.NEW_32));

		register(openFileAction = new OpenLocalb3FileAction(window));
		register(openFileToolbarAction = new OpenLocalb3FileAction(window));

		// openFileToolbarAction.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
		// "com.cloudsmith.publish.publisher", IImageKeys.OPEN_32));

		register(preferencesAction = new ReducedPreferencesAction(window));
	}

	/**
	 * Creates and returns the Edit menu.
	 */
	private MenuManager createEditMenu() {
		MenuManager menu = new MenuManager(IDEWorkbenchMessages.Workbench_edit, "publisher.edit");
		// menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

		menu.add(undoAction);
		menu.add(redoAction);
		menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));
		menu.add(new Separator());

		menu.add(getCutItem());
		menu.add(getCopyItem());
		menu.add(getPasteItem());
		menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));
		menu.add(new Separator());

		menu.add(getDeleteItem());
		menu.add(getSelectAllItem());
		menu.add(new Separator());

		menu.add(getFindItem());
		// menu.add(new GroupMarker(IWorkbenchActionConstants.FIND_EXT));
		// menu.add(new Separator());
		//
		// menu.add(getBookmarkItem());
		// menu.add(getTaskItem());
		// menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));

		// menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
		// menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		return menu;
	}

	private MenuManager createFileMenu() {
		// create the file menu itself
		// Do NOT use the default id IWorkbenchActionConstants.M_FILE (i.e. "file") for this
		// menu, as there will be too many contributions of unwanted commands.
		MenuManager menu = new MenuManager(IDEWorkbenchMessages.Workbench_file, "publisher.file");
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));

		// If this entry is included, the default "Open File..." is added by
		// a contribution.
		// menu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));
		menu.add(newFileAction);
		menu.add(openFileAction);

		menu.add(new Separator());
		menu.add(closeAction);
		menu.add(closeAllAction);
		menu.add(new GroupMarker(IWorkbenchActionConstants.CLOSE_EXT));

		menu.add(new Separator());
		menu.add(saveAction);
		menu.add(saveAsAction);
		menu.add(saveAllAction);
		menu.add(revertAction);

		// If this entry is included, the default "Convert Line ends ..." action is
		// added by a contribution
		// menu.add(new GroupMarker(IWorkbenchActionConstants.SAVE_EXT));

		menu.add(new Separator());

		// TODO: --Separator
		// TODO: Print
		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		// EXTENSION POINT DEFINITIONS GO HERE
		menu.add(new Separator());
		// special handling of preferences
		preferencesActionItem = new ActionContributionItem(preferencesAction);
		menu.add(preferencesActionItem);
		menu.add(preferenceSeparator = new Separator());
		// special handling of quit
		quitActionItem = new ActionContributionItem(quitAction);
		menu.add(quitActionItem);

		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));

		return menu;
	}

	private MenuManager createHelpMenu() {
		// create the file menu itself
		MenuManager menu = new MenuManager("Help", "publisher.help");
		// define a group marker that marks the start of the menu (don't know if it is needed)
		menu.add(new GroupMarker("publisher.file.group.help.start"));

		// A typical eclipse configuration of help menu
		// Welcome
		// ---Separator
		// Help Contents
		// Search Help
		// (Dynamic Help)
		// ---Separator
		// (Key Assist)
		// (Tips and Tricks)
		// Cheat Sheets
		// ---Separator
		// (Check for updates)
		// (Install new software)
		// ---Separator

		// TODO: Welcome
		// TODO: ---Separator
		menu.add(helpContentsAction);
		menu.add(helpSearchAction);
		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		menu.add(newExampleFileAction);

		// special handling of about
		menu.add(new Separator("group.about")); //$NON-NLS-1$
		aboutActionItem = new ActionContributionItem(aboutAction);
		menu.add(aboutActionItem);
		menu.add(new GroupMarker("group.about.ext")); //$NON-NLS-1$

		// EXTENSION POINT DEFINITIONS GO HERE
		return menu;
	}

	private void enhanceForMacOsx() {
		if(!Util.isMac())
			return;
		preferencesActionItem.setVisible(false);
		quitActionItem.setVisible(false);
		aboutActionItem.setVisible(false);
	}

	private IContributionItem getCopyItem() {
		return getItem(
			ActionFactory.COPY.getId(), ActionFactory.COPY.getCommandId(), ISharedImages.IMG_TOOL_COPY,
			ISharedImages.IMG_TOOL_COPY_DISABLED, WorkbenchMessages.Workbench_copy,
			WorkbenchMessages.Workbench_copyToolTip, null);
	}

	private IContributionItem getCutItem() {
		return getItem(
			ActionFactory.CUT.getId(), ActionFactory.CUT.getCommandId(), ISharedImages.IMG_TOOL_CUT,
			ISharedImages.IMG_TOOL_CUT_DISABLED, WorkbenchMessages.Workbench_cut,
			WorkbenchMessages.Workbench_cutToolTip, null);
	}

	private IContributionItem getDeleteItem() {
		return getItem(
			ActionFactory.DELETE.getId(), ActionFactory.DELETE.getCommandId(), ISharedImages.IMG_TOOL_DELETE,
			ISharedImages.IMG_TOOL_DELETE_DISABLED, WorkbenchMessages.Workbench_delete,
			WorkbenchMessages.Workbench_deleteToolTip, IWorkbenchHelpContextIds.DELETE_RETARGET_ACTION);
	}

	private IContributionItem getFindItem() {
		return getItem(
			ActionFactory.FIND.getId(), ActionFactory.FIND.getCommandId(), null, null,
			WorkbenchMessages.Workbench_findReplace, WorkbenchMessages.Workbench_findReplaceToolTip, null);
	}

	private IContributionItem getItem(String actionId, String commandId, String image, String disabledImage,
			String label, String tooltip, String helpContextId) {
		ISharedImages sharedImages = window.getWorkbench().getSharedImages();

		IActionCommandMappingService acms = (IActionCommandMappingService) window.getService(IActionCommandMappingService.class);
		acms.map(actionId, commandId);

		CommandContributionItemParameter commandParm = new CommandContributionItemParameter(
			window, actionId, commandId, null, sharedImages.getImageDescriptor(image),
			sharedImages.getImageDescriptor(disabledImage), null, label, null, tooltip,
			CommandContributionItem.STYLE_PUSH, null, false);
		return new CommandContributionItem(commandParm);
	}

	private IContributionItem getPasteItem() {
		return getItem(
			ActionFactory.PASTE.getId(), ActionFactory.PASTE.getCommandId(), ISharedImages.IMG_TOOL_PASTE,
			ISharedImages.IMG_TOOL_PASTE_DISABLED, WorkbenchMessages.Workbench_paste,
			WorkbenchMessages.Workbench_pasteToolTip, null);
	}

	// private IContributionItem getNewFileItem() {
	// return getItem("new", "publish.newb3File", null, null, "New File", "Create a new .b3 file", null);
	// }
	//
	// private IContributionItem getOpenFileItem() {
	// return getItem("publish.openb3Files", "open", null, null, "Open...", "Open a .b3 file", null);
	// }

	private IContributionItem getSelectAllItem() {
		return getItem(
			ActionFactory.SELECT_ALL.getId(), ActionFactory.SELECT_ALL.getCommandId(), null, null,
			WorkbenchMessages.Workbench_selectAll, WorkbenchMessages.Workbench_selectAllToolTip, null);
	}

	// private void scaleActionImage(IAction action, int width, int height) {
	// ImageData imageData = action.getImageDescriptor().getImageData().scaledTo(width, height);
	// action.setImageDescriptor(ImageDescriptor.createFromImageData(imageData));
	// }
}
