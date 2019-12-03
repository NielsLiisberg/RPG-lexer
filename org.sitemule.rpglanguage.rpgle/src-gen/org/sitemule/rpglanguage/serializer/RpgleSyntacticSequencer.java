/*
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sitemule.rpglanguage.services.RpgleGrammarAccess;

@SuppressWarnings("all")
public class RpgleSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RpgleGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BoolExpr_NotKeyword_0_q;
	protected AbstractElementAlias match_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__a;
	protected AbstractElementAlias match_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__p;
	protected AbstractElementAlias match_Compare2_EqualsSignKeyword_0_2_or_GreaterThanSignEqualsSignKeyword_0_3_or_GreaterThanSignKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_4_or_LessThanSignKeyword_0_1;
	protected AbstractElementAlias match_Datatype_CharKeyword_0_0_or_DateKeyword_0_4_or_DecKeyword_0_3_or_IntKeyword_0_2_or_TimestampKeyword_0_5_or_VarcharKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RpgleGrammarAccess) access;
		match_BoolExpr_NotKeyword_0_q = new TokenAlias(false, true, grammarAccess.getBoolExprAccess().getNotKeyword_0());
		match_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, true, grammarAccess.getBoolExprAccess().getNotKeyword_0()));
		match_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, true, grammarAccess.getBoolExprAccess().getNotKeyword_0()));
		match_Compare2_EqualsSignKeyword_0_2_or_GreaterThanSignEqualsSignKeyword_0_3_or_GreaterThanSignKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_4_or_LessThanSignKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompare2Access().getEqualsSignKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getCompare2Access().getGreaterThanSignEqualsSignKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getCompare2Access().getGreaterThanSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompare2Access().getLessThanSignEqualsSignKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getCompare2Access().getLessThanSignKeyword_0_1()));
		match_Datatype_CharKeyword_0_0_or_DateKeyword_0_4_or_DecKeyword_0_3_or_IntKeyword_0_2_or_TimestampKeyword_0_5_or_VarcharKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDatatypeAccess().getCharKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getDatatypeAccess().getDateKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getDatatypeAccess().getDecKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getDatatypeAccess().getIntKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getDatatypeAccess().getTimestampKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getDatatypeAccess().getVarcharKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getEndifRule())
			return getEndifToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEndslRule())
			return getEndslToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSelectRule())
			return getSelectToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Endif:
	 * 	'endif';
	 */
	protected String getEndifToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "endif";
	}
	
	/**
	 * Endsl:
	 * 	'endsl';
	 */
	protected String getEndslToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "endsl";
	}
	
	/**
	 * Select:
	 * 	'select' ';';
	 */
	protected String getSelectToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "select ;";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BoolExpr_NotKeyword_0_q.equals(syntax))
				emit_BoolExpr_NotKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__a.equals(syntax))
				emit_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__p.equals(syntax))
				emit_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Compare2_EqualsSignKeyword_0_2_or_GreaterThanSignEqualsSignKeyword_0_3_or_GreaterThanSignKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_4_or_LessThanSignKeyword_0_1.equals(syntax))
				emit_Compare2_EqualsSignKeyword_0_2_or_GreaterThanSignEqualsSignKeyword_0_3_or_GreaterThanSignKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_4_or_LessThanSignKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Datatype_CharKeyword_0_0_or_DateKeyword_0_4_or_DecKeyword_0_3_or_IntKeyword_0_2_or_TimestampKeyword_0_5_or_VarcharKeyword_0_1.equals(syntax))
				emit_Datatype_CharKeyword_0_0_or_DateKeyword_0_4_or_DecKeyword_0_3_or_IntKeyword_0_2_or_TimestampKeyword_0_5_or_VarcharKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'not'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('(' (ambiguity))* bif2=Bif
	 *     (rule start) (ambiguity) ('(' (ambiguity))* intval2=INT
	 *     (rule start) (ambiguity) ('(' (ambiguity))* spec=Special
	 *     (rule start) (ambiguity) ('(' (ambiguity))* strval2=STRING
	 *     (rule start) (ambiguity) ('(' (ambiguity))* var2=[Dcls|ID]
	 *     (rule start) (ambiguity) ('(' (ambiguity))* {And.left=}
	 *     (rule start) (ambiguity) ('(' (ambiguity))* {Or.left=}
	 */
	protected void emit_BoolExpr_NotKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' 'not'?)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'not'? (ambiguity) bif2=Bif
	 *     (rule start) 'not'? (ambiguity) intval2=INT
	 *     (rule start) 'not'? (ambiguity) spec=Special
	 *     (rule start) 'not'? (ambiguity) strval2=STRING
	 *     (rule start) 'not'? (ambiguity) var2=[Dcls|ID]
	 *     (rule start) 'not'? (ambiguity) {And.left=}
	 *     (rule start) 'not'? (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) bif2=Bif
	 *     (rule start) (ambiguity) intval2=INT
	 *     (rule start) (ambiguity) spec=Special
	 *     (rule start) (ambiguity) strval2=STRING
	 *     (rule start) (ambiguity) var2=[Dcls|ID]
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 */
	protected void emit_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' 'not'?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 */
	protected void emit_BoolExpr_PrimaryExpr___LeftParenthesisKeyword_0_0_NotKeyword_0_q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '>' | '<' | '=' | '>=' | '<='
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) bif2=Bif
	 *     (rule start) (ambiguity) intval2=INT
	 *     (rule start) (ambiguity) spec=Special
	 *     (rule start) (ambiguity) strval2=STRING
	 *     (rule start) (ambiguity) var2=[Dcls|ID]
	 */
	protected void emit_Compare2_EqualsSignKeyword_0_2_or_GreaterThanSignEqualsSignKeyword_0_3_or_GreaterThanSignKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_4_or_LessThanSignKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'char' | 
	  *         'varchar' | 
	  *         'int' | 
	  *         'dec' | 
	  *         'date' | 
	  *         'timestamp'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) len=Len
	 */
	protected void emit_Datatype_CharKeyword_0_0_or_DateKeyword_0_4_or_DecKeyword_0_3_or_IntKeyword_0_2_or_TimestampKeyword_0_5_or_VarcharKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}