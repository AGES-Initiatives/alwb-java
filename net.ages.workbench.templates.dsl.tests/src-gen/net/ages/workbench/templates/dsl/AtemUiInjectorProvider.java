/*
* generated by Xtext
*/
package net.ages.workbench.templates.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AtemUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return net.ages.workbench.templates.dsl.ui.internal.AtemActivator.getInstance().getInjector("net.ages.workbench.templates.dsl.Atem");
	}
	
}
