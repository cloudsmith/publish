package com.cloudsmith.publish.ui.editor;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.b3.beelang.ui.xtext.linked.IExtXtextEditorCustomizer;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;

/**
 * This customizer removes the "Show in" submenu item that appears as a contribution from the ide.ui.
 * As the publisher has no suitable views for "Show in", it always states that there are no such views available.
 *
 */
public class PublishExtXtextEditorCustomizer implements
		IExtXtextEditorCustomizer {

	public void customizeEditorContextMenu(IMenuManager menuManager) {
		// Is there a better way to hide "Show In" submenu in editor context menu?
		// This submenu doesn't have its id set, so Activity can not be referenced.

		String remove = "Sho&w In";

		Iterator<IContributionItem> iter = Arrays.asList(menuManager.getItems()).iterator();

		while(iter.hasNext()) {
			IContributionItem item = iter.next();
			if(item instanceof MenuManager && ((MenuManager) item).getMenuText() != null &&
					((MenuManager) item).getMenuText().startsWith(remove))
				item.setVisible(false);
		}

	}

}
