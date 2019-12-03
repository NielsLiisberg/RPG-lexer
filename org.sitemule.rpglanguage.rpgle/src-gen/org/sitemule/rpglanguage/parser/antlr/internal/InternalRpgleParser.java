package org.sitemule.rpglanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sitemule.rpglanguage.services.RpgleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRpgleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EndProc", "Timestamp", "Include", "DclProc", "BLANKS", "CtlOpt", "Options", "Varchar", "BLANK", "HIVAL", "LOVAL", "ZEROS", "Elseif", "Endfor", "Return", "Select", "INLR", "ZERO", "Begsr", "Chain", "Close", "DclF", "DclS", "Enddo", "Endif", "Endsl", "Endsr", "Other", "Reade", "Setgt", "Setll", "Eof", "Rnf", "OFF", "INH1", "Char", "Date", "Else", "Exsr", "Open", "Read", "When", "ON", "And", "Dec", "Dou", "Dow", "For", "Int", "Not", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "Do", "If", "Or", "To", "LeftParenthesis", "RightParenthesis", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_IND", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int ZERO=21;
    public static final int Setll=34;
    public static final int Or=58;
    public static final int Include=6;
    public static final int Rnf=36;
    public static final int DclProc=7;
    public static final int Varchar=11;
    public static final int LessThanSign=64;
    public static final int Read=44;
    public static final int Begsr=22;
    public static final int LeftParenthesis=60;
    public static final int DclF=25;
    public static final int To=59;
    public static final int GreaterThanSign=66;
    public static final int RULE_ID=68;
    public static final int Endsr=30;
    public static final int For=51;
    public static final int RightParenthesis=61;
    public static final int Endsl=29;
    public static final int Dou=49;
    public static final int Do=56;
    public static final int Dow=50;
    public static final int GreaterThanSignEqualsSign=55;
    public static final int Not=53;
    public static final int And=47;
    public static final int RULE_INT=69;
    public static final int RULE_ML_COMMENT=71;
    public static final int Close=24;
    public static final int If=57;
    public static final int ZEROS=15;
    public static final int Options=10;
    public static final int Chain=23;
    public static final int RULE_IND=67;
    public static final int INLR=20;
    public static final int LOVAL=14;
    public static final int RULE_STRING=70;
    public static final int Timestamp=5;
    public static final int OFF=37;
    public static final int Int=52;
    public static final int Open=43;
    public static final int RULE_SL_COMMENT=72;
    public static final int Elseif=16;
    public static final int CtlOpt=9;
    public static final int EqualsSign=65;
    public static final int Exsr=42;
    public static final int Endfor=17;
    public static final int Char=39;
    public static final int EndProc=4;
    public static final int LessThanSignEqualsSign=54;
    public static final int Colon=62;
    public static final int EOF=-1;
    public static final int Reade=32;
    public static final int Eof=35;
    public static final int ON=46;
    public static final int Return=18;
    public static final int Dec=48;
    public static final int RULE_WS=73;
    public static final int DclS=26;
    public static final int Endif=28;
    public static final int RULE_ANY_OTHER=74;
    public static final int INH1=38;
    public static final int Setgt=33;
    public static final int Date=40;
    public static final int Semicolon=63;
    public static final int BLANK=12;
    public static final int BLANKS=8;
    public static final int When=45;
    public static final int Select=19;
    public static final int Else=41;
    public static final int HIVAL=13;
    public static final int Enddo=27;
    public static final int Other=31;

    // delegates
    // delegators


        public InternalRpgleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRpgleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRpgleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRpgleParser.g"; }



     	private RpgleGrammarAccess grammarAccess;

        public InternalRpgleParser(TokenStream input, RpgleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Language";
       	}

       	@Override
       	protected RpgleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLanguage"
    // InternalRpgleParser.g:57:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalRpgleParser.g:57:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalRpgleParser.g:58:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalRpgleParser.g:64:1: ruleLanguage returns [EObject current=null] : ( (lv_elements_0_0= ruleComponents ) )* ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:70:2: ( ( (lv_elements_0_0= ruleComponents ) )* )
            // InternalRpgleParser.g:71:2: ( (lv_elements_0_0= ruleComponents ) )*
            {
            // InternalRpgleParser.g:71:2: ( (lv_elements_0_0= ruleComponents ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Include && LA1_0<=DclProc)||LA1_0==CtlOpt||(LA1_0>=DclF && LA1_0<=DclS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRpgleParser.g:72:3: (lv_elements_0_0= ruleComponents )
            	    {
            	    // InternalRpgleParser.g:72:3: (lv_elements_0_0= ruleComponents )
            	    // InternalRpgleParser.g:73:4: lv_elements_0_0= ruleComponents
            	    {

            	    				newCompositeNode(grammarAccess.getLanguageAccess().getElementsComponentsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleComponents();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLanguageRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.sitemule.rpglanguage.Rpgle.Components");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleComponents"
    // InternalRpgleParser.g:93:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalRpgleParser.g:93:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalRpgleParser.g:94:2: iv_ruleComponents= ruleComponents EOF
            {
             newCompositeNode(grammarAccess.getComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponents=ruleComponents();

            state._fsp--;

             current =iv_ruleComponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponents"


    // $ANTLR start "ruleComponents"
    // InternalRpgleParser.g:100:1: ruleComponents returns [EObject current=null] : (this_Ctrlopt_0= ruleCtrlopt | this_Directive_1= ruleDirective | this_Declare_2= ruleDeclare ) ;
    public final EObject ruleComponents() throws RecognitionException {
        EObject current = null;

        EObject this_Ctrlopt_0 = null;

        EObject this_Directive_1 = null;

        EObject this_Declare_2 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:106:2: ( (this_Ctrlopt_0= ruleCtrlopt | this_Directive_1= ruleDirective | this_Declare_2= ruleDeclare ) )
            // InternalRpgleParser.g:107:2: (this_Ctrlopt_0= ruleCtrlopt | this_Directive_1= ruleDirective | this_Declare_2= ruleDeclare )
            {
            // InternalRpgleParser.g:107:2: (this_Ctrlopt_0= ruleCtrlopt | this_Directive_1= ruleDirective | this_Declare_2= ruleDeclare )
            int alt2=3;
            switch ( input.LA(1) ) {
            case CtlOpt:
                {
                alt2=1;
                }
                break;
            case Include:
                {
                alt2=2;
                }
                break;
            case DclProc:
            case DclF:
            case DclS:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRpgleParser.g:108:3: this_Ctrlopt_0= ruleCtrlopt
                    {

                    			newCompositeNode(grammarAccess.getComponentsAccess().getCtrloptParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ctrlopt_0=ruleCtrlopt();

                    state._fsp--;


                    			current = this_Ctrlopt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:117:3: this_Directive_1= ruleDirective
                    {

                    			newCompositeNode(grammarAccess.getComponentsAccess().getDirectiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Directive_1=ruleDirective();

                    state._fsp--;


                    			current = this_Directive_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:126:3: this_Declare_2= ruleDeclare
                    {

                    			newCompositeNode(grammarAccess.getComponentsAccess().getDeclareParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declare_2=ruleDeclare();

                    state._fsp--;


                    			current = this_Declare_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponents"


    // $ANTLR start "entryRuleCtrlopt"
    // InternalRpgleParser.g:138:1: entryRuleCtrlopt returns [EObject current=null] : iv_ruleCtrlopt= ruleCtrlopt EOF ;
    public final EObject entryRuleCtrlopt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCtrlopt = null;


        try {
            // InternalRpgleParser.g:138:48: (iv_ruleCtrlopt= ruleCtrlopt EOF )
            // InternalRpgleParser.g:139:2: iv_ruleCtrlopt= ruleCtrlopt EOF
            {
             newCompositeNode(grammarAccess.getCtrloptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCtrlopt=ruleCtrlopt();

            state._fsp--;

             current =iv_ruleCtrlopt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCtrlopt"


    // $ANTLR start "ruleCtrlopt"
    // InternalRpgleParser.g:145:1: ruleCtrlopt returns [EObject current=null] : (otherlv_0= CtlOpt ( (lv_opt_1_0= ruleOpt ) )+ otherlv_2= Semicolon ) ;
    public final EObject ruleCtrlopt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_opt_1_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:151:2: ( (otherlv_0= CtlOpt ( (lv_opt_1_0= ruleOpt ) )+ otherlv_2= Semicolon ) )
            // InternalRpgleParser.g:152:2: (otherlv_0= CtlOpt ( (lv_opt_1_0= ruleOpt ) )+ otherlv_2= Semicolon )
            {
            // InternalRpgleParser.g:152:2: (otherlv_0= CtlOpt ( (lv_opt_1_0= ruleOpt ) )+ otherlv_2= Semicolon )
            // InternalRpgleParser.g:153:3: otherlv_0= CtlOpt ( (lv_opt_1_0= ruleOpt ) )+ otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,CtlOpt,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCtrloptAccess().getCtlOptKeyword_0());
            		
            // InternalRpgleParser.g:157:3: ( (lv_opt_1_0= ruleOpt ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRpgleParser.g:158:4: (lv_opt_1_0= ruleOpt )
            	    {
            	    // InternalRpgleParser.g:158:4: (lv_opt_1_0= ruleOpt )
            	    // InternalRpgleParser.g:159:5: lv_opt_1_0= ruleOpt
            	    {

            	    					newCompositeNode(grammarAccess.getCtrloptAccess().getOptOptParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_opt_1_0=ruleOpt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCtrloptRule());
            	    					}
            	    					add(
            	    						current,
            	    						"opt",
            	    						lv_opt_1_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Opt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCtrloptAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCtrlopt"


    // $ANTLR start "entryRuleOpt"
    // InternalRpgleParser.g:184:1: entryRuleOpt returns [EObject current=null] : iv_ruleOpt= ruleOpt EOF ;
    public final EObject entryRuleOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpt = null;


        try {
            // InternalRpgleParser.g:184:44: (iv_ruleOpt= ruleOpt EOF )
            // InternalRpgleParser.g:185:2: iv_ruleOpt= ruleOpt EOF
            {
             newCompositeNode(grammarAccess.getOptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpt=ruleOpt();

            state._fsp--;

             current =iv_ruleOpt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpt"


    // $ANTLR start "ruleOpt"
    // InternalRpgleParser.g:191:1: ruleOpt returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )? ) ;
    public final EObject ruleOpt() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:197:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )? ) )
            // InternalRpgleParser.g:198:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )? )
            {
            // InternalRpgleParser.g:198:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )? )
            // InternalRpgleParser.g:199:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )?
            {
            // InternalRpgleParser.g:199:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpgleParser.g:200:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpgleParser.g:200:4: (lv_name_0_0= RULE_ID )
            // InternalRpgleParser.g:201:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOptAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgleParser.g:217:3: (otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LeftParenthesis) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRpgleParser.g:218:4: otherlv_1= LeftParenthesis ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getOptAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRpgleParser.g:222:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalRpgleParser.g:223:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalRpgleParser.g:223:5: (lv_value_2_0= RULE_STRING )
                    // InternalRpgleParser.g:224:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getOptAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOptRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOptAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpt"


    // $ANTLR start "entryRuleDirective"
    // InternalRpgleParser.g:249:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalRpgleParser.g:249:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalRpgleParser.g:250:2: iv_ruleDirective= ruleDirective EOF
            {
             newCompositeNode(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;

             current =iv_ruleDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalRpgleParser.g:256:1: ruleDirective returns [EObject current=null] : (otherlv_0= Include ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:262:2: ( (otherlv_0= Include ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ) )
            // InternalRpgleParser.g:263:2: (otherlv_0= Include ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon )
            {
            // InternalRpgleParser.g:263:2: (otherlv_0= Include ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon )
            // InternalRpgleParser.g:264:3: otherlv_0= Include ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Include,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getIncludeKeyword_0());
            		
            // InternalRpgleParser.g:268:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgleParser.g:269:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgleParser.g:269:4: (lv_name_1_0= RULE_ID )
            // InternalRpgleParser.g:270:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDirectiveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDirectiveAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleDeclare"
    // InternalRpgleParser.g:294:1: entryRuleDeclare returns [EObject current=null] : iv_ruleDeclare= ruleDeclare EOF ;
    public final EObject entryRuleDeclare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclare = null;


        try {
            // InternalRpgleParser.g:294:48: (iv_ruleDeclare= ruleDeclare EOF )
            // InternalRpgleParser.g:295:2: iv_ruleDeclare= ruleDeclare EOF
            {
             newCompositeNode(grammarAccess.getDeclareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclare=ruleDeclare();

            state._fsp--;

             current =iv_ruleDeclare; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclare"


    // $ANTLR start "ruleDeclare"
    // InternalRpgleParser.g:301:1: ruleDeclare returns [EObject current=null] : (this_Dclproc_0= ruleDclproc | this_Dcls_1= ruleDcls | this_Dclf_2= ruleDclf ) ;
    public final EObject ruleDeclare() throws RecognitionException {
        EObject current = null;

        EObject this_Dclproc_0 = null;

        EObject this_Dcls_1 = null;

        EObject this_Dclf_2 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:307:2: ( (this_Dclproc_0= ruleDclproc | this_Dcls_1= ruleDcls | this_Dclf_2= ruleDclf ) )
            // InternalRpgleParser.g:308:2: (this_Dclproc_0= ruleDclproc | this_Dcls_1= ruleDcls | this_Dclf_2= ruleDclf )
            {
            // InternalRpgleParser.g:308:2: (this_Dclproc_0= ruleDclproc | this_Dcls_1= ruleDcls | this_Dclf_2= ruleDclf )
            int alt5=3;
            switch ( input.LA(1) ) {
            case DclProc:
                {
                alt5=1;
                }
                break;
            case DclS:
                {
                alt5=2;
                }
                break;
            case DclF:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRpgleParser.g:309:3: this_Dclproc_0= ruleDclproc
                    {

                    			newCompositeNode(grammarAccess.getDeclareAccess().getDclprocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dclproc_0=ruleDclproc();

                    state._fsp--;


                    			current = this_Dclproc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:318:3: this_Dcls_1= ruleDcls
                    {

                    			newCompositeNode(grammarAccess.getDeclareAccess().getDclsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dcls_1=ruleDcls();

                    state._fsp--;


                    			current = this_Dcls_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:327:3: this_Dclf_2= ruleDclf
                    {

                    			newCompositeNode(grammarAccess.getDeclareAccess().getDclfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dclf_2=ruleDclf();

                    state._fsp--;


                    			current = this_Dclf_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclare"


    // $ANTLR start "entryRuleDclf"
    // InternalRpgleParser.g:339:1: entryRuleDclf returns [EObject current=null] : iv_ruleDclf= ruleDclf EOF ;
    public final EObject entryRuleDclf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDclf = null;


        try {
            // InternalRpgleParser.g:339:45: (iv_ruleDclf= ruleDclf EOF )
            // InternalRpgleParser.g:340:2: iv_ruleDclf= ruleDclf EOF
            {
             newCompositeNode(grammarAccess.getDclfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDclf=ruleDclf();

            state._fsp--;

             current =iv_ruleDclf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDclf"


    // $ANTLR start "ruleDclf"
    // InternalRpgleParser.g:346:1: ruleDclf returns [EObject current=null] : (otherlv_0= DclF ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleDclf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:352:2: ( (otherlv_0= DclF ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ) )
            // InternalRpgleParser.g:353:2: (otherlv_0= DclF ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon )
            {
            // InternalRpgleParser.g:353:2: (otherlv_0= DclF ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon )
            // InternalRpgleParser.g:354:3: otherlv_0= DclF ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,DclF,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDclfAccess().getDclFKeyword_0());
            		
            // InternalRpgleParser.g:358:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgleParser.g:359:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgleParser.g:359:4: (lv_name_1_0= RULE_ID )
            // InternalRpgleParser.g:360:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDclfAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDclfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDclfAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDclf"


    // $ANTLR start "entryRuleFileio"
    // InternalRpgleParser.g:384:1: entryRuleFileio returns [EObject current=null] : iv_ruleFileio= ruleFileio EOF ;
    public final EObject entryRuleFileio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileio = null;


        try {
            // InternalRpgleParser.g:384:47: (iv_ruleFileio= ruleFileio EOF )
            // InternalRpgleParser.g:385:2: iv_ruleFileio= ruleFileio EOF
            {
             newCompositeNode(grammarAccess.getFileioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileio=ruleFileio();

            state._fsp--;

             current =iv_ruleFileio; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileio"


    // $ANTLR start "ruleFileio"
    // InternalRpgleParser.g:391:1: ruleFileio returns [EObject current=null] : (this_Open_0= ruleOpen | this_Close_1= ruleClose | this_Chain_2= ruleChain | this_Read_3= ruleRead | this_Reade_4= ruleReade | this_Setll_5= ruleSetll | this_Setgt_6= ruleSetgt | this_Eof_7= ruleEof | this_Rnf_8= ruleRnf ) ;
    public final EObject ruleFileio() throws RecognitionException {
        EObject current = null;

        EObject this_Open_0 = null;

        EObject this_Close_1 = null;

        EObject this_Chain_2 = null;

        EObject this_Read_3 = null;

        EObject this_Reade_4 = null;

        EObject this_Setll_5 = null;

        EObject this_Setgt_6 = null;

        EObject this_Eof_7 = null;

        EObject this_Rnf_8 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:397:2: ( (this_Open_0= ruleOpen | this_Close_1= ruleClose | this_Chain_2= ruleChain | this_Read_3= ruleRead | this_Reade_4= ruleReade | this_Setll_5= ruleSetll | this_Setgt_6= ruleSetgt | this_Eof_7= ruleEof | this_Rnf_8= ruleRnf ) )
            // InternalRpgleParser.g:398:2: (this_Open_0= ruleOpen | this_Close_1= ruleClose | this_Chain_2= ruleChain | this_Read_3= ruleRead | this_Reade_4= ruleReade | this_Setll_5= ruleSetll | this_Setgt_6= ruleSetgt | this_Eof_7= ruleEof | this_Rnf_8= ruleRnf )
            {
            // InternalRpgleParser.g:398:2: (this_Open_0= ruleOpen | this_Close_1= ruleClose | this_Chain_2= ruleChain | this_Read_3= ruleRead | this_Reade_4= ruleReade | this_Setll_5= ruleSetll | this_Setgt_6= ruleSetgt | this_Eof_7= ruleEof | this_Rnf_8= ruleRnf )
            int alt6=9;
            switch ( input.LA(1) ) {
            case Open:
                {
                alt6=1;
                }
                break;
            case Close:
                {
                alt6=2;
                }
                break;
            case Chain:
                {
                alt6=3;
                }
                break;
            case Read:
                {
                alt6=4;
                }
                break;
            case Reade:
                {
                alt6=5;
                }
                break;
            case Setll:
                {
                alt6=6;
                }
                break;
            case Setgt:
                {
                alt6=7;
                }
                break;
            case Eof:
                {
                alt6=8;
                }
                break;
            case Rnf:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRpgleParser.g:399:3: this_Open_0= ruleOpen
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getOpenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Open_0=ruleOpen();

                    state._fsp--;


                    			current = this_Open_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:408:3: this_Close_1= ruleClose
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getCloseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Close_1=ruleClose();

                    state._fsp--;


                    			current = this_Close_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:417:3: this_Chain_2= ruleChain
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getChainParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chain_2=ruleChain();

                    state._fsp--;


                    			current = this_Chain_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:426:3: this_Read_3= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getReadParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_3=ruleRead();

                    state._fsp--;


                    			current = this_Read_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:435:3: this_Reade_4= ruleReade
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getReadeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reade_4=ruleReade();

                    state._fsp--;


                    			current = this_Reade_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRpgleParser.g:444:3: this_Setll_5= ruleSetll
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getSetllParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Setll_5=ruleSetll();

                    state._fsp--;


                    			current = this_Setll_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRpgleParser.g:453:3: this_Setgt_6= ruleSetgt
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getSetgtParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Setgt_6=ruleSetgt();

                    state._fsp--;


                    			current = this_Setgt_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRpgleParser.g:462:3: this_Eof_7= ruleEof
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getEofParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eof_7=ruleEof();

                    state._fsp--;


                    			current = this_Eof_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRpgleParser.g:471:3: this_Rnf_8= ruleRnf
                    {

                    			newCompositeNode(grammarAccess.getFileioAccess().getRnfParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rnf_8=ruleRnf();

                    state._fsp--;


                    			current = this_Rnf_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileio"


    // $ANTLR start "entryRuleOpen"
    // InternalRpgleParser.g:483:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalRpgleParser.g:483:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalRpgleParser.g:484:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalRpgleParser.g:490:1: ruleOpen returns [EObject current=null] : (otherlv_0= Open ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:496:2: ( (otherlv_0= Open ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:497:2: (otherlv_0= Open ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:497:2: (otherlv_0= Open ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:498:3: otherlv_0= Open ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Open,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenAccess().getOpenKeyword_0());
            		
            // InternalRpgleParser.g:502:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:503:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:503:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:504:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleClose"
    // InternalRpgleParser.g:519:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalRpgleParser.g:519:46: (iv_ruleClose= ruleClose EOF )
            // InternalRpgleParser.g:520:2: iv_ruleClose= ruleClose EOF
            {
             newCompositeNode(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClose=ruleClose();

            state._fsp--;

             current =iv_ruleClose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // InternalRpgleParser.g:526:1: ruleClose returns [EObject current=null] : (otherlv_0= Close ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:532:2: ( (otherlv_0= Close ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:533:2: (otherlv_0= Close ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:533:2: (otherlv_0= Close ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:534:3: otherlv_0= Close ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Close,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCloseKeyword_0());
            		
            // InternalRpgleParser.g:538:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:539:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:539:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:540:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRuleChain"
    // InternalRpgleParser.g:555:1: entryRuleChain returns [EObject current=null] : iv_ruleChain= ruleChain EOF ;
    public final EObject entryRuleChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChain = null;


        try {
            // InternalRpgleParser.g:555:46: (iv_ruleChain= ruleChain EOF )
            // InternalRpgleParser.g:556:2: iv_ruleChain= ruleChain EOF
            {
             newCompositeNode(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChain=ruleChain();

            state._fsp--;

             current =iv_ruleChain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // InternalRpgleParser.g:562:1: ruleChain returns [EObject current=null] : (otherlv_0= Chain ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:568:2: ( (otherlv_0= Chain ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:569:2: (otherlv_0= Chain ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:569:2: (otherlv_0= Chain ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:570:3: otherlv_0= Chain ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Chain,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getChainAccess().getChainKeyword_0());
            		
            // InternalRpgleParser.g:574:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:575:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:575:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:576:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChainRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getChainAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRuleRead"
    // InternalRpgleParser.g:591:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalRpgleParser.g:591:45: (iv_ruleRead= ruleRead EOF )
            // InternalRpgleParser.g:592:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalRpgleParser.g:598:1: ruleRead returns [EObject current=null] : (otherlv_0= Read ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:604:2: ( (otherlv_0= Read ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:605:2: (otherlv_0= Read ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:605:2: (otherlv_0= Read ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:606:3: otherlv_0= Read ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Read,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            // InternalRpgleParser.g:610:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:611:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:611:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:612:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReadAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleReade"
    // InternalRpgleParser.g:627:1: entryRuleReade returns [EObject current=null] : iv_ruleReade= ruleReade EOF ;
    public final EObject entryRuleReade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReade = null;


        try {
            // InternalRpgleParser.g:627:46: (iv_ruleReade= ruleReade EOF )
            // InternalRpgleParser.g:628:2: iv_ruleReade= ruleReade EOF
            {
             newCompositeNode(grammarAccess.getReadeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReade=ruleReade();

            state._fsp--;

             current =iv_ruleReade; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReade"


    // $ANTLR start "ruleReade"
    // InternalRpgleParser.g:634:1: ruleReade returns [EObject current=null] : (otherlv_0= Reade ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:640:2: ( (otherlv_0= Reade ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:641:2: (otherlv_0= Reade ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:641:2: (otherlv_0= Reade ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:642:3: otherlv_0= Reade ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Reade,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReadeAccess().getReadeKeyword_0());
            		
            // InternalRpgleParser.g:646:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:647:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:647:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:648:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReadeAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReade"


    // $ANTLR start "entryRuleSetll"
    // InternalRpgleParser.g:663:1: entryRuleSetll returns [EObject current=null] : iv_ruleSetll= ruleSetll EOF ;
    public final EObject entryRuleSetll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetll = null;


        try {
            // InternalRpgleParser.g:663:46: (iv_ruleSetll= ruleSetll EOF )
            // InternalRpgleParser.g:664:2: iv_ruleSetll= ruleSetll EOF
            {
             newCompositeNode(grammarAccess.getSetllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetll=ruleSetll();

            state._fsp--;

             current =iv_ruleSetll; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetll"


    // $ANTLR start "ruleSetll"
    // InternalRpgleParser.g:670:1: ruleSetll returns [EObject current=null] : (otherlv_0= Setll ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSetll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:676:2: ( (otherlv_0= Setll ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:677:2: (otherlv_0= Setll ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:677:2: (otherlv_0= Setll ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:678:3: otherlv_0= Setll ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Setll,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetllAccess().getSetllKeyword_0());
            		
            // InternalRpgleParser.g:682:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:683:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:683:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:684:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetllRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSetllAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetll"


    // $ANTLR start "entryRuleSetgt"
    // InternalRpgleParser.g:699:1: entryRuleSetgt returns [EObject current=null] : iv_ruleSetgt= ruleSetgt EOF ;
    public final EObject entryRuleSetgt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetgt = null;


        try {
            // InternalRpgleParser.g:699:46: (iv_ruleSetgt= ruleSetgt EOF )
            // InternalRpgleParser.g:700:2: iv_ruleSetgt= ruleSetgt EOF
            {
             newCompositeNode(grammarAccess.getSetgtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetgt=ruleSetgt();

            state._fsp--;

             current =iv_ruleSetgt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetgt"


    // $ANTLR start "ruleSetgt"
    // InternalRpgleParser.g:706:1: ruleSetgt returns [EObject current=null] : (otherlv_0= Setgt ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSetgt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:712:2: ( (otherlv_0= Setgt ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:713:2: (otherlv_0= Setgt ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:713:2: (otherlv_0= Setgt ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:714:3: otherlv_0= Setgt ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Setgt,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetgtAccess().getSetgtKeyword_0());
            		
            // InternalRpgleParser.g:718:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:719:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:719:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:720:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetgtRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSetgtAccess().getNameDclfCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetgt"


    // $ANTLR start "entryRuleEof"
    // InternalRpgleParser.g:735:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalRpgleParser.g:735:44: (iv_ruleEof= ruleEof EOF )
            // InternalRpgleParser.g:736:2: iv_ruleEof= ruleEof EOF
            {
             newCompositeNode(grammarAccess.getEofRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEof=ruleEof();

            state._fsp--;

             current =iv_ruleEof; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEof"


    // $ANTLR start "ruleEof"
    // InternalRpgleParser.g:742:1: ruleEof returns [EObject current=null] : (otherlv_0= Eof otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:748:2: ( (otherlv_0= Eof otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalRpgleParser.g:749:2: (otherlv_0= Eof otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalRpgleParser.g:749:2: (otherlv_0= Eof otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalRpgleParser.g:750:3: otherlv_0= Eof otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Eof,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEofKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEofAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRpgleParser.g:758:3: ( (otherlv_2= RULE_ID ) )
            // InternalRpgleParser.g:759:4: (otherlv_2= RULE_ID )
            {
            // InternalRpgleParser.g:759:4: (otherlv_2= RULE_ID )
            // InternalRpgleParser.g:760:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEofRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getEofAccess().getNameDclfCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEofAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEof"


    // $ANTLR start "entryRuleRnf"
    // InternalRpgleParser.g:779:1: entryRuleRnf returns [EObject current=null] : iv_ruleRnf= ruleRnf EOF ;
    public final EObject entryRuleRnf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRnf = null;


        try {
            // InternalRpgleParser.g:779:44: (iv_ruleRnf= ruleRnf EOF )
            // InternalRpgleParser.g:780:2: iv_ruleRnf= ruleRnf EOF
            {
             newCompositeNode(grammarAccess.getRnfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRnf=ruleRnf();

            state._fsp--;

             current =iv_ruleRnf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRnf"


    // $ANTLR start "ruleRnf"
    // InternalRpgleParser.g:786:1: ruleRnf returns [EObject current=null] : (otherlv_0= Rnf otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleRnf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:792:2: ( (otherlv_0= Rnf otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalRpgleParser.g:793:2: (otherlv_0= Rnf otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalRpgleParser.g:793:2: (otherlv_0= Rnf otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalRpgleParser.g:794:3: otherlv_0= Rnf otherlv_1= LeftParenthesis ( (otherlv_2= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Rnf,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRnfAccess().getRnfKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRnfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRpgleParser.g:802:3: ( (otherlv_2= RULE_ID ) )
            // InternalRpgleParser.g:803:4: (otherlv_2= RULE_ID )
            {
            // InternalRpgleParser.g:803:4: (otherlv_2= RULE_ID )
            // InternalRpgleParser.g:804:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRnfRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getRnfAccess().getNameDclfCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRnfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRnf"


    // $ANTLR start "entryRuleDclproc"
    // InternalRpgleParser.g:823:1: entryRuleDclproc returns [EObject current=null] : iv_ruleDclproc= ruleDclproc EOF ;
    public final EObject entryRuleDclproc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDclproc = null;


        try {
            // InternalRpgleParser.g:823:48: (iv_ruleDclproc= ruleDclproc EOF )
            // InternalRpgleParser.g:824:2: iv_ruleDclproc= ruleDclproc EOF
            {
             newCompositeNode(grammarAccess.getDclprocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDclproc=ruleDclproc();

            state._fsp--;

             current =iv_ruleDclproc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDclproc"


    // $ANTLR start "ruleDclproc"
    // InternalRpgleParser.g:830:1: ruleDclproc returns [EObject current=null] : (otherlv_0= DclProc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_declare_3_0= ruleDeclare ) )* ( (lv_code_4_0= ruleCode ) )* otherlv_5= EndProc ) ;
    public final EObject ruleDclproc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_declare_3_0 = null;

        EObject lv_code_4_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:836:2: ( (otherlv_0= DclProc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_declare_3_0= ruleDeclare ) )* ( (lv_code_4_0= ruleCode ) )* otherlv_5= EndProc ) )
            // InternalRpgleParser.g:837:2: (otherlv_0= DclProc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_declare_3_0= ruleDeclare ) )* ( (lv_code_4_0= ruleCode ) )* otherlv_5= EndProc )
            {
            // InternalRpgleParser.g:837:2: (otherlv_0= DclProc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_declare_3_0= ruleDeclare ) )* ( (lv_code_4_0= ruleCode ) )* otherlv_5= EndProc )
            // InternalRpgleParser.g:838:3: otherlv_0= DclProc ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_declare_3_0= ruleDeclare ) )* ( (lv_code_4_0= ruleCode ) )* otherlv_5= EndProc
            {
            otherlv_0=(Token)match(input,DclProc,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDclprocAccess().getDclProcKeyword_0());
            		
            // InternalRpgleParser.g:842:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgleParser.g:843:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgleParser.g:843:4: (lv_name_1_0= RULE_ID )
            // InternalRpgleParser.g:844:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDclprocAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDclprocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDclprocAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:864:3: ( (lv_declare_3_0= ruleDeclare ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DclProc||(LA7_0>=DclF && LA7_0<=DclS)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRpgleParser.g:865:4: (lv_declare_3_0= ruleDeclare )
            	    {
            	    // InternalRpgleParser.g:865:4: (lv_declare_3_0= ruleDeclare )
            	    // InternalRpgleParser.g:866:5: lv_declare_3_0= ruleDeclare
            	    {

            	    					newCompositeNode(grammarAccess.getDclprocAccess().getDeclareDeclareParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_declare_3_0=ruleDeclare();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDclprocRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declare",
            	    						lv_declare_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Declare");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalRpgleParser.g:883:3: ( (lv_code_4_0= ruleCode ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=Return && LA8_0<=Select)||(LA8_0>=Begsr && LA8_0<=Close)||(LA8_0>=Reade && LA8_0<=Rnf)||(LA8_0>=Exsr && LA8_0<=Read)||(LA8_0>=Dou && LA8_0<=For)||(LA8_0>=Do && LA8_0<=If)||LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRpgleParser.g:884:4: (lv_code_4_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:884:4: (lv_code_4_0= ruleCode )
            	    // InternalRpgleParser.g:885:5: lv_code_4_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getDclprocAccess().getCodeCodeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_code_4_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDclprocRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_4_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,EndProc,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDclprocAccess().getEndProcKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDclproc"


    // $ANTLR start "entryRuleCode"
    // InternalRpgleParser.g:910:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalRpgleParser.g:910:45: (iv_ruleCode= ruleCode EOF )
            // InternalRpgleParser.g:911:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // InternalRpgleParser.g:917:1: ruleCode returns [EObject current=null] : ( (this_Stmt_0= ruleStmt | this_Subrutine_1= ruleSubrutine ) otherlv_2= Semicolon ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Stmt_0 = null;

        EObject this_Subrutine_1 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:923:2: ( ( (this_Stmt_0= ruleStmt | this_Subrutine_1= ruleSubrutine ) otherlv_2= Semicolon ) )
            // InternalRpgleParser.g:924:2: ( (this_Stmt_0= ruleStmt | this_Subrutine_1= ruleSubrutine ) otherlv_2= Semicolon )
            {
            // InternalRpgleParser.g:924:2: ( (this_Stmt_0= ruleStmt | this_Subrutine_1= ruleSubrutine ) otherlv_2= Semicolon )
            // InternalRpgleParser.g:925:3: (this_Stmt_0= ruleStmt | this_Subrutine_1= ruleSubrutine ) otherlv_2= Semicolon
            {
            // InternalRpgleParser.g:925:3: (this_Stmt_0= ruleStmt | this_Subrutine_1= ruleSubrutine )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Return && LA9_0<=Select)||(LA9_0>=Chain && LA9_0<=Close)||(LA9_0>=Reade && LA9_0<=Rnf)||(LA9_0>=Exsr && LA9_0<=Read)||(LA9_0>=Dou && LA9_0<=For)||(LA9_0>=Do && LA9_0<=If)||LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==Begsr) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRpgleParser.g:926:4: this_Stmt_0= ruleStmt
                    {

                    				newCompositeNode(grammarAccess.getCodeAccess().getStmtParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_Stmt_0=ruleStmt();

                    state._fsp--;


                    				current = this_Stmt_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:935:4: this_Subrutine_1= ruleSubrutine
                    {

                    				newCompositeNode(grammarAccess.getCodeAccess().getSubrutineParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Subrutine_1=ruleSubrutine();

                    state._fsp--;


                    				current = this_Subrutine_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleSubrutine"
    // InternalRpgleParser.g:952:1: entryRuleSubrutine returns [EObject current=null] : iv_ruleSubrutine= ruleSubrutine EOF ;
    public final EObject entryRuleSubrutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrutine = null;


        try {
            // InternalRpgleParser.g:952:50: (iv_ruleSubrutine= ruleSubrutine EOF )
            // InternalRpgleParser.g:953:2: iv_ruleSubrutine= ruleSubrutine EOF
            {
             newCompositeNode(grammarAccess.getSubrutineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubrutine=ruleSubrutine();

            state._fsp--;

             current =iv_ruleSubrutine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubrutine"


    // $ANTLR start "ruleSubrutine"
    // InternalRpgleParser.g:959:1: ruleSubrutine returns [EObject current=null] : (otherlv_0= Begsr ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_subrcode_3_0= ruleCode ) )* otherlv_4= Endsr ) ;
    public final EObject ruleSubrutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subrcode_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:965:2: ( (otherlv_0= Begsr ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_subrcode_3_0= ruleCode ) )* otherlv_4= Endsr ) )
            // InternalRpgleParser.g:966:2: (otherlv_0= Begsr ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_subrcode_3_0= ruleCode ) )* otherlv_4= Endsr )
            {
            // InternalRpgleParser.g:966:2: (otherlv_0= Begsr ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_subrcode_3_0= ruleCode ) )* otherlv_4= Endsr )
            // InternalRpgleParser.g:967:3: otherlv_0= Begsr ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Semicolon ( (lv_subrcode_3_0= ruleCode ) )* otherlv_4= Endsr
            {
            otherlv_0=(Token)match(input,Begsr,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubrutineAccess().getBegsrKeyword_0());
            		
            // InternalRpgleParser.g:971:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgleParser.g:972:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgleParser.g:972:4: (lv_name_1_0= RULE_ID )
            // InternalRpgleParser.g:973:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubrutineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubrutineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSubrutineAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:993:3: ( (lv_subrcode_3_0= ruleCode ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=Return && LA10_0<=Select)||(LA10_0>=Begsr && LA10_0<=Close)||(LA10_0>=Reade && LA10_0<=Rnf)||(LA10_0>=Exsr && LA10_0<=Read)||(LA10_0>=Dou && LA10_0<=For)||(LA10_0>=Do && LA10_0<=If)||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRpgleParser.g:994:4: (lv_subrcode_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:994:4: (lv_subrcode_3_0= ruleCode )
            	    // InternalRpgleParser.g:995:5: lv_subrcode_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getSubrutineAccess().getSubrcodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_subrcode_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubrutineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subrcode",
            	    						lv_subrcode_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,Endsr,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSubrutineAccess().getEndsrKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubrutine"


    // $ANTLR start "entryRuleExsr"
    // InternalRpgleParser.g:1020:1: entryRuleExsr returns [EObject current=null] : iv_ruleExsr= ruleExsr EOF ;
    public final EObject entryRuleExsr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExsr = null;


        try {
            // InternalRpgleParser.g:1020:45: (iv_ruleExsr= ruleExsr EOF )
            // InternalRpgleParser.g:1021:2: iv_ruleExsr= ruleExsr EOF
            {
             newCompositeNode(grammarAccess.getExsrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExsr=ruleExsr();

            state._fsp--;

             current =iv_ruleExsr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExsr"


    // $ANTLR start "ruleExsr"
    // InternalRpgleParser.g:1027:1: ruleExsr returns [EObject current=null] : (otherlv_0= Exsr ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleExsr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:1033:2: ( (otherlv_0= Exsr ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgleParser.g:1034:2: (otherlv_0= Exsr ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgleParser.g:1034:2: (otherlv_0= Exsr ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgleParser.g:1035:3: otherlv_0= Exsr ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Exsr,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExsrAccess().getExsrKeyword_0());
            		
            // InternalRpgleParser.g:1039:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:1040:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:1040:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:1041:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExsrRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getExsrAccess().getNameSubrutineCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExsr"


    // $ANTLR start "entryRuleStmt"
    // InternalRpgleParser.g:1056:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalRpgleParser.g:1056:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalRpgleParser.g:1057:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalRpgleParser.g:1063:1: ruleStmt returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_Ifblock_1= ruleIfblock | this_Do_2= ruleDo | this_Dow_3= ruleDow | this_Dou_4= ruleDou | this_For_5= ruleFor | this_Selectblock_6= ruleSelectblock | this_Exsr_7= ruleExsr | this_Fileio_8= ruleFileio | this_Return_9= ruleReturn ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_Ifblock_1 = null;

        EObject this_Do_2 = null;

        EObject this_Dow_3 = null;

        EObject this_Dou_4 = null;

        EObject this_For_5 = null;

        EObject this_Selectblock_6 = null;

        EObject this_Exsr_7 = null;

        EObject this_Fileio_8 = null;

        EObject this_Return_9 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1069:2: ( (this_Assignment_0= ruleAssignment | this_Ifblock_1= ruleIfblock | this_Do_2= ruleDo | this_Dow_3= ruleDow | this_Dou_4= ruleDou | this_For_5= ruleFor | this_Selectblock_6= ruleSelectblock | this_Exsr_7= ruleExsr | this_Fileio_8= ruleFileio | this_Return_9= ruleReturn ) )
            // InternalRpgleParser.g:1070:2: (this_Assignment_0= ruleAssignment | this_Ifblock_1= ruleIfblock | this_Do_2= ruleDo | this_Dow_3= ruleDow | this_Dou_4= ruleDou | this_For_5= ruleFor | this_Selectblock_6= ruleSelectblock | this_Exsr_7= ruleExsr | this_Fileio_8= ruleFileio | this_Return_9= ruleReturn )
            {
            // InternalRpgleParser.g:1070:2: (this_Assignment_0= ruleAssignment | this_Ifblock_1= ruleIfblock | this_Do_2= ruleDo | this_Dow_3= ruleDow | this_Dou_4= ruleDou | this_For_5= ruleFor | this_Selectblock_6= ruleSelectblock | this_Exsr_7= ruleExsr | this_Fileio_8= ruleFileio | this_Return_9= ruleReturn )
            int alt11=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case If:
                {
                alt11=2;
                }
                break;
            case Do:
                {
                alt11=3;
                }
                break;
            case Dow:
                {
                alt11=4;
                }
                break;
            case Dou:
                {
                alt11=5;
                }
                break;
            case For:
                {
                alt11=6;
                }
                break;
            case Select:
                {
                alt11=7;
                }
                break;
            case Exsr:
                {
                alt11=8;
                }
                break;
            case Chain:
            case Close:
            case Reade:
            case Setgt:
            case Setll:
            case Eof:
            case Rnf:
            case Open:
            case Read:
                {
                alt11=9;
                }
                break;
            case Return:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRpgleParser.g:1071:3: this_Assignment_0= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:1080:3: this_Ifblock_1= ruleIfblock
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getIfblockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ifblock_1=ruleIfblock();

                    state._fsp--;


                    			current = this_Ifblock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:1089:3: this_Do_2= ruleDo
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getDoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Do_2=ruleDo();

                    state._fsp--;


                    			current = this_Do_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:1098:3: this_Dow_3= ruleDow
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getDowParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dow_3=ruleDow();

                    state._fsp--;


                    			current = this_Dow_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:1107:3: this_Dou_4= ruleDou
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getDouParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dou_4=ruleDou();

                    state._fsp--;


                    			current = this_Dou_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRpgleParser.g:1116:3: this_For_5= ruleFor
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getForParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_For_5=ruleFor();

                    state._fsp--;


                    			current = this_For_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRpgleParser.g:1125:3: this_Selectblock_6= ruleSelectblock
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getSelectblockParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selectblock_6=ruleSelectblock();

                    state._fsp--;


                    			current = this_Selectblock_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRpgleParser.g:1134:3: this_Exsr_7= ruleExsr
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getExsrParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exsr_7=ruleExsr();

                    state._fsp--;


                    			current = this_Exsr_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRpgleParser.g:1143:3: this_Fileio_8= ruleFileio
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getFileioParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fileio_8=ruleFileio();

                    state._fsp--;


                    			current = this_Fileio_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRpgleParser.g:1152:3: this_Return_9= ruleReturn
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getReturnParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Return_9=ruleReturn();

                    state._fsp--;


                    			current = this_Return_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleAssignment"
    // InternalRpgleParser.g:1164:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalRpgleParser.g:1164:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalRpgleParser.g:1165:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalRpgleParser.g:1171:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1177:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalRpgleParser.g:1178:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalRpgleParser.g:1178:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalRpgleParser.g:1179:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalRpgleParser.g:1179:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgleParser.g:1180:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgleParser.g:1180:4: (otherlv_0= RULE_ID )
            // InternalRpgleParser.g:1181:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getVariableDclsCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalRpgleParser.g:1196:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalRpgleParser.g:1197:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalRpgleParser.g:1197:4: (lv_expression_2_0= ruleExpression )
            // InternalRpgleParser.g:1198:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.sitemule.rpglanguage.Rpgle.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalRpgleParser.g:1219:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRpgleParser.g:1219:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRpgleParser.g:1220:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRpgleParser.g:1226:1: ruleExpression returns [EObject current=null] : ( ( (lv_intval_0_0= RULE_INT ) ) | ( (lv_strval_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) | this_Bif_3= ruleBif | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_intval_0_0=null;
        Token lv_strval_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Bif_3 = null;

        EObject lv_parmlist_6_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1232:2: ( ( ( (lv_intval_0_0= RULE_INT ) ) | ( (lv_strval_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) | this_Bif_3= ruleBif | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis ) ) )
            // InternalRpgleParser.g:1233:2: ( ( (lv_intval_0_0= RULE_INT ) ) | ( (lv_strval_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) | this_Bif_3= ruleBif | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis ) )
            {
            // InternalRpgleParser.g:1233:2: ( ( (lv_intval_0_0= RULE_INT ) ) | ( (lv_strval_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) | this_Bif_3= ruleBif | ( ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==EOF||LA13_3==To||(LA13_3>=RightParenthesis && LA13_3<=Semicolon)) ) {
                    alt13=3;
                }
                else if ( (LA13_3==LeftParenthesis) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case Eof:
            case Rnf:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRpgleParser.g:1234:3: ( (lv_intval_0_0= RULE_INT ) )
                    {
                    // InternalRpgleParser.g:1234:3: ( (lv_intval_0_0= RULE_INT ) )
                    // InternalRpgleParser.g:1235:4: (lv_intval_0_0= RULE_INT )
                    {
                    // InternalRpgleParser.g:1235:4: (lv_intval_0_0= RULE_INT )
                    // InternalRpgleParser.g:1236:5: lv_intval_0_0= RULE_INT
                    {
                    lv_intval_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intval_0_0, grammarAccess.getExpressionAccess().getIntvalINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intval",
                    						lv_intval_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:1253:3: ( (lv_strval_1_0= RULE_STRING ) )
                    {
                    // InternalRpgleParser.g:1253:3: ( (lv_strval_1_0= RULE_STRING ) )
                    // InternalRpgleParser.g:1254:4: (lv_strval_1_0= RULE_STRING )
                    {
                    // InternalRpgleParser.g:1254:4: (lv_strval_1_0= RULE_STRING )
                    // InternalRpgleParser.g:1255:5: lv_strval_1_0= RULE_STRING
                    {
                    lv_strval_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_strval_1_0, grammarAccess.getExpressionAccess().getStrvalSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"strval",
                    						lv_strval_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:1272:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalRpgleParser.g:1272:3: ( (otherlv_2= RULE_ID ) )
                    // InternalRpgleParser.g:1273:4: (otherlv_2= RULE_ID )
                    {
                    // InternalRpgleParser.g:1273:4: (otherlv_2= RULE_ID )
                    // InternalRpgleParser.g:1274:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getVarDclsCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:1286:3: this_Bif_3= ruleBif
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBifParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bif_3=ruleBif();

                    state._fsp--;


                    			current = this_Bif_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:1295:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis )
                    {
                    // InternalRpgleParser.g:1295:3: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis )
                    // InternalRpgleParser.g:1296:4: ( (otherlv_4= RULE_ID ) ) otherlv_5= LeftParenthesis ( (lv_parmlist_6_0= ruleParmlist ) )? otherlv_7= RightParenthesis
                    {
                    // InternalRpgleParser.g:1296:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRpgleParser.g:1297:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRpgleParser.g:1297:5: (otherlv_4= RULE_ID )
                    // InternalRpgleParser.g:1298:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getProcvalDclprocCrossReference_4_0_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRpgleParser.g:1313:4: ( (lv_parmlist_6_0= ruleParmlist ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=Eof && LA12_0<=Rnf)||(LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalRpgleParser.g:1314:5: (lv_parmlist_6_0= ruleParmlist )
                            {
                            // InternalRpgleParser.g:1314:5: (lv_parmlist_6_0= ruleParmlist )
                            // InternalRpgleParser.g:1315:6: lv_parmlist_6_0= ruleParmlist
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getParmlistParmlistParserRuleCall_4_2_0());
                            					
                            pushFollow(FOLLOW_8);
                            lv_parmlist_6_0=ruleParmlist();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"parmlist",
                            							lv_parmlist_6_0,
                            							"org.sitemule.rpglanguage.Rpgle.Parmlist");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBif"
    // InternalRpgleParser.g:1341:1: entryRuleBif returns [EObject current=null] : iv_ruleBif= ruleBif EOF ;
    public final EObject entryRuleBif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBif = null;


        try {
            // InternalRpgleParser.g:1341:44: (iv_ruleBif= ruleBif EOF )
            // InternalRpgleParser.g:1342:2: iv_ruleBif= ruleBif EOF
            {
             newCompositeNode(grammarAccess.getBifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBif=ruleBif();

            state._fsp--;

             current =iv_ruleBif; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBif"


    // $ANTLR start "ruleBif"
    // InternalRpgleParser.g:1348:1: ruleBif returns [EObject current=null] : (this_Eof_0= ruleEof | this_Rnf_1= ruleRnf ) ;
    public final EObject ruleBif() throws RecognitionException {
        EObject current = null;

        EObject this_Eof_0 = null;

        EObject this_Rnf_1 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1354:2: ( (this_Eof_0= ruleEof | this_Rnf_1= ruleRnf ) )
            // InternalRpgleParser.g:1355:2: (this_Eof_0= ruleEof | this_Rnf_1= ruleRnf )
            {
            // InternalRpgleParser.g:1355:2: (this_Eof_0= ruleEof | this_Rnf_1= ruleRnf )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Eof) ) {
                alt14=1;
            }
            else if ( (LA14_0==Rnf) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRpgleParser.g:1356:3: this_Eof_0= ruleEof
                    {

                    			newCompositeNode(grammarAccess.getBifAccess().getEofParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Eof_0=ruleEof();

                    state._fsp--;


                    			current = this_Eof_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:1365:3: this_Rnf_1= ruleRnf
                    {

                    			newCompositeNode(grammarAccess.getBifAccess().getRnfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rnf_1=ruleRnf();

                    state._fsp--;


                    			current = this_Rnf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBif"


    // $ANTLR start "entryRuleParmlist"
    // InternalRpgleParser.g:1377:1: entryRuleParmlist returns [EObject current=null] : iv_ruleParmlist= ruleParmlist EOF ;
    public final EObject entryRuleParmlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParmlist = null;


        try {
            // InternalRpgleParser.g:1377:49: (iv_ruleParmlist= ruleParmlist EOF )
            // InternalRpgleParser.g:1378:2: iv_ruleParmlist= ruleParmlist EOF
            {
             newCompositeNode(grammarAccess.getParmlistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParmlist=ruleParmlist();

            state._fsp--;

             current =iv_ruleParmlist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParmlist"


    // $ANTLR start "ruleParmlist"
    // InternalRpgleParser.g:1384:1: ruleParmlist returns [EObject current=null] : (this_Parm1_0= ruleParm1 ( (lv_parms_1_0= ruleParm2 ) )* ) ;
    public final EObject ruleParmlist() throws RecognitionException {
        EObject current = null;

        EObject this_Parm1_0 = null;

        EObject lv_parms_1_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1390:2: ( (this_Parm1_0= ruleParm1 ( (lv_parms_1_0= ruleParm2 ) )* ) )
            // InternalRpgleParser.g:1391:2: (this_Parm1_0= ruleParm1 ( (lv_parms_1_0= ruleParm2 ) )* )
            {
            // InternalRpgleParser.g:1391:2: (this_Parm1_0= ruleParm1 ( (lv_parms_1_0= ruleParm2 ) )* )
            // InternalRpgleParser.g:1392:3: this_Parm1_0= ruleParm1 ( (lv_parms_1_0= ruleParm2 ) )*
            {

            			newCompositeNode(grammarAccess.getParmlistAccess().getParm1ParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Parm1_0=ruleParm1();

            state._fsp--;


            			current = this_Parm1_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgleParser.g:1400:3: ( (lv_parms_1_0= ruleParm2 ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Colon) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRpgleParser.g:1401:4: (lv_parms_1_0= ruleParm2 )
            	    {
            	    // InternalRpgleParser.g:1401:4: (lv_parms_1_0= ruleParm2 )
            	    // InternalRpgleParser.g:1402:5: lv_parms_1_0= ruleParm2
            	    {

            	    					newCompositeNode(grammarAccess.getParmlistAccess().getParmsParm2ParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parms_1_0=ruleParm2();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParmlistRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parms",
            	    						lv_parms_1_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Parm2");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParmlist"


    // $ANTLR start "entryRuleParm1"
    // InternalRpgleParser.g:1423:1: entryRuleParm1 returns [EObject current=null] : iv_ruleParm1= ruleParm1 EOF ;
    public final EObject entryRuleParm1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParm1 = null;


        try {
            // InternalRpgleParser.g:1423:46: (iv_ruleParm1= ruleParm1 EOF )
            // InternalRpgleParser.g:1424:2: iv_ruleParm1= ruleParm1 EOF
            {
             newCompositeNode(grammarAccess.getParm1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParm1=ruleParm1();

            state._fsp--;

             current =iv_ruleParm1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParm1"


    // $ANTLR start "ruleParm1"
    // InternalRpgleParser.g:1430:1: ruleParm1 returns [EObject current=null] : ( (lv_parm_0_0= ruleExpression ) ) ;
    public final EObject ruleParm1() throws RecognitionException {
        EObject current = null;

        EObject lv_parm_0_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1436:2: ( ( (lv_parm_0_0= ruleExpression ) ) )
            // InternalRpgleParser.g:1437:2: ( (lv_parm_0_0= ruleExpression ) )
            {
            // InternalRpgleParser.g:1437:2: ( (lv_parm_0_0= ruleExpression ) )
            // InternalRpgleParser.g:1438:3: (lv_parm_0_0= ruleExpression )
            {
            // InternalRpgleParser.g:1438:3: (lv_parm_0_0= ruleExpression )
            // InternalRpgleParser.g:1439:4: lv_parm_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getParm1Access().getParmExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_parm_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParm1Rule());
            				}
            				set(
            					current,
            					"parm",
            					lv_parm_0_0,
            					"org.sitemule.rpglanguage.Rpgle.Expression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParm1"


    // $ANTLR start "entryRuleParm2"
    // InternalRpgleParser.g:1459:1: entryRuleParm2 returns [EObject current=null] : iv_ruleParm2= ruleParm2 EOF ;
    public final EObject entryRuleParm2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParm2 = null;


        try {
            // InternalRpgleParser.g:1459:46: (iv_ruleParm2= ruleParm2 EOF )
            // InternalRpgleParser.g:1460:2: iv_ruleParm2= ruleParm2 EOF
            {
             newCompositeNode(grammarAccess.getParm2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParm2=ruleParm2();

            state._fsp--;

             current =iv_ruleParm2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParm2"


    // $ANTLR start "ruleParm2"
    // InternalRpgleParser.g:1466:1: ruleParm2 returns [EObject current=null] : (otherlv_0= Colon this_Parm1_1= ruleParm1 ) ;
    public final EObject ruleParm2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Parm1_1 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1472:2: ( (otherlv_0= Colon this_Parm1_1= ruleParm1 ) )
            // InternalRpgleParser.g:1473:2: (otherlv_0= Colon this_Parm1_1= ruleParm1 )
            {
            // InternalRpgleParser.g:1473:2: (otherlv_0= Colon this_Parm1_1= ruleParm1 )
            // InternalRpgleParser.g:1474:3: otherlv_0= Colon this_Parm1_1= ruleParm1
            {
            otherlv_0=(Token)match(input,Colon,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParm2Access().getColonKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParm2Access().getParm1ParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Parm1_1=ruleParm1();

            state._fsp--;


            			current = this_Parm1_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParm2"


    // $ANTLR start "entryRuleIfblock"
    // InternalRpgleParser.g:1490:1: entryRuleIfblock returns [EObject current=null] : iv_ruleIfblock= ruleIfblock EOF ;
    public final EObject entryRuleIfblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfblock = null;


        try {
            // InternalRpgleParser.g:1490:48: (iv_ruleIfblock= ruleIfblock EOF )
            // InternalRpgleParser.g:1491:2: iv_ruleIfblock= ruleIfblock EOF
            {
             newCompositeNode(grammarAccess.getIfblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfblock=ruleIfblock();

            state._fsp--;

             current =iv_ruleIfblock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfblock"


    // $ANTLR start "ruleIfblock"
    // InternalRpgleParser.g:1497:1: ruleIfblock returns [EObject current=null] : (this_If_0= ruleIf ( (lv_ifcode_1_0= ruleElseif ) )* ( (lv_ifcode_2_0= ruleElse ) )? ruleEndif ) ;
    public final EObject ruleIfblock() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject lv_ifcode_1_0 = null;

        EObject lv_ifcode_2_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1503:2: ( (this_If_0= ruleIf ( (lv_ifcode_1_0= ruleElseif ) )* ( (lv_ifcode_2_0= ruleElse ) )? ruleEndif ) )
            // InternalRpgleParser.g:1504:2: (this_If_0= ruleIf ( (lv_ifcode_1_0= ruleElseif ) )* ( (lv_ifcode_2_0= ruleElse ) )? ruleEndif )
            {
            // InternalRpgleParser.g:1504:2: (this_If_0= ruleIf ( (lv_ifcode_1_0= ruleElseif ) )* ( (lv_ifcode_2_0= ruleElse ) )? ruleEndif )
            // InternalRpgleParser.g:1505:3: this_If_0= ruleIf ( (lv_ifcode_1_0= ruleElseif ) )* ( (lv_ifcode_2_0= ruleElse ) )? ruleEndif
            {

            			newCompositeNode(grammarAccess.getIfblockAccess().getIfParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_If_0=ruleIf();

            state._fsp--;


            			current = this_If_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgleParser.g:1513:3: ( (lv_ifcode_1_0= ruleElseif ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Elseif) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRpgleParser.g:1514:4: (lv_ifcode_1_0= ruleElseif )
            	    {
            	    // InternalRpgleParser.g:1514:4: (lv_ifcode_1_0= ruleElseif )
            	    // InternalRpgleParser.g:1515:5: lv_ifcode_1_0= ruleElseif
            	    {

            	    					newCompositeNode(grammarAccess.getIfblockAccess().getIfcodeElseifParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_ifcode_1_0=ruleElseif();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfblockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifcode",
            	    						lv_ifcode_1_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Elseif");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalRpgleParser.g:1532:3: ( (lv_ifcode_2_0= ruleElse ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Else) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRpgleParser.g:1533:4: (lv_ifcode_2_0= ruleElse )
                    {
                    // InternalRpgleParser.g:1533:4: (lv_ifcode_2_0= ruleElse )
                    // InternalRpgleParser.g:1534:5: lv_ifcode_2_0= ruleElse
                    {

                    					newCompositeNode(grammarAccess.getIfblockAccess().getIfcodeElseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_ifcode_2_0=ruleElse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfblockRule());
                    					}
                    					add(
                    						current,
                    						"ifcode",
                    						lv_ifcode_2_0,
                    						"org.sitemule.rpglanguage.Rpgle.Else");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getIfblockAccess().getEndifParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEndif();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfblock"


    // $ANTLR start "entryRuleIf"
    // InternalRpgleParser.g:1562:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalRpgleParser.g:1562:43: (iv_ruleIf= ruleIf EOF )
            // InternalRpgleParser.g:1563:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalRpgleParser.g:1569:1: ruleIf returns [EObject current=null] : (otherlv_0= If this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Boolean_1 = null;

        EObject lv_ifcode_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1575:2: ( (otherlv_0= If this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* ) )
            // InternalRpgleParser.g:1576:2: (otherlv_0= If this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* )
            {
            // InternalRpgleParser.g:1576:2: (otherlv_0= If this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* )
            // InternalRpgleParser.g:1577:3: otherlv_0= If this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )*
            {
            otherlv_0=(Token)match(input,If,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIfAccess().getBooleanParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Boolean_1=ruleBoolean();

            state._fsp--;


            			current = this_Boolean_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:1593:3: ( (lv_ifcode_3_0= ruleCode ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=Return && LA18_0<=Select)||(LA18_0>=Begsr && LA18_0<=Close)||(LA18_0>=Reade && LA18_0<=Rnf)||(LA18_0>=Exsr && LA18_0<=Read)||(LA18_0>=Dou && LA18_0<=For)||(LA18_0>=Do && LA18_0<=If)||LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpgleParser.g:1594:4: (lv_ifcode_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:1594:4: (lv_ifcode_3_0= ruleCode )
            	    // InternalRpgleParser.g:1595:5: lv_ifcode_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getIfcodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_ifcode_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifcode",
            	    						lv_ifcode_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleElseif"
    // InternalRpgleParser.g:1616:1: entryRuleElseif returns [EObject current=null] : iv_ruleElseif= ruleElseif EOF ;
    public final EObject entryRuleElseif() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseif = null;


        try {
            // InternalRpgleParser.g:1616:47: (iv_ruleElseif= ruleElseif EOF )
            // InternalRpgleParser.g:1617:2: iv_ruleElseif= ruleElseif EOF
            {
             newCompositeNode(grammarAccess.getElseifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseif=ruleElseif();

            state._fsp--;

             current =iv_ruleElseif; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseif"


    // $ANTLR start "ruleElseif"
    // InternalRpgleParser.g:1623:1: ruleElseif returns [EObject current=null] : (otherlv_0= Elseif this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* ) ;
    public final EObject ruleElseif() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Boolean_1 = null;

        EObject lv_ifcode_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1629:2: ( (otherlv_0= Elseif this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* ) )
            // InternalRpgleParser.g:1630:2: (otherlv_0= Elseif this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* )
            {
            // InternalRpgleParser.g:1630:2: (otherlv_0= Elseif this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* )
            // InternalRpgleParser.g:1631:3: otherlv_0= Elseif this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )*
            {
            otherlv_0=(Token)match(input,Elseif,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getElseifAccess().getElseifKeyword_0());
            		

            			newCompositeNode(grammarAccess.getElseifAccess().getBooleanParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Boolean_1=ruleBoolean();

            state._fsp--;


            			current = this_Boolean_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getElseifAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:1647:3: ( (lv_ifcode_3_0= ruleCode ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=Return && LA19_0<=Select)||(LA19_0>=Begsr && LA19_0<=Close)||(LA19_0>=Reade && LA19_0<=Rnf)||(LA19_0>=Exsr && LA19_0<=Read)||(LA19_0>=Dou && LA19_0<=For)||(LA19_0>=Do && LA19_0<=If)||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgleParser.g:1648:4: (lv_ifcode_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:1648:4: (lv_ifcode_3_0= ruleCode )
            	    // InternalRpgleParser.g:1649:5: lv_ifcode_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getElseifAccess().getIfcodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_ifcode_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseifRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifcode",
            	    						lv_ifcode_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseif"


    // $ANTLR start "entryRuleElse"
    // InternalRpgleParser.g:1670:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalRpgleParser.g:1670:45: (iv_ruleElse= ruleElse EOF )
            // InternalRpgleParser.g:1671:2: iv_ruleElse= ruleElse EOF
            {
             newCompositeNode(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElse=ruleElse();

            state._fsp--;

             current =iv_ruleElse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalRpgleParser.g:1677:1: ruleElse returns [EObject current=null] : ( () otherlv_1= Else otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ifcode_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1683:2: ( ( () otherlv_1= Else otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* ) )
            // InternalRpgleParser.g:1684:2: ( () otherlv_1= Else otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* )
            {
            // InternalRpgleParser.g:1684:2: ( () otherlv_1= Else otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )* )
            // InternalRpgleParser.g:1685:3: () otherlv_1= Else otherlv_2= Semicolon ( (lv_ifcode_3_0= ruleCode ) )*
            {
            // InternalRpgleParser.g:1685:3: ()
            // InternalRpgleParser.g:1686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseAccess().getElseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Else,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getElseAccess().getElseKeyword_1());
            		
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getElseAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:1700:3: ( (lv_ifcode_3_0= ruleCode ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Return && LA20_0<=Select)||(LA20_0>=Begsr && LA20_0<=Close)||(LA20_0>=Reade && LA20_0<=Rnf)||(LA20_0>=Exsr && LA20_0<=Read)||(LA20_0>=Dou && LA20_0<=For)||(LA20_0>=Do && LA20_0<=If)||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgleParser.g:1701:4: (lv_ifcode_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:1701:4: (lv_ifcode_3_0= ruleCode )
            	    // InternalRpgleParser.g:1702:5: lv_ifcode_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getElseAccess().getIfcodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_ifcode_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifcode",
            	    						lv_ifcode_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleEndif"
    // InternalRpgleParser.g:1723:1: entryRuleEndif returns [String current=null] : iv_ruleEndif= ruleEndif EOF ;
    public final String entryRuleEndif() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndif = null;


        try {
            // InternalRpgleParser.g:1723:45: (iv_ruleEndif= ruleEndif EOF )
            // InternalRpgleParser.g:1724:2: iv_ruleEndif= ruleEndif EOF
            {
             newCompositeNode(grammarAccess.getEndifRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndif=ruleEndif();

            state._fsp--;

             current =iv_ruleEndif.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndif"


    // $ANTLR start "ruleEndif"
    // InternalRpgleParser.g:1730:1: ruleEndif returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Endif ;
    public final AntlrDatatypeRuleToken ruleEndif() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:1736:2: (kw= Endif )
            // InternalRpgleParser.g:1737:2: kw= Endif
            {
            kw=(Token)match(input,Endif,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEndifAccess().getEndifKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndif"


    // $ANTLR start "entryRuleDo"
    // InternalRpgleParser.g:1745:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // InternalRpgleParser.g:1745:43: (iv_ruleDo= ruleDo EOF )
            // InternalRpgleParser.g:1746:2: iv_ruleDo= ruleDo EOF
            {
             newCompositeNode(grammarAccess.getDoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDo=ruleDo();

            state._fsp--;

             current =iv_ruleDo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDo"


    // $ANTLR start "ruleDo"
    // InternalRpgleParser.g:1752:1: ruleDo returns [EObject current=null] : (otherlv_0= Do otherlv_1= Semicolon ( (lv_code_2_0= ruleCode ) )* otherlv_3= Enddo otherlv_4= Semicolon ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1758:2: ( (otherlv_0= Do otherlv_1= Semicolon ( (lv_code_2_0= ruleCode ) )* otherlv_3= Enddo otherlv_4= Semicolon ) )
            // InternalRpgleParser.g:1759:2: (otherlv_0= Do otherlv_1= Semicolon ( (lv_code_2_0= ruleCode ) )* otherlv_3= Enddo otherlv_4= Semicolon )
            {
            // InternalRpgleParser.g:1759:2: (otherlv_0= Do otherlv_1= Semicolon ( (lv_code_2_0= ruleCode ) )* otherlv_3= Enddo otherlv_4= Semicolon )
            // InternalRpgleParser.g:1760:3: otherlv_0= Do otherlv_1= Semicolon ( (lv_code_2_0= ruleCode ) )* otherlv_3= Enddo otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Do,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDoAccess().getDoKeyword_0());
            		
            otherlv_1=(Token)match(input,Semicolon,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDoAccess().getSemicolonKeyword_1());
            		
            // InternalRpgleParser.g:1768:3: ( (lv_code_2_0= ruleCode ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=Return && LA21_0<=Select)||(LA21_0>=Begsr && LA21_0<=Close)||(LA21_0>=Reade && LA21_0<=Rnf)||(LA21_0>=Exsr && LA21_0<=Read)||(LA21_0>=Dou && LA21_0<=For)||(LA21_0>=Do && LA21_0<=If)||LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgleParser.g:1769:4: (lv_code_2_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:1769:4: (lv_code_2_0= ruleCode )
            	    // InternalRpgleParser.g:1770:5: lv_code_2_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getDoAccess().getCodeCodeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_code_2_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_2_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,Enddo,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDoAccess().getEnddoKeyword_3());
            		
            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDoAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDo"


    // $ANTLR start "entryRuleDow"
    // InternalRpgleParser.g:1799:1: entryRuleDow returns [EObject current=null] : iv_ruleDow= ruleDow EOF ;
    public final EObject entryRuleDow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDow = null;


        try {
            // InternalRpgleParser.g:1799:44: (iv_ruleDow= ruleDow EOF )
            // InternalRpgleParser.g:1800:2: iv_ruleDow= ruleDow EOF
            {
             newCompositeNode(grammarAccess.getDowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDow=ruleDow();

            state._fsp--;

             current =iv_ruleDow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDow"


    // $ANTLR start "ruleDow"
    // InternalRpgleParser.g:1806:1: ruleDow returns [EObject current=null] : (otherlv_0= Dow ( (lv_dow_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon ) ;
    public final EObject ruleDow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_dow_1_0 = null;

        EObject lv_code_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1812:2: ( (otherlv_0= Dow ( (lv_dow_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon ) )
            // InternalRpgleParser.g:1813:2: (otherlv_0= Dow ( (lv_dow_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon )
            {
            // InternalRpgleParser.g:1813:2: (otherlv_0= Dow ( (lv_dow_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon )
            // InternalRpgleParser.g:1814:3: otherlv_0= Dow ( (lv_dow_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Dow,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDowAccess().getDowKeyword_0());
            		
            // InternalRpgleParser.g:1818:3: ( (lv_dow_1_0= ruleBoolean ) )
            // InternalRpgleParser.g:1819:4: (lv_dow_1_0= ruleBoolean )
            {
            // InternalRpgleParser.g:1819:4: (lv_dow_1_0= ruleBoolean )
            // InternalRpgleParser.g:1820:5: lv_dow_1_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getDowAccess().getDowBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_dow_1_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDowRule());
            					}
            					set(
            						current,
            						"dow",
            						lv_dow_1_0,
            						"org.sitemule.rpglanguage.Rpgle.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDowAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:1841:3: ( (lv_code_3_0= ruleCode ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=Return && LA22_0<=Select)||(LA22_0>=Begsr && LA22_0<=Close)||(LA22_0>=Reade && LA22_0<=Rnf)||(LA22_0>=Exsr && LA22_0<=Read)||(LA22_0>=Dou && LA22_0<=For)||(LA22_0>=Do && LA22_0<=If)||LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRpgleParser.g:1842:4: (lv_code_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:1842:4: (lv_code_3_0= ruleCode )
            	    // InternalRpgleParser.g:1843:5: lv_code_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getDowAccess().getCodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_code_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,Enddo,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDowAccess().getEnddoKeyword_4());
            		
            otherlv_5=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDowAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDow"


    // $ANTLR start "entryRuleDou"
    // InternalRpgleParser.g:1872:1: entryRuleDou returns [EObject current=null] : iv_ruleDou= ruleDou EOF ;
    public final EObject entryRuleDou() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDou = null;


        try {
            // InternalRpgleParser.g:1872:44: (iv_ruleDou= ruleDou EOF )
            // InternalRpgleParser.g:1873:2: iv_ruleDou= ruleDou EOF
            {
             newCompositeNode(grammarAccess.getDouRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDou=ruleDou();

            state._fsp--;

             current =iv_ruleDou; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDou"


    // $ANTLR start "ruleDou"
    // InternalRpgleParser.g:1879:1: ruleDou returns [EObject current=null] : (otherlv_0= Dou ( (lv_dou_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon ) ;
    public final EObject ruleDou() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_dou_1_0 = null;

        EObject lv_code_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1885:2: ( (otherlv_0= Dou ( (lv_dou_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon ) )
            // InternalRpgleParser.g:1886:2: (otherlv_0= Dou ( (lv_dou_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon )
            {
            // InternalRpgleParser.g:1886:2: (otherlv_0= Dou ( (lv_dou_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon )
            // InternalRpgleParser.g:1887:3: otherlv_0= Dou ( (lv_dou_1_0= ruleBoolean ) ) otherlv_2= Semicolon ( (lv_code_3_0= ruleCode ) )* otherlv_4= Enddo otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Dou,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDouAccess().getDouKeyword_0());
            		
            // InternalRpgleParser.g:1891:3: ( (lv_dou_1_0= ruleBoolean ) )
            // InternalRpgleParser.g:1892:4: (lv_dou_1_0= ruleBoolean )
            {
            // InternalRpgleParser.g:1892:4: (lv_dou_1_0= ruleBoolean )
            // InternalRpgleParser.g:1893:5: lv_dou_1_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getDouAccess().getDouBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_dou_1_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDouRule());
            					}
            					set(
            						current,
            						"dou",
            						lv_dou_1_0,
            						"org.sitemule.rpglanguage.Rpgle.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDouAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:1914:3: ( (lv_code_3_0= ruleCode ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=Return && LA23_0<=Select)||(LA23_0>=Begsr && LA23_0<=Close)||(LA23_0>=Reade && LA23_0<=Rnf)||(LA23_0>=Exsr && LA23_0<=Read)||(LA23_0>=Dou && LA23_0<=For)||(LA23_0>=Do && LA23_0<=If)||LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRpgleParser.g:1915:4: (lv_code_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:1915:4: (lv_code_3_0= ruleCode )
            	    // InternalRpgleParser.g:1916:5: lv_code_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getDouAccess().getCodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_code_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDouRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,Enddo,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDouAccess().getEnddoKeyword_4());
            		
            otherlv_5=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDouAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDou"


    // $ANTLR start "entryRuleFor"
    // InternalRpgleParser.g:1945:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalRpgleParser.g:1945:44: (iv_ruleFor= ruleFor EOF )
            // InternalRpgleParser.g:1946:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalRpgleParser.g:1952:1: ruleFor returns [EObject current=null] : (otherlv_0= For ( (otherlv_1= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_from_3_0= ruleExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleExpression ) ) otherlv_6= Semicolon ( (lv_code_7_0= ruleCode ) )* otherlv_8= Endfor otherlv_9= Semicolon ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_from_3_0 = null;

        EObject lv_to_5_0 = null;

        EObject lv_code_7_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:1958:2: ( (otherlv_0= For ( (otherlv_1= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_from_3_0= ruleExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleExpression ) ) otherlv_6= Semicolon ( (lv_code_7_0= ruleCode ) )* otherlv_8= Endfor otherlv_9= Semicolon ) )
            // InternalRpgleParser.g:1959:2: (otherlv_0= For ( (otherlv_1= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_from_3_0= ruleExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleExpression ) ) otherlv_6= Semicolon ( (lv_code_7_0= ruleCode ) )* otherlv_8= Endfor otherlv_9= Semicolon )
            {
            // InternalRpgleParser.g:1959:2: (otherlv_0= For ( (otherlv_1= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_from_3_0= ruleExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleExpression ) ) otherlv_6= Semicolon ( (lv_code_7_0= ruleCode ) )* otherlv_8= Endfor otherlv_9= Semicolon )
            // InternalRpgleParser.g:1960:3: otherlv_0= For ( (otherlv_1= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_from_3_0= ruleExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleExpression ) ) otherlv_6= Semicolon ( (lv_code_7_0= ruleCode ) )* otherlv_8= Endfor otherlv_9= Semicolon
            {
            otherlv_0=(Token)match(input,For,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
            		
            // InternalRpgleParser.g:1964:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgleParser.g:1965:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgleParser.g:1965:4: (otherlv_1= RULE_ID )
            // InternalRpgleParser.g:1966:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getForAccess().getVarDclsCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getForAccess().getEqualsSignKeyword_2());
            		
            // InternalRpgleParser.g:1981:3: ( (lv_from_3_0= ruleExpression ) )
            // InternalRpgleParser.g:1982:4: (lv_from_3_0= ruleExpression )
            {
            // InternalRpgleParser.g:1982:4: (lv_from_3_0= ruleExpression )
            // InternalRpgleParser.g:1983:5: lv_from_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForAccess().getFromExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_from_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_3_0,
            						"org.sitemule.rpglanguage.Rpgle.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,To,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getForAccess().getToKeyword_4());
            		
            // InternalRpgleParser.g:2004:3: ( (lv_to_5_0= ruleExpression ) )
            // InternalRpgleParser.g:2005:4: (lv_to_5_0= ruleExpression )
            {
            // InternalRpgleParser.g:2005:4: (lv_to_5_0= ruleExpression )
            // InternalRpgleParser.g:2006:5: lv_to_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForAccess().getToExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_to_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_5_0,
            						"org.sitemule.rpglanguage.Rpgle.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Semicolon,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getForAccess().getSemicolonKeyword_6());
            		
            // InternalRpgleParser.g:2027:3: ( (lv_code_7_0= ruleCode ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=Return && LA24_0<=Select)||(LA24_0>=Begsr && LA24_0<=Close)||(LA24_0>=Reade && LA24_0<=Rnf)||(LA24_0>=Exsr && LA24_0<=Read)||(LA24_0>=Dou && LA24_0<=For)||(LA24_0>=Do && LA24_0<=If)||LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRpgleParser.g:2028:4: (lv_code_7_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:2028:4: (lv_code_7_0= ruleCode )
            	    // InternalRpgleParser.g:2029:5: lv_code_7_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getForAccess().getCodeCodeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_code_7_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForRule());
            	    					}
            	    					add(
            	    						current,
            	    						"code",
            	    						lv_code_7_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,Endfor,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getEndforKeyword_8());
            		
            otherlv_9=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getForAccess().getSemicolonKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleSelectblock"
    // InternalRpgleParser.g:2058:1: entryRuleSelectblock returns [EObject current=null] : iv_ruleSelectblock= ruleSelectblock EOF ;
    public final EObject entryRuleSelectblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectblock = null;


        try {
            // InternalRpgleParser.g:2058:52: (iv_ruleSelectblock= ruleSelectblock EOF )
            // InternalRpgleParser.g:2059:2: iv_ruleSelectblock= ruleSelectblock EOF
            {
             newCompositeNode(grammarAccess.getSelectblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectblock=ruleSelectblock();

            state._fsp--;

             current =iv_ruleSelectblock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectblock"


    // $ANTLR start "ruleSelectblock"
    // InternalRpgleParser.g:2065:1: ruleSelectblock returns [EObject current=null] : ( () ruleSelect otherlv_2= Semicolon ( (lv_when_3_0= ruleWhen ) )* ( (lv_other_4_0= ruleOther ) )? ruleEndsl ) ;
    public final EObject ruleSelectblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_when_3_0 = null;

        EObject lv_other_4_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2071:2: ( ( () ruleSelect otherlv_2= Semicolon ( (lv_when_3_0= ruleWhen ) )* ( (lv_other_4_0= ruleOther ) )? ruleEndsl ) )
            // InternalRpgleParser.g:2072:2: ( () ruleSelect otherlv_2= Semicolon ( (lv_when_3_0= ruleWhen ) )* ( (lv_other_4_0= ruleOther ) )? ruleEndsl )
            {
            // InternalRpgleParser.g:2072:2: ( () ruleSelect otherlv_2= Semicolon ( (lv_when_3_0= ruleWhen ) )* ( (lv_other_4_0= ruleOther ) )? ruleEndsl )
            // InternalRpgleParser.g:2073:3: () ruleSelect otherlv_2= Semicolon ( (lv_when_3_0= ruleWhen ) )* ( (lv_other_4_0= ruleOther ) )? ruleEndsl
            {
            // InternalRpgleParser.g:2073:3: ()
            // InternalRpgleParser.g:2074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectblockAccess().getSelectblockAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getSelectblockAccess().getSelectParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            ruleSelect();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectblockAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:2091:3: ( (lv_when_3_0= ruleWhen ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==When) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRpgleParser.g:2092:4: (lv_when_3_0= ruleWhen )
            	    {
            	    // InternalRpgleParser.g:2092:4: (lv_when_3_0= ruleWhen )
            	    // InternalRpgleParser.g:2093:5: lv_when_3_0= ruleWhen
            	    {

            	    					newCompositeNode(grammarAccess.getSelectblockAccess().getWhenWhenParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_when_3_0=ruleWhen();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelectblockRule());
            	    					}
            	    					set(
            	    						current,
            	    						"when",
            	    						lv_when_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.When");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalRpgleParser.g:2110:3: ( (lv_other_4_0= ruleOther ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Other) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRpgleParser.g:2111:4: (lv_other_4_0= ruleOther )
                    {
                    // InternalRpgleParser.g:2111:4: (lv_other_4_0= ruleOther )
                    // InternalRpgleParser.g:2112:5: lv_other_4_0= ruleOther
                    {

                    					newCompositeNode(grammarAccess.getSelectblockAccess().getOtherOtherParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_other_4_0=ruleOther();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectblockRule());
                    					}
                    					set(
                    						current,
                    						"other",
                    						lv_other_4_0,
                    						"org.sitemule.rpglanguage.Rpgle.Other");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getSelectblockAccess().getEndslParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            ruleEndsl();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectblock"


    // $ANTLR start "entryRuleSelect"
    // InternalRpgleParser.g:2140:1: entryRuleSelect returns [String current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final String entryRuleSelect() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelect = null;


        try {
            // InternalRpgleParser.g:2140:46: (iv_ruleSelect= ruleSelect EOF )
            // InternalRpgleParser.g:2141:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalRpgleParser.g:2147:1: ruleSelect returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Select kw= Semicolon ) ;
    public final AntlrDatatypeRuleToken ruleSelect() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:2153:2: ( (kw= Select kw= Semicolon ) )
            // InternalRpgleParser.g:2154:2: (kw= Select kw= Semicolon )
            {
            // InternalRpgleParser.g:2154:2: (kw= Select kw= Semicolon )
            // InternalRpgleParser.g:2155:3: kw= Select kw= Semicolon
            {
            kw=(Token)match(input,Select,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            kw=(Token)match(input,Semicolon,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSelectAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleWhen"
    // InternalRpgleParser.g:2169:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalRpgleParser.g:2169:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalRpgleParser.g:2170:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalRpgleParser.g:2176:1: ruleWhen returns [EObject current=null] : (otherlv_0= When this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_whencode_3_0= ruleCode ) )* ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Boolean_1 = null;

        EObject lv_whencode_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2182:2: ( (otherlv_0= When this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_whencode_3_0= ruleCode ) )* ) )
            // InternalRpgleParser.g:2183:2: (otherlv_0= When this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_whencode_3_0= ruleCode ) )* )
            {
            // InternalRpgleParser.g:2183:2: (otherlv_0= When this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_whencode_3_0= ruleCode ) )* )
            // InternalRpgleParser.g:2184:3: otherlv_0= When this_Boolean_1= ruleBoolean otherlv_2= Semicolon ( (lv_whencode_3_0= ruleCode ) )*
            {
            otherlv_0=(Token)match(input,When,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		

            			newCompositeNode(grammarAccess.getWhenAccess().getBooleanParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Boolean_1=ruleBoolean();

            state._fsp--;


            			current = this_Boolean_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:2200:3: ( (lv_whencode_3_0= ruleCode ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=Return && LA27_0<=Select)||(LA27_0>=Begsr && LA27_0<=Close)||(LA27_0>=Reade && LA27_0<=Rnf)||(LA27_0>=Exsr && LA27_0<=Read)||(LA27_0>=Dou && LA27_0<=For)||(LA27_0>=Do && LA27_0<=If)||LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRpgleParser.g:2201:4: (lv_whencode_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:2201:4: (lv_whencode_3_0= ruleCode )
            	    // InternalRpgleParser.g:2202:5: lv_whencode_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getWhenAccess().getWhencodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_whencode_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"whencode",
            	    						lv_whencode_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleOther"
    // InternalRpgleParser.g:2223:1: entryRuleOther returns [EObject current=null] : iv_ruleOther= ruleOther EOF ;
    public final EObject entryRuleOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOther = null;


        try {
            // InternalRpgleParser.g:2223:46: (iv_ruleOther= ruleOther EOF )
            // InternalRpgleParser.g:2224:2: iv_ruleOther= ruleOther EOF
            {
             newCompositeNode(grammarAccess.getOtherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOther=ruleOther();

            state._fsp--;

             current =iv_ruleOther; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOther"


    // $ANTLR start "ruleOther"
    // InternalRpgleParser.g:2230:1: ruleOther returns [EObject current=null] : ( () otherlv_1= Other otherlv_2= Semicolon ( (lv_othercode_3_0= ruleCode ) )* ) ;
    public final EObject ruleOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_othercode_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2236:2: ( ( () otherlv_1= Other otherlv_2= Semicolon ( (lv_othercode_3_0= ruleCode ) )* ) )
            // InternalRpgleParser.g:2237:2: ( () otherlv_1= Other otherlv_2= Semicolon ( (lv_othercode_3_0= ruleCode ) )* )
            {
            // InternalRpgleParser.g:2237:2: ( () otherlv_1= Other otherlv_2= Semicolon ( (lv_othercode_3_0= ruleCode ) )* )
            // InternalRpgleParser.g:2238:3: () otherlv_1= Other otherlv_2= Semicolon ( (lv_othercode_3_0= ruleCode ) )*
            {
            // InternalRpgleParser.g:2238:3: ()
            // InternalRpgleParser.g:2239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOtherAccess().getOtherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Other,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherAccess().getOtherKeyword_1());
            		
            otherlv_2=(Token)match(input,Semicolon,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getOtherAccess().getSemicolonKeyword_2());
            		
            // InternalRpgleParser.g:2253:3: ( (lv_othercode_3_0= ruleCode ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=Return && LA28_0<=Select)||(LA28_0>=Begsr && LA28_0<=Close)||(LA28_0>=Reade && LA28_0<=Rnf)||(LA28_0>=Exsr && LA28_0<=Read)||(LA28_0>=Dou && LA28_0<=For)||(LA28_0>=Do && LA28_0<=If)||LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRpgleParser.g:2254:4: (lv_othercode_3_0= ruleCode )
            	    {
            	    // InternalRpgleParser.g:2254:4: (lv_othercode_3_0= ruleCode )
            	    // InternalRpgleParser.g:2255:5: lv_othercode_3_0= ruleCode
            	    {

            	    					newCompositeNode(grammarAccess.getOtherAccess().getOthercodeCodeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_othercode_3_0=ruleCode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOtherRule());
            	    					}
            	    					add(
            	    						current,
            	    						"othercode",
            	    						lv_othercode_3_0,
            	    						"org.sitemule.rpglanguage.Rpgle.Code");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOther"


    // $ANTLR start "entryRuleEndsl"
    // InternalRpgleParser.g:2276:1: entryRuleEndsl returns [String current=null] : iv_ruleEndsl= ruleEndsl EOF ;
    public final String entryRuleEndsl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndsl = null;


        try {
            // InternalRpgleParser.g:2276:45: (iv_ruleEndsl= ruleEndsl EOF )
            // InternalRpgleParser.g:2277:2: iv_ruleEndsl= ruleEndsl EOF
            {
             newCompositeNode(grammarAccess.getEndslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndsl=ruleEndsl();

            state._fsp--;

             current =iv_ruleEndsl.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndsl"


    // $ANTLR start "ruleEndsl"
    // InternalRpgleParser.g:2283:1: ruleEndsl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Endsl ;
    public final AntlrDatatypeRuleToken ruleEndsl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:2289:2: (kw= Endsl )
            // InternalRpgleParser.g:2290:2: kw= Endsl
            {
            kw=(Token)match(input,Endsl,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEndslAccess().getEndslKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndsl"


    // $ANTLR start "entryRuleReturn"
    // InternalRpgleParser.g:2298:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalRpgleParser.g:2298:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalRpgleParser.g:2299:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalRpgleParser.g:2305:1: ruleReturn returns [EObject current=null] : ( () otherlv_1= Return ( (lv_expression_2_0= ruleExpression ) )? ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2311:2: ( ( () otherlv_1= Return ( (lv_expression_2_0= ruleExpression ) )? ) )
            // InternalRpgleParser.g:2312:2: ( () otherlv_1= Return ( (lv_expression_2_0= ruleExpression ) )? )
            {
            // InternalRpgleParser.g:2312:2: ( () otherlv_1= Return ( (lv_expression_2_0= ruleExpression ) )? )
            // InternalRpgleParser.g:2313:3: () otherlv_1= Return ( (lv_expression_2_0= ruleExpression ) )?
            {
            // InternalRpgleParser.g:2313:3: ()
            // InternalRpgleParser.g:2314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnAccess().getReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Return,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getReturnKeyword_1());
            		
            // InternalRpgleParser.g:2324:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=Eof && LA29_0<=Rnf)||(LA29_0>=RULE_ID && LA29_0<=RULE_STRING)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRpgleParser.g:2325:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalRpgleParser.g:2325:4: (lv_expression_2_0= ruleExpression )
                    // InternalRpgleParser.g:2326:5: lv_expression_2_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReturnRule());
                    					}
                    					add(
                    						current,
                    						"expression",
                    						lv_expression_2_0,
                    						"org.sitemule.rpglanguage.Rpgle.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleBoolean"
    // InternalRpgleParser.g:2347:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalRpgleParser.g:2347:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRpgleParser.g:2348:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRpgleParser.g:2354:1: ruleBoolean returns [EObject current=null] : ( () ( (lv_boolexprs_1_0= ruleBoolExpr ) )* ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        EObject lv_boolexprs_1_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2360:2: ( ( () ( (lv_boolexprs_1_0= ruleBoolExpr ) )* ) )
            // InternalRpgleParser.g:2361:2: ( () ( (lv_boolexprs_1_0= ruleBoolExpr ) )* )
            {
            // InternalRpgleParser.g:2361:2: ( () ( (lv_boolexprs_1_0= ruleBoolExpr ) )* )
            // InternalRpgleParser.g:2362:3: () ( (lv_boolexprs_1_0= ruleBoolExpr ) )*
            {
            // InternalRpgleParser.g:2362:3: ()
            // InternalRpgleParser.g:2363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalRpgleParser.g:2369:3: ( (lv_boolexprs_1_0= ruleBoolExpr ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==BLANKS||(LA30_0>=BLANK && LA30_0<=ZEROS)||(LA30_0>=INLR && LA30_0<=ZERO)||(LA30_0>=Eof && LA30_0<=INH1)||LA30_0==ON||LA30_0==Not||LA30_0==LeftParenthesis||(LA30_0>=RULE_IND && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRpgleParser.g:2370:4: (lv_boolexprs_1_0= ruleBoolExpr )
            	    {
            	    // InternalRpgleParser.g:2370:4: (lv_boolexprs_1_0= ruleBoolExpr )
            	    // InternalRpgleParser.g:2371:5: lv_boolexprs_1_0= ruleBoolExpr
            	    {

            	    					newCompositeNode(grammarAccess.getBooleanAccess().getBoolexprsBoolExprParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_boolexprs_1_0=ruleBoolExpr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBooleanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boolexprs",
            	    						lv_boolexprs_1_0,
            	    						"org.sitemule.rpglanguage.Rpgle.BoolExpr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleBoolExpr"
    // InternalRpgleParser.g:2392:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // InternalRpgleParser.g:2392:49: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // InternalRpgleParser.g:2393:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
             newCompositeNode(grammarAccess.getBoolExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolExpr=ruleBoolExpr();

            state._fsp--;

             current =iv_ruleBoolExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpr"


    // $ANTLR start "ruleBoolExpr"
    // InternalRpgleParser.g:2399:1: ruleBoolExpr returns [EObject current=null] : ( (otherlv_0= Not )? this_OrExpr_1= ruleOrExpr ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_OrExpr_1 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2405:2: ( ( (otherlv_0= Not )? this_OrExpr_1= ruleOrExpr ) )
            // InternalRpgleParser.g:2406:2: ( (otherlv_0= Not )? this_OrExpr_1= ruleOrExpr )
            {
            // InternalRpgleParser.g:2406:2: ( (otherlv_0= Not )? this_OrExpr_1= ruleOrExpr )
            // InternalRpgleParser.g:2407:3: (otherlv_0= Not )? this_OrExpr_1= ruleOrExpr
            {
            // InternalRpgleParser.g:2407:3: (otherlv_0= Not )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Not) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRpgleParser.g:2408:4: otherlv_0= Not
                    {
                    otherlv_0=(Token)match(input,Not,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getBoolExprAccess().getNotKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getBoolExprAccess().getOrExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_OrExpr_1=ruleOrExpr();

            state._fsp--;


            			current = this_OrExpr_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalRpgleParser.g:2425:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalRpgleParser.g:2425:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalRpgleParser.g:2426:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalRpgleParser.g:2432:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2438:2: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalRpgleParser.g:2439:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalRpgleParser.g:2439:2: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalRpgleParser.g:2440:3: this_AndExpr_0= ruleAndExpr ( () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgleParser.g:2448:3: ( () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Or) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRpgleParser.g:2449:4: () otherlv_2= Or ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalRpgleParser.g:2449:4: ()
            	    // InternalRpgleParser.g:2450:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExprAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Or,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	    			
            	    // InternalRpgleParser.g:2460:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalRpgleParser.g:2461:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalRpgleParser.g:2461:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalRpgleParser.g:2462:6: lv_right_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.sitemule.rpglanguage.Rpgle.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalRpgleParser.g:2484:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalRpgleParser.g:2484:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalRpgleParser.g:2485:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalRpgleParser.g:2491:1: ruleAndExpr returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2497:2: ( (this_PrimaryExpr_0= rulePrimaryExpr ( () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) )
            // InternalRpgleParser.g:2498:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            {
            // InternalRpgleParser.g:2498:2: (this_PrimaryExpr_0= rulePrimaryExpr ( () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            // InternalRpgleParser.g:2499:3: this_PrimaryExpr_0= rulePrimaryExpr ( () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getPrimaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;


            			current = this_PrimaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgleParser.g:2507:3: ( () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==And) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRpgleParser.g:2508:4: () otherlv_2= And ( (lv_right_3_0= rulePrimaryExpr ) )
            	    {
            	    // InternalRpgleParser.g:2508:4: ()
            	    // InternalRpgleParser.g:2509:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExprAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,And,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	    			
            	    // InternalRpgleParser.g:2519:4: ( (lv_right_3_0= rulePrimaryExpr ) )
            	    // InternalRpgleParser.g:2520:5: (lv_right_3_0= rulePrimaryExpr )
            	    {
            	    // InternalRpgleParser.g:2520:5: (lv_right_3_0= rulePrimaryExpr )
            	    // InternalRpgleParser.g:2521:6: lv_right_3_0= rulePrimaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightPrimaryExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=rulePrimaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.sitemule.rpglanguage.Rpgle.PrimaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalRpgleParser.g:2543:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalRpgleParser.g:2543:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalRpgleParser.g:2544:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalRpgleParser.g:2550:1: rulePrimaryExpr returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis ) | this_Compare_3= ruleCompare ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_BoolExpr_1 = null;

        EObject this_Compare_3 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2556:2: ( ( (otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis ) | this_Compare_3= ruleCompare ) )
            // InternalRpgleParser.g:2557:2: ( (otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis ) | this_Compare_3= ruleCompare )
            {
            // InternalRpgleParser.g:2557:2: ( (otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis ) | this_Compare_3= ruleCompare )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LeftParenthesis) ) {
                alt34=1;
            }
            else if ( (LA34_0==BLANKS||(LA34_0>=BLANK && LA34_0<=ZEROS)||(LA34_0>=INLR && LA34_0<=ZERO)||(LA34_0>=Eof && LA34_0<=INH1)||LA34_0==ON||(LA34_0>=RULE_IND && LA34_0<=RULE_STRING)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalRpgleParser.g:2558:3: (otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis )
                    {
                    // InternalRpgleParser.g:2558:3: (otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis )
                    // InternalRpgleParser.g:2559:4: otherlv_0= LeftParenthesis this_BoolExpr_1= ruleBoolExpr otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getBoolExprParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_BoolExpr_1=ruleBoolExpr();

                    state._fsp--;


                    				current = this_BoolExpr_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:2577:3: this_Compare_3= ruleCompare
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getCompareParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Compare_3=ruleCompare();

                    state._fsp--;


                    			current = this_Compare_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleCompare"
    // InternalRpgleParser.g:2589:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalRpgleParser.g:2589:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalRpgleParser.g:2590:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalRpgleParser.g:2596:1: ruleCompare returns [EObject current=null] : ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token lv_intval2_1_0=null;
        Token lv_strval2_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_spec_0_0 = null;

        EObject lv_bif2_4_0 = null;

        EObject lv_cmp_5_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2602:2: ( ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? ) )
            // InternalRpgleParser.g:2603:2: ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? )
            {
            // InternalRpgleParser.g:2603:2: ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? )
            // InternalRpgleParser.g:2604:3: ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )?
            {
            // InternalRpgleParser.g:2604:3: ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case BLANKS:
            case BLANK:
            case HIVAL:
            case LOVAL:
            case ZEROS:
            case INLR:
            case ZERO:
            case OFF:
            case INH1:
            case ON:
            case RULE_IND:
                {
                alt35=1;
                }
                break;
            case RULE_INT:
                {
                alt35=2;
                }
                break;
            case RULE_STRING:
                {
                alt35=3;
                }
                break;
            case RULE_ID:
                {
                alt35=4;
                }
                break;
            case Eof:
            case Rnf:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalRpgleParser.g:2605:4: ( (lv_spec_0_0= ruleSpecial ) )
                    {
                    // InternalRpgleParser.g:2605:4: ( (lv_spec_0_0= ruleSpecial ) )
                    // InternalRpgleParser.g:2606:5: (lv_spec_0_0= ruleSpecial )
                    {
                    // InternalRpgleParser.g:2606:5: (lv_spec_0_0= ruleSpecial )
                    // InternalRpgleParser.g:2607:6: lv_spec_0_0= ruleSpecial
                    {

                    						newCompositeNode(grammarAccess.getCompareAccess().getSpecSpecialParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_spec_0_0=ruleSpecial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompareRule());
                    						}
                    						set(
                    							current,
                    							"spec",
                    							lv_spec_0_0,
                    							"org.sitemule.rpglanguage.Rpgle.Special");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:2625:4: ( (lv_intval2_1_0= RULE_INT ) )
                    {
                    // InternalRpgleParser.g:2625:4: ( (lv_intval2_1_0= RULE_INT ) )
                    // InternalRpgleParser.g:2626:5: (lv_intval2_1_0= RULE_INT )
                    {
                    // InternalRpgleParser.g:2626:5: (lv_intval2_1_0= RULE_INT )
                    // InternalRpgleParser.g:2627:6: lv_intval2_1_0= RULE_INT
                    {
                    lv_intval2_1_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    						newLeafNode(lv_intval2_1_0, grammarAccess.getCompareAccess().getIntval2INTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intval2",
                    							lv_intval2_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:2644:4: ( (lv_strval2_2_0= RULE_STRING ) )
                    {
                    // InternalRpgleParser.g:2644:4: ( (lv_strval2_2_0= RULE_STRING ) )
                    // InternalRpgleParser.g:2645:5: (lv_strval2_2_0= RULE_STRING )
                    {
                    // InternalRpgleParser.g:2645:5: (lv_strval2_2_0= RULE_STRING )
                    // InternalRpgleParser.g:2646:6: lv_strval2_2_0= RULE_STRING
                    {
                    lv_strval2_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_strval2_2_0, grammarAccess.getCompareAccess().getStrval2STRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"strval2",
                    							lv_strval2_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:2663:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalRpgleParser.g:2663:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRpgleParser.g:2664:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRpgleParser.g:2664:5: (otherlv_3= RULE_ID )
                    // InternalRpgleParser.g:2665:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_3, grammarAccess.getCompareAccess().getVar2DclsCrossReference_0_3_0());
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:2677:4: ( (lv_bif2_4_0= ruleBif ) )
                    {
                    // InternalRpgleParser.g:2677:4: ( (lv_bif2_4_0= ruleBif ) )
                    // InternalRpgleParser.g:2678:5: (lv_bif2_4_0= ruleBif )
                    {
                    // InternalRpgleParser.g:2678:5: (lv_bif2_4_0= ruleBif )
                    // InternalRpgleParser.g:2679:6: lv_bif2_4_0= ruleBif
                    {

                    						newCompositeNode(grammarAccess.getCompareAccess().getBif2BifParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_bif2_4_0=ruleBif();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompareRule());
                    						}
                    						set(
                    							current,
                    							"bif2",
                    							lv_bif2_4_0,
                    							"org.sitemule.rpglanguage.Rpgle.Bif");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRpgleParser.g:2697:3: ( (lv_cmp_5_0= ruleCompare2 ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=LessThanSignEqualsSign && LA36_0<=GreaterThanSignEqualsSign)||(LA36_0>=LessThanSign && LA36_0<=GreaterThanSign)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRpgleParser.g:2698:4: (lv_cmp_5_0= ruleCompare2 )
                    {
                    // InternalRpgleParser.g:2698:4: (lv_cmp_5_0= ruleCompare2 )
                    // InternalRpgleParser.g:2699:5: lv_cmp_5_0= ruleCompare2
                    {

                    					newCompositeNode(grammarAccess.getCompareAccess().getCmpCompare2ParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cmp_5_0=ruleCompare2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompareRule());
                    					}
                    					set(
                    						current,
                    						"cmp",
                    						lv_cmp_5_0,
                    						"org.sitemule.rpglanguage.Rpgle.Compare2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleCompare2"
    // InternalRpgleParser.g:2720:1: entryRuleCompare2 returns [EObject current=null] : iv_ruleCompare2= ruleCompare2 EOF ;
    public final EObject entryRuleCompare2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare2 = null;


        try {
            // InternalRpgleParser.g:2720:49: (iv_ruleCompare2= ruleCompare2 EOF )
            // InternalRpgleParser.g:2721:2: iv_ruleCompare2= ruleCompare2 EOF
            {
             newCompositeNode(grammarAccess.getCompare2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare2=ruleCompare2();

            state._fsp--;

             current =iv_ruleCompare2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompare2"


    // $ANTLR start "ruleCompare2"
    // InternalRpgleParser.g:2727:1: ruleCompare2 returns [EObject current=null] : ( (otherlv_0= GreaterThanSign | otherlv_1= LessThanSign | otherlv_2= EqualsSign | otherlv_3= GreaterThanSignEqualsSign | otherlv_4= LessThanSignEqualsSign ) this_CompareRight_5= ruleCompareRight ) ;
    public final EObject ruleCompare2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_CompareRight_5 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2733:2: ( ( (otherlv_0= GreaterThanSign | otherlv_1= LessThanSign | otherlv_2= EqualsSign | otherlv_3= GreaterThanSignEqualsSign | otherlv_4= LessThanSignEqualsSign ) this_CompareRight_5= ruleCompareRight ) )
            // InternalRpgleParser.g:2734:2: ( (otherlv_0= GreaterThanSign | otherlv_1= LessThanSign | otherlv_2= EqualsSign | otherlv_3= GreaterThanSignEqualsSign | otherlv_4= LessThanSignEqualsSign ) this_CompareRight_5= ruleCompareRight )
            {
            // InternalRpgleParser.g:2734:2: ( (otherlv_0= GreaterThanSign | otherlv_1= LessThanSign | otherlv_2= EqualsSign | otherlv_3= GreaterThanSignEqualsSign | otherlv_4= LessThanSignEqualsSign ) this_CompareRight_5= ruleCompareRight )
            // InternalRpgleParser.g:2735:3: (otherlv_0= GreaterThanSign | otherlv_1= LessThanSign | otherlv_2= EqualsSign | otherlv_3= GreaterThanSignEqualsSign | otherlv_4= LessThanSignEqualsSign ) this_CompareRight_5= ruleCompareRight
            {
            // InternalRpgleParser.g:2735:3: (otherlv_0= GreaterThanSign | otherlv_1= LessThanSign | otherlv_2= EqualsSign | otherlv_3= GreaterThanSignEqualsSign | otherlv_4= LessThanSignEqualsSign )
            int alt37=5;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt37=1;
                }
                break;
            case LessThanSign:
                {
                alt37=2;
                }
                break;
            case EqualsSign:
                {
                alt37=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt37=4;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalRpgleParser.g:2736:4: otherlv_0= GreaterThanSign
                    {
                    otherlv_0=(Token)match(input,GreaterThanSign,FOLLOW_31); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompare2Access().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:2741:4: otherlv_1= LessThanSign
                    {
                    otherlv_1=(Token)match(input,LessThanSign,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompare2Access().getLessThanSignKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:2746:4: otherlv_2= EqualsSign
                    {
                    otherlv_2=(Token)match(input,EqualsSign,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompare2Access().getEqualsSignKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:2751:4: otherlv_3= GreaterThanSignEqualsSign
                    {
                    otherlv_3=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompare2Access().getGreaterThanSignEqualsSignKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:2756:4: otherlv_4= LessThanSignEqualsSign
                    {
                    otherlv_4=(Token)match(input,LessThanSignEqualsSign,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompare2Access().getLessThanSignEqualsSignKeyword_0_4());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getCompare2Access().getCompareRightParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CompareRight_5=ruleCompareRight();

            state._fsp--;


            			current = this_CompareRight_5;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare2"


    // $ANTLR start "entryRuleCompareRight"
    // InternalRpgleParser.g:2773:1: entryRuleCompareRight returns [EObject current=null] : iv_ruleCompareRight= ruleCompareRight EOF ;
    public final EObject entryRuleCompareRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareRight = null;


        try {
            // InternalRpgleParser.g:2773:53: (iv_ruleCompareRight= ruleCompareRight EOF )
            // InternalRpgleParser.g:2774:2: iv_ruleCompareRight= ruleCompareRight EOF
            {
             newCompositeNode(grammarAccess.getCompareRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareRight=ruleCompareRight();

            state._fsp--;

             current =iv_ruleCompareRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareRight"


    // $ANTLR start "ruleCompareRight"
    // InternalRpgleParser.g:2780:1: ruleCompareRight returns [EObject current=null] : ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? ) ;
    public final EObject ruleCompareRight() throws RecognitionException {
        EObject current = null;

        Token lv_intval2_1_0=null;
        Token lv_strval2_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_spec_0_0 = null;

        EObject lv_bif2_4_0 = null;

        EObject lv_cmp_5_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:2786:2: ( ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? ) )
            // InternalRpgleParser.g:2787:2: ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? )
            {
            // InternalRpgleParser.g:2787:2: ( ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )? )
            // InternalRpgleParser.g:2788:3: ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) ) ( (lv_cmp_5_0= ruleCompare2 ) )?
            {
            // InternalRpgleParser.g:2788:3: ( ( (lv_spec_0_0= ruleSpecial ) ) | ( (lv_intval2_1_0= RULE_INT ) ) | ( (lv_strval2_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) | ( (lv_bif2_4_0= ruleBif ) ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case BLANKS:
            case BLANK:
            case HIVAL:
            case LOVAL:
            case ZEROS:
            case INLR:
            case ZERO:
            case OFF:
            case INH1:
            case ON:
            case RULE_IND:
                {
                alt38=1;
                }
                break;
            case RULE_INT:
                {
                alt38=2;
                }
                break;
            case RULE_STRING:
                {
                alt38=3;
                }
                break;
            case RULE_ID:
                {
                alt38=4;
                }
                break;
            case Eof:
            case Rnf:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalRpgleParser.g:2789:4: ( (lv_spec_0_0= ruleSpecial ) )
                    {
                    // InternalRpgleParser.g:2789:4: ( (lv_spec_0_0= ruleSpecial ) )
                    // InternalRpgleParser.g:2790:5: (lv_spec_0_0= ruleSpecial )
                    {
                    // InternalRpgleParser.g:2790:5: (lv_spec_0_0= ruleSpecial )
                    // InternalRpgleParser.g:2791:6: lv_spec_0_0= ruleSpecial
                    {

                    						newCompositeNode(grammarAccess.getCompareRightAccess().getSpecSpecialParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_spec_0_0=ruleSpecial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompareRightRule());
                    						}
                    						set(
                    							current,
                    							"spec",
                    							lv_spec_0_0,
                    							"org.sitemule.rpglanguage.Rpgle.Special");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:2809:4: ( (lv_intval2_1_0= RULE_INT ) )
                    {
                    // InternalRpgleParser.g:2809:4: ( (lv_intval2_1_0= RULE_INT ) )
                    // InternalRpgleParser.g:2810:5: (lv_intval2_1_0= RULE_INT )
                    {
                    // InternalRpgleParser.g:2810:5: (lv_intval2_1_0= RULE_INT )
                    // InternalRpgleParser.g:2811:6: lv_intval2_1_0= RULE_INT
                    {
                    lv_intval2_1_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    						newLeafNode(lv_intval2_1_0, grammarAccess.getCompareRightAccess().getIntval2INTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRightRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intval2",
                    							lv_intval2_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:2828:4: ( (lv_strval2_2_0= RULE_STRING ) )
                    {
                    // InternalRpgleParser.g:2828:4: ( (lv_strval2_2_0= RULE_STRING ) )
                    // InternalRpgleParser.g:2829:5: (lv_strval2_2_0= RULE_STRING )
                    {
                    // InternalRpgleParser.g:2829:5: (lv_strval2_2_0= RULE_STRING )
                    // InternalRpgleParser.g:2830:6: lv_strval2_2_0= RULE_STRING
                    {
                    lv_strval2_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_strval2_2_0, grammarAccess.getCompareRightAccess().getStrval2STRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRightRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"strval2",
                    							lv_strval2_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:2847:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalRpgleParser.g:2847:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRpgleParser.g:2848:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRpgleParser.g:2848:5: (otherlv_3= RULE_ID )
                    // InternalRpgleParser.g:2849:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompareRightRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_3, grammarAccess.getCompareRightAccess().getVar2DclsCrossReference_0_3_0());
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:2861:4: ( (lv_bif2_4_0= ruleBif ) )
                    {
                    // InternalRpgleParser.g:2861:4: ( (lv_bif2_4_0= ruleBif ) )
                    // InternalRpgleParser.g:2862:5: (lv_bif2_4_0= ruleBif )
                    {
                    // InternalRpgleParser.g:2862:5: (lv_bif2_4_0= ruleBif )
                    // InternalRpgleParser.g:2863:6: lv_bif2_4_0= ruleBif
                    {

                    						newCompositeNode(grammarAccess.getCompareRightAccess().getBif2BifParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_bif2_4_0=ruleBif();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompareRightRule());
                    						}
                    						set(
                    							current,
                    							"bif2",
                    							lv_bif2_4_0,
                    							"org.sitemule.rpglanguage.Rpgle.Bif");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRpgleParser.g:2881:3: ( (lv_cmp_5_0= ruleCompare2 ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=LessThanSignEqualsSign && LA39_0<=GreaterThanSignEqualsSign)||(LA39_0>=LessThanSign && LA39_0<=GreaterThanSign)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRpgleParser.g:2882:4: (lv_cmp_5_0= ruleCompare2 )
                    {
                    // InternalRpgleParser.g:2882:4: (lv_cmp_5_0= ruleCompare2 )
                    // InternalRpgleParser.g:2883:5: lv_cmp_5_0= ruleCompare2
                    {

                    					newCompositeNode(grammarAccess.getCompareRightAccess().getCmpCompare2ParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cmp_5_0=ruleCompare2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompareRightRule());
                    					}
                    					set(
                    						current,
                    						"cmp",
                    						lv_cmp_5_0,
                    						"org.sitemule.rpglanguage.Rpgle.Compare2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareRight"


    // $ANTLR start "entryRuleSpecial"
    // InternalRpgleParser.g:2904:1: entryRuleSpecial returns [String current=null] : iv_ruleSpecial= ruleSpecial EOF ;
    public final String entryRuleSpecial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecial = null;


        try {
            // InternalRpgleParser.g:2904:47: (iv_ruleSpecial= ruleSpecial EOF )
            // InternalRpgleParser.g:2905:2: iv_ruleSpecial= ruleSpecial EOF
            {
             newCompositeNode(grammarAccess.getSpecialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecial=ruleSpecial();

            state._fsp--;

             current =iv_ruleSpecial.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecial"


    // $ANTLR start "ruleSpecial"
    // InternalRpgleParser.g:2911:1: ruleSpecial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IND_0= RULE_IND | kw= INLR | kw= INH1 | kw= ON | kw= OFF | kw= ZEROS | kw= ZERO | kw= BLANK | kw= BLANKS | kw= HIVAL | kw= LOVAL ) ;
    public final AntlrDatatypeRuleToken ruleSpecial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IND_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:2917:2: ( (this_IND_0= RULE_IND | kw= INLR | kw= INH1 | kw= ON | kw= OFF | kw= ZEROS | kw= ZERO | kw= BLANK | kw= BLANKS | kw= HIVAL | kw= LOVAL ) )
            // InternalRpgleParser.g:2918:2: (this_IND_0= RULE_IND | kw= INLR | kw= INH1 | kw= ON | kw= OFF | kw= ZEROS | kw= ZERO | kw= BLANK | kw= BLANKS | kw= HIVAL | kw= LOVAL )
            {
            // InternalRpgleParser.g:2918:2: (this_IND_0= RULE_IND | kw= INLR | kw= INH1 | kw= ON | kw= OFF | kw= ZEROS | kw= ZERO | kw= BLANK | kw= BLANKS | kw= HIVAL | kw= LOVAL )
            int alt40=11;
            switch ( input.LA(1) ) {
            case RULE_IND:
                {
                alt40=1;
                }
                break;
            case INLR:
                {
                alt40=2;
                }
                break;
            case INH1:
                {
                alt40=3;
                }
                break;
            case ON:
                {
                alt40=4;
                }
                break;
            case OFF:
                {
                alt40=5;
                }
                break;
            case ZEROS:
                {
                alt40=6;
                }
                break;
            case ZERO:
                {
                alt40=7;
                }
                break;
            case BLANK:
                {
                alt40=8;
                }
                break;
            case BLANKS:
                {
                alt40=9;
                }
                break;
            case HIVAL:
                {
                alt40=10;
                }
                break;
            case LOVAL:
                {
                alt40=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalRpgleParser.g:2919:3: this_IND_0= RULE_IND
                    {
                    this_IND_0=(Token)match(input,RULE_IND,FOLLOW_2); 

                    			current.merge(this_IND_0);
                    		

                    			newLeafNode(this_IND_0, grammarAccess.getSpecialAccess().getINDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:2927:3: kw= INLR
                    {
                    kw=(Token)match(input,INLR,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getINLRKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:2933:3: kw= INH1
                    {
                    kw=(Token)match(input,INH1,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getINH1Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:2939:3: kw= ON
                    {
                    kw=(Token)match(input,ON,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getONKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:2945:3: kw= OFF
                    {
                    kw=(Token)match(input,OFF,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getOFFKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRpgleParser.g:2951:3: kw= ZEROS
                    {
                    kw=(Token)match(input,ZEROS,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getZEROSKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRpgleParser.g:2957:3: kw= ZERO
                    {
                    kw=(Token)match(input,ZERO,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getZEROKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRpgleParser.g:2963:3: kw= BLANK
                    {
                    kw=(Token)match(input,BLANK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getBLANKKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRpgleParser.g:2969:3: kw= BLANKS
                    {
                    kw=(Token)match(input,BLANKS,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getBLANKSKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRpgleParser.g:2975:3: kw= HIVAL
                    {
                    kw=(Token)match(input,HIVAL,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getHIVALKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRpgleParser.g:2981:3: kw= LOVAL
                    {
                    kw=(Token)match(input,LOVAL,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialAccess().getLOVALKeyword_10());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecial"


    // $ANTLR start "entryRuleDcls"
    // InternalRpgleParser.g:2990:1: entryRuleDcls returns [EObject current=null] : iv_ruleDcls= ruleDcls EOF ;
    public final EObject entryRuleDcls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDcls = null;


        try {
            // InternalRpgleParser.g:2990:45: (iv_ruleDcls= ruleDcls EOF )
            // InternalRpgleParser.g:2991:2: iv_ruleDcls= ruleDcls EOF
            {
             newCompositeNode(grammarAccess.getDclsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDcls=ruleDcls();

            state._fsp--;

             current =iv_ruleDcls; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDcls"


    // $ANTLR start "ruleDcls"
    // InternalRpgleParser.g:2997:1: ruleDcls returns [EObject current=null] : (otherlv_0= DclS ( (lv_name_1_0= RULE_ID ) ) ( (lv_datatype_2_0= ruleDatatype ) ) ( (lv_options_3_0= ruleOptions ) )? otherlv_4= Semicolon ) ;
    public final EObject ruleDcls() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_datatype_2_0 = null;

        EObject lv_options_3_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:3003:2: ( (otherlv_0= DclS ( (lv_name_1_0= RULE_ID ) ) ( (lv_datatype_2_0= ruleDatatype ) ) ( (lv_options_3_0= ruleOptions ) )? otherlv_4= Semicolon ) )
            // InternalRpgleParser.g:3004:2: (otherlv_0= DclS ( (lv_name_1_0= RULE_ID ) ) ( (lv_datatype_2_0= ruleDatatype ) ) ( (lv_options_3_0= ruleOptions ) )? otherlv_4= Semicolon )
            {
            // InternalRpgleParser.g:3004:2: (otherlv_0= DclS ( (lv_name_1_0= RULE_ID ) ) ( (lv_datatype_2_0= ruleDatatype ) ) ( (lv_options_3_0= ruleOptions ) )? otherlv_4= Semicolon )
            // InternalRpgleParser.g:3005:3: otherlv_0= DclS ( (lv_name_1_0= RULE_ID ) ) ( (lv_datatype_2_0= ruleDatatype ) ) ( (lv_options_3_0= ruleOptions ) )? otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,DclS,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDclsAccess().getDclSKeyword_0());
            		
            // InternalRpgleParser.g:3009:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgleParser.g:3010:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgleParser.g:3010:4: (lv_name_1_0= RULE_ID )
            // InternalRpgleParser.g:3011:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDclsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDclsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgleParser.g:3027:3: ( (lv_datatype_2_0= ruleDatatype ) )
            // InternalRpgleParser.g:3028:4: (lv_datatype_2_0= ruleDatatype )
            {
            // InternalRpgleParser.g:3028:4: (lv_datatype_2_0= ruleDatatype )
            // InternalRpgleParser.g:3029:5: lv_datatype_2_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getDclsAccess().getDatatypeDatatypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_datatype_2_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDclsRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_2_0,
            						"org.sitemule.rpglanguage.Rpgle.Datatype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgleParser.g:3046:3: ( (lv_options_3_0= ruleOptions ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Options) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRpgleParser.g:3047:4: (lv_options_3_0= ruleOptions )
                    {
                    // InternalRpgleParser.g:3047:4: (lv_options_3_0= ruleOptions )
                    // InternalRpgleParser.g:3048:5: lv_options_3_0= ruleOptions
                    {

                    					newCompositeNode(grammarAccess.getDclsAccess().getOptionsOptionsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_options_3_0=ruleOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDclsRule());
                    					}
                    					set(
                    						current,
                    						"options",
                    						lv_options_3_0,
                    						"org.sitemule.rpglanguage.Rpgle.Options");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDclsAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDcls"


    // $ANTLR start "entryRuleDatatype"
    // InternalRpgleParser.g:3073:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalRpgleParser.g:3073:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalRpgleParser.g:3074:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalRpgleParser.g:3080:1: ruleDatatype returns [EObject current=null] : ( (otherlv_0= Char | otherlv_1= Varchar | otherlv_2= Int | otherlv_3= Dec | otherlv_4= Date | otherlv_5= Timestamp ) ( (lv_len_6_0= ruleLen ) )? ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_len_6_0 = null;



        	enterRule();

        try {
            // InternalRpgleParser.g:3086:2: ( ( (otherlv_0= Char | otherlv_1= Varchar | otherlv_2= Int | otherlv_3= Dec | otherlv_4= Date | otherlv_5= Timestamp ) ( (lv_len_6_0= ruleLen ) )? ) )
            // InternalRpgleParser.g:3087:2: ( (otherlv_0= Char | otherlv_1= Varchar | otherlv_2= Int | otherlv_3= Dec | otherlv_4= Date | otherlv_5= Timestamp ) ( (lv_len_6_0= ruleLen ) )? )
            {
            // InternalRpgleParser.g:3087:2: ( (otherlv_0= Char | otherlv_1= Varchar | otherlv_2= Int | otherlv_3= Dec | otherlv_4= Date | otherlv_5= Timestamp ) ( (lv_len_6_0= ruleLen ) )? )
            // InternalRpgleParser.g:3088:3: (otherlv_0= Char | otherlv_1= Varchar | otherlv_2= Int | otherlv_3= Dec | otherlv_4= Date | otherlv_5= Timestamp ) ( (lv_len_6_0= ruleLen ) )?
            {
            // InternalRpgleParser.g:3088:3: (otherlv_0= Char | otherlv_1= Varchar | otherlv_2= Int | otherlv_3= Dec | otherlv_4= Date | otherlv_5= Timestamp )
            int alt42=6;
            switch ( input.LA(1) ) {
            case Char:
                {
                alt42=1;
                }
                break;
            case Varchar:
                {
                alt42=2;
                }
                break;
            case Int:
                {
                alt42=3;
                }
                break;
            case Dec:
                {
                alt42=4;
                }
                break;
            case Date:
                {
                alt42=5;
                }
                break;
            case Timestamp:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalRpgleParser.g:3089:4: otherlv_0= Char
                    {
                    otherlv_0=(Token)match(input,Char,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getCharKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRpgleParser.g:3094:4: otherlv_1= Varchar
                    {
                    otherlv_1=(Token)match(input,Varchar,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDatatypeAccess().getVarcharKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRpgleParser.g:3099:4: otherlv_2= Int
                    {
                    otherlv_2=(Token)match(input,Int,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getDatatypeAccess().getIntKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRpgleParser.g:3104:4: otherlv_3= Dec
                    {
                    otherlv_3=(Token)match(input,Dec,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDatatypeAccess().getDecKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalRpgleParser.g:3109:4: otherlv_4= Date
                    {
                    otherlv_4=(Token)match(input,Date,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getDatatypeAccess().getDateKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalRpgleParser.g:3114:4: otherlv_5= Timestamp
                    {
                    otherlv_5=(Token)match(input,Timestamp,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDatatypeAccess().getTimestampKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalRpgleParser.g:3119:3: ( (lv_len_6_0= ruleLen ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LeftParenthesis) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRpgleParser.g:3120:4: (lv_len_6_0= ruleLen )
                    {
                    // InternalRpgleParser.g:3120:4: (lv_len_6_0= ruleLen )
                    // InternalRpgleParser.g:3121:5: lv_len_6_0= ruleLen
                    {

                    					newCompositeNode(grammarAccess.getDatatypeAccess().getLenLenParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_len_6_0=ruleLen();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatatypeRule());
                    					}
                    					set(
                    						current,
                    						"len",
                    						lv_len_6_0,
                    						"org.sitemule.rpglanguage.Rpgle.Len");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleLen"
    // InternalRpgleParser.g:3142:1: entryRuleLen returns [String current=null] : iv_ruleLen= ruleLen EOF ;
    public final String entryRuleLen() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLen = null;


        try {
            // InternalRpgleParser.g:3142:43: (iv_ruleLen= ruleLen EOF )
            // InternalRpgleParser.g:3143:2: iv_ruleLen= ruleLen EOF
            {
             newCompositeNode(grammarAccess.getLenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLen=ruleLen();

            state._fsp--;

             current =iv_ruleLen.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLen"


    // $ANTLR start "ruleLen"
    // InternalRpgleParser.g:3149:1: ruleLen returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftParenthesis this_INT_1= RULE_INT kw= RightParenthesis ) ;
    public final AntlrDatatypeRuleToken ruleLen() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:3155:2: ( (kw= LeftParenthesis this_INT_1= RULE_INT kw= RightParenthesis ) )
            // InternalRpgleParser.g:3156:2: (kw= LeftParenthesis this_INT_1= RULE_INT kw= RightParenthesis )
            {
            // InternalRpgleParser.g:3156:2: (kw= LeftParenthesis this_INT_1= RULE_INT kw= RightParenthesis )
            // InternalRpgleParser.g:3157:3: kw= LeftParenthesis this_INT_1= RULE_INT kw= RightParenthesis
            {
            kw=(Token)match(input,LeftParenthesis,FOLLOW_34); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLenAccess().getLeftParenthesisKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_8); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getLenAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLenAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLen"


    // $ANTLR start "entryRuleOptions"
    // InternalRpgleParser.g:3178:1: entryRuleOptions returns [EObject current=null] : iv_ruleOptions= ruleOptions EOF ;
    public final EObject entryRuleOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptions = null;


        try {
            // InternalRpgleParser.g:3178:48: (iv_ruleOptions= ruleOptions EOF )
            // InternalRpgleParser.g:3179:2: iv_ruleOptions= ruleOptions EOF
            {
             newCompositeNode(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptions=ruleOptions();

            state._fsp--;

             current =iv_ruleOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // InternalRpgleParser.g:3185:1: ruleOptions returns [EObject current=null] : (otherlv_0= Options otherlv_1= LeftParenthesis ( (lv_val_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRpgleParser.g:3191:2: ( (otherlv_0= Options otherlv_1= LeftParenthesis ( (lv_val_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis ) )
            // InternalRpgleParser.g:3192:2: (otherlv_0= Options otherlv_1= LeftParenthesis ( (lv_val_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )
            {
            // InternalRpgleParser.g:3192:2: (otherlv_0= Options otherlv_1= LeftParenthesis ( (lv_val_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis )
            // InternalRpgleParser.g:3193:3: otherlv_0= Options otherlv_1= LeftParenthesis ( (lv_val_2_0= RULE_STRING ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Options,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionsAccess().getOptionsKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRpgleParser.g:3201:3: ( (lv_val_2_0= RULE_STRING ) )
            // InternalRpgleParser.g:3202:4: (lv_val_2_0= RULE_STRING )
            {
            // InternalRpgleParser.g:3202:4: (lv_val_2_0= RULE_STRING )
            // InternalRpgleParser.g:3203:5: lv_val_2_0= RULE_STRING
            {
            lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_val_2_0, grammarAccess.getOptionsAccess().getValSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOptionsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptions"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000060002C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x030E1C1F07CC02D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x030E1C1F01CC0010L,0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x030E1C1F41CC0000L,0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000181F01800000L,0x0000000000000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x2000181F01800000L,0x0000000000000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020010010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x9020587F01B0F100L,0x0000000000000078L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x030E1C1F01CC0002L,0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x030E1C1F09CC0000L,0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x030E1C1F01CE0000L,0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00002000A0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000181F01800002L,0x0000000000000070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1020587F01B0F102L,0x0000000000000078L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1020587F01B0F100L,0x0000000000000078L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00C0000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000587F01B0F100L,0x0000000000000078L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0011018000000820L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});

}