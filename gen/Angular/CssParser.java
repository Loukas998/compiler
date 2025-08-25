// Generated from C:/Users/LOQ/Documents/Github/compiler/src/Angular/CssParser.g4 by ANTLR 4.13.2
package Angular;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Component=1, NgFor=2, NgIf=3, NgModel=4, Selector=5, TemplateUrl=6, Template=7, 
		StyleUrls=8, StyleUrl=9, Styles=10, Imports=11, Standalone=12, Router=13, 
		Get=14, HTML_COMMENT=15, HTML_CONDITIONAL_COMMENT=16, XML=17, CDATA=18, 
		DTD=19, SCRIPTLET=20, SEA_WS=21, DoubleQuotationMark=22, MultiLineComment=23, 
		SingleLineComment=24, SingleQuote=25, TripleQuote=26, DoubleQuote=27, 
		BackTickQuote=28, OpenBracket=29, CloseBracket=30, OpenParen=31, CloseParen=32, 
		OpenBrace=33, CloseBrace=34, SemiColon=35, Comma=36, Assign=37, QuestionMark=38, 
		QuestionMarkDot=39, Colon=40, Ellipsis=41, Dot=42, PlusPlus=43, MinusMinus=44, 
		Plus=45, Minus=46, BitNot=47, Not=48, Multiply=49, Divide=50, Percent=51, 
		Power=52, NullCoalesce=53, Hashtag=54, LeftShiftArithmetic=55, LessThan=56, 
		MoreThan=57, LessThanEquals=58, GreaterThanEquals=59, Equals=60, NotEquals=61, 
		IdentityEquals=62, IdentityNotEquals=63, BitAnd=64, BitXOr=65, BitOr=66, 
		And=67, Or=68, MultiplyAssign=69, DivideAssign=70, ModulusAssign=71, PlusAssign=72, 
		MinusAssign=73, LeftShiftArithmeticAssign=74, RightShiftArithmeticAssign=75, 
		RightShiftLogicalAssign=76, BitAndAssign=77, BitXorAssign=78, BitOrAssign=79, 
		PowerAssign=80, NullishCoalescingAssign=81, ARROW=82, HEXCHAR=83, NullLiteral=84, 
		BooleanLiteral=85, DecimalLiteral=86, BigDecimalIntegerLiteral=87, DecimalIntegerLiteral=88, 
		Break=89, Do=90, Instanceof=91, Typeof=92, Case=93, Else=94, New=95, Var=96, 
		Catch=97, Finally=98, Return=99, Void=100, Continue=101, For=102, Switch=103, 
		While=104, Debugger=105, Function_=106, This=107, With=108, Default=109, 
		If=110, Throw=111, Delete=112, In=113, Try=114, As=115, From=116, ReadOnly=117, 
		Async=118, Await=119, Yield=120, YieldStar=121, H1=122, H2=123, H3=124, 
		H4=125, H5=126, H6=127, AnchorTag=128, Div=129, ParagprahTag=130, SpanTag=131, 
		ImageTag=132, UnorderedListTag=133, OrderedListTag=134, ListItemTag=135, 
		LineBreakTag=136, StrongTextTag=137, Button=138, Input=139, Label=140, 
		Row=141, Column=142, Auto=143, Pointer=144, Border_Box=145, Center=146, 
		Solid=147, Display=148, Flex_Direction=149, Gap=150, Padding=151, Box_Size=152, 
		Flex=153, Border=154, Text_Align=155, Max_With=156, Height=157, Width=158, 
		Cursor=159, Transition=160, Color=161, FontSize=162, Margin=163, Background_Color=164, 
		Textarea=165, PX=166, CM=167, MM=168, PT=169, PC=170, EM=171, REM=172, 
		EX=173, CH=174, VW=175, VH=176, VMIN=177, VMAX=178, CQW=179, CQH=180, 
		CQI=181, CQB=182, CQMIN=183, CQMAX=184, Class=185, Enum=186, Extends=187, 
		Super=188, Const=189, Export=190, Import=191, Implements=192, Let=193, 
		Private=194, Public=195, Interface=196, Package=197, Protected=198, Static=199, 
		Any=200, Number=201, Never=202, Boolean=203, String=204, Int=205, Unique=206, 
		Symbol=207, Undefined=208, Object=209, Of=210, KeyOf=211, TypeAlias=212, 
		Constructor=213, Namespace=214, Require=215, Module=216, Declare=217, 
		Abstract=218, Is=219, At=220, WhiteSpaces=221, Comment=222, HtmlComment=223, 
		CDataComment=224, ID=225;
	public static final int
		RULE_cssElement = 0, RULE_selector = 1, RULE_simpleSelector = 2, RULE_cssProperty = 3, 
		RULE_css = 4, RULE_cssValue = 5, RULE_decimalLiteral_UNIT = 6, RULE_decimalLiteralUnit = 7, 
		RULE_decimalLiteral = 8, RULE_tagName = 9, RULE_eos = 10, RULE_unit = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cssElement", "selector", "simpleSelector", "cssProperty", "css", "cssValue", 
			"decimalLiteral_UNIT", "decimalLiteralUnit", "decimalLiteral", "tagName", 
			"eos", "unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", null, null, null, "'selector'", "'templateUrl'", 
			"'template'", "'styleUrls'", "'styleUrl'", "'styles'", "'imports'", "'standalone'", 
			null, "'get'", null, null, null, null, null, null, null, "'\"'", null, 
			null, null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", 
			"'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", 
			"'<<'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", 
			"'??='", "'=>'", null, "'null'", null, null, null, null, "'break'", "'do'", 
			"'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", "'from'", "'readonly'", 
			"'async'", "'await'", "'yield'", "'yield*'", "'h1'", "'h2'", "'h3'", 
			"'h4'", "'h5'", "'h6'", "'a'", "'div'", "'p'", "'span'", "'img'", "'ul'", 
			"'ol'", "'li'", "'br'", "'strong'", "'button'", "'input'", "'label'", 
			"'row'", "'column'", "'auto'", "'pointer'", "'border-box'", "'center'", 
			"'solid'", "'display'", "'flex-direction'", "'gap'", "'padding'", "'box-sizing'", 
			"'flex'", "'border'", "'text-align'", "'max-width'", "'height'", "'width'", 
			"'cursor'", "'transition'", "'color'", "'fontsize'", "'margin'", "'background-color'", 
			"'textarea'", "'px'", "'cm'", "'mm'", "'pt'", "'pc'", "'em'", "'rem'", 
			"'ex'", "'ch'", "'vw'", "'vh'", "'vmin'", "'vmax'", "'cqw'", "'cqh'", 
			"'cqi'", "'cqb'", "'cqmin'", "'cqmax'", "'class'", "'enum'", "'extends'", 
			"'super'", "'const'", "'export'", "'import'", "'implements'", "'let'", 
			"'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'", 
			"'any'", "'number'", "'never'", "'boolean'", "'string'", "'int'", "'unique'", 
			"'symbol'", "'undefined'", "'object'", "'of'", "'keyof'", "'type'", "'constructor'", 
			"'namespace'", "'require'", "'module'", "'declare'", "'abstract'", "'is'", 
			"'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Component", "NgFor", "NgIf", "NgModel", "Selector", "TemplateUrl", 
			"Template", "StyleUrls", "StyleUrl", "Styles", "Imports", "Standalone", 
			"Router", "Get", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", 
			"DTD", "SCRIPTLET", "SEA_WS", "DoubleQuotationMark", "MultiLineComment", 
			"SingleLineComment", "SingleQuote", "TripleQuote", "DoubleQuote", "BackTickQuote", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", 
			"Colon", "Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", 
			"BitNot", "Not", "Multiply", "Divide", "Percent", "Power", "NullCoalesce", 
			"Hashtag", "LeftShiftArithmetic", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "PowerAssign", "NullishCoalescingAssign", 
			"ARROW", "HEXCHAR", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"BigDecimalIntegerLiteral", "DecimalIntegerLiteral", "Break", "Do", "Instanceof", 
			"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
			"Void", "Continue", "For", "Switch", "While", "Debugger", "Function_", 
			"This", "With", "Default", "If", "Throw", "Delete", "In", "Try", "As", 
			"From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", "H1", "H2", 
			"H3", "H4", "H5", "H6", "AnchorTag", "Div", "ParagprahTag", "SpanTag", 
			"ImageTag", "UnorderedListTag", "OrderedListTag", "ListItemTag", "LineBreakTag", 
			"StrongTextTag", "Button", "Input", "Label", "Row", "Column", "Auto", 
			"Pointer", "Border_Box", "Center", "Solid", "Display", "Flex_Direction", 
			"Gap", "Padding", "Box_Size", "Flex", "Border", "Text_Align", "Max_With", 
			"Height", "Width", "Cursor", "Transition", "Color", "FontSize", "Margin", 
			"Background_Color", "Textarea", "PX", "CM", "MM", "PT", "PC", "EM", "REM", 
			"EX", "CH", "VW", "VH", "VMIN", "VMAX", "CQW", "CQH", "CQI", "CQB", "CQMIN", 
			"CQMAX", "Class", "Enum", "Extends", "Super", "Const", "Export", "Import", 
			"Implements", "Let", "Private", "Public", "Interface", "Package", "Protected", 
			"Static", "Any", "Number", "Never", "Boolean", "String", "Int", "Unique", 
			"Symbol", "Undefined", "Object", "Of", "KeyOf", "TypeAlias", "Constructor", 
			"Namespace", "Require", "Module", "Declare", "Abstract", "Is", "At", 
			"WhiteSpaces", "Comment", "HtmlComment", "CDataComment", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssElementContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(CssParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(CssParser.CloseBrace, 0); }
		public TerminalNode Dot() { return getToken(CssParser.Dot, 0); }
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CssParser.Comma, i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<CssPropertyContext> cssProperty() {
			return getRuleContexts(CssPropertyContext.class);
		}
		public CssPropertyContext cssProperty(int i) {
			return getRuleContext(CssPropertyContext.class,i);
		}
		public CssElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssElementContext cssElement() throws RecognitionException {
		CssElementContext _localctx = new CssElementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cssElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(24);
				match(Dot);
				}
				break;
			}
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(27);
				tagName();
				}
				break;
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(30);
				match(Comma);
				setState(31);
				tagName();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SingleQuote || _la==DoubleQuote || _la==Textarea) {
				{
				{
				setState(37);
				selector();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(OpenBrace);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 131071L) != 0)) {
				{
				{
				setState(44);
				cssProperty();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DoubleQuote() { return getToken(CssParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(CssParser.SingleQuote, 0); }
		public TerminalNode ImageTag() { return getToken(CssParser.ImageTag, 0); }
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public TerminalNode Textarea() { return getToken(CssParser.Textarea, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selector);
		int _la;
		try {
			int _alt;
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleQuote:
			case DoubleQuote:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==DoubleQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ImageTag) {
					{
					setState(53);
					match(ImageTag);
					}
				}

				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(56);
						simpleSelector();
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(Textarea);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode DoubleQuote() { return getToken(CssParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(CssParser.SingleQuote, 0); }
		public TerminalNode Colon() { return getToken(CssParser.Colon, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(65);
				match(Colon);
				}
			}

			setState(68);
			_la = _input.LA(1);
			if ( !(_la==SingleQuote || _la==DoubleQuote) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CssParser.Colon, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			css();
			setState(71);
			match(Colon);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 2594073385365405701L) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 16777151L) != 0)) {
				{
				{
				setState(72);
				cssValue();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssContext extends ParserRuleContext {
		public TerminalNode Display() { return getToken(CssParser.Display, 0); }
		public TerminalNode Flex_Direction() { return getToken(CssParser.Flex_Direction, 0); }
		public TerminalNode Gap() { return getToken(CssParser.Gap, 0); }
		public TerminalNode Padding() { return getToken(CssParser.Padding, 0); }
		public TerminalNode Box_Size() { return getToken(CssParser.Box_Size, 0); }
		public TerminalNode Flex() { return getToken(CssParser.Flex, 0); }
		public TerminalNode Border() { return getToken(CssParser.Border, 0); }
		public TerminalNode Text_Align() { return getToken(CssParser.Text_Align, 0); }
		public TerminalNode Max_With() { return getToken(CssParser.Max_With, 0); }
		public TerminalNode Height() { return getToken(CssParser.Height, 0); }
		public TerminalNode Cursor() { return getToken(CssParser.Cursor, 0); }
		public TerminalNode Transition() { return getToken(CssParser.Transition, 0); }
		public TerminalNode Background_Color() { return getToken(CssParser.Background_Color, 0); }
		public TerminalNode Margin() { return getToken(CssParser.Margin, 0); }
		public TerminalNode FontSize() { return getToken(CssParser.FontSize, 0); }
		public TerminalNode Color() { return getToken(CssParser.Color, 0); }
		public TerminalNode Width() { return getToken(CssParser.Width, 0); }
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 131071L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public DecimalLiteral_UNITContext decimalLiteral_UNIT() {
			return getRuleContext(DecimalLiteral_UNITContext.class,0);
		}
		public TerminalNode Row() { return getToken(CssParser.Row, 0); }
		public TerminalNode Flex() { return getToken(CssParser.Flex, 0); }
		public TerminalNode Border_Box() { return getToken(CssParser.Border_Box, 0); }
		public TerminalNode Center() { return getToken(CssParser.Center, 0); }
		public TerminalNode Column() { return getToken(CssParser.Column, 0); }
		public TerminalNode Auto() { return getToken(CssParser.Auto, 0); }
		public TerminalNode Pointer() { return getToken(CssParser.Pointer, 0); }
		public TerminalNode HEXCHAR() { return getToken(CssParser.HEXCHAR, 0); }
		public TerminalNode DoubleQuote() { return getToken(CssParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(CssParser.SingleQuote, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cssValue);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				decimalLiteral_UNIT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(Row);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(Flex);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(Border_Box);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(Center);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(Column);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(Auto);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				match(Pointer);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				match(HEXCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==DoubleQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteral_UNITContext extends ParserRuleContext {
		public DecimalLiteral_UNITContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral_UNIT; }
	 
		public DecimalLiteral_UNITContext() { }
		public void copyFrom(DecimalLiteral_UNITContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralUnitContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public GeneralUnitContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterGeneralUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitGeneralUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitGeneralUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberListContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public UnitNumberListContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUnitNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUnitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundColorUnitContext extends DecimalLiteral_UNITContext {
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public BackgroundColorUnitContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBackgroundColorUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBackgroundColorUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBackgroundColorUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitSolidColorContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public TerminalNode Solid() { return getToken(CssParser.Solid, 0); }
		public TerminalNode HEXCHAR() { return getToken(CssParser.HEXCHAR, 0); }
		public UnitSolidColorContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUnitSolidColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUnitSolidColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnitSolidColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteral_UNITContext decimalLiteral_UNIT() throws RecognitionException {
		DecimalLiteral_UNITContext _localctx = new DecimalLiteral_UNITContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decimalLiteral_UNIT);
		try {
			int _alt;
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new UnitNumberListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				decimalLiteralUnit();
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						decimalLiteral();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new UnitSolidColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				decimalLiteralUnit();
				setState(102);
				match(Solid);
				setState(103);
				match(HEXCHAR);
				}
				break;
			case 3:
				_localctx = new BackgroundColorUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				css();
				setState(106);
				decimalLiteralUnit();
				}
				break;
			case 4:
				_localctx = new GeneralUnitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				decimalLiteralUnit();
				setState(109);
				unit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralUnitContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(CssParser.DecimalLiteral, 0); }
		public DecimalLiteralUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteralUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDecimalLiteralUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDecimalLiteralUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDecimalLiteralUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralUnitContext decimalLiteralUnit() throws RecognitionException {
		DecimalLiteralUnitContext _localctx = new DecimalLiteralUnitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimalLiteralUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(CssParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode H1() { return getToken(CssParser.H1, 0); }
		public TerminalNode H2() { return getToken(CssParser.H2, 0); }
		public TerminalNode H3() { return getToken(CssParser.H3, 0); }
		public TerminalNode H4() { return getToken(CssParser.H4, 0); }
		public TerminalNode ImageTag() { return getToken(CssParser.ImageTag, 0); }
		public TerminalNode ParagprahTag() { return getToken(CssParser.ParagprahTag, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(CssParser.QuestionMarkDot, 0); }
		public List<TerminalNode> CloseBrace() { return getTokens(CssParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(CssParser.CloseBrace, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(CssParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(CssParser.OpenBrace, i);
		}
		public TerminalNode Div() { return getToken(CssParser.Div, 0); }
		public TerminalNode Dot() { return getToken(CssParser.Dot, 0); }
		public TerminalNode Button() { return getToken(CssParser.Button, 0); }
		public TerminalNode Label() { return getToken(CssParser.Label, 0); }
		public TerminalNode Input() { return getToken(CssParser.Input, 0); }
		public TerminalNode Textarea() { return getToken(CssParser.Textarea, 0); }
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tagName);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(H1);
				}
				break;
			case H2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(H2);
				}
				break;
			case H3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(H3);
				}
				break;
			case H4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(H4);
				}
				break;
			case ImageTag:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(ImageTag);
				}
				break;
			case ParagprahTag:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(ParagprahTag);
				}
				break;
			case QuestionMarkDot:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(QuestionMarkDot);
				}
				break;
			case CloseBrace:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				match(CloseBrace);
				setState(125);
				match(CloseBrace);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				match(OpenBrace);
				setState(127);
				match(OpenBrace);
				}
				break;
			case Div:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(Div);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				match(Dot);
				}
				break;
			case Button:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				match(Button);
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 13);
				{
				setState(131);
				match(Label);
				}
				break;
			case Input:
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				match(Input);
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 15);
				{
				setState(133);
				match(Textarea);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 16);
				{
				setState(134);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(CssParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public TerminalNode PX() { return getToken(CssParser.PX, 0); }
		public TerminalNode CM() { return getToken(CssParser.CM, 0); }
		public TerminalNode MM() { return getToken(CssParser.MM, 0); }
		public TerminalNode In() { return getToken(CssParser.In, 0); }
		public TerminalNode PT() { return getToken(CssParser.PT, 0); }
		public TerminalNode PC() { return getToken(CssParser.PC, 0); }
		public TerminalNode EM() { return getToken(CssParser.EM, 0); }
		public TerminalNode REM() { return getToken(CssParser.REM, 0); }
		public TerminalNode Percent() { return getToken(CssParser.Percent, 0); }
		public TerminalNode EX() { return getToken(CssParser.EX, 0); }
		public TerminalNode CH() { return getToken(CssParser.CH, 0); }
		public TerminalNode VW() { return getToken(CssParser.VW, 0); }
		public TerminalNode VH() { return getToken(CssParser.VH, 0); }
		public TerminalNode VMIN() { return getToken(CssParser.VMIN, 0); }
		public TerminalNode VMAX() { return getToken(CssParser.VMAX, 0); }
		public TerminalNode CQW() { return getToken(CssParser.CQW, 0); }
		public TerminalNode CQH() { return getToken(CssParser.CQH, 0); }
		public TerminalNode CQI() { return getToken(CssParser.CQI, 0); }
		public TerminalNode CQB() { return getToken(CssParser.CQB, 0); }
		public TerminalNode CQMIN() { return getToken(CssParser.CQMIN, 0); }
		public TerminalNode CQMAX() { return getToken(CssParser.CQMAX, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==Percent || _la==In || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 524287L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00e1\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0003\u0000\u001d\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t"+
		"\u0000\u0001\u0000\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001"+
		"\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0003"+
		"\u0001@\b\u0001\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003"+
		"M\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006a\b\u0006\n\u0006\f\u0006d\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0088\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\u0003\u0002\u0000\u0019\u0019\u001b\u001b"+
		"\u0001\u0000\u0094\u00a4\u0003\u000033qq\u00a6\u00b8\u00a7\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004B\u0001\u0000"+
		"\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000"+
		"\n\\\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000eq\u0001\u0000"+
		"\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000"+
		"\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0005*\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0003\u0012\t\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005$\u0000\u0000\u001f!\u0003\u0012\t\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#(\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0003"+
		"\u0002\u0001\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+/\u0005!\u0000\u0000,.\u0003\u0006\u0003"+
		"\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000023\u0005\"\u0000\u00003\u0001\u0001\u0000\u0000\u0000"+
		"46\u0007\u0000\u0000\u000057\u0005\u0084\u0000\u000065\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007;\u0001\u0000\u0000\u00008:\u0003\u0004"+
		"\u0002\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<@\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>@\u0005\u00a5\u0000\u0000?4\u0001\u0000\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AC\u0005"+
		"(\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0007\u0000\u0000\u0000E\u0005\u0001\u0000\u0000"+
		"\u0000FG\u0003\b\u0004\u0000GK\u0005(\u0000\u0000HJ\u0003\n\u0005\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NO\u0003\u0014\n\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0007"+
		"\u0001\u0000\u0000Q\t\u0001\u0000\u0000\u0000R]\u0003\f\u0006\u0000S]"+
		"\u0005\u008d\u0000\u0000T]\u0005\u0099\u0000\u0000U]\u0005\u0091\u0000"+
		"\u0000V]\u0005\u0092\u0000\u0000W]\u0005\u008e\u0000\u0000X]\u0005\u008f"+
		"\u0000\u0000Y]\u0005\u0090\u0000\u0000Z]\u0005S\u0000\u0000[]\u0007\u0000"+
		"\u0000\u0000\\R\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000\\T"+
		"\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000"+
		"\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]\u000b\u0001\u0000\u0000\u0000^b\u0003\u000e\u0007\u0000_a\u0003\u0010"+
		"\b\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cp\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0005\u0093\u0000\u0000"+
		"gh\u0005S\u0000\u0000hp\u0001\u0000\u0000\u0000ij\u0003\b\u0004\u0000"+
		"jk\u0003\u000e\u0007\u0000kp\u0001\u0000\u0000\u0000lm\u0003\u000e\u0007"+
		"\u0000mn\u0003\u0016\u000b\u0000np\u0001\u0000\u0000\u0000o^\u0001\u0000"+
		"\u0000\u0000oe\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000ol\u0001"+
		"\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u0005V\u0000\u0000r\u000f"+
		"\u0001\u0000\u0000\u0000st\u0005V\u0000\u0000t\u0011\u0001\u0000\u0000"+
		"\u0000u\u0088\u0005z\u0000\u0000v\u0088\u0005{\u0000\u0000w\u0088\u0005"+
		"|\u0000\u0000x\u0088\u0005}\u0000\u0000y\u0088\u0005\u0084\u0000\u0000"+
		"z\u0088\u0005\u0082\u0000\u0000{\u0088\u0005\'\u0000\u0000|}\u0005\"\u0000"+
		"\u0000}\u0088\u0005\"\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0088"+
		"\u0005!\u0000\u0000\u0080\u0088\u0005\u0081\u0000\u0000\u0081\u0088\u0005"+
		"*\u0000\u0000\u0082\u0088\u0005\u008a\u0000\u0000\u0083\u0088\u0005\u008c"+
		"\u0000\u0000\u0084\u0088\u0005\u008b\u0000\u0000\u0085\u0088\u0005\u00a5"+
		"\u0000\u0000\u0086\u0088\u0005\u00e1\u0000\u0000\u0087u\u0001\u0000\u0000"+
		"\u0000\u0087v\u0001\u0000\u0000\u0000\u0087w\u0001\u0000\u0000\u0000\u0087"+
		"x\u0001\u0000\u0000\u0000\u0087y\u0001\u0000\u0000\u0000\u0087z\u0001"+
		"\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0087|\u0001\u0000\u0000"+
		"\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000"+
		"\u0087\u0081\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000"+
		"\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0005#\u0000\u0000\u008a"+
		"\u0015\u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0002\u0000\u0000\u008c"+
		"\u0017\u0001\u0000\u0000\u0000\u000e\u0019\u001c\"(/6;?BK\\bo\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}