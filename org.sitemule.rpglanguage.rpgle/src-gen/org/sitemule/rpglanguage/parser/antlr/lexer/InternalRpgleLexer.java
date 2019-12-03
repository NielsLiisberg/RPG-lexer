package org.sitemule.rpglanguage.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRpgleLexer extends Lexer {
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

    public InternalRpgleLexer() {;} 
    public InternalRpgleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRpgleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRpgleLexer.g"; }

    // $ANTLR start "EndProc"
    public final void mEndProc() throws RecognitionException {
        try {
            int _type = EndProc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:14:9: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) '-' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ';' )
            // InternalRpgleLexer.g:14:11: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) '-' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ';'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EndProc"

    // $ANTLR start "Timestamp"
    public final void mTimestamp() throws RecognitionException {
        try {
            int _type = Timestamp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:16:11: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // InternalRpgleLexer.g:16:13: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timestamp"

    // $ANTLR start "Include"
    public final void mInclude() throws RecognitionException {
        try {
            int _type = Include;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:18:9: ( '/' ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalRpgleLexer.g:18:11: '/' ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            match('/'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Include"

    // $ANTLR start "DclProc"
    public final void mDclProc() throws RecognitionException {
        try {
            int _type = DclProc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:20:9: ( ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'L' | 'l' ) '-' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) )
            // InternalRpgleLexer.g:20:11: ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'L' | 'l' ) '-' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DclProc"

    // $ANTLR start "BLANKS"
    public final void mBLANKS() throws RecognitionException {
        try {
            int _type = BLANKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:22:8: ( '*' ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' ) ( 'S' | 's' ) )
            // InternalRpgleLexer.g:22:10: '*' ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' ) ( 'S' | 's' )
            {
            match('*'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANKS"

    // $ANTLR start "CtlOpt"
    public final void mCtlOpt() throws RecognitionException {
        try {
            int _type = CtlOpt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:24:8: ( ( 'C' | 'c' ) ( 'T' | 't' ) ( 'L' | 'l' ) '-' ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) )
            // InternalRpgleLexer.g:24:10: ( 'C' | 'c' ) ( 'T' | 't' ) ( 'L' | 'l' ) '-' ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CtlOpt"

    // $ANTLR start "Options"
    public final void mOptions() throws RecognitionException {
        try {
            int _type = Options;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:26:9: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // InternalRpgleLexer.g:26:11: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Options"

    // $ANTLR start "Varchar"
    public final void mVarchar() throws RecognitionException {
        try {
            int _type = Varchar;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:28:9: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:28:11: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Varchar"

    // $ANTLR start "BLANK"
    public final void mBLANK() throws RecognitionException {
        try {
            int _type = BLANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:30:7: ( '*' ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // InternalRpgleLexer.g:30:9: '*' ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            match('*'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK"

    // $ANTLR start "HIVAL"
    public final void mHIVAL() throws RecognitionException {
        try {
            int _type = HIVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:32:7: ( '*' ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalRpgleLexer.g:32:9: '*' ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            match('*'); 
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HIVAL"

    // $ANTLR start "LOVAL"
    public final void mLOVAL() throws RecognitionException {
        try {
            int _type = LOVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:34:7: ( '*' ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalRpgleLexer.g:34:9: '*' ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            match('*'); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOVAL"

    // $ANTLR start "ZEROS"
    public final void mZEROS() throws RecognitionException {
        try {
            int _type = ZEROS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:36:7: ( '*' ( 'Z' | 'z' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'S' | 's' ) )
            // InternalRpgleLexer.g:36:9: '*' ( 'Z' | 'z' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'S' | 's' )
            {
            match('*'); 
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZEROS"

    // $ANTLR start "Elseif"
    public final void mElseif() throws RecognitionException {
        try {
            int _type = Elseif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:38:8: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:38:10: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elseif"

    // $ANTLR start "Endfor"
    public final void mEndfor() throws RecognitionException {
        try {
            int _type = Endfor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:40:8: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:40:10: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Endfor"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:42:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalRpgleLexer.g:42:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Select"
    public final void mSelect() throws RecognitionException {
        try {
            int _type = Select;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:44:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalRpgleLexer.g:44:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Select"

    // $ANTLR start "INLR"
    public final void mINLR() throws RecognitionException {
        try {
            int _type = INLR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:46:6: ( '*' ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:46:8: '*' ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'L' | 'l' ) ( 'R' | 'r' )
            {
            match('*'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INLR"

    // $ANTLR start "ZERO"
    public final void mZERO() throws RecognitionException {
        try {
            int _type = ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:48:6: ( '*' ( 'Z' | 'z' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'O' | 'o' ) )
            // InternalRpgleLexer.g:48:8: '*' ( 'Z' | 'z' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'O' | 'o' )
            {
            match('*'); 
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZERO"

    // $ANTLR start "Begsr"
    public final void mBegsr() throws RecognitionException {
        try {
            int _type = Begsr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:50:7: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'S' | 's' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:50:9: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'S' | 's' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Begsr"

    // $ANTLR start "Chain"
    public final void mChain() throws RecognitionException {
        try {
            int _type = Chain;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:52:7: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalRpgleLexer.g:52:9: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Chain"

    // $ANTLR start "Close"
    public final void mClose() throws RecognitionException {
        try {
            int _type = Close;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:54:7: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalRpgleLexer.g:54:9: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Close"

    // $ANTLR start "DclF"
    public final void mDclF() throws RecognitionException {
        try {
            int _type = DclF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:56:6: ( ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'L' | 'l' ) '-' ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:56:8: ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'L' | 'l' ) '-' ( 'F' | 'f' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DclF"

    // $ANTLR start "DclS"
    public final void mDclS() throws RecognitionException {
        try {
            int _type = DclS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:58:6: ( ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'L' | 'l' ) '-' ( 'S' | 's' ) )
            // InternalRpgleLexer.g:58:8: ( 'D' | 'd' ) ( 'C' | 'c' ) ( 'L' | 'l' ) '-' ( 'S' | 's' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DclS"

    // $ANTLR start "Enddo"
    public final void mEnddo() throws RecognitionException {
        try {
            int _type = Enddo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:60:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalRpgleLexer.g:60:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'D' | 'd' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enddo"

    // $ANTLR start "Endif"
    public final void mEndif() throws RecognitionException {
        try {
            int _type = Endif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:62:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:62:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Endif"

    // $ANTLR start "Endsl"
    public final void mEndsl() throws RecognitionException {
        try {
            int _type = Endsl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:64:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) ( 'L' | 'l' ) )
            // InternalRpgleLexer.g:64:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Endsl"

    // $ANTLR start "Endsr"
    public final void mEndsr() throws RecognitionException {
        try {
            int _type = Endsr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:66:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:66:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Endsr"

    // $ANTLR start "Other"
    public final void mOther() throws RecognitionException {
        try {
            int _type = Other;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:68:7: ( ( 'O' | 'o' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:68:9: ( 'O' | 'o' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Other"

    // $ANTLR start "Reade"
    public final void mReade() throws RecognitionException {
        try {
            int _type = Reade;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:70:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalRpgleLexer.g:70:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reade"

    // $ANTLR start "Setgt"
    public final void mSetgt() throws RecognitionException {
        try {
            int _type = Setgt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:72:7: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'G' | 'g' ) ( 'T' | 't' ) )
            // InternalRpgleLexer.g:72:9: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'G' | 'g' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Setgt"

    // $ANTLR start "Setll"
    public final void mSetll() throws RecognitionException {
        try {
            int _type = Setll;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:74:7: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalRpgleLexer.g:74:9: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Setll"

    // $ANTLR start "Eof"
    public final void mEof() throws RecognitionException {
        try {
            int _type = Eof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:76:5: ( '%' ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:76:7: '%' ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'F' | 'f' )
            {
            match('%'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Eof"

    // $ANTLR start "Rnf"
    public final void mRnf() throws RecognitionException {
        try {
            int _type = Rnf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:78:5: ( '%' ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:78:7: '%' ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'F' | 'f' )
            {
            match('%'); 
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rnf"

    // $ANTLR start "OFF"
    public final void mOFF() throws RecognitionException {
        try {
            int _type = OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:80:5: ( '*' ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:80:7: '*' ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' )
            {
            match('*'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OFF"

    // $ANTLR start "INH1"
    public final void mINH1() throws RecognitionException {
        try {
            int _type = INH1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:82:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'H' | 'h' ) '1' )
            // InternalRpgleLexer.g:82:8: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'H' | 'h' ) '1'
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INH1"

    // $ANTLR start "Char"
    public final void mChar() throws RecognitionException {
        try {
            int _type = Char;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:84:6: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:84:8: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:86:6: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalRpgleLexer.g:86:8: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:88:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalRpgleLexer.g:88:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Exsr"
    public final void mExsr() throws RecognitionException {
        try {
            int _type = Exsr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:90:6: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'S' | 's' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:90:8: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'S' | 's' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exsr"

    // $ANTLR start "Open"
    public final void mOpen() throws RecognitionException {
        try {
            int _type = Open;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:92:6: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalRpgleLexer.g:92:8: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Open"

    // $ANTLR start "Read"
    public final void mRead() throws RecognitionException {
        try {
            int _type = Read;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:94:6: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // InternalRpgleLexer.g:94:8: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Read"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:96:6: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalRpgleLexer.g:96:8: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:98:4: ( '*' ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalRpgleLexer.g:98:6: '*' ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            match('*'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:100:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalRpgleLexer.g:100:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Dec"
    public final void mDec() throws RecognitionException {
        try {
            int _type = Dec;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:102:5: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' ) )
            // InternalRpgleLexer.g:102:7: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dec"

    // $ANTLR start "Dou"
    public final void mDou() throws RecognitionException {
        try {
            int _type = Dou;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:104:5: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) )
            // InternalRpgleLexer.g:104:7: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dou"

    // $ANTLR start "Dow"
    public final void mDow() throws RecognitionException {
        try {
            int _type = Dow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:106:5: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // InternalRpgleLexer.g:106:7: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dow"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:108:5: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:108:7: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:110:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalRpgleLexer.g:110:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:112:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalRpgleLexer.g:112:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:114:24: ( '<' '=' )
            // InternalRpgleLexer.g:114:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:116:27: ( '>' '=' )
            // InternalRpgleLexer.g:116:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:118:4: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // InternalRpgleLexer.g:118:6: ( 'D' | 'd' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:120:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // InternalRpgleLexer.g:120:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:122:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalRpgleLexer.g:122:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:124:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalRpgleLexer.g:124:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:126:17: ( '(' )
            // InternalRpgleLexer.g:126:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:128:18: ( ')' )
            // InternalRpgleLexer.g:128:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:130:7: ( ':' )
            // InternalRpgleLexer.g:130:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:132:11: ( ';' )
            // InternalRpgleLexer.g:132:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:134:14: ( '<' )
            // InternalRpgleLexer.g:134:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:136:12: ( '=' )
            // InternalRpgleLexer.g:136:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:138:17: ( '>' )
            // InternalRpgleLexer.g:138:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "RULE_IND"
    public final void mRULE_IND() throws RecognitionException {
        try {
            int _type = RULE_IND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:140:10: ( '*IN' '0' .. '9' '0' .. '9' )
            // InternalRpgleLexer.g:140:12: '*IN' '0' .. '9' '0' .. '9'
            {
            match("*IN"); 

            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IND"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:142:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRpgleLexer.g:142:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRpgleLexer.g:142:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRpgleLexer.g:142:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRpgleLexer.g:142:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRpgleLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:144:10: ( ( '0' .. '9' )+ )
            // InternalRpgleLexer.g:144:12: ( '0' .. '9' )+
            {
            // InternalRpgleLexer.g:144:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRpgleLexer.g:144:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:146:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRpgleLexer.g:146:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRpgleLexer.g:146:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRpgleLexer.g:146:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRpgleLexer.g:146:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRpgleLexer.g:146:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRpgleLexer.g:146:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRpgleLexer.g:146:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRpgleLexer.g:146:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRpgleLexer.g:146:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRpgleLexer.g:146:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:148:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRpgleLexer.g:148:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRpgleLexer.g:148:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRpgleLexer.g:148:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:150:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRpgleLexer.g:150:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRpgleLexer.g:150:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRpgleLexer.g:150:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRpgleLexer.g:150:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRpgleLexer.g:150:41: ( '\\r' )? '\\n'
                    {
                    // InternalRpgleLexer.g:150:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRpgleLexer.g:150:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:152:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRpgleLexer.g:152:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRpgleLexer.g:152:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRpgleLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRpgleLexer.g:154:16: ( . )
            // InternalRpgleLexer.g:154:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRpgleLexer.g:1:8: ( EndProc | Timestamp | Include | DclProc | BLANKS | CtlOpt | Options | Varchar | BLANK | HIVAL | LOVAL | ZEROS | Elseif | Endfor | Return | Select | INLR | ZERO | Begsr | Chain | Close | DclF | DclS | Enddo | Endif | Endsl | Endsr | Other | Reade | Setgt | Setll | Eof | Rnf | OFF | INH1 | Char | Date | Else | Exsr | Open | Read | When | ON | And | Dec | Dou | Dow | For | Int | Not | LessThanSignEqualsSign | GreaterThanSignEqualsSign | Do | If | Or | To | LeftParenthesis | RightParenthesis | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | RULE_IND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=71;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRpgleLexer.g:1:10: EndProc
                {
                mEndProc(); 

                }
                break;
            case 2 :
                // InternalRpgleLexer.g:1:18: Timestamp
                {
                mTimestamp(); 

                }
                break;
            case 3 :
                // InternalRpgleLexer.g:1:28: Include
                {
                mInclude(); 

                }
                break;
            case 4 :
                // InternalRpgleLexer.g:1:36: DclProc
                {
                mDclProc(); 

                }
                break;
            case 5 :
                // InternalRpgleLexer.g:1:44: BLANKS
                {
                mBLANKS(); 

                }
                break;
            case 6 :
                // InternalRpgleLexer.g:1:51: CtlOpt
                {
                mCtlOpt(); 

                }
                break;
            case 7 :
                // InternalRpgleLexer.g:1:58: Options
                {
                mOptions(); 

                }
                break;
            case 8 :
                // InternalRpgleLexer.g:1:66: Varchar
                {
                mVarchar(); 

                }
                break;
            case 9 :
                // InternalRpgleLexer.g:1:74: BLANK
                {
                mBLANK(); 

                }
                break;
            case 10 :
                // InternalRpgleLexer.g:1:80: HIVAL
                {
                mHIVAL(); 

                }
                break;
            case 11 :
                // InternalRpgleLexer.g:1:86: LOVAL
                {
                mLOVAL(); 

                }
                break;
            case 12 :
                // InternalRpgleLexer.g:1:92: ZEROS
                {
                mZEROS(); 

                }
                break;
            case 13 :
                // InternalRpgleLexer.g:1:98: Elseif
                {
                mElseif(); 

                }
                break;
            case 14 :
                // InternalRpgleLexer.g:1:105: Endfor
                {
                mEndfor(); 

                }
                break;
            case 15 :
                // InternalRpgleLexer.g:1:112: Return
                {
                mReturn(); 

                }
                break;
            case 16 :
                // InternalRpgleLexer.g:1:119: Select
                {
                mSelect(); 

                }
                break;
            case 17 :
                // InternalRpgleLexer.g:1:126: INLR
                {
                mINLR(); 

                }
                break;
            case 18 :
                // InternalRpgleLexer.g:1:131: ZERO
                {
                mZERO(); 

                }
                break;
            case 19 :
                // InternalRpgleLexer.g:1:136: Begsr
                {
                mBegsr(); 

                }
                break;
            case 20 :
                // InternalRpgleLexer.g:1:142: Chain
                {
                mChain(); 

                }
                break;
            case 21 :
                // InternalRpgleLexer.g:1:148: Close
                {
                mClose(); 

                }
                break;
            case 22 :
                // InternalRpgleLexer.g:1:154: DclF
                {
                mDclF(); 

                }
                break;
            case 23 :
                // InternalRpgleLexer.g:1:159: DclS
                {
                mDclS(); 

                }
                break;
            case 24 :
                // InternalRpgleLexer.g:1:164: Enddo
                {
                mEnddo(); 

                }
                break;
            case 25 :
                // InternalRpgleLexer.g:1:170: Endif
                {
                mEndif(); 

                }
                break;
            case 26 :
                // InternalRpgleLexer.g:1:176: Endsl
                {
                mEndsl(); 

                }
                break;
            case 27 :
                // InternalRpgleLexer.g:1:182: Endsr
                {
                mEndsr(); 

                }
                break;
            case 28 :
                // InternalRpgleLexer.g:1:188: Other
                {
                mOther(); 

                }
                break;
            case 29 :
                // InternalRpgleLexer.g:1:194: Reade
                {
                mReade(); 

                }
                break;
            case 30 :
                // InternalRpgleLexer.g:1:200: Setgt
                {
                mSetgt(); 

                }
                break;
            case 31 :
                // InternalRpgleLexer.g:1:206: Setll
                {
                mSetll(); 

                }
                break;
            case 32 :
                // InternalRpgleLexer.g:1:212: Eof
                {
                mEof(); 

                }
                break;
            case 33 :
                // InternalRpgleLexer.g:1:216: Rnf
                {
                mRnf(); 

                }
                break;
            case 34 :
                // InternalRpgleLexer.g:1:220: OFF
                {
                mOFF(); 

                }
                break;
            case 35 :
                // InternalRpgleLexer.g:1:224: INH1
                {
                mINH1(); 

                }
                break;
            case 36 :
                // InternalRpgleLexer.g:1:229: Char
                {
                mChar(); 

                }
                break;
            case 37 :
                // InternalRpgleLexer.g:1:234: Date
                {
                mDate(); 

                }
                break;
            case 38 :
                // InternalRpgleLexer.g:1:239: Else
                {
                mElse(); 

                }
                break;
            case 39 :
                // InternalRpgleLexer.g:1:244: Exsr
                {
                mExsr(); 

                }
                break;
            case 40 :
                // InternalRpgleLexer.g:1:249: Open
                {
                mOpen(); 

                }
                break;
            case 41 :
                // InternalRpgleLexer.g:1:254: Read
                {
                mRead(); 

                }
                break;
            case 42 :
                // InternalRpgleLexer.g:1:259: When
                {
                mWhen(); 

                }
                break;
            case 43 :
                // InternalRpgleLexer.g:1:264: ON
                {
                mON(); 

                }
                break;
            case 44 :
                // InternalRpgleLexer.g:1:267: And
                {
                mAnd(); 

                }
                break;
            case 45 :
                // InternalRpgleLexer.g:1:271: Dec
                {
                mDec(); 

                }
                break;
            case 46 :
                // InternalRpgleLexer.g:1:275: Dou
                {
                mDou(); 

                }
                break;
            case 47 :
                // InternalRpgleLexer.g:1:279: Dow
                {
                mDow(); 

                }
                break;
            case 48 :
                // InternalRpgleLexer.g:1:283: For
                {
                mFor(); 

                }
                break;
            case 49 :
                // InternalRpgleLexer.g:1:287: Int
                {
                mInt(); 

                }
                break;
            case 50 :
                // InternalRpgleLexer.g:1:291: Not
                {
                mNot(); 

                }
                break;
            case 51 :
                // InternalRpgleLexer.g:1:295: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 52 :
                // InternalRpgleLexer.g:1:318: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 53 :
                // InternalRpgleLexer.g:1:344: Do
                {
                mDo(); 

                }
                break;
            case 54 :
                // InternalRpgleLexer.g:1:347: If
                {
                mIf(); 

                }
                break;
            case 55 :
                // InternalRpgleLexer.g:1:350: Or
                {
                mOr(); 

                }
                break;
            case 56 :
                // InternalRpgleLexer.g:1:353: To
                {
                mTo(); 

                }
                break;
            case 57 :
                // InternalRpgleLexer.g:1:356: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 58 :
                // InternalRpgleLexer.g:1:372: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 59 :
                // InternalRpgleLexer.g:1:389: Colon
                {
                mColon(); 

                }
                break;
            case 60 :
                // InternalRpgleLexer.g:1:395: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 61 :
                // InternalRpgleLexer.g:1:405: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 62 :
                // InternalRpgleLexer.g:1:418: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 63 :
                // InternalRpgleLexer.g:1:429: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 64 :
                // InternalRpgleLexer.g:1:445: RULE_IND
                {
                mRULE_IND(); 

                }
                break;
            case 65 :
                // InternalRpgleLexer.g:1:454: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 66 :
                // InternalRpgleLexer.g:1:462: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 67 :
                // InternalRpgleLexer.g:1:471: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 68 :
                // InternalRpgleLexer.g:1:483: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 69 :
                // InternalRpgleLexer.g:1:499: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 70 :
                // InternalRpgleLexer.g:1:515: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 71 :
                // InternalRpgleLexer.g:1:523: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\43\1\37\1\43\1\37\6\43\1\37\5\43\1\107\1\111\5\uffff\1\37\2\uffff\2\37\2\uffff\3\43\1\uffff\1\43\1\126\3\uffff\3\43\1\134\7\uffff\5\43\1\150\4\43\2\uffff\1\43\1\161\4\43\14\uffff\4\43\1\uffff\2\43\1\u0080\1\u0081\1\u0082\6\uffff\6\43\1\uffff\7\43\1\u0095\1\uffff\1\43\1\u0097\1\u0098\1\u0099\1\uffff\4\43\1\u00a0\1\u00a1\1\43\1\uffff\1\u00a6\7\uffff\1\43\1\u00aa\2\43\1\u00ad\3\43\1\u00b2\4\43\1\u00b7\1\uffff\1\u00b8\3\uffff\1\43\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\43\2\uffff\1\43\5\uffff\1\u00c2\1\u00c3\1\uffff\1\u00c4\1\43\1\uffff\1\u00c6\2\43\1\u00c9\1\uffff\1\43\1\u00cb\1\u00cc\1\u00cd\2\uffff\1\u00ce\4\uffff\1\u00cf\1\43\1\u00d2\4\uffff\1\43\1\uffff\1\43\1\u00d5\1\uffff\1\u00d6\5\uffff\1\43\2\uffff\1\u00d8\1\u00d9\2\uffff\1\43\2\uffff\1\u00db\1\uffff";
    static final String DFA12_eofS =
        "\u00dc\uffff";
    static final String DFA12_minS =
        "\1\0\1\114\1\111\1\52\1\101\1\102\1\110\1\120\1\101\4\105\1\106\1\110\1\116\2\117\2\75\5\uffff\1\101\2\uffff\2\0\2\uffff\1\104\2\123\1\uffff\1\115\1\60\3\uffff\1\114\1\124\1\103\1\60\1\114\2\uffff\1\105\1\116\1\106\1\uffff\1\114\1\101\1\117\1\105\1\110\1\60\1\122\1\101\1\114\1\107\2\uffff\1\110\1\60\1\105\1\104\1\122\1\124\14\uffff\1\55\1\105\1\122\1\105\1\uffff\1\55\1\105\3\60\1\uffff\1\101\1\122\1\60\2\uffff\1\55\1\111\1\123\1\111\1\116\1\105\1\uffff\1\103\1\125\1\104\1\105\1\107\1\123\1\61\1\60\1\uffff\1\116\3\60\1\uffff\2\117\1\106\1\114\2\60\1\123\1\106\1\60\3\uffff\1\116\1\117\2\uffff\1\116\1\60\1\105\1\117\1\60\1\122\1\110\1\122\1\60\1\103\1\124\1\114\1\122\1\60\1\uffff\1\60\3\uffff\1\122\4\60\1\106\2\uffff\1\124\4\uffff\1\113\1\123\1\60\1\uffff\1\60\1\116\1\uffff\1\60\1\101\1\116\1\60\1\uffff\1\124\3\60\2\uffff\1\60\4\uffff\1\60\1\101\1\123\4\uffff\1\123\1\uffff\1\122\1\60\1\uffff\1\60\5\uffff\1\115\2\uffff\2\60\2\uffff\1\120\2\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\170\1\157\1\151\1\157\1\172\2\164\1\141\3\145\1\162\1\156\1\150\1\156\2\157\2\75\5\uffff\1\172\2\uffff\2\uffff\2\uffff\1\144\2\163\1\uffff\1\155\1\172\3\uffff\1\154\1\164\1\143\1\172\1\154\2\uffff\1\145\2\156\1\uffff\1\154\1\141\1\157\1\164\1\150\1\172\1\162\2\164\1\147\2\uffff\1\164\1\172\1\145\1\144\1\162\1\164\14\uffff\1\163\1\145\1\162\1\145\1\uffff\1\55\1\145\3\172\1\uffff\1\141\1\162\1\154\2\uffff\1\55\1\162\1\163\1\151\1\156\1\145\1\uffff\1\143\1\165\1\144\1\145\1\154\1\163\1\61\1\172\1\uffff\1\156\3\172\1\uffff\2\157\1\146\1\162\2\172\2\163\1\172\3\uffff\1\156\1\157\2\uffff\1\156\1\172\1\145\1\157\1\172\1\162\1\150\1\162\1\172\1\143\1\164\1\154\1\162\1\172\1\uffff\1\172\3\uffff\1\162\4\172\1\146\2\uffff\1\164\4\uffff\1\153\1\163\1\172\1\uffff\1\172\1\156\1\uffff\1\172\1\141\1\156\1\172\1\uffff\1\164\3\172\2\uffff\1\172\4\uffff\1\172\1\141\1\163\4\uffff\1\163\1\uffff\1\162\1\172\1\uffff\1\172\5\uffff\1\155\2\uffff\2\172\2\uffff\1\160\2\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\24\uffff\1\71\1\72\1\73\1\74\1\76\1\uffff\1\101\1\102\2\uffff\1\106\1\107\3\uffff\1\101\2\uffff\1\3\1\104\1\105\5\uffff\1\12\1\13\3\uffff\1\21\12\uffff\1\40\1\41\6\uffff\1\63\1\75\1\64\1\77\1\71\1\72\1\73\1\74\1\76\1\102\1\103\1\106\4\uffff\1\70\5\uffff\1\65\3\uffff\1\42\1\53\6\uffff\1\67\10\uffff\1\66\4\uffff\1\1\11\uffff\1\55\1\56\1\57\2\uffff\1\100\1\6\16\uffff\1\61\1\uffff\1\54\1\60\1\62\6\uffff\1\46\1\47\1\uffff\1\4\1\26\1\27\1\45\3\uffff\1\44\2\uffff\1\50\4\uffff\1\51\4\uffff\1\43\1\52\1\uffff\1\30\1\31\1\32\1\33\3\uffff\1\14\1\22\1\24\1\25\1\uffff\1\34\2\uffff\1\35\1\uffff\1\36\1\37\1\23\1\16\1\15\1\uffff\1\5\1\11\2\uffff\1\17\1\20\1\uffff\1\7\1\10\1\uffff\1\2";
    static final String DFA12_specialS =
        "\1\2\33\uffff\1\0\1\1\u00be\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\34\2\37\1\14\1\37\1\35\1\24\1\25\1\5\4\37\1\3\12\33\1\26\1\27\1\22\1\30\1\23\2\37\1\17\1\13\1\6\1\4\1\1\1\20\2\32\1\15\4\32\1\21\1\7\2\32\1\11\1\12\1\2\1\32\1\10\1\16\3\32\3\37\1\31\1\32\1\37\1\17\1\13\1\6\1\4\1\1\1\20\2\32\1\15\4\32\1\21\1\7\2\32\1\11\1\12\1\2\1\32\1\10\1\16\3\32\uff85\37",
            "\1\41\1\uffff\1\40\11\uffff\1\42\23\uffff\1\41\1\uffff\1\40\11\uffff\1\42",
            "\1\44\5\uffff\1\45\31\uffff\1\44\5\uffff\1\45",
            "\1\47\4\uffff\1\50\31\uffff\1\46\37\uffff\1\46",
            "\1\52\1\uffff\1\51\1\uffff\1\53\11\uffff\1\54\21\uffff\1\52\1\uffff\1\51\1\uffff\1\53\11\uffff\1\54",
            "\1\55\5\uffff\1\56\1\61\2\uffff\1\57\2\uffff\1\62\12\uffff\1\60\7\uffff\1\55\5\uffff\1\56\1\63\2\uffff\1\57\2\uffff\1\62\12\uffff\1\60",
            "\1\65\3\uffff\1\66\7\uffff\1\64\23\uffff\1\65\3\uffff\1\66\7\uffff\1\64",
            "\1\67\1\uffff\1\71\1\uffff\1\70\33\uffff\1\67\1\uffff\1\71\1\uffff\1\70",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\14\uffff\1\77\22\uffff\1\76\14\uffff\1\77",
            "\1\101\7\uffff\1\100\27\uffff\1\101\7\uffff\1\100",
            "\1\102\37\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\120",
            "\0\120",
            "",
            "",
            "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "",
            "\1\125\37\uffff\1\125",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131",
            "\12\43\7\uffff\24\43\1\132\1\43\1\133\3\43\4\uffff\1\43\1\uffff\24\43\1\132\1\43\1\133\3\43",
            "\1\135\37\uffff\1\135",
            "",
            "",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\63",
            "\1\140\7\uffff\1\141\27\uffff\1\140\7\uffff\1\141",
            "",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\1\146\16\uffff\1\145\20\uffff\1\146\16\uffff\1\145",
            "\1\147\37\uffff\1\147",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\151\37\uffff\1\151",
            "\1\153\22\uffff\1\152\14\uffff\1\153\22\uffff\1\152",
            "\1\154\7\uffff\1\155\27\uffff\1\154\7\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "",
            "",
            "\1\157\13\uffff\1\160\23\uffff\1\157\13\uffff\1\160",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166\26\uffff\1\170\1\uffff\1\167\2\uffff\1\171\11\uffff\1\172\20\uffff\1\170\1\uffff\1\167\2\uffff\1\171\11\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "",
            "\1\176",
            "\1\177\37\uffff\1\177",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\12\u0085\22\uffff\1\63\37\uffff\1\63",
            "",
            "",
            "\1\u0086",
            "\1\u0087\10\uffff\1\u0088\26\uffff\1\u0087\10\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\4\uffff\1\u0092\32\uffff\1\u0091\4\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0096\37\uffff\1\u0096",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\5\uffff\1\u009e\31\uffff\1\u009d\5\uffff\1\u009e",
            "\12\43\7\uffff\10\43\1\u009f\21\43\4\uffff\1\43\1\uffff\10\43\1\u009f\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a4\11\uffff\1\u00a3\2\uffff\1\u00a5\22\uffff\1\u00a4\11\uffff\1\u00a3\2\uffff\1\u00a5",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "",
            "",
            "\1\u00a9\37\uffff\1\u00a9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\12\43\7\uffff\4\43\1\u00b1\25\43\4\uffff\1\43\1\uffff\4\43\1\u00b1\25\43",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u00b9\37\uffff\1\u00b9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00be\37\uffff\1\u00be",
            "",
            "",
            "\1\u00bf\37\uffff\1\u00bf",
            "",
            "",
            "",
            "",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c5\37\uffff\1\u00c5",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ca\37\uffff\1\u00ca",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "",
            "",
            "",
            "",
            "\1\u00d3\37\uffff\1\u00d3",
            "",
            "\1\u00d4\37\uffff\1\u00d4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d7\37\uffff\1\u00d7",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u00da\37\uffff\1\u00da",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EndProc | Timestamp | Include | DclProc | BLANKS | CtlOpt | Options | Varchar | BLANK | HIVAL | LOVAL | ZEROS | Elseif | Endfor | Return | Select | INLR | ZERO | Begsr | Chain | Close | DclF | DclS | Enddo | Endif | Endsl | Endsr | Other | Reade | Setgt | Setll | Eof | Rnf | OFF | INH1 | Char | Date | Else | Exsr | Open | Read | When | ON | And | Dec | Dou | Dow | For | Int | Not | LessThanSignEqualsSign | GreaterThanSignEqualsSign | Do | If | Or | To | LeftParenthesis | RightParenthesis | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | RULE_IND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFF')) ) {s = 80;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 80;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='E'||LA12_0=='e') ) {s = 1;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='/') ) {s = 3;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='*') ) {s = 5;}

                        else if ( (LA12_0=='C'||LA12_0=='c') ) {s = 6;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 7;}

                        else if ( (LA12_0=='V'||LA12_0=='v') ) {s = 8;}

                        else if ( (LA12_0=='R'||LA12_0=='r') ) {s = 9;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 10;}

                        else if ( (LA12_0=='B'||LA12_0=='b') ) {s = 11;}

                        else if ( (LA12_0=='%') ) {s = 12;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 13;}

                        else if ( (LA12_0=='W'||LA12_0=='w') ) {s = 14;}

                        else if ( (LA12_0=='A'||LA12_0=='a') ) {s = 15;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 16;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 17;}

                        else if ( (LA12_0=='<') ) {s = 18;}

                        else if ( (LA12_0=='>') ) {s = 19;}

                        else if ( (LA12_0=='(') ) {s = 20;}

                        else if ( (LA12_0==')') ) {s = 21;}

                        else if ( (LA12_0==':') ) {s = 22;}

                        else if ( (LA12_0==';') ) {s = 23;}

                        else if ( (LA12_0=='=') ) {s = 24;}

                        else if ( (LA12_0=='^') ) {s = 25;}

                        else if ( ((LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='M')||(LA12_0>='P' && LA12_0<='Q')||LA12_0=='U'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='p' && LA12_0<='q')||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( (LA12_0=='\"') ) {s = 28;}

                        else if ( (LA12_0=='\'') ) {s = 29;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 30;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||(LA12_0>='+' && LA12_0<='.')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}