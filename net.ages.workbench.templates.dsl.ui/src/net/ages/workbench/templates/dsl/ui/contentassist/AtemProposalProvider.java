/*
* generated by Xtext
*/
package net.ages.workbench.templates.dsl.ui.contentassist;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.ui.contentassist.AbstractAtemProposalProvider;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class AtemProposalProvider extends AbstractAtemProposalProvider {

	public void completeAtemModel_Name(
		AtemModel model, Assignment assignment,
        ContentAssistContext context, ICompletionProposalAcceptor acceptor){

		//first call the implementation of the superclass
		super.completeAtemModel_Name(model, assignment, context, acceptor);

	    // create a proposal string that is the name of the file minus its extension
	    URI uri = model.eResource().getURI();
	    String proposal = uri.lastSegment().replace( "." + uri.fileExtension(), "" ) + " \n\nEnd-Template";

	    // Create and register the completion proposal.
	    acceptor.accept(createCompletionProposal(proposal, context));
	}
}
