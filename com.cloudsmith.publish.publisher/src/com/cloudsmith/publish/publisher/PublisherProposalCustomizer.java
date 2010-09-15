/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package com.cloudsmith.publish.publisher;

import java.util.Arrays;
import java.util.Set;

import org.eclipse.b3.ui.contentassist.IProposalCustomizer;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.collect.Sets;

/**
 * The Publisher Product filters out advanced keywords from code completion proposals.
 * 
 */
public class PublisherProposalCustomizer implements IProposalCustomizer {

	private static final Set<String> unwantedKeywords = Sets.newHashSet();

	private static final String[] keywords = {
			"concern", "final", "function", "parallel", "private", "properties", "public", "reexport", "repository",
			"resolution", "sequential", "@postcondition", "@precondition", "container" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.ui.contentassist.IProposalCustomizer#completeKeyword(org.eclipse.xtext.Keyword,
	 * org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext, org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor)
	 */
	@Override
	public boolean completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		if(getUnwantedKeywords().contains(keyword.getValue()))
			return false;
		return true; // include all other keywords
	}

	private synchronized Set<String> getUnwantedKeywords() {
		if(unwantedKeywords.size() < 1) {
			unwantedKeywords.addAll(Arrays.asList(keywords));
		}
		return unwantedKeywords;
	}
}
