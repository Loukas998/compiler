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
		OpenBrace=33, DoubleOpenBrace=34, CloseBrace=35, DoubleCloseBrace=36, 
		SemiColon=37, Comma=38, Assign=39, QuestionMark=40, QuestionMarkDot=41, 
		Colon=42, Ellipsis=43, Dot=44, PlusPlus=45, MinusMinus=46, Plus=47, Minus=48, 
		BitNot=49, Not=50, Multiply=51, Divide=52, Percent=53, Power=54, NullCoalesce=55, 
		Hashtag=56, LeftShiftArithmetic=57, LessThan=58, MoreThan=59, LessThanEquals=60, 
		GreaterThanEquals=61, Equals=62, NotEquals=63, IdentityEquals=64, IdentityNotEquals=65, 
		BitAnd=66, BitXOr=67, BitOr=68, And=69, Or=70, MultiplyAssign=71, DivideAssign=72, 
		ModulusAssign=73, PlusAssign=74, MinusAssign=75, LeftShiftArithmeticAssign=76, 
		RightShiftArithmeticAssign=77, RightShiftLogicalAssign=78, BitAndAssign=79, 
		BitXorAssign=80, BitOrAssign=81, PowerAssign=82, NullishCoalescingAssign=83, 
		ARROW=84, HEXCHAR=85, NullLiteral=86, BooleanLiteral=87, DecimalLiteral=88, 
		BigDecimalIntegerLiteral=89, DecimalIntegerLiteral=90, Break=91, Do=92, 
		Instanceof=93, Typeof=94, Case=95, Else=96, New=97, Var=98, Catch=99, 
		Finally=100, Return=101, Void=102, Continue=103, For=104, Switch=105, 
		While=106, Debugger=107, Function_=108, This=109, With=110, Default=111, 
		If=112, Throw=113, Delete=114, In=115, Try=116, As=117, From=118, ReadOnly=119, 
		Async=120, Await=121, Yield=122, YieldStar=123, H1=124, H2=125, H3=126, 
		H4=127, H5=128, H6=129, AnchorTag=130, Div=131, ParagprahTag=132, SpanTag=133, 
		ImageTag=134, UnorderedListTag=135, OrderedListTag=136, ListItemTag=137, 
		LineBreakTag=138, StrongTextTag=139, Button=140, Input=141, Label=142, 
		Row=143, Column=144, Auto=145, Pointer=146, Border_Box=147, Center=148, 
		Solid=149, Display=150, Flex_Direction=151, Gap=152, Padding=153, Box_Size=154, 
		Flex=155, Border=156, Text_Align=157, Max_With=158, Height=159, Width=160, 
		Cursor=161, Transition=162, Color=163, Font_Size=164, Margin=165, Background_Color=166, 
		Textarea=167, PX=168, CM=169, MM=170, PT=171, PC=172, EM=173, REM=174, 
		EX=175, CH=176, VW=177, VH=178, VMIN=179, VMAX=180, CQW=181, CQH=182, 
		CQI=183, CQB=184, CQMIN=185, CQMAX=186, Class=187, Enum=188, Extends=189, 
		Super=190, Const=191, Export=192, Import=193, Implements=194, Let=195, 
		Private=196, Public=197, Interface=198, Package=199, Protected=200, Static=201, 
		Any=202, Number=203, Never=204, Boolean=205, String=206, Int=207, Unique=208, 
		Symbol=209, Undefined=210, Object=211, Of=212, KeyOf=213, TypeAlias=214, 
		Constructor=215, Namespace=216, Require=217, Module=218, Declare=219, 
		Abstract=220, Is=221, At=222, WhiteSpaces=223, Comment=224, HtmlComment=225, 
		CDataComment=226, ID=227;
	public static final int
		RULE_cssFile = 0, RULE_cssElement = 1, RULE_selector = 2, RULE_simpleSelector = 3, 
		RULE_cssProperty = 4, RULE_css = 5, RULE_cssValue = 6, RULE_decimalLiteral_UNIT = 7, 
		RULE_decimalLiteralUnit = 8, RULE_tagName = 9, RULE_eos = 10, RULE_unit = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cssFile", "cssElement", "selector", "simpleSelector", "cssProperty", 
			"css", "cssValue", "decimalLiteral_UNIT", "decimalLiteralUnit", "tagName", 
			"eos", "unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", null, null, null, "'selector'", "'templateUrl'", 
			"'template'", "'styleUrls'", "'styleUrl'", "'styles'", "'imports'", "'standalone'", 
			null, "'get'", null, null, null, null, null, null, null, "'\"'", null, 
			null, null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'{{'", 
			"'}'", "'}}'", "';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", 
			"'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", 
			"'??'", "'#'", "'<<'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
			"'**='", "'??='", "'=>'", null, "'null'", null, null, null, null, "'break'", 
			"'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", 
			"'catch'", "'finally'", "'return'", "'void'", "'continue'", "'for'", 
			"'switch'", "'while'", "'debugger'", "'function'", "'this'", "'with'", 
			"'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", 
			"'from'", "'readonly'", "'async'", "'await'", "'yield'", "'yield*'", 
			"'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'a'", "'div'", "'p'", 
			"'span'", "'img'", "'ul'", "'ol'", "'li'", "'br'", "'strong'", "'button'", 
			"'input'", "'label'", "'row'", "'column'", "'auto'", "'pointer'", "'border-box'", 
			"'center'", "'solid'", "'display'", "'flex-direction'", "'gap'", "'padding'", 
			"'box-sizing'", "'flex'", "'border'", "'text-align'", "'max-width'", 
			"'height'", "'width'", "'cursor'", "'transition'", "'color'", "'font-size'", 
			"'margin'", "'background-color'", "'textarea'", "'px'", "'cm'", "'mm'", 
			"'pt'", "'pc'", "'em'", "'rem'", "'ex'", "'ch'", "'vw'", "'vh'", "'vmin'", 
			"'vmax'", "'cqw'", "'cqh'", "'cqi'", "'cqb'", "'cqmin'", "'cqmax'", "'class'", 
			"'enum'", "'extends'", "'super'", "'const'", "'export'", "'import'", 
			"'implements'", "'let'", "'private'", "'public'", "'interface'", "'package'", 
			"'protected'", "'static'", "'any'", "'number'", "'never'", "'boolean'", 
			"'string'", "'int'", "'unique'", "'symbol'", "'undefined'", "'object'", 
			"'of'", "'keyof'", "'type'", "'constructor'", "'namespace'", "'require'", 
			"'module'", "'declare'", "'abstract'", "'is'", "'@'"
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
			"DoubleOpenBrace", "CloseBrace", "DoubleCloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", "Dot", 
			"PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Percent", "Power", "NullCoalesce", "Hashtag", "LeftShiftArithmetic", 
			"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
			"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
			"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "HEXCHAR", "NullLiteral", 
			"BooleanLiteral", "DecimalLiteral", "BigDecimalIntegerLiteral", "DecimalIntegerLiteral", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function_", "This", "With", "Default", "If", "Throw", "Delete", 
			"In", "Try", "As", "From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", 
			"H1", "H2", "H3", "H4", "H5", "H6", "AnchorTag", "Div", "ParagprahTag", 
			"SpanTag", "ImageTag", "UnorderedListTag", "OrderedListTag", "ListItemTag", 
			"LineBreakTag", "StrongTextTag", "Button", "Input", "Label", "Row", "Column", 
			"Auto", "Pointer", "Border_Box", "Center", "Solid", "Display", "Flex_Direction", 
			"Gap", "Padding", "Box_Size", "Flex", "Border", "Text_Align", "Max_With", 
			"Height", "Width", "Cursor", "Transition", "Color", "Font_Size", "Margin", 
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
	public static class CssFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<CssElementContext> cssElement() {
			return getRuleContexts(CssElementContext.class);
		}
		public CssElementContext cssElement(int i) {
			return getRuleContext(CssElementContext.class,i);
		}
		public CssFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFileContext cssFile() throws RecognitionException {
		CssFileContext _localctx = new CssFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cssFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20160576487424L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 8796093482383L) != 0)) {
				{
				{
				setState(24);
				cssElement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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
	public static class CssElementContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(CssParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(CssParser.CloseBrace, 0); }
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
		enterRule(_localctx, 2, RULE_cssElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(32);
				tagName();
				}
				break;
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(35);
				match(Comma);
				setState(36);
				tagName();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Textarea) {
				{
				{
				setState(42);
				selector();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(OpenBrace);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 131071L) != 0)) {
				{
				{
				setState(49);
				cssProperty();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
		public TerminalNode Dot() { return getToken(CssParser.Dot, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_selector);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(57);
				match(Dot);
				}
				setState(58);
				match(ID);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(59);
					tagName();
					}
					break;
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon || _la==ID) {
					{
					{
					setState(62);
					simpleSelector();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
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
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
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
		enterRule(_localctx, 6, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(71);
				match(Colon);
				}
			}

			setState(74);
			match(ID);
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
		enterRule(_localctx, 8, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			css();
			setState(77);
			match(Colon);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & -8070450532247928827L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 16777151L) != 0) || _la==ID) {
				{
				{
				setState(78);
				cssValue();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
		public TerminalNode Font_Size() { return getToken(CssParser.Font_Size, 0); }
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
		enterRule(_localctx, 10, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 131071L) != 0)) ) {
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
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
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
		enterRule(_localctx, 12, RULE_cssValue);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				decimalLiteral_UNIT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(Row);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(Flex);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(Border_Box);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(Center);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(Column);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(Auto);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(Pointer);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				match(HEXCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
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
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(98);
				match(ID);
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
	public static class UnitNumberListContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public List<TerminalNode> DecimalLiteral() { return getTokens(CssParser.DecimalLiteral); }
		public TerminalNode DecimalLiteral(int i) {
			return getToken(CssParser.DecimalLiteral, i);
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
		enterRule(_localctx, 14, RULE_decimalLiteral_UNIT);
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new UnitNumberListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				decimalLiteralUnit();
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						match(DecimalLiteral);
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new UnitSolidColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				decimalLiteralUnit();
				setState(109);
				match(Solid);
				setState(110);
				match(HEXCHAR);
				}
				break;
			case 3:
				_localctx = new BackgroundColorUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				css();
				setState(113);
				decimalLiteralUnit();
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
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_decimalLiteralUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(DecimalLiteral);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(118);
				unit();
				}
				break;
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
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode H1() { return getToken(CssParser.H1, 0); }
		public TerminalNode H2() { return getToken(CssParser.H2, 0); }
		public TerminalNode H3() { return getToken(CssParser.H3, 0); }
		public TerminalNode H4() { return getToken(CssParser.H4, 0); }
		public TerminalNode ImageTag() { return getToken(CssParser.ImageTag, 0); }
		public TerminalNode ParagprahTag() { return getToken(CssParser.ParagprahTag, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(CssParser.QuestionMarkDot, 0); }
		public TerminalNode DoubleOpenBrace() { return getToken(CssParser.DoubleOpenBrace, 0); }
		public TerminalNode DoubleCloseBrace() { return getToken(CssParser.DoubleCloseBrace, 0); }
		public TerminalNode Div() { return getToken(CssParser.Div, 0); }
		public TerminalNode Button() { return getToken(CssParser.Button, 0); }
		public TerminalNode Label() { return getToken(CssParser.Label, 0); }
		public TerminalNode Input() { return getToken(CssParser.Input, 0); }
		public TerminalNode Textarea() { return getToken(CssParser.Textarea, 0); }
		public TerminalNode Dot() { return getToken(CssParser.Dot, 0); }
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(H1);
				}
				break;
			case H2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(H2);
				}
				break;
			case H3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(H3);
				}
				break;
			case H4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(H4);
				}
				break;
			case ImageTag:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(ImageTag);
				}
				break;
			case ParagprahTag:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(ParagprahTag);
				}
				break;
			case QuestionMarkDot:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(QuestionMarkDot);
				}
				break;
			case DoubleOpenBrace:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(DoubleOpenBrace);
				}
				break;
			case DoubleCloseBrace:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(DoubleCloseBrace);
				}
				break;
			case Div:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				match(Div);
				}
				break;
			case Button:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				match(Button);
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 12);
				{
				setState(132);
				match(Label);
				}
				break;
			case Input:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
				match(Input);
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 14);
				{
				setState(134);
				match(Textarea);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 15);
				{
				setState(135);
				match(Dot);
				setState(136);
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
			setState(139);
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
		public TerminalNode ID() { return getToken(CssParser.ID, 0); }
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
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==Percent || _la==In || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & 576460752303947775L) != 0)) ) {
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
		"\u0004\u0001\u00e3\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0005"+
		"\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0005"+
		"\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0003\u0002F\b\u0002"+
		"\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004P\b\u0004\n\u0004\f\u0004S\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006d\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007h\b\u0007\n\u0007\f\u0007k\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0003\bx\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0003\u0001\u0000\u0096\u00a6"+
		"\u0002\u0000\u0019\u0019\u001b\u001b\u0004\u000055ss\u00a8\u00ba\u00e3"+
		"\u00e3\u00a9\u0000\u001b\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004E\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"L\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000"+
		"\u0000\u000es\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012"+
		"\u0089\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016"+
		"\u008d\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 \""+
		"\u0003\u0012\t\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000"+
		"\"\'\u0001\u0000\u0000\u0000#$\u0005&\u0000\u0000$&\u0003\u0012\t\u0000"+
		"%#\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(-\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000*,\u0003\u0004\u0002\u0000+*\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000004\u0005!\u0000\u0000"+
		"13\u0003\b\u0004\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000078\u0005#\u0000\u00008\u0003\u0001\u0000"+
		"\u0000\u00009:\u0005,\u0000\u0000:<\u0005\u00e3\u0000\u0000;=\u0003\u0012"+
		"\t\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=A\u0001\u0000"+
		"\u0000\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BF\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0005\u00a7\u0000"+
		"\u0000E9\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0005\u0001"+
		"\u0000\u0000\u0000GI\u0005*\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u00e3\u0000\u0000"+
		"K\u0007\u0001\u0000\u0000\u0000LM\u0003\n\u0005\u0000MQ\u0005*\u0000\u0000"+
		"NP\u0003\f\u0006\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TU\u0003\u0014\n\u0000U\t\u0001\u0000"+
		"\u0000\u0000VW\u0007\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000"+
		"Xd\u0003\u000e\u0007\u0000Yd\u0005\u008f\u0000\u0000Zd\u0005\u009b\u0000"+
		"\u0000[d\u0005\u0093\u0000\u0000\\d\u0005\u0094\u0000\u0000]d\u0005\u0090"+
		"\u0000\u0000^d\u0005\u0091\u0000\u0000_d\u0005\u0092\u0000\u0000`d\u0005"+
		"U\u0000\u0000ad\u0007\u0001\u0000\u0000bd\u0005\u00e3\u0000\u0000cX\u0001"+
		"\u0000\u0000\u0000cY\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000"+
		"c[\u0001\u0000\u0000\u0000c\\\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000"+
		"\u0000c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\r\u0001"+
		"\u0000\u0000\u0000ei\u0003\u0010\b\u0000fh\u0005X\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jt\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000lm\u0003\u0010\b\u0000mn\u0005\u0095\u0000\u0000no\u0005U\u0000"+
		"\u0000ot\u0001\u0000\u0000\u0000pq\u0003\n\u0005\u0000qr\u0003\u0010\b"+
		"\u0000rt\u0001\u0000\u0000\u0000se\u0001\u0000\u0000\u0000sl\u0001\u0000"+
		"\u0000\u0000sp\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000"+
		"uw\u0005X\u0000\u0000vx\u0003\u0016\u000b\u0000wv\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x\u0011\u0001\u0000\u0000\u0000y\u008a\u0005"+
		"|\u0000\u0000z\u008a\u0005}\u0000\u0000{\u008a\u0005~\u0000\u0000|\u008a"+
		"\u0005\u007f\u0000\u0000}\u008a\u0005\u0086\u0000\u0000~\u008a\u0005\u0084"+
		"\u0000\u0000\u007f\u008a\u0005)\u0000\u0000\u0080\u008a\u0005\"\u0000"+
		"\u0000\u0081\u008a\u0005$\u0000\u0000\u0082\u008a\u0005\u0083\u0000\u0000"+
		"\u0083\u008a\u0005\u008c\u0000\u0000\u0084\u008a\u0005\u008e\u0000\u0000"+
		"\u0085\u008a\u0005\u008d\u0000\u0000\u0086\u008a\u0005\u00a7\u0000\u0000"+
		"\u0087\u0088\u0005,\u0000\u0000\u0088\u008a\u0005\u00e3\u0000\u0000\u0089"+
		"y\u0001\u0000\u0000\u0000\u0089z\u0001\u0000\u0000\u0000\u0089{\u0001"+
		"\u0000\u0000\u0000\u0089|\u0001\u0000\u0000\u0000\u0089}\u0001\u0000\u0000"+
		"\u0000\u0089~\u0001\u0000\u0000\u0000\u0089\u007f\u0001\u0000\u0000\u0000"+
		"\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000"+
		"\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000"+
		"\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000"+
		"\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u008c\u0005%\u0000\u0000\u008c"+
		"\u0015\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0002\u0000\u0000\u008e"+
		"\u0017\u0001\u0000\u0000\u0000\u000f\u001b!\'-4<AEHQcisw\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}