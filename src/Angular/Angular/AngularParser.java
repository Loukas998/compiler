// Generated from C:/Users/LOQ/Documents/Github/compiler/src/Angular/AngularParser.g4 by ANTLR 4.13.2
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
public class AngularParser extends Parser {
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
		BitNot=49, Not=50, Multiply=51, Divide=52, Modulus=53, Power=54, NullCoalesce=55, 
		Hashtag=56, LeftShiftArithmetic=57, LessThan=58, MoreThan=59, LessThanEquals=60, 
		GreaterThanEquals=61, Equals=62, NotEquals=63, IdentityEquals=64, IdentityNotEquals=65, 
		BitAnd=66, BitXOr=67, BitOr=68, And=69, Or=70, MultiplyAssign=71, DivideAssign=72, 
		ModulusAssign=73, PlusAssign=74, MinusAssign=75, LeftShiftArithmeticAssign=76, 
		RightShiftArithmeticAssign=77, RightShiftLogicalAssign=78, BitAndAssign=79, 
		BitXorAssign=80, BitOrAssign=81, PowerAssign=82, NullishCoalescingAssign=83, 
		ARROW=84, HEXCHAR=85, NullLiteral=86, BooleanLiteral=87, DecimalLiteral=88, 
		BigDecimalIntegerLiteral=89, Break=90, Do=91, Instanceof=92, Typeof=93, 
		Case=94, Else=95, New=96, Var=97, Catch=98, Finally=99, Return=100, Void=101, 
		Continue=102, For=103, Switch=104, While=105, Debugger=106, Function_=107, 
		This=108, With=109, Default=110, If=111, Throw=112, Delete=113, In=114, 
		Try=115, As=116, From=117, ReadOnly=118, Async=119, Await=120, Yield=121, 
		YieldStar=122, Class=123, Enum=124, Extends=125, Super=126, Const=127, 
		Export=128, Import=129, Implements=130, Let=131, Private=132, Public=133, 
		Interface=134, Package=135, Protected=136, Static=137, Any=138, Number=139, 
		Never=140, Boolean=141, String=142, Int=143, Unique=144, Symbol=145, Undefined=146, 
		Object=147, Of=148, KeyOf=149, TypeAlias=150, Constructor=151, Namespace=152, 
		Require=153, Module=154, Declare=155, Abstract=156, Is=157, At=158, H1=159, 
		H2=160, H3=161, H4=162, H5=163, H6=164, AnchorTag=165, Div=166, ParagprahTag=167, 
		SpanTag=168, ImageTag=169, UnorderedListTag=170, OrderedListTag=171, ListItemTag=172, 
		LineBreakTag=173, StrongTextTag=174, Button=175, Input=176, Label=177, 
		Row=178, Column=179, Auto=180, Pointer=181, Border_Box=182, Center=183, 
		Solid=184, Display=185, Flex_Direction=186, Gap=187, Padding=188, Box_Size=189, 
		Flex=190, Border=191, Text_Align=192, Max_With=193, Height=194, Width=195, 
		Cursor=196, Transition=197, Color=198, Font_Size=199, Margin=200, Background_Color=201, 
		Textarea=202, PX=203, CM=204, MM=205, PT=206, PC=207, EM=208, REM=209, 
		EX=210, CH=211, VW=212, VH=213, VMIN=214, VMAX=215, CQW=216, CQH=217, 
		CQI=218, CQB=219, CQMIN=220, CQMAX=221, WhiteSpaces=222, Comment=223, 
		HtmlComment=224, CDataComment=225, ID=226, OpenTag=227, CloseTag=228, 
		OpenBraceHTML=229, CloseBraceHTML=230, DoubleOpenBraceHtml=231, DoubleCloseBraceHtml=232, 
		TEXT=233, WS=234;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_importStatement = 2, RULE_interface = 3, 
		RULE_variableNaming = 4, RULE_varType = 5, RULE_string = 6, RULE_value = 7, 
		RULE_componentDeclaration = 8, RULE_componentInfo = 9, RULE_genericStatement = 10, 
		RULE_classStructure = 11, RULE_variableDeclaration = 12, RULE_arrayDeclaration = 13, 
		RULE_arrayInfo = 14, RULE_functionDeclaration = 15, RULE_functionBody = 16, 
		RULE_arrowFunction = 17, RULE_functionCall = 18, RULE_assignStatement = 19, 
		RULE_thisorId = 20, RULE_returnStatement = 21, RULE_ifStatement = 22, 
		RULE_elseStatement = 23, RULE_logicalOp = 24, RULE_logicalStatement = 25, 
		RULE_forLoop = 26, RULE_forBody = 27, RULE_jsonObject = 28, RULE_attribute = 29, 
		RULE_ngForStatement = 30, RULE_ngIfStatement = 31, RULE_htmlTags = 32, 
		RULE_interpolation = 33, RULE_knownHtmlTags = 34, RULE_openTag = 35, RULE_closeTag = 36, 
		RULE_selfClosingTag = 37, RULE_cssElement = 38, RULE_selector = 39, RULE_simpleSelector = 40, 
		RULE_cssProperty = 41, RULE_css = 42, RULE_cssValue = 43, RULE_decimalLiteral_UNIT = 44, 
		RULE_decimalLiteralUnit = 45, RULE_tagName = 46, RULE_eos = 47, RULE_unit = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "importStatement", "interface", "variableNaming", 
			"varType", "string", "value", "componentDeclaration", "componentInfo", 
			"genericStatement", "classStructure", "variableDeclaration", "arrayDeclaration", 
			"arrayInfo", "functionDeclaration", "functionBody", "arrowFunction", 
			"functionCall", "assignStatement", "thisorId", "returnStatement", "ifStatement", 
			"elseStatement", "logicalOp", "logicalStatement", "forLoop", "forBody", 
			"jsonObject", "attribute", "ngForStatement", "ngIfStatement", "htmlTags", 
			"interpolation", "knownHtmlTags", "openTag", "closeTag", "selfClosingTag", 
			"cssElement", "selector", "simpleSelector", "cssProperty", "css", "cssValue", 
			"decimalLiteral_UNIT", "decimalLiteralUnit", "tagName", "eos", "unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", null, null, null, "'selector'", "'templateUrl'", 
			"'template'", "'styleUrls'", "'styleUrl'", "'styles'", "'imports'", "'standalone'", 
			null, "'get'", null, null, null, null, null, null, null, "'\"'", null, 
			null, null, null, null, null, "'['", "']'", "'('", "')'", null, null, 
			null, null, "';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", 
			"'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", 
			"'??'", "'#'", "'<<'", null, null, "'<='", "'>='", "'=='", "'!='", "'==='", 
			"'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", 
			"'??='", "'=>'", null, "'null'", null, null, null, "'break'", "'do'", 
			"'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", "'from'", "'readonly'", 
			"'async'", "'await'", "'yield'", "'yield*'", "'class'", "'enum'", "'extends'", 
			"'super'", "'const'", "'export'", "'import'", "'implements'", "'let'", 
			"'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'", 
			"'any'", "'number'", "'never'", "'boolean'", "'string'", "'int'", "'unique'", 
			"'symbol'", "'undefined'", "'object'", "'of'", "'keyof'", "'type'", "'constructor'", 
			"'namespace'", "'require'", "'module'", "'declare'", "'abstract'", "'is'", 
			"'@'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", "'a'", "'div'", 
			"'p'", "'span'", "'img'", "'ul'", "'ol'", "'li'", "'br'", "'strong'", 
			"'button'", "'input'", "'label'", "'row'", "'column'", "'auto'", "'pointer'", 
			"'border-box'", "'center'", "'solid'", "'display'", "'flex-direction'", 
			"'gap'", "'padding'", "'box-sizing'", "'flex'", "'border'", "'text-align'", 
			"'max-width'", "'height'", "'width'", "'cursor'", "'transition'", "'color'", 
			"'font-size'", "'margin'", "'background-color'", "'textarea'", "'px'", 
			"'cm'", "'mm'", "'pt'", "'pc'", "'em'", "'rem'", "'ex'", "'ch'", "'vw'", 
			"'vh'", "'vmin'", "'vmax'", "'cqw'", "'cqh'", "'cqi'", "'cqb'", "'cqmin'", 
			"'cqmax'"
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
			"Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", "LeftShiftArithmetic", 
			"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
			"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
			"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "HEXCHAR", "NullLiteral", 
			"BooleanLiteral", "DecimalLiteral", "BigDecimalIntegerLiteral", "Break", 
			"Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", "Catch", 
			"Finally", "Return", "Void", "Continue", "For", "Switch", "While", "Debugger", 
			"Function_", "This", "With", "Default", "If", "Throw", "Delete", "In", 
			"Try", "As", "From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", 
			"Class", "Enum", "Extends", "Super", "Const", "Export", "Import", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Any", "Number", "Never", "Boolean", "String", "Int", "Unique", "Symbol", 
			"Undefined", "Object", "Of", "KeyOf", "TypeAlias", "Constructor", "Namespace", 
			"Require", "Module", "Declare", "Abstract", "Is", "At", "H1", "H2", "H3", 
			"H4", "H5", "H6", "AnchorTag", "Div", "ParagprahTag", "SpanTag", "ImageTag", 
			"UnorderedListTag", "OrderedListTag", "ListItemTag", "LineBreakTag", 
			"StrongTextTag", "Button", "Input", "Label", "Row", "Column", "Auto", 
			"Pointer", "Border_Box", "Center", "Solid", "Display", "Flex_Direction", 
			"Gap", "Padding", "Box_Size", "Flex", "Border", "Text_Align", "Max_With", 
			"Height", "Width", "Cursor", "Transition", "Color", "Font_Size", "Margin", 
			"Background_Color", "Textarea", "PX", "CM", "MM", "PT", "PC", "EM", "REM", 
			"EX", "CH", "VW", "VH", "VMIN", "VMAX", "CQW", "CQH", "CQI", "CQB", "CQMIN", 
			"CQMAX", "WhiteSpaces", "Comment", "HtmlComment", "CDataComment", "ID", 
			"OpenTag", "CloseTag", "OpenBraceHTML", "CloseBraceHTML", "DoubleOpenBraceHtml", 
			"DoubleCloseBraceHtml", "TEXT", "WS"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				expression();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288259335941783552L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 332052549486725L) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & 17592186964767L) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 171L) != 0) );
			setState(103);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportContext extends ExpressionContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericContext extends ExpressionContext {
		public GenericStatementContext genericStatement() {
			return getRuleContext(GenericStatementContext.class,0);
		}
		public GenericContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclContext extends ExpressionContext {
		public InterfaceContext interface_() {
			return getRuleContext(InterfaceContext.class,0);
		}
		public InterfaceDeclContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ExpressionContext {
		public ClassStructureContext classStructure() {
			return getRuleContext(ClassStructureContext.class,0);
		}
		public ClassContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ExpressionContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ComponentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				importStatement();
				}
				break;
			case Interface:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				interface_();
				}
				break;
			case At:
				_localctx = new ComponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				componentDeclaration();
				}
				break;
			case Export:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				classStructure();
				}
				break;
			case SingleQuote:
			case DoubleQuote:
			case BackTickQuote:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case DoubleOpenBrace:
			case DoubleCloseBrace:
			case Comma:
			case QuestionMarkDot:
			case Ellipsis:
			case Dot:
			case LessThan:
			case NullLiteral:
			case DecimalLiteral:
			case Typeof:
			case Var:
			case Return:
			case For:
			case This:
			case If:
			case Const:
			case Let:
			case H1:
			case H2:
			case H3:
			case H4:
			case Div:
			case ParagprahTag:
			case ImageTag:
			case Button:
			case Input:
			case Label:
			case Textarea:
			case ID:
			case OpenTag:
			case OpenBraceHTML:
			case DoubleOpenBraceHtml:
			case TEXT:
				_localctx = new GenericContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				genericStatement();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode NgFor() { return getToken(AngularParser.NgFor, 0); }
		public TerminalNode NgIf() { return getToken(AngularParser.NgIf, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode Router() { return getToken(AngularParser.Router, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public TerminalNode As() { return getToken(AngularParser.As, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Import);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8206L) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(115);
				match(As);
				setState(116);
				match(ID);
				}
			}

			setState(119);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			match(From);
			setState(121);
			match(SingleQuote);
			setState(122);
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
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<VariableNamingContext> variableNaming() {
			return getRuleContexts(VariableNamingContext.class);
		}
		public VariableNamingContext variableNaming(int i) {
			return getRuleContext(VariableNamingContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(Interface);
			setState(125);
			match(ID);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 18253611009L) != 0) || _la==ID) {
				{
				{
				setState(127);
				variableNaming();
				setState(128);
				match(SemiColon);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
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
	public static class VariableNamingContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode BitOr() { return getToken(AngularParser.BitOr, 0); }
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public VariableNamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableNaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableNaming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableNaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNamingContext variableNaming() throws RecognitionException {
		VariableNamingContext _localctx = new VariableNamingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableNaming);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 18253611009L) != 0) || _la==ID) ) {
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
			setState(140);
			match(ID);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(141);
					match(Colon);
					setState(142);
					varType();
					}
					break;
				}
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(145);
					match(BitOr);
					setState(146);
					match(NullLiteral);
					}
					break;
				}
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
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Int() { return getToken(AngularParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public TerminalNode Any() { return getToken(AngularParser.Any, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 8108898254849L) != 0) || _la==ID) ) {
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public TerminalNode BackTickQuote() { return getToken(AngularParser.BackTickQuote, 0); }
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0)) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventValueContext extends ValueContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public EventValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableValueContext extends ValueContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public VariableValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueDotValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public ValueDotValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueDotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueDotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueDotValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisDotValueContext extends ValueContext {
		public ThisorIdContext thisorId() {
			return getRuleContext(ThisorIdContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ThisDotValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisDotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisDotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisDotValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullableValueContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(AngularParser.QuestionMark, 0); }
		public NullableValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNullableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNullableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNullableValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EllipsisValueContext extends ValueContext {
		public TerminalNode Ellipsis() { return getToken(AngularParser.Ellipsis, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EllipsisValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEllipsisValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEllipsisValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEllipsisValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeOfValueContext extends ValueContext {
		public TerminalNode Typeof() { return getToken(AngularParser.Typeof, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TypeOfValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeOfValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeOfValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeOfValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueAndValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public ValueAndValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueAndValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueAndValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueAndValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullableDotValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode QuestionMarkDot() { return getToken(AngularParser.QuestionMarkDot, 0); }
		public NullableDotValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNullableDotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNullableDotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNullableDotValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracedValueContext extends ValueContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public BracedValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueOrValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public ValueOrValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueOrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueOrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueOrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementValueContext extends ValueContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionStatementValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionStatementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionStatementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionStatementValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullValueContext extends ValueContext {
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallValueContext extends ValueContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIndexValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public ArrayIndexValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayIndexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayIndexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayIndexValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalNumberValueContext extends ValueContext {
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public DecimalNumberValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecimalNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecimalNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecimalNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionValueContext extends ValueContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueIdentityNotEqualsValueContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IdentityNotEquals() { return getToken(AngularParser.IdentityNotEquals, 0); }
		public ValueIdentityNotEqualsValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueIdentityNotEqualsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueIdentityNotEqualsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueIdentityNotEqualsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ValueContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInfoValueContext extends ValueContext {
		public ArrayInfoContext arrayInfo() {
			return getRuleContext(ArrayInfoContext.class,0);
		}
		public ArrayInfoValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayInfoValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayInfoValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayInfoValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonObjectValueContext extends ValueContext {
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public JsonObjectValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsonObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsonObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsonObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayInfoValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(156);
				arrayInfo();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new FunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				functionDeclaration();
				}
				break;
			case 4:
				{
				_localctx = new FunctionStatementValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				functionBody();
				}
				break;
			case 5:
				{
				_localctx = new JsonObjectValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				jsonObject();
				}
				break;
			case 6:
				{
				_localctx = new EventValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(OpenParen);
				setState(162);
				value(0);
				setState(163);
				match(CloseParen);
				}
				break;
			case 7:
				{
				_localctx = new EllipsisValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(Ellipsis);
				setState(166);
				value(8);
				}
				break;
			case 8:
				{
				_localctx = new TypeOfValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(Typeof);
				setState(168);
				value(7);
				}
				break;
			case 9:
				{
				_localctx = new BracedValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(OpenBrace);
				setState(170);
				value(0);
				setState(171);
				match(CloseBrace);
				}
				break;
			case 10:
				{
				_localctx = new ThisDotValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				thisorId();
				setState(174);
				value(5);
				}
				break;
			case 11:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				string();
				}
				break;
			case 12:
				{
				_localctx = new DecimalNumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(DecimalLiteral);
				}
				break;
			case 13:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(ID);
				}
				break;
			case 14:
				{
				_localctx = new NullValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(NullLiteral);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ValueDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(182);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(183);
						match(Dot);
						setState(184);
						value(16);
						}
						break;
					case 2:
						{
						_localctx = new NullableDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(185);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(186);
						match(QuestionMarkDot);
						setState(187);
						value(15);
						}
						break;
					case 3:
						{
						_localctx = new ValueOrValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(188);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(189);
						match(Or);
						setState(190);
						value(13);
						}
						break;
					case 4:
						{
						_localctx = new ValueAndValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(191);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(192);
						match(And);
						setState(193);
						value(12);
						}
						break;
					case 5:
						{
						_localctx = new ValueIdentityNotEqualsValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(194);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(195);
						match(IdentityNotEquals);
						setState(196);
						value(11);
						}
						break;
					case 6:
						{
						_localctx = new NullableValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(197);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(198);
						match(QuestionMark);
						}
						break;
					case 7:
						{
						_localctx = new ArrayIndexValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(199);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(200);
						match(OpenBracket);
						setState(201);
						value(0);
						setState(202);
						match(CloseBracket);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngularParser.At, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public List<ComponentInfoContext> componentInfo() {
			return getRuleContexts(ComponentInfoContext.class);
		}
		public ComponentInfoContext componentInfo(int i) {
			return getRuleContext(ComponentInfoContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(At);
			setState(210);
			match(Component);
			setState(211);
			match(OpenParen);
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			componentInfo();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(214);
				match(Comma);
				setState(215);
				componentInfo();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			match(CloseParen);
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
	public static class ComponentInfoContext extends ParserRuleContext {
		public ComponentInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentInfo; }
	 
		public ComponentInfoContext() { }
		public void copyFrom(ComponentInfoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TempUrlContext extends ComponentInfoContext {
		public TerminalNode TemplateUrl() { return getToken(AngularParser.TemplateUrl, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public TerminalNode BackTickQuote() { return getToken(AngularParser.BackTickQuote, 0); }
		public TempUrlContext(ComponentInfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTempUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTempUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTempUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ComponentInfoContext {
		public TerminalNode Selector() { return getToken(AngularParser.Selector, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public TerminalNode BackTickQuote() { return getToken(AngularParser.BackTickQuote, 0); }
		public SelectContext(ComponentInfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportssContext extends ComponentInfoContext {
		public TerminalNode Imports() { return getToken(AngularParser.Imports, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<TerminalNode> NgFor() { return getTokens(AngularParser.NgFor); }
		public TerminalNode NgFor(int i) {
			return getToken(AngularParser.NgFor, i);
		}
		public List<TerminalNode> NgIf() { return getTokens(AngularParser.NgIf); }
		public TerminalNode NgIf(int i) {
			return getToken(AngularParser.NgIf, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> Router() { return getTokens(AngularParser.Router); }
		public TerminalNode Router(int i) {
			return getToken(AngularParser.Router, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ImportssContext(ComponentInfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportss(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneStatusContext extends ComponentInfoContext {
		public TerminalNode Standalone() { return getToken(AngularParser.Standalone, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public StandaloneStatusContext(ComponentInfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneStatus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesContext extends ComponentInfoContext {
		public TerminalNode StyleUrls() { return getToken(AngularParser.StyleUrls, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(AngularParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(AngularParser.SingleQuote, i);
		}
		public List<TerminalNode> BackTickQuote() { return getTokens(AngularParser.BackTickQuote); }
		public TerminalNode BackTickQuote(int i) {
			return getToken(AngularParser.BackTickQuote, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public StylesContext(ComponentInfoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentInfoContext componentInfo() throws RecognitionException {
		ComponentInfoContext _localctx = new ComponentInfoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentInfo);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(Selector);
				setState(225);
				match(Colon);
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==BackTickQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TemplateUrl:
				_localctx = new TempUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(TemplateUrl);
				setState(228);
				match(Colon);
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==BackTickQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case StyleUrls:
				_localctx = new StylesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(StyleUrls);
				setState(231);
				match(Colon);
				setState(232);
				match(OpenBracket);
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==BackTickQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(234);
					match(Comma);
					setState(235);
					_la = _input.LA(1);
					if ( !(_la==SingleQuote || _la==BackTickQuote) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(CloseBracket);
				}
				break;
			case Standalone:
				_localctx = new StandaloneStatusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(Standalone);
				setState(243);
				match(Colon);
				setState(244);
				match(BooleanLiteral);
				}
				break;
			case Imports:
				_localctx = new ImportssContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(Imports);
				setState(246);
				match(Colon);
				setState(247);
				match(OpenBracket);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8204L) != 0) || _la==ID) {
					{
					setState(248);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8204L) != 0) || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(249);
						match(Comma);
						setState(250);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8204L) != 0) || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(258);
				match(CloseBracket);
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
	public static class GenericStatementContext extends ParserRuleContext {
		public GenericStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericStatement; }
	 
		public GenericStatementContext() { }
		public void copyFrom(GenericStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends GenericStatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagValueContext extends GenericStatementContext {
		public HtmlTagsContext htmlTags() {
			return getRuleContext(HtmlTagsContext.class,0);
		}
		public HtmlTagValueContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueTypeContext extends GenericStatementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueTypeContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSummoningContext extends GenericStatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionSummoningContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionSummoning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionSummoning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionSummoning(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends GenericStatementContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends GenericStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssElementStatementContext extends GenericStatementContext {
		public CssElementContext cssElement() {
			return getRuleContext(CssElementContext.class,0);
		}
		public CssElementStatementContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssElementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssElementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssElementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends GenericStatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends GenericStatementContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionStatementContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends GenericStatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public AssignContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends GenericStatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalStatementGenContext extends GenericStatementContext {
		public LogicalStatementContext logicalStatement() {
			return getRuleContext(LogicalStatementContext.class,0);
		}
		public LogicalStatementGenContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalStatementGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalStatementGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalStatementGen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclContext extends GenericStatementContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayDeclContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericStatementContext genericStatement() throws RecognitionException {
		GenericStatementContext _localctx = new GenericStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericStatement);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FunctionSummoningContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				functionCall();
				}
				break;
			case 2:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				functionDeclaration();
				}
				break;
			case 3:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				functionBody();
				}
				break;
			case 4:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				variableDeclaration();
				}
				break;
			case 5:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				arrayDeclaration();
				}
				break;
			case 6:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				assignStatement();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				returnStatement();
				}
				break;
			case 8:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				ifStatement();
				}
				break;
			case 9:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				forLoop();
				}
				break;
			case 10:
				_localctx = new LogicalStatementGenContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				logicalStatement();
				}
				break;
			case 11:
				_localctx = new HtmlTagValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				htmlTags();
				}
				break;
			case 12:
				_localctx = new CssElementStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(272);
				cssElement();
				}
				break;
			case 13:
				_localctx = new ValueTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(273);
				value(0);
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
	public static class ClassStructureContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<GenericStatementContext> genericStatement() {
			return getRuleContexts(GenericStatementContext.class);
		}
		public GenericStatementContext genericStatement(int i) {
			return getRuleContext(GenericStatementContext.class,i);
		}
		public TerminalNode Implements() { return getToken(AngularParser.Implements, 0); }
		public TerminalNode Extends() { return getToken(AngularParser.Extends, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(AngularParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(AngularParser.SemiColon, i);
		}
		public ClassStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStructureContext classStructure() throws RecognitionException {
		ClassStructureContext _localctx = new ClassStructureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classStructure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Export);
			setState(277);
			match(Class);
			setState(278);
			match(ID);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==Implements) {
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Implements) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				match(ID);
				}
			}

			setState(283);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288259335941783552L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 37383433242757L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 8796093482383L) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 171L) != 0)) {
				{
				{
				setState(284);
				genericStatement();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(285);
					match(SemiColon);
					}
				}

				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNamingContext variableNaming() {
			return getRuleContext(VariableNamingContext.class,0);
		}
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode BitOr() { return getToken(AngularParser.BitOr, 0); }
		public List<TerminalNode> NullLiteral() { return getTokens(AngularParser.NullLiteral); }
		public TerminalNode NullLiteral(int i) {
			return getToken(AngularParser.NullLiteral, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			variableNaming();
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(296);
				match(Assign);
				setState(297);
				value(0);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(298);
					match(BitOr);
					setState(299);
					match(NullLiteral);
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(300);
						match(Assign);
						setState(301);
						match(NullLiteral);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(308);
				match(SemiColon);
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public VariableNamingContext variableNaming() {
			return getRuleContext(VariableNamingContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<ArrayInfoContext> arrayInfo() {
			return getRuleContexts(ArrayInfoContext.class);
		}
		public ArrayInfoContext arrayInfo(int i) {
			return getRuleContext(ArrayInfoContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			variableNaming();
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(312);
				match(OpenBracket);
				setState(313);
				match(CloseBracket);
				}
				break;
			}
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(316);
				match(Assign);
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						arrayInfo();
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			}
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(325);
				match(SemiColon);
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
	public static class ArrayInfoContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInfoContext arrayInfo() throws RecognitionException {
		ArrayInfoContext _localctx = new ArrayInfoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayInfo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(OpenBracket);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8807803518976L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4194437L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(329);
				value(0);
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						match(Comma);
						setState(331);
						value(0);
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(337);
					match(Comma);
					}
				}

				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(CloseBracket);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ThisorIdContext thisorId() {
			return getRuleContext(ThisorIdContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(347);
				thisorId();
				}
				break;
			}
			setState(350);
			match(ID);
			setState(351);
			functionBody();
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<VariableNamingContext> variableNaming() {
			return getRuleContexts(VariableNamingContext.class);
		}
		public VariableNamingContext variableNaming(int i) {
			return getRuleContext(VariableNamingContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<GenericStatementContext> genericStatement() {
			return getRuleContexts(GenericStatementContext.class);
		}
		public GenericStatementContext genericStatement(int i) {
			return getRuleContext(GenericStatementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(OpenParen);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8807803518976L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 37383399540869L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(354);
					value(0);
					}
					break;
				case 2:
					{
					setState(355);
					variableNaming();
					}
					break;
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(358);
					match(Comma);
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(359);
						value(0);
						}
						break;
					case 2:
						{
						setState(360);
						variableNaming();
						}
						break;
					}
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(CloseParen);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(374);
				match(Colon);
				setState(375);
				varType();
				}
				break;
			}
			}
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(378);
					_la = _input.LA(1);
					if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288259335941783552L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 37383433242757L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 8796093482383L) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 171L) != 0)) {
						{
						{
						setState(379);
						genericStatement();
						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(385);
					_la = _input.LA(1);
					if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
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
				break;
			case 2:
				{
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(388);
					genericStatement();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(391);
				arrowFunction();
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			match(ARROW);
			setState(395);
			value(0);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ThisorIdContext thisorId() {
			return getRuleContext(ThisorIdContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(397);
				thisorId();
				}
				break;
			}
			setState(400);
			match(ID);
			setState(401);
			match(OpenParen);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8807803518976L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4194437L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(402);
				value(0);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(403);
					match(Comma);
					setState(404);
					value(0);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			match(CloseParen);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ThisorIdContext thisorId() {
			return getRuleContext(ThisorIdContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(417);
				thisorId();
				}
				break;
			}
			setState(420);
			match(ID);
			setState(421);
			match(Assign);
			setState(422);
			value(0);
			setState(423);
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
	public static class ThisorIdContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public ThisorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisorIdContext thisorId() throws RecognitionException {
		ThisorIdContext _localctx = new ThisorIdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_thisorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==This || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(426);
			match(Dot);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ThisorIdContext thisorId() {
			return getRuleContext(ThisorIdContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(Return);
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(429);
				thisorId();
				}
				break;
			}
			setState(432);
			value(0);
			setState(433);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public List<LogicalStatementContext> logicalStatement() {
			return getRuleContexts(LogicalStatementContext.class);
		}
		public LogicalStatementContext logicalStatement(int i) {
			return getRuleContext(LogicalStatementContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public List<GenericStatementContext> genericStatement() {
			return getRuleContexts(GenericStatementContext.class);
		}
		public GenericStatementContext genericStatement(int i) {
			return getRuleContext(GenericStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(If);
			setState(436);
			match(OpenParen);
			setState(437);
			logicalStatement();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 2047L) != 0)) {
				{
				{
				setState(438);
				logicalOp();
				setState(439);
				logicalStatement();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(CloseParen);
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288259335941783552L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 37383433242757L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 8796093482383L) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 171L) != 0)) {
				{
				{
				setState(448);
				genericStatement();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(455);
				elseStatement();
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
	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	 
		public ElseStatementContext() { }
		public void copyFrom(ElseStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleLineElseContext extends ElseStatementContext {
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public GenericStatementContext genericStatement() {
			return getRuleContext(GenericStatementContext.class,0);
		}
		public SingleLineElseContext(ElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleLineElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleLineElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleLineElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleLineElseContext extends ElseStatementContext {
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<GenericStatementContext> genericStatement() {
			return getRuleContexts(GenericStatementContext.class);
		}
		public GenericStatementContext genericStatement(int i) {
			return getRuleContext(GenericStatementContext.class,i);
		}
		public MultipleLineElseContext(ElseStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultipleLineElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultipleLineElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultipleLineElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseStatement);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new SingleLineElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(458);
				match(Else);
				setState(459);
				genericStatement();
				}
				}
				break;
			case 2:
				_localctx = new MultipleLineElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(460);
				match(Else);
				{
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288259335941783552L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 37383433242757L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 8796093482383L) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 171L) != 0)) {
					{
					{
					setState(462);
					genericStatement();
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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
	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode LessThanEquals() { return getToken(AngularParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(AngularParser.GreaterThanEquals, 0); }
		public TerminalNode Equals() { return getToken(AngularParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(AngularParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(AngularParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(AngularParser.IdentityNotEquals, 0); }
		public TerminalNode BitAnd() { return getToken(AngularParser.BitAnd, 0); }
		public TerminalNode BitXOr() { return getToken(AngularParser.BitXOr, 0); }
		public TerminalNode BitOr() { return getToken(AngularParser.BitOr, 0); }
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 2047L) != 0)) ) {
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
	public static class LogicalStatementContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public LogicalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalStatementContext logicalStatement() throws RecognitionException {
		LogicalStatementContext _localctx = new LogicalStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(473);
			value(0);
			{
			setState(474);
			logicalOp();
			}
			setState(475);
			value(0);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode Of() { return getToken(AngularParser.Of, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(For);
			setState(478);
			match(OpenParen);
			setState(479);
			match(Let);
			setState(480);
			match(ID);
			setState(481);
			match(Of);
			setState(482);
			match(ID);
			setState(483);
			match(CloseParen);
			setState(484);
			forBody();
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
	public static class ForBodyContext extends ParserRuleContext {
		public ForBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBody; }
	 
		public ForBodyContext() { }
		public void copyFrom(ForBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleLinesForLoopContext extends ForBodyContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<GenericStatementContext> genericStatement() {
			return getRuleContexts(GenericStatementContext.class);
		}
		public GenericStatementContext genericStatement(int i) {
			return getRuleContext(GenericStatementContext.class,i);
		}
		public MultipleLinesForLoopContext(ForBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultipleLinesForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultipleLinesForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultipleLinesForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleLineForLoopContext extends ForBodyContext {
		public GenericStatementContext genericStatement() {
			return getRuleContext(GenericStatementContext.class,0);
		}
		public SingleLineForLoopContext(ForBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleLineForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleLineForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleLineForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBodyContext forBody() throws RecognitionException {
		ForBodyContext _localctx = new ForBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forBody);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new SingleLineForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				genericStatement();
				}
				break;
			case 2:
				_localctx = new MultipleLinesForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(488);
					genericStatement();
					}
					}
					setState(491); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288259335941783552L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 37383433242757L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 8796093482383L) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & 171L) != 0) );
				setState(493);
				_la = _input.LA(1);
				if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
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
	public static class JsonObjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode OpenBraceHTML() { return getToken(AngularParser.OpenBraceHTML, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseBraceHTML() { return getToken(AngularParser.CloseBraceHTML, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jsonObject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(498);
			match(ID);
			setState(499);
			match(Colon);
			setState(500);
			value(0);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501);
					match(Comma);
					setState(502);
					match(ID);
					setState(503);
					match(Colon);
					setState(504);
					value(0);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(510);
				match(Comma);
				}
			}

			setState(513);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenParenAttributeContext extends AttributeContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public OpenParenAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenParenAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenParenAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenParenAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfContext extends AttributeContext {
		public NgIfStatementContext ngIfStatement() {
			return getRuleContext(NgIfStatementContext.class,0);
		}
		public NgIfContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuotedAttributeContext extends AttributeContext {
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public DoubleQuotedAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoubleQuotedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoubleQuotedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoubleQuotedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenBracketAttributeContext extends AttributeContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode TripleQuote() { return getToken(AngularParser.TripleQuote, 0); }
		public OpenBracketAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenBracketAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenBracketAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenBracketAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForContext extends AttributeContext {
		public NgForStatementContext ngForStatement() {
			return getRuleContext(NgForStatementContext.class,0);
		}
		public NgForContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgModelAttributeContext extends AttributeContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode NgModel() { return getToken(AngularParser.NgModel, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public NgModelAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModelAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModelAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModelAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attribute);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new NgForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				ngForStatement();
				}
				break;
			case 2:
				_localctx = new NgIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				ngIfStatement();
				}
				break;
			case 3:
				_localctx = new DoubleQuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(518);
				match(Assign);
				setState(519);
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
			case 4:
				_localctx = new OpenBracketAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(OpenBracket);
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				match(CloseBracket);
				setState(523);
				match(Assign);
				setState(524);
				_la = _input.LA(1);
				if ( !(_la==TripleQuote || _la==DoubleQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				_localctx = new OpenParenAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				match(OpenParen);
				setState(526);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(527);
				match(CloseParen);
				setState(528);
				match(Assign);
				setState(529);
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
			case 6:
				_localctx = new NgModelAttributeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				match(OpenBracket);
				setState(531);
				match(OpenParen);
				setState(532);
				match(NgModel);
				setState(533);
				match(CloseParen);
				setState(534);
				match(CloseBracket);
				setState(535);
				match(Assign);
				setState(536);
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
	public static class NgForStatementContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode NgFor() { return getToken(AngularParser.NgFor, 0); }
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public List<TerminalNode> Let() { return getTokens(AngularParser.Let); }
		public TerminalNode Let(int i) {
			return getToken(AngularParser.Let, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode Of() { return getToken(AngularParser.Of, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public NgForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForStatementContext ngForStatement() throws RecognitionException {
		NgForStatementContext _localctx = new NgForStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ngForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(Multiply);
			setState(540);
			match(NgFor);
			setState(541);
			match(Assign);
			{
			setState(542);
			match(Let);
			setState(543);
			match(ID);
			setState(544);
			match(Of);
			setState(545);
			match(ID);
			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(547);
				match(SemiColon);
				}
			}

			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let) {
				{
				setState(550);
				match(Let);
				setState(551);
				match(ID);
				setState(552);
				match(Assign);
				setState(553);
				match(ID);
				}
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
	public static class NgIfStatementContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode NgIf() { return getToken(AngularParser.NgIf, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public LogicalStatementContext logicalStatement() {
			return getRuleContext(LogicalStatementContext.class,0);
		}
		public NgIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfStatementContext ngIfStatement() throws RecognitionException {
		NgIfStatementContext _localctx = new NgIfStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ngIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(Multiply);
			setState(557);
			match(NgIf);
			setState(558);
			match(Assign);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(559);
				match(ID);
				}
				break;
			case 2:
				{
				setState(560);
				logicalStatement();
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
	public static class HtmlTagsContext extends ParserRuleContext {
		public HtmlTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTags; }
	 
		public HtmlTagsContext() { }
		public void copyFrom(HtmlTagsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PairedTagContext extends HtmlTagsContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<HtmlTagsContext> htmlTags() {
			return getRuleContexts(HtmlTagsContext.class);
		}
		public HtmlTagsContext htmlTags(int i) {
			return getRuleContext(HtmlTagsContext.class,i);
		}
		public PairedTagContext(HtmlTagsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPairedTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPairedTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPairedTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlInterpolationContext extends HtmlTagsContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public HtmlInterpolationContext(HtmlTagsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalHtmlTextContext extends HtmlTagsContext {
		public TerminalNode TEXT() { return getToken(AngularParser.TEXT, 0); }
		public NormalHtmlTextContext(HtmlTagsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnpairedTagContext extends HtmlTagsContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public UnpairedTagContext(HtmlTagsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnpairedTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnpairedTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnpairedTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagsContext htmlTags() throws RecognitionException {
		HtmlTagsContext _localctx = new HtmlTagsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_htmlTags);
		try {
			int _alt;
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new PairedTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				openTag();
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(564);
						htmlTags();
						}
						} 
					}
					setState(569);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(570);
				closeTag();
				}
				break;
			case 2:
				_localctx = new UnpairedTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new NormalHtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(TEXT);
				}
				break;
			case 4:
				_localctx = new HtmlInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				interpolation();
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode DoubleOpenBrace() { return getToken(AngularParser.DoubleOpenBrace, 0); }
		public TerminalNode DoubleOpenBraceHtml() { return getToken(AngularParser.DoubleOpenBraceHtml, 0); }
		public TerminalNode DoubleCloseBrace() { return getToken(AngularParser.DoubleCloseBrace, 0); }
		public TerminalNode DoubleCloseBraceHtml() { return getToken(AngularParser.DoubleCloseBraceHtml, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !(_la==DoubleOpenBrace || _la==DoubleOpenBraceHtml) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8807803518976L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4194437L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(578);
				value(0);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584);
			_la = _input.LA(1);
			if ( !(_la==DoubleCloseBrace || _la==DoubleCloseBraceHtml) ) {
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
	public static class KnownHtmlTagsContext extends ParserRuleContext {
		public TerminalNode H1() { return getToken(AngularParser.H1, 0); }
		public TerminalNode H2() { return getToken(AngularParser.H2, 0); }
		public TerminalNode H3() { return getToken(AngularParser.H3, 0); }
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public TerminalNode H5() { return getToken(AngularParser.H5, 0); }
		public TerminalNode H6() { return getToken(AngularParser.H6, 0); }
		public TerminalNode AnchorTag() { return getToken(AngularParser.AnchorTag, 0); }
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public TerminalNode ParagprahTag() { return getToken(AngularParser.ParagprahTag, 0); }
		public TerminalNode SpanTag() { return getToken(AngularParser.SpanTag, 0); }
		public TerminalNode ImageTag() { return getToken(AngularParser.ImageTag, 0); }
		public TerminalNode UnorderedListTag() { return getToken(AngularParser.UnorderedListTag, 0); }
		public TerminalNode OrderedListTag() { return getToken(AngularParser.OrderedListTag, 0); }
		public TerminalNode ListItemTag() { return getToken(AngularParser.ListItemTag, 0); }
		public TerminalNode LineBreakTag() { return getToken(AngularParser.LineBreakTag, 0); }
		public TerminalNode Button() { return getToken(AngularParser.Button, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode StrongTextTag() { return getToken(AngularParser.StrongTextTag, 0); }
		public KnownHtmlTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownHtmlTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKnownHtmlTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKnownHtmlTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKnownHtmlTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownHtmlTagsContext knownHtmlTags() throws RecognitionException {
		KnownHtmlTagsContext _localctx = new KnownHtmlTagsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_knownHtmlTags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_la = _input.LA(1);
			if ( !(((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 262143L) != 0)) ) {
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
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
		public KnownHtmlTagsContext knownHtmlTags() {
			return getRuleContext(KnownHtmlTagsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
			case H2:
			case H3:
			case H4:
			case H5:
			case H6:
			case AnchorTag:
			case Div:
			case ParagprahTag:
			case SpanTag:
			case ImageTag:
			case UnorderedListTag:
			case OrderedListTag:
			case ListItemTag:
			case LineBreakTag:
			case StrongTextTag:
			case Button:
			case Input:
				{
				setState(589);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(590);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251802498039808L) != 0) || _la==Class || _la==ID) {
				{
				{
				setState(593);
				attribute();
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
			_la = _input.LA(1);
			if ( !(_la==MoreThan || _la==CloseTag) ) {
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
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
		public KnownHtmlTagsContext knownHtmlTags() {
			return getRuleContext(KnownHtmlTagsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(602);
			match(Divide);
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
			case H2:
			case H3:
			case H4:
			case H5:
			case H6:
			case AnchorTag:
			case Div:
			case ParagprahTag:
			case SpanTag:
			case ImageTag:
			case UnorderedListTag:
			case OrderedListTag:
			case ListItemTag:
			case LineBreakTag:
			case StrongTextTag:
			case Button:
			case Input:
				{
				setState(603);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(604);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(607);
			_la = _input.LA(1);
			if ( !(_la==MoreThan || _la==CloseTag) ) {
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
		public KnownHtmlTagsContext knownHtmlTags() {
			return getRuleContext(KnownHtmlTagsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
			case H2:
			case H3:
			case H4:
			case H5:
			case H6:
			case AnchorTag:
			case Div:
			case ParagprahTag:
			case SpanTag:
			case ImageTag:
			case UnorderedListTag:
			case OrderedListTag:
			case ListItemTag:
			case LineBreakTag:
			case StrongTextTag:
			case Button:
			case Input:
				{
				setState(610);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(611);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251802498039808L) != 0) || _la==Class || _la==ID) {
				{
				{
				setState(614);
				attribute();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			match(Divide);
			setState(621);
			_la = _input.LA(1);
			if ( !(_la==MoreThan || _la==CloseTag) ) {
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
	public static class CssElementContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssElementContext cssElement() throws RecognitionException {
		CssElementContext _localctx = new CssElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(623);
				tagName();
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(626);
				match(Comma);
				setState(627);
				tagName();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Textarea) {
				{
				{
				setState(633);
				selector();
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(OpenBrace);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & 131071L) != 0)) {
				{
				{
				setState(640);
				cssProperty();
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(646);
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
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public TerminalNode Textarea() { return getToken(AngularParser.Textarea, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selector);
		int _la;
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(648);
				match(Dot);
				}
				setState(649);
				match(ID);
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(650);
					tagName();
					}
					break;
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon || _la==ID) {
					{
					{
					setState(653);
					simpleSelector();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
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
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(662);
				match(Colon);
				}
			}

			setState(665);
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
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			css();
			setState(668);
			match(Colon);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & -8070450532247928827L) != 0) || ((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & 281474993487807L) != 0)) {
				{
				{
				setState(669);
				cssValue();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
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
		public TerminalNode Display() { return getToken(AngularParser.Display, 0); }
		public TerminalNode Flex_Direction() { return getToken(AngularParser.Flex_Direction, 0); }
		public TerminalNode Gap() { return getToken(AngularParser.Gap, 0); }
		public TerminalNode Padding() { return getToken(AngularParser.Padding, 0); }
		public TerminalNode Box_Size() { return getToken(AngularParser.Box_Size, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Border() { return getToken(AngularParser.Border, 0); }
		public TerminalNode Text_Align() { return getToken(AngularParser.Text_Align, 0); }
		public TerminalNode Max_With() { return getToken(AngularParser.Max_With, 0); }
		public TerminalNode Height() { return getToken(AngularParser.Height, 0); }
		public TerminalNode Cursor() { return getToken(AngularParser.Cursor, 0); }
		public TerminalNode Transition() { return getToken(AngularParser.Transition, 0); }
		public TerminalNode Background_Color() { return getToken(AngularParser.Background_Color, 0); }
		public TerminalNode Margin() { return getToken(AngularParser.Margin, 0); }
		public TerminalNode Font_Size() { return getToken(AngularParser.Font_Size, 0); }
		public TerminalNode Color() { return getToken(AngularParser.Color, 0); }
		public TerminalNode Width() { return getToken(AngularParser.Width, 0); }
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & 131071L) != 0)) ) {
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
		public TerminalNode Row() { return getToken(AngularParser.Row, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Border_Box() { return getToken(AngularParser.Border_Box, 0); }
		public TerminalNode Center() { return getToken(AngularParser.Center, 0); }
		public TerminalNode Column() { return getToken(AngularParser.Column, 0); }
		public TerminalNode Auto() { return getToken(AngularParser.Auto, 0); }
		public TerminalNode Pointer() { return getToken(AngularParser.Pointer, 0); }
		public TerminalNode HEXCHAR() { return getToken(AngularParser.HEXCHAR, 0); }
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cssValue);
		int _la;
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				decimalLiteral_UNIT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(Row);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				match(Flex);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				match(Border_Box);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(683);
				match(Center);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(684);
				match(Column);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(685);
				match(Auto);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(686);
				match(Pointer);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(687);
				match(HEXCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(688);
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
				setState(689);
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
		public List<TerminalNode> DecimalLiteral() { return getTokens(AngularParser.DecimalLiteral); }
		public TerminalNode DecimalLiteral(int i) {
			return getToken(AngularParser.DecimalLiteral, i);
		}
		public UnitNumberListContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitNumberList(this);
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBackgroundColorUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBackgroundColorUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBackgroundColorUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitSolidColorContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public TerminalNode Solid() { return getToken(AngularParser.Solid, 0); }
		public TerminalNode HEXCHAR() { return getToken(AngularParser.HEXCHAR, 0); }
		public UnitSolidColorContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitSolidColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitSolidColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitSolidColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteral_UNITContext decimalLiteral_UNIT() throws RecognitionException {
		DecimalLiteral_UNITContext _localctx = new DecimalLiteral_UNITContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_decimalLiteral_UNIT);
		try {
			int _alt;
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new UnitNumberListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				decimalLiteralUnit();
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(693);
						match(DecimalLiteral);
						}
						} 
					}
					setState(698);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new UnitSolidColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				decimalLiteralUnit();
				setState(700);
				match(Solid);
				setState(701);
				match(HEXCHAR);
				}
				break;
			case 3:
				_localctx = new BackgroundColorUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				css();
				setState(704);
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
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public DecimalLiteralUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteralUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecimalLiteralUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecimalLiteralUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecimalLiteralUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralUnitContext decimalLiteralUnit() throws RecognitionException {
		DecimalLiteralUnitContext _localctx = new DecimalLiteralUnitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_decimalLiteralUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(DecimalLiteral);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(709);
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
		public TerminalNode H1() { return getToken(AngularParser.H1, 0); }
		public TerminalNode H2() { return getToken(AngularParser.H2, 0); }
		public TerminalNode H3() { return getToken(AngularParser.H3, 0); }
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public TerminalNode ImageTag() { return getToken(AngularParser.ImageTag, 0); }
		public TerminalNode ParagprahTag() { return getToken(AngularParser.ParagprahTag, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(AngularParser.QuestionMarkDot, 0); }
		public TerminalNode DoubleOpenBrace() { return getToken(AngularParser.DoubleOpenBrace, 0); }
		public TerminalNode DoubleCloseBrace() { return getToken(AngularParser.DoubleCloseBrace, 0); }
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public TerminalNode Button() { return getToken(AngularParser.Button, 0); }
		public TerminalNode Label() { return getToken(AngularParser.Label, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode Textarea() { return getToken(AngularParser.Textarea, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tagName);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(H1);
				}
				break;
			case H2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				match(H2);
				}
				break;
			case H3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				match(H3);
				}
				break;
			case H4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				match(H4);
				}
				break;
			case ImageTag:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				match(ImageTag);
				}
				break;
			case ParagprahTag:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
				match(ParagprahTag);
				}
				break;
			case QuestionMarkDot:
				enterOuterAlt(_localctx, 7);
				{
				setState(718);
				match(QuestionMarkDot);
				}
				break;
			case DoubleOpenBrace:
				enterOuterAlt(_localctx, 8);
				{
				setState(719);
				match(DoubleOpenBrace);
				}
				break;
			case DoubleCloseBrace:
				enterOuterAlt(_localctx, 9);
				{
				setState(720);
				match(DoubleCloseBrace);
				}
				break;
			case Div:
				enterOuterAlt(_localctx, 10);
				{
				setState(721);
				match(Div);
				}
				break;
			case Button:
				enterOuterAlt(_localctx, 11);
				{
				setState(722);
				match(Button);
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 12);
				{
				setState(723);
				match(Label);
				}
				break;
			case Input:
				enterOuterAlt(_localctx, 13);
				{
				setState(724);
				match(Input);
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 14);
				{
				setState(725);
				match(Textarea);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 15);
				{
				setState(726);
				match(Dot);
				setState(727);
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
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
		public TerminalNode PX() { return getToken(AngularParser.PX, 0); }
		public TerminalNode CM() { return getToken(AngularParser.CM, 0); }
		public TerminalNode MM() { return getToken(AngularParser.MM, 0); }
		public TerminalNode In() { return getToken(AngularParser.In, 0); }
		public TerminalNode PT() { return getToken(AngularParser.PT, 0); }
		public TerminalNode PC() { return getToken(AngularParser.PC, 0); }
		public TerminalNode EM() { return getToken(AngularParser.EM, 0); }
		public TerminalNode REM() { return getToken(AngularParser.REM, 0); }
		public TerminalNode Modulus() { return getToken(AngularParser.Modulus, 0); }
		public TerminalNode EX() { return getToken(AngularParser.EX, 0); }
		public TerminalNode CH() { return getToken(AngularParser.CH, 0); }
		public TerminalNode VW() { return getToken(AngularParser.VW, 0); }
		public TerminalNode VH() { return getToken(AngularParser.VH, 0); }
		public TerminalNode VMIN() { return getToken(AngularParser.VMIN, 0); }
		public TerminalNode VMAX() { return getToken(AngularParser.VMAX, 0); }
		public TerminalNode CQW() { return getToken(AngularParser.CQW, 0); }
		public TerminalNode CQH() { return getToken(AngularParser.CQH, 0); }
		public TerminalNode CQI() { return getToken(AngularParser.CQI, 0); }
		public TerminalNode CQB() { return getToken(AngularParser.CQB, 0); }
		public TerminalNode CQMIN() { return getToken(AngularParser.CQMIN, 0); }
		public TerminalNode CQMAX() { return getToken(AngularParser.CQMAX, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_la = _input.LA(1);
			if ( !(_la==Modulus || _la==In || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & 8912895L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ea\u02df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000"+
		"\u0004\u0000d\b\u0000\u000b\u0000\f\u0000e\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001o\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002v\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0083\b\u0003\n\u0003\f\u0003\u0086\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0003\u0004\u008b\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0090\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0094\b\u0004\u0003\u0004\u0096\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b5\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00cd\b\u0007\n\u0007\f\u0007"+
		"\u00d0\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00d9\b\b\n\b\f\b\u00dc\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00ed\b\t\n\t\f\t\u00f0\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00fc"+
		"\b\t\n\t\f\t\u00ff\t\t\u0003\t\u0101\b\t\u0001\t\u0003\t\u0104\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0113\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011a\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u011f\b\u000b\u0005\u000b\u0121\b\u000b"+
		"\n\u000b\f\u000b\u0124\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u012f\b\f\u0003\f\u0131"+
		"\b\f\u0003\f\u0133\b\f\u0001\f\u0003\f\u0136\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u013b\b\r\u0001\r\u0001\r\u0005\r\u013f\b\r\n\r\f\r\u0142\t"+
		"\r\u0003\r\u0144\b\r\u0001\r\u0003\r\u0147\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u014d\b\u000e\n\u000e\f\u000e\u0150"+
		"\t\u000e\u0001\u000e\u0003\u000e\u0153\b\u000e\u0005\u000e\u0155\b\u000e"+
		"\n\u000e\f\u000e\u0158\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003"+
		"\u000f\u015d\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0165\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u016a\b\u0010\u0005\u0010\u016c\b\u0010\n\u0010\f\u0010"+
		"\u016f\t\u0010\u0005\u0010\u0171\b\u0010\n\u0010\f\u0010\u0174\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0179\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u017d\b\u0010\n\u0010\f\u0010\u0180\t\u0010\u0001"+
		"\u0010\u0003\u0010\u0183\b\u0010\u0001\u0010\u0003\u0010\u0186\b\u0010"+
		"\u0001\u0010\u0003\u0010\u0189\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0003\u0012\u018f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0196\b\u0012\n\u0012\f\u0012\u0199"+
		"\t\u0012\u0005\u0012\u019b\b\u0012\n\u0012\f\u0012\u019e\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u01a3\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01af\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01ba\b\u0016\n\u0016\f\u0016\u01bd\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01c2\b\u0016\n\u0016"+
		"\f\u0016\u01c5\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c9\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u01d0\b\u0017\n\u0017\f\u0017\u01d3\t\u0017\u0001\u0017\u0003\u0017\u01d6"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u01ea\b\u001b\u000b\u001b\f\u001b\u01eb\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01f0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01fa\b\u001c\n\u001c\f\u001c\u01fd\t\u001c\u0001\u001c\u0003\u001c\u0200"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u021a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0225\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u022b\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0232\b\u001f\u0001 \u0001 \u0005 \u0236\b \n \f \u0239"+
		"\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0240\b \u0001!\u0001!\u0005"+
		"!\u0244\b!\n!\f!\u0247\t!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0003#\u0250\b#\u0001#\u0005#\u0253\b#\n#\f#\u0256\t#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0003$\u025e\b$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0003%\u0265\b%\u0001%\u0005%\u0268\b%\n%\f%\u026b\t%\u0001%"+
		"\u0001%\u0001%\u0001&\u0003&\u0271\b&\u0001&\u0001&\u0005&\u0275\b&\n"+
		"&\f&\u0278\t&\u0001&\u0005&\u027b\b&\n&\f&\u027e\t&\u0001&\u0001&\u0005"+
		"&\u0282\b&\n&\f&\u0285\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u028c\b\'\u0001\'\u0005\'\u028f\b\'\n\'\f\'\u0292\t\'\u0001\'\u0003"+
		"\'\u0295\b\'\u0001(\u0003(\u0298\b(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0005)\u029f\b)\n)\f)\u02a2\t)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u02b3\b+\u0001,\u0001,\u0005,\u02b7\b,\n,\f,\u02ba\t,\u0001,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02c3\b,\u0001-\u0001-\u0003"+
		"-\u02c7\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02d9\b.\u0001"+
		"/\u0001/\u00010\u00010\u00010\u0000\u0001\u000e1\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0015\u0002\u0000!!\u00e5\u00e5\u0003"+
		"\u0000\u0001\u0003\r\r\u00e2\u00e2\u0002\u0000##\u00e6\u00e6\u0004\u0000"+
		"aa\u007f\u007f\u0083\u0083\u00e2\u00e2\u0004\u0000ee\u008a\u008b\u008d"+
		"\u008f\u00e2\u00e2\u0002\u0000\u0019\u0019\u001b\u001c\u0002\u0000\u0019"+
		"\u0019\u001c\u001c\u0003\u0000\u0002\u0003\r\r\u00e2\u00e2\u0002\u0000"+
		"}}\u0082\u0082\u0002\u0000ll\u00e2\u00e2\u0001\u0000<F\u0002\u0000{{\u00e2"+
		"\u00e2\u0002\u0000\u0019\u0019\u001b\u001b\u0001\u0000\u001a\u001b\u0002"+
		"\u0000\"\"\u00e7\u00e7\u0002\u0000$$\u00e8\u00e8\u0001\u0000\u009f\u00b0"+
		"\u0002\u0000::\u00e3\u00e3\u0002\u0000;;\u00e4\u00e4\u0001\u0000\u00b9"+
		"\u00c9\u0004\u000055rr\u00cb\u00dd\u00e2\u00e2\u033e\u0000c\u0001\u0000"+
		"\u0000\u0000\u0002n\u0001\u0000\u0000\u0000\u0004p\u0001\u0000\u0000\u0000"+
		"\u0006|\u0001\u0000\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n\u0097"+
		"\u0001\u0000\u0000\u0000\f\u0099\u0001\u0000\u0000\u0000\u000e\u00b4\u0001"+
		"\u0000\u0000\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u0103\u0001"+
		"\u0000\u0000\u0000\u0014\u0112\u0001\u0000\u0000\u0000\u0016\u0114\u0001"+
		"\u0000\u0000\u0000\u0018\u0127\u0001\u0000\u0000\u0000\u001a\u0137\u0001"+
		"\u0000\u0000\u0000\u001c\u0148\u0001\u0000\u0000\u0000\u001e\u015c\u0001"+
		"\u0000\u0000\u0000 \u0161\u0001\u0000\u0000\u0000\"\u018a\u0001\u0000"+
		"\u0000\u0000$\u018e\u0001\u0000\u0000\u0000&\u01a2\u0001\u0000\u0000\u0000"+
		"(\u01a9\u0001\u0000\u0000\u0000*\u01ac\u0001\u0000\u0000\u0000,\u01b3"+
		"\u0001\u0000\u0000\u0000.\u01d5\u0001\u0000\u0000\u00000\u01d7\u0001\u0000"+
		"\u0000\u00002\u01d9\u0001\u0000\u0000\u00004\u01dd\u0001\u0000\u0000\u0000"+
		"6\u01ef\u0001\u0000\u0000\u00008\u01f1\u0001\u0000\u0000\u0000:\u0219"+
		"\u0001\u0000\u0000\u0000<\u021b\u0001\u0000\u0000\u0000>\u022c\u0001\u0000"+
		"\u0000\u0000@\u023f\u0001\u0000\u0000\u0000B\u0241\u0001\u0000\u0000\u0000"+
		"D\u024a\u0001\u0000\u0000\u0000F\u024c\u0001\u0000\u0000\u0000H\u0259"+
		"\u0001\u0000\u0000\u0000J\u0261\u0001\u0000\u0000\u0000L\u0270\u0001\u0000"+
		"\u0000\u0000N\u0294\u0001\u0000\u0000\u0000P\u0297\u0001\u0000\u0000\u0000"+
		"R\u029b\u0001\u0000\u0000\u0000T\u02a5\u0001\u0000\u0000\u0000V\u02b2"+
		"\u0001\u0000\u0000\u0000X\u02c2\u0001\u0000\u0000\u0000Z\u02c4\u0001\u0000"+
		"\u0000\u0000\\\u02d8\u0001\u0000\u0000\u0000^\u02da\u0001\u0000\u0000"+
		"\u0000`\u02dc\u0001\u0000\u0000\u0000bd\u0003\u0002\u0001\u0000cb\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u0000\u0000"+
		"\u0001h\u0001\u0001\u0000\u0000\u0000io\u0003\u0004\u0002\u0000jo\u0003"+
		"\u0006\u0003\u0000ko\u0003\u0010\b\u0000lo\u0003\u0016\u000b\u0000mo\u0003"+
		"\u0014\n\u0000ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"o\u0003\u0001\u0000\u0000\u0000pq\u0005\u0081\u0000\u0000qr\u0007\u0000"+
		"\u0000\u0000ru\u0007\u0001\u0000\u0000st\u0005t\u0000\u0000tv\u0005\u00e2"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0007\u0002\u0000\u0000xy\u0005u\u0000\u0000yz\u0005"+
		"\u0019\u0000\u0000z{\u0005%\u0000\u0000{\u0005\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0086\u0000\u0000}~\u0005\u00e2\u0000\u0000~\u0084\u0007\u0000"+
		"\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005%\u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0002\u0000"+
		"\u0000\u0088\u0007\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0003\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0095\u0005\u00e2\u0000"+
		"\u0000\u008d\u008e\u0005*\u0000\u0000\u008e\u0090\u0003\n\u0005\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u0092\u0005D\u0000\u0000\u0092"+
		"\u0094\u0005V\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u008f"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\t\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0007\u0004\u0000\u0000\u0098\u000b\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0007\u0005\u0000\u0000\u009a\r\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0006\u0007\uffff\uffff\u0000\u009c\u00b5\u0003"+
		"\u001c\u000e\u0000\u009d\u00b5\u0003$\u0012\u0000\u009e\u00b5\u0003\u001e"+
		"\u000f\u0000\u009f\u00b5\u0003 \u0010\u0000\u00a0\u00b5\u00038\u001c\u0000"+
		"\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a3\u0003\u000e\u0007\u0000"+
		"\u00a3\u00a4\u0005 \u0000\u0000\u00a4\u00b5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005+\u0000\u0000\u00a6\u00b5\u0003\u000e\u0007\b\u00a7\u00a8"+
		"\u0005]\u0000\u0000\u00a8\u00b5\u0003\u000e\u0007\u0007\u00a9\u00aa\u0005"+
		"!\u0000\u0000\u00aa\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ac\u0005#\u0000"+
		"\u0000\u00ac\u00b5\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003(\u0014\u0000"+
		"\u00ae\u00af\u0003\u000e\u0007\u0005\u00af\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b5\u0003\f\u0006\u0000\u00b1\u00b5\u0005X\u0000\u0000\u00b2"+
		"\u00b5\u0005\u00e2\u0000\u0000\u00b3\u00b5\u0005V\u0000\u0000\u00b4\u009b"+
		"\u0001\u0000\u0000\u0000\u00b4\u009d\u0001\u0000\u0000\u0000\u00b4\u009e"+
		"\u0001\u0000\u0000\u0000\u00b4\u009f\u0001\u0000\u0000\u0000\u00b4\u00a0"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a1\u0001\u0000\u0000\u0000\u00b4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a7\u0001\u0000\u0000\u0000\u00b4\u00a9"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00ce"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\n\u000f\u0000\u0000\u00b7\u00b8\u0005"+
		",\u0000\u0000\u00b8\u00cd\u0003\u000e\u0007\u0010\u00b9\u00ba\n\u000e"+
		"\u0000\u0000\u00ba\u00bb\u0005)\u0000\u0000\u00bb\u00cd\u0003\u000e\u0007"+
		"\u000f\u00bc\u00bd\n\f\u0000\u0000\u00bd\u00be\u0005F\u0000\u0000\u00be"+
		"\u00cd\u0003\u000e\u0007\r\u00bf\u00c0\n\u000b\u0000\u0000\u00c0\u00c1"+
		"\u0005E\u0000\u0000\u00c1\u00cd\u0003\u000e\u0007\f\u00c2\u00c3\n\n\u0000"+
		"\u0000\u00c3\u00c4\u0005A\u0000\u0000\u00c4\u00cd\u0003\u000e\u0007\u000b"+
		"\u00c5\u00c6\n\r\u0000\u0000\u00c6\u00cd\u0005(\u0000\u0000\u00c7\u00c8"+
		"\n\t\u0000\u0000\u00c8\u00c9\u0005\u001d\u0000\u0000\u00c9\u00ca\u0003"+
		"\u000e\u0007\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00b6\u0001\u0000\u0000\u0000\u00cc\u00b9\u0001"+
		"\u0000\u0000\u0000\u00cc\u00bc\u0001\u0000\u0000\u0000\u00cc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c2\u0001\u0000\u0000\u0000\u00cc\u00c5\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u000f\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005\u009e\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0001\u0000\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d5\u0007"+
		"\u0000\u0000\u0000\u00d5\u00da\u0003\u0012\t\u0000\u00d6\u00d7\u0005&"+
		"\u0000\u0000\u00d7\u00d9\u0003\u0012\t\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0007\u0002\u0000"+
		"\u0000\u00de\u00df\u0005 \u0000\u0000\u00df\u0011\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\u00e2\u0005*\u0000\u0000\u00e2"+
		"\u0104\u0007\u0006\u0000\u0000\u00e3\u00e4\u0005\u0006\u0000\u0000\u00e4"+
		"\u00e5\u0005*\u0000\u0000\u00e5\u0104\u0007\u0006\u0000\u0000\u00e6\u00e7"+
		"\u0005\b\u0000\u0000\u00e7\u00e8\u0005*\u0000\u0000\u00e8\u00e9\u0005"+
		"\u001d\u0000\u0000\u00e9\u00ee\u0007\u0006\u0000\u0000\u00ea\u00eb\u0005"+
		"&\u0000\u0000\u00eb\u00ed\u0007\u0006\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u0104\u0005\u001e"+
		"\u0000\u0000\u00f2\u00f3\u0005\f\u0000\u0000\u00f3\u00f4\u0005*\u0000"+
		"\u0000\u00f4\u0104\u0005W\u0000\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000"+
		"\u00f6\u00f7\u0005*\u0000\u0000\u00f7\u0100\u0005\u001d\u0000\u0000\u00f8"+
		"\u00fd\u0007\u0007\u0000\u0000\u00f9\u00fa\u0005&\u0000\u0000\u00fa\u00fc"+
		"\u0007\u0007\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104"+
		"\u0005\u001e\u0000\u0000\u0103\u00e0\u0001\u0000\u0000\u0000\u0103\u00e3"+
		"\u0001\u0000\u0000\u0000\u0103\u00e6\u0001\u0000\u0000\u0000\u0103\u00f2"+
		"\u0001\u0000\u0000\u0000\u0103\u00f5\u0001\u0000\u0000\u0000\u0104\u0013"+
		"\u0001\u0000\u0000\u0000\u0105\u0113\u0003$\u0012\u0000\u0106\u0113\u0003"+
		"\u001e\u000f\u0000\u0107\u0113\u0003 \u0010\u0000\u0108\u0113\u0003\u0018"+
		"\f\u0000\u0109\u0113\u0003\u001a\r\u0000\u010a\u0113\u0003&\u0013\u0000"+
		"\u010b\u0113\u0003*\u0015\u0000\u010c\u0113\u0003,\u0016\u0000\u010d\u0113"+
		"\u00034\u001a\u0000\u010e\u0113\u00032\u0019\u0000\u010f\u0113\u0003@"+
		" \u0000\u0110\u0113\u0003L&\u0000\u0111\u0113\u0003\u000e\u0007\u0000"+
		"\u0112\u0105\u0001\u0000\u0000\u0000\u0112\u0106\u0001\u0000\u0000\u0000"+
		"\u0112\u0107\u0001\u0000\u0000\u0000\u0112\u0108\u0001\u0000\u0000\u0000"+
		"\u0112\u0109\u0001\u0000\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000"+
		"\u0112\u010b\u0001\u0000\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000"+
		"\u0112\u010d\u0001\u0000\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000"+
		"\u0112\u010f\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0015\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\u0080\u0000\u0000\u0115\u0116\u0005{\u0000\u0000\u0116"+
		"\u0119\u0005\u00e2\u0000\u0000\u0117\u0118\u0007\b\u0000\u0000\u0118\u011a"+
		"\u0005\u00e2\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0122"+
		"\u0007\u0000\u0000\u0000\u011c\u011e\u0003\u0014\n\u0000\u011d\u011f\u0005"+
		"%\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0007\u0002"+
		"\u0000\u0000\u0126\u0017\u0001\u0000\u0000\u0000\u0127\u0132\u0003\b\u0004"+
		"\u0000\u0128\u0129\u0005\'\u0000\u0000\u0129\u0130\u0003\u000e\u0007\u0000"+
		"\u012a\u012b\u0005D\u0000\u0000\u012b\u012e\u0005V\u0000\u0000\u012c\u012d"+
		"\u0005\'\u0000\u0000\u012d\u012f\u0005V\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001"+
		"\u0000\u0000\u0000\u0130\u012a\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0128\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u0005%\u0000\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0019\u0001\u0000"+
		"\u0000\u0000\u0137\u013a\u0003\b\u0004\u0000\u0138\u0139\u0005\u001d\u0000"+
		"\u0000\u0139\u013b\u0005\u001e\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0143\u0001\u0000\u0000"+
		"\u0000\u013c\u0140\u0005\'\u0000\u0000\u013d\u013f\u0003\u001c\u000e\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u013c\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0147\u0005%\u0000\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u001b\u0001\u0000\u0000\u0000\u0148\u0156\u0005\u001d\u0000\u0000\u0149"+
		"\u014e\u0003\u000e\u0007\u0000\u014a\u014b\u0005&\u0000\u0000\u014b\u014d"+
		"\u0003\u000e\u0007\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0150"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0153\u0005&\u0000\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001"+
		"\u0000\u0000\u0000\u0154\u0149\u0001\u0000\u0000\u0000\u0155\u0158\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0005\u001e\u0000\u0000\u015a\u001d\u0001"+
		"\u0000\u0000\u0000\u015b\u015d\u0003(\u0014\u0000\u015c\u015b\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005\u00e2\u0000\u0000\u015f\u0160\u0003 \u0010"+
		"\u0000\u0160\u001f\u0001\u0000\u0000\u0000\u0161\u0172\u0005\u001f\u0000"+
		"\u0000\u0162\u0165\u0003\u000e\u0007\u0000\u0163\u0165\u0003\b\u0004\u0000"+
		"\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u016d\u0001\u0000\u0000\u0000\u0166\u0169\u0005&\u0000\u0000\u0167"+
		"\u016a\u0003\u000e\u0007\u0000\u0168\u016a\u0003\b\u0004\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016c"+
		"\u0001\u0000\u0000\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016c\u016f"+
		"\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u0170\u0164\u0001\u0000\u0000\u0000\u0171\u0174"+
		"\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0175\u0178\u0005 \u0000\u0000\u0176\u0177\u0005"+
		"*\u0000\u0000\u0177\u0179\u0003\n\u0005\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0188\u0001\u0000"+
		"\u0000\u0000\u017a\u017e\u0007\u0000\u0000\u0000\u017b\u017d\u0003\u0014"+
		"\n\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u0183\u0007\u0002\u0000\u0000\u0182\u017a\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0189\u0001\u0000\u0000"+
		"\u0000\u0184\u0186\u0003\u0014\n\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0003\"\u0011\u0000\u0188\u0182\u0001\u0000\u0000\u0000\u0188"+
		"\u0185\u0001\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189"+
		"!\u0001\u0000\u0000\u0000\u018a\u018b\u0005T\u0000\u0000\u018b\u018c\u0003"+
		"\u000e\u0007\u0000\u018c#\u0001\u0000\u0000\u0000\u018d\u018f\u0003(\u0014"+
		"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u00e2\u0000"+
		"\u0000\u0191\u019c\u0005\u001f\u0000\u0000\u0192\u0197\u0003\u000e\u0007"+
		"\u0000\u0193\u0194\u0005&\u0000\u0000\u0194\u0196\u0003\u000e\u0007\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u0192\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0005 \u0000\u0000\u01a0%\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0003(\u0014\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005"+
		"\u00e2\u0000\u0000\u01a5\u01a6\u0005\'\u0000\u0000\u01a6\u01a7\u0003\u000e"+
		"\u0007\u0000\u01a7\u01a8\u0005%\u0000\u0000\u01a8\'\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0007\t\u0000\u0000\u01aa\u01ab\u0005,\u0000\u0000"+
		"\u01ab)\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005d\u0000\u0000\u01ad\u01af"+
		"\u0003(\u0014\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003"+
		"\u000e\u0007\u0000\u01b1\u01b2\u0005%\u0000\u0000\u01b2+\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0005o\u0000\u0000\u01b4\u01b5\u0005\u001f\u0000\u0000"+
		"\u01b5\u01bb\u00032\u0019\u0000\u01b6\u01b7\u00030\u0018\u0000\u01b7\u01b8"+
		"\u00032\u0019\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		" \u0000\u0000\u01bf\u01c3\u0007\u0000\u0000\u0000\u01c0\u01c2\u0003\u0014"+
		"\n\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c8\u0007\u0002\u0000\u0000\u01c7\u01c9\u0003.\u0017\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9-\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005_\u0000\u0000\u01cb\u01d6"+
		"\u0003\u0014\n\u0000\u01cc\u01cd\u0005_\u0000\u0000\u01cd\u01d1\u0007"+
		"\u0000\u0000\u0000\u01ce\u01d0\u0003\u0014\n\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d6\u0007\u0002"+
		"\u0000\u0000\u01d5\u01ca\u0001\u0000\u0000\u0000\u01d5\u01cc\u0001\u0000"+
		"\u0000\u0000\u01d6/\u0001\u0000\u0000\u0000\u01d7\u01d8\u0007\n\u0000"+
		"\u0000\u01d81\u0001\u0000\u0000\u0000\u01d9\u01da\u0003\u000e\u0007\u0000"+
		"\u01da\u01db\u00030\u0018\u0000\u01db\u01dc\u0003\u000e\u0007\u0000\u01dc"+
		"3\u0001\u0000\u0000\u0000\u01dd\u01de\u0005g\u0000\u0000\u01de\u01df\u0005"+
		"\u001f\u0000\u0000\u01df\u01e0\u0005\u0083\u0000\u0000\u01e0\u01e1\u0005"+
		"\u00e2\u0000\u0000\u01e1\u01e2\u0005\u0094\u0000\u0000\u01e2\u01e3\u0005"+
		"\u00e2\u0000\u0000\u01e3\u01e4\u0005 \u0000\u0000\u01e4\u01e5\u00036\u001b"+
		"\u0000\u01e55\u0001\u0000\u0000\u0000\u01e6\u01f0\u0003\u0014\n\u0000"+
		"\u01e7\u01e9\u0007\u0000\u0000\u0000\u01e8\u01ea\u0003\u0014\n\u0000\u01e9"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0007\u0002\u0000\u0000\u01ee"+
		"\u01f0\u0001\u0000\u0000\u0000\u01ef\u01e6\u0001\u0000\u0000\u0000\u01ef"+
		"\u01e7\u0001\u0000\u0000\u0000\u01f07\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0007\u0000\u0000\u0000\u01f2\u01f3\u0005\u00e2\u0000\u0000\u01f3\u01f4"+
		"\u0005*\u0000\u0000\u01f4\u01fb\u0003\u000e\u0007\u0000\u01f5\u01f6\u0005"+
		"&\u0000\u0000\u01f6\u01f7\u0005\u00e2\u0000\u0000\u01f7\u01f8\u0005*\u0000"+
		"\u0000\u01f8\u01fa\u0003\u000e\u0007\u0000\u01f9\u01f5\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0200\u0005&\u0000\u0000"+
		"\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0007\u0002\u0000\u0000"+
		"\u02029\u0001\u0000\u0000\u0000\u0203\u021a\u0003<\u001e\u0000\u0204\u021a"+
		"\u0003>\u001f\u0000\u0205\u0206\u0007\u000b\u0000\u0000\u0206\u0207\u0005"+
		"\'\u0000\u0000\u0207\u021a\u0007\f\u0000\u0000\u0208\u0209\u0005\u001d"+
		"\u0000\u0000\u0209\u020a\u0007\u000b\u0000\u0000\u020a\u020b\u0005\u001e"+
		"\u0000\u0000\u020b\u020c\u0005\'\u0000\u0000\u020c\u021a\u0007\r\u0000"+
		"\u0000\u020d\u020e\u0005\u001f\u0000\u0000\u020e\u020f\u0007\u000b\u0000"+
		"\u0000\u020f\u0210\u0005 \u0000\u0000\u0210\u0211\u0005\'\u0000\u0000"+
		"\u0211\u021a\u0007\f\u0000\u0000\u0212\u0213\u0005\u001d\u0000\u0000\u0213"+
		"\u0214\u0005\u001f\u0000\u0000\u0214\u0215\u0005\u0004\u0000\u0000\u0215"+
		"\u0216\u0005 \u0000\u0000\u0216\u0217\u0005\u001e\u0000\u0000\u0217\u0218"+
		"\u0005\'\u0000\u0000\u0218\u021a\u0007\f\u0000\u0000\u0219\u0203\u0001"+
		"\u0000\u0000\u0000\u0219\u0204\u0001\u0000\u0000\u0000\u0219\u0205\u0001"+
		"\u0000\u0000\u0000\u0219\u0208\u0001\u0000\u0000\u0000\u0219\u020d\u0001"+
		"\u0000\u0000\u0000\u0219\u0212\u0001\u0000\u0000\u0000\u021a;\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u00053\u0000\u0000\u021c\u021d\u0005\u0002\u0000"+
		"\u0000\u021d\u021e\u0005\'\u0000\u0000\u021e\u021f\u0005\u0083\u0000\u0000"+
		"\u021f\u0220\u0005\u00e2\u0000\u0000\u0220\u0221\u0005\u0094\u0000\u0000"+
		"\u0221\u0222\u0005\u00e2\u0000\u0000\u0222\u0224\u0001\u0000\u0000\u0000"+
		"\u0223\u0225\u0005%\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u022a\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005\u0083\u0000\u0000\u0227\u0228\u0005\u00e2\u0000\u0000\u0228"+
		"\u0229\u0005\'\u0000\u0000\u0229\u022b\u0005\u00e2\u0000\u0000\u022a\u0226"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b=\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u00053\u0000\u0000\u022d\u022e\u0005\u0003"+
		"\u0000\u0000\u022e\u0231\u0005\'\u0000\u0000\u022f\u0232\u0005\u00e2\u0000"+
		"\u0000\u0230\u0232\u00032\u0019\u0000\u0231\u022f\u0001\u0000\u0000\u0000"+
		"\u0231\u0230\u0001\u0000\u0000\u0000\u0232?\u0001\u0000\u0000\u0000\u0233"+
		"\u0237\u0003F#\u0000\u0234\u0236\u0003@ \u0000\u0235\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000"+
		"\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023b\u0003H$\u0000"+
		"\u023b\u0240\u0001\u0000\u0000\u0000\u023c\u0240\u0003J%\u0000\u023d\u0240"+
		"\u0005\u00e9\u0000\u0000\u023e\u0240\u0003B!\u0000\u023f\u0233\u0001\u0000"+
		"\u0000\u0000\u023f\u023c\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000"+
		"\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240A\u0001\u0000\u0000"+
		"\u0000\u0241\u0245\u0007\u000e\u0000\u0000\u0242\u0244\u0003\u000e\u0007"+
		"\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0007\u000f\u0000\u0000\u0249C\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0007\u0010\u0000\u0000\u024bE\u0001\u0000\u0000\u0000\u024c"+
		"\u024f\u0007\u0011\u0000\u0000\u024d\u0250\u0003D\"\u0000\u024e\u0250"+
		"\u0005\u00e2\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u024e"+
		"\u0001\u0000\u0000\u0000\u0250\u0254\u0001\u0000\u0000\u0000\u0251\u0253"+
		"\u0003:\u001d\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253\u0256\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0007\u0012\u0000\u0000\u0258G\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0007\u0011\u0000\u0000\u025a\u025d\u00054\u0000"+
		"\u0000\u025b\u025e\u0003D\"\u0000\u025c\u025e\u0005\u00e2\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0007\u0012\u0000\u0000"+
		"\u0260I\u0001\u0000\u0000\u0000\u0261\u0264\u0007\u0011\u0000\u0000\u0262"+
		"\u0265\u0003D\"\u0000\u0263\u0265\u0005\u00e2\u0000\u0000\u0264\u0262"+
		"\u0001\u0000\u0000\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0269"+
		"\u0001\u0000\u0000\u0000\u0266\u0268\u0003:\u001d\u0000\u0267\u0266\u0001"+
		"\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026d\u0005"+
		"4\u0000\u0000\u026d\u026e\u0007\u0012\u0000\u0000\u026eK\u0001\u0000\u0000"+
		"\u0000\u026f\u0271\u0003\\.\u0000\u0270\u026f\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0276\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0005&\u0000\u0000\u0273\u0275\u0003\\.\u0000\u0274\u0272"+
		"\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u027c"+
		"\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027b"+
		"\u0003N\'\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u027e\u0001"+
		"\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000\u0000\u027e\u027c\u0001"+
		"\u0000\u0000\u0000\u027f\u0283\u0005!\u0000\u0000\u0280\u0282\u0003R)"+
		"\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000\u0000"+
		"\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000"+
		"\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000"+
		"\u0000\u0286\u0287\u0005#\u0000\u0000\u0287M\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0005,\u0000\u0000\u0289\u028b\u0005\u00e2\u0000\u0000\u028a\u028c"+
		"\u0003\\.\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\u0290\u0001\u0000\u0000\u0000\u028d\u028f\u0003"+
		"P(\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000"+
		"\u0000\u0291\u0295\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000"+
		"\u0000\u0293\u0295\u0005\u00ca\u0000\u0000\u0294\u0288\u0001\u0000\u0000"+
		"\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295O\u0001\u0000\u0000\u0000"+
		"\u0296\u0298\u0005*\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297"+
		"\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0005\u00e2\u0000\u0000\u029aQ\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0003T*\u0000\u029c\u02a0\u0005*\u0000\u0000\u029d\u029f\u0003V+\u0000"+
		"\u029e\u029d\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0003^/\u0000\u02a4S\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0007\u0013\u0000\u0000\u02a6U\u0001\u0000\u0000\u0000\u02a7\u02b3\u0003"+
		"X,\u0000\u02a8\u02b3\u0005\u00b2\u0000\u0000\u02a9\u02b3\u0005\u00be\u0000"+
		"\u0000\u02aa\u02b3\u0005\u00b6\u0000\u0000\u02ab\u02b3\u0005\u00b7\u0000"+
		"\u0000\u02ac\u02b3\u0005\u00b3\u0000\u0000\u02ad\u02b3\u0005\u00b4\u0000"+
		"\u0000\u02ae\u02b3\u0005\u00b5\u0000\u0000\u02af\u02b3\u0005U\u0000\u0000"+
		"\u02b0\u02b3\u0007\f\u0000\u0000\u02b1\u02b3\u0005\u00e2\u0000\u0000\u02b2"+
		"\u02a7\u0001\u0000\u0000\u0000\u02b2\u02a8\u0001\u0000\u0000\u0000\u02b2"+
		"\u02a9\u0001\u0000\u0000\u0000\u02b2\u02aa\u0001\u0000\u0000\u0000\u02b2"+
		"\u02ab\u0001\u0000\u0000\u0000\u02b2\u02ac\u0001\u0000\u0000\u0000\u02b2"+
		"\u02ad\u0001\u0000\u0000\u0000\u02b2\u02ae\u0001\u0000\u0000\u0000\u02b2"+
		"\u02af\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b3W\u0001\u0000\u0000\u0000\u02b4\u02b8"+
		"\u0003Z-\u0000\u02b5\u02b7\u0005X\u0000\u0000\u02b6\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02c3\u0001\u0000"+
		"\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02bc\u0003Z-\u0000"+
		"\u02bc\u02bd\u0005\u00b8\u0000\u0000\u02bd\u02be\u0005U\u0000\u0000\u02be"+
		"\u02c3\u0001\u0000\u0000\u0000\u02bf\u02c0\u0003T*\u0000\u02c0\u02c1\u0003"+
		"Z-\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02b4\u0001\u0000\u0000"+
		"\u0000\u02c2\u02bb\u0001\u0000\u0000\u0000\u02c2\u02bf\u0001\u0000\u0000"+
		"\u0000\u02c3Y\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005X\u0000\u0000\u02c5"+
		"\u02c7\u0003`0\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c7[\u0001\u0000\u0000\u0000\u02c8\u02d9\u0005\u009f"+
		"\u0000\u0000\u02c9\u02d9\u0005\u00a0\u0000\u0000\u02ca\u02d9\u0005\u00a1"+
		"\u0000\u0000\u02cb\u02d9\u0005\u00a2\u0000\u0000\u02cc\u02d9\u0005\u00a9"+
		"\u0000\u0000\u02cd\u02d9\u0005\u00a7\u0000\u0000\u02ce\u02d9\u0005)\u0000"+
		"\u0000\u02cf\u02d9\u0005\"\u0000\u0000\u02d0\u02d9\u0005$\u0000\u0000"+
		"\u02d1\u02d9\u0005\u00a6\u0000\u0000\u02d2\u02d9\u0005\u00af\u0000\u0000"+
		"\u02d3\u02d9\u0005\u00b1\u0000\u0000\u02d4\u02d9\u0005\u00b0\u0000\u0000"+
		"\u02d5\u02d9\u0005\u00ca\u0000\u0000\u02d6\u02d7\u0005,\u0000\u0000\u02d7"+
		"\u02d9\u0005\u00e2\u0000\u0000\u02d8\u02c8\u0001\u0000\u0000\u0000\u02d8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02d8\u02ca\u0001\u0000\u0000\u0000\u02d8"+
		"\u02cb\u0001\u0000\u0000\u0000\u02d8\u02cc\u0001\u0000\u0000\u0000\u02d8"+
		"\u02cd\u0001\u0000\u0000\u0000\u02d8\u02ce\u0001\u0000\u0000\u0000\u02d8"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d8\u02d0\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d8\u02d2\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d8\u02d4\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9"+
		"]\u0001\u0000\u0000\u0000\u02da\u02db\u0005%\u0000\u0000\u02db_\u0001"+
		"\u0000\u0000\u0000\u02dc\u02dd\u0007\u0014\u0000\u0000\u02dda\u0001\u0000"+
		"\u0000\u0000Qenu\u0084\u008a\u008f\u0093\u0095\u00b4\u00cc\u00ce\u00da"+
		"\u00ee\u00fd\u0100\u0103\u0112\u0119\u011e\u0122\u012e\u0130\u0132\u0135"+
		"\u013a\u0140\u0143\u0146\u014e\u0152\u0156\u015c\u0164\u0169\u016d\u0172"+
		"\u0178\u017e\u0182\u0185\u0188\u018e\u0197\u019c\u01a2\u01ae\u01bb\u01c3"+
		"\u01c8\u01d1\u01d5\u01eb\u01ef\u01fb\u01ff\u0219\u0224\u022a\u0231\u0237"+
		"\u023f\u0245\u024f\u0254\u025d\u0264\u0269\u0270\u0276\u027c\u0283\u028b"+
		"\u0290\u0294\u0297\u02a0\u02b2\u02b8\u02c2\u02c6\u02d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}