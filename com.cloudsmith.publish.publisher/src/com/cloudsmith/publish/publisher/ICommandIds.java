package com.cloudsmith.publish.publisher;

/**
 * Interface defining the application's command IDs.
 * Key bindings can be defined for specific commands.
 * To associate an action with a command, use IAction.setActionDefinitionId(commandId).
 *
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

    public static final String CMD_OPEN_NEW = "publisher.openNew";
    public static final String CMD_OPEN_FILE = "publisher.openFile";
    public static final String CMD_SAVE_FILE = "publisher.saveFile";
    public static final String CMD_SAVE_AS_FILE = "publisher.saveAsFile";    
    public static final String CMD_CREATE_REPO = "publisher.createRepo";    
}
