/*
 * generated by Xtext
 */
package net.ages.workbench.resources.dsl.ui;

import net.ages.workbench.resources.dsl.ui.AresEObjectDocumentationProvider;
import net.ages.workbench.resources.dsl.ui.AresEObjectHoverProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class AresUiModule extends net.ages.workbench.resources.dsl.ui.AbstractAresUiModule {
	public AresUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return AresEObjectHoverProvider.class;
	}

	public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProviderr() {
		return AresEObjectDocumentationProvider.class;
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
//		binder.bind(String.class).annotatedWith(com.google.inject.name.Names.named(
//				(XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))).toInstance(".");
	}
}
