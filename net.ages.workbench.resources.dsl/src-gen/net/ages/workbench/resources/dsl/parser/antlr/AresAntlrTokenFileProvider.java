/*
* generated by Xtext
*/
package net.ages.workbench.resources.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AresAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/ages/workbench/resources/dsl/parser/antlr/internal/InternalAres.tokens");
	}
}
