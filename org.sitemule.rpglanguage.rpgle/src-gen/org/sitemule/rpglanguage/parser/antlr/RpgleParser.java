/*
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.sitemule.rpglanguage.parser.antlr.internal.InternalRpgleParser;
import org.sitemule.rpglanguage.services.RpgleGrammarAccess;

public class RpgleParser extends AbstractAntlrParser {

	@Inject
	private RpgleGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRpgleParser createParser(XtextTokenStream stream) {
		return new InternalRpgleParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Language";
	}

	public RpgleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RpgleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
