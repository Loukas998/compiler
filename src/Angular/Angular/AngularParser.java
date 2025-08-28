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
		Get=14, QueryParams=15, HTML_COMMENT=16, HTML_CONDITIONAL_COMMENT=17, 
		XML=18, CDATA=19, DTD=20, SCRIPTLET=21, SEA_WS=22, DoubleQuotationMark=23, 
		MultiLineComment=24, SingleLineComment=25, SingleQuote=26, TripleQuote=27, 
		DoubleQuote=28, BackTickQuote=29, OpenBracket=30, CloseBracket=31, OpenParen=32, 
		CloseParen=33, OpenBrace=34, DoubleOpenBrace=35, CloseBrace=36, DoubleCloseBrace=37, 
		SemiColon=38, Comma=39, Assign=40, QuestionMark=41, QuestionMarkDot=42, 
		Colon=43, Ellipsis=44, Dot=45, PlusPlus=46, MinusMinus=47, Plus=48, Minus=49, 
		BitNot=50, Not=51, Multiply=52, Divide=53, Modulus=54, Power=55, NullCoalesce=56, 
		Hashtag=57, LeftShiftArithmetic=58, LessThan=59, MoreThan=60, LessThanEquals=61, 
		GreaterThanEquals=62, Equals=63, NotEquals=64, IdentityEquals=65, IdentityNotEquals=66, 
		BitAnd=67, BitXOr=68, BitOr=69, And=70, Or=71, MultiplyAssign=72, DivideAssign=73, 
		ModulusAssign=74, PlusAssign=75, MinusAssign=76, LeftShiftArithmeticAssign=77, 
		RightShiftArithmeticAssign=78, RightShiftLogicalAssign=79, BitAndAssign=80, 
		BitXorAssign=81, BitOrAssign=82, PowerAssign=83, NullishCoalescingAssign=84, 
		ARROW=85, HEXCHAR=86, NullLiteral=87, BooleanLiteral=88, DecimalLiteral=89, 
		IntegerNumber=90, BigDecimalIntegerLiteral=91, Break=92, Do=93, Instanceof=94, 
		Typeof=95, Case=96, Else=97, New=98, Var=99, Catch=100, Finally=101, Return=102, 
		Void=103, Continue=104, For=105, Switch=106, While=107, Debugger=108, 
		Function_=109, This=110, With=111, Default=112, If=113, Throw=114, Delete=115, 
		In=116, Try=117, As=118, From=119, ReadOnly=120, Async=121, Await=122, 
		Yield=123, YieldStar=124, Class=125, Enum=126, Extends=127, Super=128, 
		Const=129, Export=130, Import=131, Implements=132, Let=133, Private=134, 
		Public=135, Interface=136, Package=137, Protected=138, Static=139, Any=140, 
		Number=141, Never=142, Boolean=143, String=144, Int=145, Unique=146, Symbol=147, 
		Undefined=148, Object=149, Of=150, KeyOf=151, TypeAlias=152, Constructor=153, 
		Namespace=154, Require=155, Module=156, Declare=157, Abstract=158, Is=159, 
		At=160, H1=161, H2=162, H3=163, H4=164, H5=165, H6=166, AnchorTag=167, 
		Div=168, ParagprahTag=169, SpanTag=170, ImageTag=171, UnorderedListTag=172, 
		OrderedListTag=173, ListItemTag=174, LineBreakTag=175, StrongTextTag=176, 
		Button=177, Input=178, Label=179, Row=180, Column=181, Auto=182, Pointer=183, 
		Border_Box=184, Center=185, Solid=186, Display=187, Flex_Direction=188, 
		Gap=189, Padding=190, Box_Size=191, Flex=192, Border=193, Text_Align=194, 
		Max_With=195, Height=196, Width=197, Cursor=198, Transition=199, Color=200, 
		Font_Size=201, Margin=202, Background_Color=203, Textarea=204, PX=205, 
		CM=206, MM=207, PT=208, PC=209, EM=210, REM=211, EX=212, CH=213, VW=214, 
		VH=215, VMIN=216, VMAX=217, CQW=218, CQH=219, CQI=220, CQB=221, CQMIN=222, 
		CQMAX=223, WhiteSpaces=224, Comment=225, HtmlComment=226, CDataComment=227, 
		ID=228, OpenTag=229, CloseTag=230, OpenBraceHTML=231, CloseBraceHTML=232, 
		DoubleOpenBraceHtml=233, DoubleCloseBraceHtml=234, TEXT=235, WS=236;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_importStatement = 2, RULE_interface = 3, 
		RULE_variableNaming = 4, RULE_varType = 5, RULE_string = 6, RULE_value = 7, 
		RULE_componentDeclaration = 8, RULE_componentInfo = 9, RULE_genericStatement = 10, 
		RULE_classStructure = 11, RULE_variableDeclaration = 12, RULE_arrayDeclaration = 13, 
		RULE_arrayInfo = 14, RULE_functionDeclaration = 15, RULE_functionBody = 16, 
		RULE_arrowFunction = 17, RULE_functionCall = 18, RULE_routerFunctionCall = 19, 
		RULE_routerFunctionParams = 20, RULE_routerFunctionQueryParams = 21, RULE_assignStatement = 22, 
		RULE_thisorId = 23, RULE_returnStatement = 24, RULE_ifStatement = 25, 
		RULE_elseStatement = 26, RULE_logicalOp = 27, RULE_logicalStatement = 28, 
		RULE_forLoop = 29, RULE_forBody = 30, RULE_jsonObject = 31, RULE_attribute = 32, 
		RULE_ngForStatement = 33, RULE_ngIfStatement = 34, RULE_htmlTags = 35, 
		RULE_interpolation = 36, RULE_knownHtmlTags = 37, RULE_openTag = 38, RULE_closeTag = 39, 
		RULE_selfClosingTag = 40, RULE_cssElement = 41, RULE_selector = 42, RULE_simpleSelector = 43, 
		RULE_cssProperty = 44, RULE_css = 45, RULE_cssValue = 46, RULE_decimalLiteral_UNIT = 47, 
		RULE_decimalLiteralUnit = 48, RULE_tagName = 49, RULE_eos = 50, RULE_unit = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "importStatement", "interface", "variableNaming", 
			"varType", "string", "value", "componentDeclaration", "componentInfo", 
			"genericStatement", "classStructure", "variableDeclaration", "arrayDeclaration", 
			"arrayInfo", "functionDeclaration", "functionBody", "arrowFunction", 
			"functionCall", "routerFunctionCall", "routerFunctionParams", "routerFunctionQueryParams", 
			"assignStatement", "thisorId", "returnStatement", "ifStatement", "elseStatement", 
			"logicalOp", "logicalStatement", "forLoop", "forBody", "jsonObject", 
			"attribute", "ngForStatement", "ngIfStatement", "htmlTags", "interpolation", 
			"knownHtmlTags", "openTag", "closeTag", "selfClosingTag", "cssElement", 
			"selector", "simpleSelector", "cssProperty", "css", "cssValue", "decimalLiteral_UNIT", 
			"decimalLiteralUnit", "tagName", "eos", "unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", null, null, null, "'selector'", "'templateUrl'", 
			"'template'", "'styleUrls'", "'styleUrl'", "'styles'", "'imports'", "'standalone'", 
			null, "'get'", "'queryParams'", null, null, null, null, null, null, null, 
			"'\"'", null, null, null, null, null, null, "'['", "']'", "'('", "')'", 
			null, null, null, null, "';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", 
			"'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", 
			"'**'", "'??'", "'#'", "'<<'", null, null, "'<='", "'>='", "'=='", "'!='", 
			"'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", 
			"'**='", "'??='", "'=>'", null, "'null'", null, null, null, null, "'break'", 
			"'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", 
			"'catch'", "'finally'", "'return'", "'void'", "'continue'", "'for'", 
			"'switch'", "'while'", "'debugger'", "'function'", "'this'", "'with'", 
			"'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", "'as'", 
			"'from'", "'readonly'", "'async'", "'await'", "'yield'", "'yield*'", 
			"'class'", "'enum'", "'extends'", "'super'", "'const'", "'export'", "'import'", 
			"'implements'", "'let'", "'private'", "'public'", "'interface'", "'package'", 
			"'protected'", "'static'", "'any'", "'number'", "'never'", "'boolean'", 
			"'string'", "'int'", "'unique'", "'symbol'", "'undefined'", "'object'", 
			"'of'", "'keyof'", "'type'", "'constructor'", "'namespace'", "'require'", 
			"'module'", "'declare'", "'abstract'", "'is'", "'@'", "'h1'", "'h2'", 
			"'h3'", "'h4'", "'h5'", "'h6'", "'a'", "'div'", "'p'", "'span'", "'img'", 
			"'ul'", "'ol'", "'li'", "'br'", "'strong'", "'button'", "'input'", "'label'", 
			"'row'", "'column'", "'auto'", "'pointer'", "'border-box'", "'center'", 
			"'solid'", "'display'", "'flex-direction'", "'gap'", "'padding'", "'box-sizing'", 
			"'flex'", "'border'", "'text-align'", "'max-width'", "'height'", "'width'", 
			"'cursor'", "'transition'", "'color'", "'font-size'", "'margin'", "'background-color'", 
			"'textarea'", "'px'", "'cm'", "'mm'", "'pt'", "'pc'", "'em'", "'rem'", 
			"'ex'", "'ch'", "'vw'", "'vh'", "'vmin'", "'vmax'", "'cqw'", "'cqh'", 
			"'cqi'", "'cqb'", "'cqmin'", "'cqmax'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Component", "NgFor", "NgIf", "NgModel", "Selector", "TemplateUrl", 
			"Template", "StyleUrls", "StyleUrl", "Styles", "Imports", "Standalone", 
			"Router", "Get", "QueryParams", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", "DoubleQuotationMark", 
			"MultiLineComment", "SingleLineComment", "SingleQuote", "TripleQuote", 
			"DoubleQuote", "BackTickQuote", "OpenBracket", "CloseBracket", "OpenParen", 
			"CloseParen", "OpenBrace", "DoubleOpenBrace", "CloseBrace", "DoubleCloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", 
			"LeftShiftArithmetic", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
			"Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", 
			"BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "HEXCHAR", "NullLiteral", 
			"BooleanLiteral", "DecimalLiteral", "IntegerNumber", "BigDecimalIntegerLiteral", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function_", "This", "With", "Default", "If", "Throw", "Delete", 
			"In", "Try", "As", "From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", 
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
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				expression();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 576518671883575296L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 664105098973445L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 17592186964767L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 171L) != 0) );
			setState(109);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				importStatement();
				}
				break;
			case Interface:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				interface_();
				}
				break;
			case At:
				_localctx = new ComponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				componentDeclaration();
				}
				break;
			case Export:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				classStructure();
				}
				break;
			case Router:
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
				setState(115);
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
			setState(118);
			match(Import);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8206L) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(121);
				match(As);
				setState(122);
				match(ID);
				}
			}

			setState(125);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(From);
			setState(127);
			match(SingleQuote);
			setState(128);
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
			setState(130);
			match(Interface);
			setState(131);
			match(ID);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 18253611009L) != 0) || _la==ID) {
				{
				{
				setState(133);
				variableNaming();
				setState(134);
				match(SemiColon);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 18253611009L) != 0) || _la==ID) ) {
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
			setState(146);
			match(ID);
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(147);
					match(Colon);
					setState(148);
					varType();
					}
					break;
				}
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(151);
					match(BitOr);
					setState(152);
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
			setState(157);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 8108898254849L) != 0) || _la==ID) ) {
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
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 872415232L) != 0)) ) {
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayInfoValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				arrayInfo();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new FunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				functionDeclaration();
				}
				break;
			case 4:
				{
				_localctx = new FunctionStatementValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				functionBody();
				}
				break;
			case 5:
				{
				_localctx = new JsonObjectValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				jsonObject();
				}
				break;
			case 6:
				{
				_localctx = new EventValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(OpenParen);
				setState(168);
				value(0);
				setState(169);
				match(CloseParen);
				}
				break;
			case 7:
				{
				_localctx = new EllipsisValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(Ellipsis);
				setState(172);
				value(8);
				}
				break;
			case 8:
				{
				_localctx = new TypeOfValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(Typeof);
				setState(174);
				value(7);
				}
				break;
			case 9:
				{
				_localctx = new BracedValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(OpenBrace);
				setState(176);
				value(0);
				setState(177);
				match(CloseBrace);
				}
				break;
			case 10:
				{
				_localctx = new ThisDotValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				thisorId();
				setState(180);
				value(5);
				}
				break;
			case 11:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				string();
				}
				break;
			case 12:
				{
				_localctx = new DecimalNumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(DecimalLiteral);
				}
				break;
			case 13:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(ID);
				}
				break;
			case 14:
				{
				_localctx = new NullValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(NullLiteral);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ValueDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(188);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(189);
						match(Dot);
						setState(190);
						value(16);
						}
						break;
					case 2:
						{
						_localctx = new NullableDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(191);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(192);
						match(QuestionMarkDot);
						setState(193);
						value(15);
						}
						break;
					case 3:
						{
						_localctx = new ValueOrValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(194);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(195);
						match(Or);
						setState(196);
						value(13);
						}
						break;
					case 4:
						{
						_localctx = new ValueAndValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(197);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(198);
						match(And);
						setState(199);
						value(12);
						}
						break;
					case 5:
						{
						_localctx = new ValueIdentityNotEqualsValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(200);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(201);
						match(IdentityNotEquals);
						setState(202);
						value(11);
						}
						break;
					case 6:
						{
						_localctx = new NullableValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(203);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(204);
						match(QuestionMark);
						}
						break;
					case 7:
						{
						_localctx = new ArrayIndexValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(205);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(206);
						match(OpenBracket);
						setState(207);
						value(0);
						setState(208);
						match(CloseBracket);
						}
						break;
					}
					} 
				}
				setState(214);
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
			setState(215);
			match(At);
			setState(216);
			match(Component);
			setState(217);
			match(OpenParen);
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			componentInfo();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(220);
				match(Comma);
				setState(221);
				componentInfo();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(Selector);
				setState(231);
				match(Colon);
				{
				setState(232);
				match(SingleQuote);
				}
				}
				break;
			case TemplateUrl:
				_localctx = new TempUrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(TemplateUrl);
				setState(234);
				match(Colon);
				{
				setState(235);
				match(SingleQuote);
				}
				}
				break;
			case StyleUrls:
				_localctx = new StylesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(StyleUrls);
				setState(237);
				match(Colon);
				setState(238);
				match(OpenBracket);
				{
				setState(239);
				match(SingleQuote);
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(240);
					match(Comma);
					{
					setState(241);
					match(SingleQuote);
					}
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(CloseBracket);
				}
				break;
			case Standalone:
				_localctx = new StandaloneStatusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(Standalone);
				setState(249);
				match(Colon);
				setState(250);
				match(BooleanLiteral);
				}
				break;
			case Imports:
				_localctx = new ImportssContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(Imports);
				setState(252);
				match(Colon);
				setState(253);
				match(OpenBracket);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8204L) != 0) || _la==ID) {
					{
					setState(254);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8204L) != 0) || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(255);
						match(Comma);
						setState(256);
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
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(264);
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
	public static class RouterCallContext extends GenericStatementContext {
		public RouterFunctionCallContext routerFunctionCall() {
			return getRuleContext(RouterFunctionCallContext.class,0);
		}
		public RouterCallContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterCall(this);
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
	public static class HtmlTagStatementContext extends GenericStatementContext {
		public HtmlTagsContext htmlTags() {
			return getRuleContext(HtmlTagsContext.class,0);
		}
		public HtmlTagStatementContext(GenericStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagStatement(this);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new RouterCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				routerFunctionCall();
				}
				break;
			case 2:
				_localctx = new FunctionSummoningContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				functionCall();
				}
				break;
			case 3:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				functionDeclaration();
				}
				break;
			case 4:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				functionBody();
				}
				break;
			case 5:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				variableDeclaration();
				}
				break;
			case 6:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				arrayDeclaration();
				}
				break;
			case 7:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				assignStatement();
				}
				break;
			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				returnStatement();
				}
				break;
			case 9:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(275);
				ifStatement();
				}
				break;
			case 10:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(276);
				forLoop();
				}
				break;
			case 11:
				_localctx = new LogicalStatementGenContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(277);
				logicalStatement();
				}
				break;
			case 12:
				_localctx = new HtmlTagStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(278);
				htmlTags();
				}
				break;
			case 13:
				_localctx = new CssElementStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(279);
				cssElement();
				}
				break;
			case 14:
				_localctx = new ValueTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(280);
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
			setState(283);
			match(Export);
			setState(284);
			match(Class);
			setState(285);
			match(ID);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==Implements) {
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Implements) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				match(ID);
				}
			}

			setState(290);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576518671883575296L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 74766866485509L) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 8796093482383L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 171L) != 0)) {
				{
				{
				setState(291);
				genericStatement();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(292);
					match(SemiColon);
					}
				}

				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
			setState(302);
			variableNaming();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(303);
				match(Assign);
				setState(304);
				value(0);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(305);
					match(BitOr);
					setState(306);
					match(NullLiteral);
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(307);
						match(Assign);
						setState(308);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(315);
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
			setState(318);
			variableNaming();
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(319);
				match(OpenBracket);
				setState(320);
				match(CloseBracket);
				}
				break;
			}
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(323);
				match(Assign);
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						arrayInfo();
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(332);
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
			setState(335);
			match(OpenBracket);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17615607037952L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8388869L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(336);
				value(0);
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(Comma);
						setState(338);
						value(0);
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(344);
					match(Comma);
					}
				}

				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(354);
				thisorId();
				}
				break;
			}
			setState(357);
			match(ID);
			setState(358);
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
			setState(360);
			match(OpenParen);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17615607037952L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 74766799081733L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(361);
					value(0);
					}
					break;
				case 2:
					{
					setState(362);
					variableNaming();
					}
					break;
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(365);
					match(Comma);
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(366);
						value(0);
						}
						break;
					case 2:
						{
						setState(367);
						variableNaming();
						}
						break;
					}
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(CloseParen);
			{
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(381);
				match(Colon);
				setState(382);
				varType();
				}
				break;
			}
			}
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(385);
					_la = _input.LA(1);
					if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576518671883575296L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 74766866485509L) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 8796093482383L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 171L) != 0)) {
						{
						{
						setState(386);
						genericStatement();
						}
						}
						setState(391);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(392);
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
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(395);
					genericStatement();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(398);
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
			setState(401);
			match(ARROW);
			setState(402);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(404);
				thisorId();
				}
				break;
			}
			setState(407);
			match(ID);
			setState(408);
			match(OpenParen);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17615607037952L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8388869L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(409);
				value(0);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(410);
					match(Comma);
					setState(411);
					value(0);
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
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
	public static class RouterFunctionCallContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Router() { return getToken(AngularParser.Router, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public ThisorIdContext thisorId() {
			return getRuleContext(ThisorIdContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<RouterFunctionParamsContext> routerFunctionParams() {
			return getRuleContexts(RouterFunctionParamsContext.class);
		}
		public RouterFunctionParamsContext routerFunctionParams(int i) {
			return getRuleContext(RouterFunctionParamsContext.class,i);
		}
		public List<RouterFunctionQueryParamsContext> routerFunctionQueryParams() {
			return getRuleContexts(RouterFunctionQueryParamsContext.class);
		}
		public RouterFunctionQueryParamsContext routerFunctionQueryParams(int i) {
			return getRuleContext(RouterFunctionQueryParamsContext.class,i);
		}
		public RouterFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterFunctionCallContext routerFunctionCall() throws RecognitionException {
		RouterFunctionCallContext _localctx = new RouterFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_routerFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==This || _la==ID) {
				{
				setState(424);
				thisorId();
				}
			}

			{
			setState(427);
			match(Router);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(428);
				match(Dot);
				setState(429);
				match(ID);
				}
			}

			}
			setState(432);
			match(OpenParen);
			setState(433);
			match(OpenBracket);
			{
			setState(434);
			match(SingleQuote);
			}
			setState(435);
			match(CloseBracket);
			{
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(436);
				match(Comma);
				setState(439);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SingleQuote:
				case IntegerNumber:
				case ID:
					{
					setState(437);
					routerFunctionParams();
					}
					break;
				case OpenBrace:
					{
					setState(438);
					routerFunctionQueryParams();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(446);
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
	public static class RouterFunctionParamsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode IntegerNumber() { return getToken(AngularParser.IntegerNumber, 0); }
		public TerminalNode SingleQuote() { return getToken(AngularParser.SingleQuote, 0); }
		public RouterFunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerFunctionParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterFunctionParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterFunctionParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterFunctionParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterFunctionParamsContext routerFunctionParams() throws RecognitionException {
		RouterFunctionParamsContext _localctx = new RouterFunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_routerFunctionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==SingleQuote || _la==IntegerNumber || _la==ID) ) {
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
	public static class RouterFunctionQueryParamsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode QueryParams() { return getToken(AngularParser.QueryParams, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public RouterFunctionQueryParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerFunctionQueryParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterFunctionQueryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterFunctionQueryParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterFunctionQueryParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterFunctionQueryParamsContext routerFunctionQueryParams() throws RecognitionException {
		RouterFunctionQueryParamsContext _localctx = new RouterFunctionQueryParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_routerFunctionQueryParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(OpenBrace);
			setState(451);
			match(QueryParams);
			setState(452);
			match(Colon);
			setState(453);
			jsonObject();
			setState(454);
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
		enterRule(_localctx, 44, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(456);
				thisorId();
				}
				break;
			}
			setState(459);
			match(ID);
			setState(460);
			match(Assign);
			setState(461);
			value(0);
			setState(462);
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
		enterRule(_localctx, 46, RULE_thisorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==This || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(465);
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
		enterRule(_localctx, 48, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(Return);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(468);
				thisorId();
				}
				break;
			}
			setState(471);
			value(0);
			setState(472);
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
		enterRule(_localctx, 50, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(If);
			setState(475);
			match(OpenParen);
			setState(476);
			logicalStatement();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 2047L) != 0)) {
				{
				{
				setState(477);
				logicalOp();
				setState(478);
				logicalStatement();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(CloseParen);
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576518671883575296L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 74766866485509L) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 8796093482383L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 171L) != 0)) {
				{
				{
				setState(487);
				genericStatement();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(494);
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
		enterRule(_localctx, 52, RULE_elseStatement);
		int _la;
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new SingleLineElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(497);
				match(Else);
				setState(498);
				genericStatement();
				}
				}
				break;
			case 2:
				_localctx = new MultipleLineElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(499);
				match(Else);
				{
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576518671883575296L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 74766866485509L) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 8796093482383L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 171L) != 0)) {
					{
					{
					setState(501);
					genericStatement();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
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
		enterRule(_localctx, 54, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 2047L) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_logicalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(512);
			value(0);
			{
			setState(513);
			logicalOp();
			}
			setState(514);
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
		enterRule(_localctx, 58, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(For);
			setState(517);
			match(OpenParen);
			setState(518);
			match(Let);
			setState(519);
			match(ID);
			setState(520);
			match(Of);
			setState(521);
			match(ID);
			setState(522);
			match(CloseParen);
			setState(523);
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
		enterRule(_localctx, 60, RULE_forBody);
		int _la;
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new SingleLineForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				genericStatement();
				}
				break;
			case 2:
				_localctx = new MultipleLinesForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(528); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(527);
					genericStatement();
					}
					}
					setState(530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 576518671883575296L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 74766866485509L) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 8796093482383L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 171L) != 0) );
				setState(532);
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
		enterRule(_localctx, 62, RULE_jsonObject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(537);
			match(ID);
			setState(538);
			match(Colon);
			setState(539);
			value(0);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(540);
					match(Comma);
					setState(541);
					match(ID);
					setState(542);
					match(Colon);
					setState(543);
					value(0);
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(549);
				match(Comma);
				}
			}

			setState(552);
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
		public TerminalNode TypeAlias() { return getToken(AngularParser.TypeAlias, 0); }
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
		public TerminalNode TypeAlias() { return getToken(AngularParser.TypeAlias, 0); }
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
		public TerminalNode TypeAlias() { return getToken(AngularParser.TypeAlias, 0); }
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
		enterRule(_localctx, 64, RULE_attribute);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new NgForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				ngForStatement();
				}
				break;
			case 2:
				_localctx = new NgIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				ngIfStatement();
				}
				break;
			case 3:
				_localctx = new DoubleQuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==TypeAlias || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(557);
				match(Assign);
				setState(558);
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
				setState(559);
				match(OpenBracket);
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==TypeAlias || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				match(CloseBracket);
				setState(562);
				match(Assign);
				setState(563);
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
				setState(564);
				match(OpenParen);
				setState(565);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==TypeAlias || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(566);
				match(CloseParen);
				setState(567);
				match(Assign);
				setState(568);
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
				setState(569);
				match(OpenBracket);
				setState(570);
				match(OpenParen);
				setState(571);
				match(NgModel);
				setState(572);
				match(CloseParen);
				setState(573);
				match(CloseBracket);
				setState(574);
				match(Assign);
				{
				setState(575);
				match(SingleQuote);
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
		enterRule(_localctx, 66, RULE_ngForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(Multiply);
			setState(579);
			match(NgFor);
			setState(580);
			match(Assign);
			{
			setState(581);
			match(Let);
			setState(582);
			match(ID);
			setState(583);
			match(Of);
			setState(584);
			match(ID);
			}
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(586);
				match(SemiColon);
				}
			}

			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let) {
				{
				setState(589);
				match(Let);
				setState(590);
				match(ID);
				setState(591);
				match(Assign);
				setState(592);
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
		enterRule(_localctx, 68, RULE_ngIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(Multiply);
			setState(596);
			match(NgIf);
			setState(597);
			match(Assign);
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(598);
				match(ID);
				}
				break;
			case 2:
				{
				setState(599);
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
		enterRule(_localctx, 70, RULE_htmlTags);
		try {
			int _alt;
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new PairedTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				openTag();
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(603);
						htmlTags();
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(609);
				closeTag();
				}
				break;
			case 2:
				_localctx = new UnpairedTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new NormalHtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(TEXT);
				}
				break;
			case 4:
				_localctx = new HtmlInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
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
		public List<TerminalNode> DoubleOpenBraceHtml() { return getTokens(AngularParser.DoubleOpenBraceHtml); }
		public TerminalNode DoubleOpenBraceHtml(int i) {
			return getToken(AngularParser.DoubleOpenBraceHtml, i);
		}
		public TerminalNode DoubleCloseBrace() { return getToken(AngularParser.DoubleCloseBrace, 0); }
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
		enterRule(_localctx, 72, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !(_la==DoubleOpenBrace || _la==DoubleOpenBraceHtml) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17615607037952L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8388869L) != 0) || _la==ID || _la==OpenBraceHTML) {
				{
				{
				setState(617);
				value(0);
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==DoubleCloseBrace || _la==DoubleOpenBraceHtml) ) {
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
		public TerminalNode Label() { return getToken(AngularParser.Label, 0); }
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
		enterRule(_localctx, 74, RULE_knownHtmlTags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 524287L) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(630);
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
			case Label:
				{
				setState(628);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(629);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503604996079616L) != 0) || _la==Class || _la==TypeAlias || _la==ID) {
				{
				{
				setState(632);
				attribute();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
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
		enterRule(_localctx, 78, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(641);
			match(Divide);
			setState(644);
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
			case Label:
				{
				setState(642);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(643);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(646);
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
		enterRule(_localctx, 80, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(651);
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
			case Label:
				{
				setState(649);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(650);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503604996079616L) != 0) || _la==Class || _la==TypeAlias || _la==ID) {
				{
				{
				setState(653);
				attribute();
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			match(Divide);
			setState(660);
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
		enterRule(_localctx, 82, RULE_cssElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(662);
				tagName();
				}
				break;
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(665);
				match(Comma);
				setState(666);
				tagName();
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Textarea) {
				{
				{
				setState(672);
				selector();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			match(OpenBrace);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & 131071L) != 0)) {
				{
				{
				setState(679);
				cssProperty();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
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
		enterRule(_localctx, 84, RULE_selector);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(687);
				match(Dot);
				}
				setState(688);
				match(ID);
				setState(690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(689);
					tagName();
					}
					break;
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon || _la==ID) {
					{
					{
					setState(692);
					simpleSelector();
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
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
		enterRule(_localctx, 86, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(701);
				match(Colon);
				}
			}

			setState(704);
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
		enterRule(_localctx, 88, RULE_cssProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			css();
			setState(707);
			match(Colon);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & -8070450532247928827L) != 0) || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & 281474993487807L) != 0)) {
				{
				{
				setState(708);
				cssValue();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
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
		enterRule(_localctx, 90, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if ( !(((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & 131071L) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_cssValue);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				decimalLiteral_UNIT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(Row);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				match(Flex);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				match(Border_Box);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(722);
				match(Center);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(723);
				match(Column);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(724);
				match(Auto);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(725);
				match(Pointer);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(726);
				match(HEXCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(727);
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
				setState(728);
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
		enterRule(_localctx, 94, RULE_decimalLiteral_UNIT);
		try {
			int _alt;
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new UnitNumberListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				decimalLiteralUnit();
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(732);
						match(DecimalLiteral);
						}
						} 
					}
					setState(737);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new UnitSolidColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				decimalLiteralUnit();
				setState(739);
				match(Solid);
				setState(740);
				match(HEXCHAR);
				}
				break;
			case 3:
				_localctx = new BackgroundColorUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				css();
				setState(743);
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
		enterRule(_localctx, 96, RULE_decimalLiteralUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(DecimalLiteral);
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(748);
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
		enterRule(_localctx, 98, RULE_tagName);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(H1);
				}
				break;
			case H2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(H2);
				}
				break;
			case H3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				match(H3);
				}
				break;
			case H4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				match(H4);
				}
				break;
			case ImageTag:
				enterOuterAlt(_localctx, 5);
				{
				setState(755);
				match(ImageTag);
				}
				break;
			case ParagprahTag:
				enterOuterAlt(_localctx, 6);
				{
				setState(756);
				match(ParagprahTag);
				}
				break;
			case QuestionMarkDot:
				enterOuterAlt(_localctx, 7);
				{
				setState(757);
				match(QuestionMarkDot);
				}
				break;
			case DoubleOpenBrace:
				enterOuterAlt(_localctx, 8);
				{
				setState(758);
				match(DoubleOpenBrace);
				}
				break;
			case DoubleCloseBrace:
				enterOuterAlt(_localctx, 9);
				{
				setState(759);
				match(DoubleCloseBrace);
				}
				break;
			case Div:
				enterOuterAlt(_localctx, 10);
				{
				setState(760);
				match(Div);
				}
				break;
			case Button:
				enterOuterAlt(_localctx, 11);
				{
				setState(761);
				match(Button);
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 12);
				{
				setState(762);
				match(Label);
				}
				break;
			case Input:
				enterOuterAlt(_localctx, 13);
				{
				setState(763);
				match(Input);
				}
				break;
			case Textarea:
				enterOuterAlt(_localctx, 14);
				{
				setState(764);
				match(Textarea);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 15);
				{
				setState(765);
				match(Dot);
				setState(766);
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
		enterRule(_localctx, 100, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
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
		enterRule(_localctx, 102, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_la = _input.LA(1);
			if ( !(_la==Modulus || _la==In || ((((_la - 205)) & ~0x3f) == 0 && ((1L << (_la - 205)) & 8912895L) != 0)) ) {
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
		"\u0004\u0001\u00ec\u0306\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u0001\u0000\u0004\u0000j\b\u0000\u000b\u0000"+
		"\f\u0000k\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002|\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0089\b\u0003"+
		"\n\u0003\f\u0003\u008c\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003"+
		"\u0004\u0091\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0003\u0004"+
		"\u009c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00bb\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00d3\b\u0007\n\u0007\f\u0007\u00d6\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00df\b\b\n\b\f\b\u00e2"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f3\b\t\n"+
		"\t\f\t\u00f6\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0102\b\t\n\t\f\t\u0105\t\t\u0003\t"+
		"\u0107\b\t\u0001\t\u0003\t\u010a\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u011a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0121\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0126\b\u000b\u0005\u000b\u0128\b\u000b\n\u000b\f\u000b\u012b\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0136\b\f\u0003\f\u0138\b\f\u0003\f\u013a\b\f"+
		"\u0001\f\u0003\f\u013d\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0142\b\r\u0001"+
		"\r\u0001\r\u0005\r\u0146\b\r\n\r\f\r\u0149\t\r\u0003\r\u014b\b\r\u0001"+
		"\r\u0003\r\u014e\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0154\b\u000e\n\u000e\f\u000e\u0157\t\u000e\u0001\u000e\u0003\u000e"+
		"\u015a\b\u000e\u0005\u000e\u015c\b\u000e\n\u000e\f\u000e\u015f\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u0164\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u016c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0171\b"+
		"\u0010\u0005\u0010\u0173\b\u0010\n\u0010\f\u0010\u0176\t\u0010\u0005\u0010"+
		"\u0178\b\u0010\n\u0010\f\u0010\u017b\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0180\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0184"+
		"\b\u0010\n\u0010\f\u0010\u0187\t\u0010\u0001\u0010\u0003\u0010\u018a\b"+
		"\u0010\u0001\u0010\u0003\u0010\u018d\b\u0010\u0001\u0010\u0003\u0010\u0190"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u0196"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u019d\b\u0012\n\u0012\f\u0012\u01a0\t\u0012\u0005\u0012\u01a2\b"+
		"\u0012\n\u0012\f\u0012\u01a5\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0003\u0013\u01aa\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01af\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01b8\b\u0013\u0005\u0013\u01ba\b"+
		"\u0013\n\u0013\f\u0013\u01bd\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0003\u0016\u01ca\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01d6\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u01e1\b\u0019\n\u0019\f\u0019\u01e4\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01e9\b\u0019\n\u0019\f\u0019"+
		"\u01ec\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01f0\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01f7"+
		"\b\u001a\n\u001a\f\u001a\u01fa\t\u001a\u0001\u001a\u0003\u001a\u01fd\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0004\u001e\u0211\b\u001e\u000b\u001e\f\u001e\u0212\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0217\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0221\b\u001f\n\u001f\f\u001f\u0224\t\u001f\u0001\u001f\u0003\u001f\u0227"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0241\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u024c\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0252\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u0259\b\"\u0001#\u0001#\u0005#\u025d\b#\n#\f#\u0260\t"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0267\b#\u0001$\u0001$\u0005"+
		"$\u026b\b$\n$\f$\u026e\t$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0003&\u0277\b&\u0001&\u0005&\u027a\b&\n&\f&\u027d\t&\u0001&\u0001&"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0285\b\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0003(\u028c\b(\u0001(\u0005(\u028f\b(\n(\f(\u0292\t("+
		"\u0001(\u0001(\u0001(\u0001)\u0003)\u0298\b)\u0001)\u0001)\u0005)\u029c"+
		"\b)\n)\f)\u029f\t)\u0001)\u0005)\u02a2\b)\n)\f)\u02a5\t)\u0001)\u0001"+
		")\u0005)\u02a9\b)\n)\f)\u02ac\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003"+
		"*\u02b3\b*\u0001*\u0005*\u02b6\b*\n*\f*\u02b9\t*\u0001*\u0003*\u02bc\b"+
		"*\u0001+\u0003+\u02bf\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005,\u02c6"+
		"\b,\n,\f,\u02c9\t,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02da\b.\u0001"+
		"/\u0001/\u0005/\u02de\b/\n/\f/\u02e1\t/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u02ea\b/\u00010\u00010\u00030\u02ee\b0\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u0300\b1\u00012\u00012\u00013\u0001"+
		"3\u00013\u0000\u0001\u000e4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdf\u0000\u0015\u0002\u0000\"\"\u00e7\u00e7\u0003\u0000\u0001"+
		"\u0003\r\r\u00e4\u00e4\u0002\u0000$$\u00e8\u00e8\u0004\u0000cc\u0081\u0081"+
		"\u0085\u0085\u00e4\u00e4\u0004\u0000gg\u008c\u008d\u008f\u0091\u00e4\u00e4"+
		"\u0002\u0000\u001a\u001a\u001c\u001d\u0003\u0000\u0002\u0003\r\r\u00e4"+
		"\u00e4\u0002\u0000\u007f\u007f\u0084\u0084\u0003\u0000\u001a\u001aZZ\u00e4"+
		"\u00e4\u0002\u0000nn\u00e4\u00e4\u0001\u0000=G\u0003\u0000}}\u0098\u0098"+
		"\u00e4\u00e4\u0002\u0000\u001a\u001a\u001c\u001c\u0001\u0000\u001b\u001c"+
		"\u0002\u0000##\u00e9\u00e9\u0002\u0000%%\u00e9\u00e9\u0001\u0000\u00a1"+
		"\u00b3\u0002\u0000;;\u00e5\u00e5\u0002\u0000<<\u00e6\u00e6\u0001\u0000"+
		"\u00bb\u00cb\u0004\u000066tt\u00cd\u00df\u00e4\u00e4\u0367\u0000i\u0001"+
		"\u0000\u0000\u0000\u0002t\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000"+
		"\u0000\u0006\u0082\u0001\u0000\u0000\u0000\b\u0090\u0001\u0000\u0000\u0000"+
		"\n\u009d\u0001\u0000\u0000\u0000\f\u009f\u0001\u0000\u0000\u0000\u000e"+
		"\u00ba\u0001\u0000\u0000\u0000\u0010\u00d7\u0001\u0000\u0000\u0000\u0012"+
		"\u0109\u0001\u0000\u0000\u0000\u0014\u0119\u0001\u0000\u0000\u0000\u0016"+
		"\u011b\u0001\u0000\u0000\u0000\u0018\u012e\u0001\u0000\u0000\u0000\u001a"+
		"\u013e\u0001\u0000\u0000\u0000\u001c\u014f\u0001\u0000\u0000\u0000\u001e"+
		"\u0163\u0001\u0000\u0000\u0000 \u0168\u0001\u0000\u0000\u0000\"\u0191"+
		"\u0001\u0000\u0000\u0000$\u0195\u0001\u0000\u0000\u0000&\u01a9\u0001\u0000"+
		"\u0000\u0000(\u01c0\u0001\u0000\u0000\u0000*\u01c2\u0001\u0000\u0000\u0000"+
		",\u01c9\u0001\u0000\u0000\u0000.\u01d0\u0001\u0000\u0000\u00000\u01d3"+
		"\u0001\u0000\u0000\u00002\u01da\u0001\u0000\u0000\u00004\u01fc\u0001\u0000"+
		"\u0000\u00006\u01fe\u0001\u0000\u0000\u00008\u0200\u0001\u0000\u0000\u0000"+
		":\u0204\u0001\u0000\u0000\u0000<\u0216\u0001\u0000\u0000\u0000>\u0218"+
		"\u0001\u0000\u0000\u0000@\u0240\u0001\u0000\u0000\u0000B\u0242\u0001\u0000"+
		"\u0000\u0000D\u0253\u0001\u0000\u0000\u0000F\u0266\u0001\u0000\u0000\u0000"+
		"H\u0268\u0001\u0000\u0000\u0000J\u0271\u0001\u0000\u0000\u0000L\u0273"+
		"\u0001\u0000\u0000\u0000N\u0280\u0001\u0000\u0000\u0000P\u0288\u0001\u0000"+
		"\u0000\u0000R\u0297\u0001\u0000\u0000\u0000T\u02bb\u0001\u0000\u0000\u0000"+
		"V\u02be\u0001\u0000\u0000\u0000X\u02c2\u0001\u0000\u0000\u0000Z\u02cc"+
		"\u0001\u0000\u0000\u0000\\\u02d9\u0001\u0000\u0000\u0000^\u02e9\u0001"+
		"\u0000\u0000\u0000`\u02eb\u0001\u0000\u0000\u0000b\u02ff\u0001\u0000\u0000"+
		"\u0000d\u0301\u0001\u0000\u0000\u0000f\u0303\u0001\u0000\u0000\u0000h"+
		"j\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0000\u0000\u0001n\u0001\u0001\u0000\u0000\u0000"+
		"ou\u0003\u0004\u0002\u0000pu\u0003\u0006\u0003\u0000qu\u0003\u0010\b\u0000"+
		"ru\u0003\u0016\u000b\u0000su\u0003\u0014\n\u0000to\u0001\u0000\u0000\u0000"+
		"tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000u\u0003\u0001\u0000\u0000\u0000vw\u0005"+
		"\u0083\u0000\u0000wx\u0007\u0000\u0000\u0000x{\u0007\u0001\u0000\u0000"+
		"yz\u0005v\u0000\u0000z|\u0005\u00e4\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0007\u0002\u0000"+
		"\u0000~\u007f\u0005w\u0000\u0000\u007f\u0080\u0005\u001a\u0000\u0000\u0080"+
		"\u0081\u0005&\u0000\u0000\u0081\u0005\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\u0088\u0000\u0000\u0083\u0084\u0005\u00e4\u0000\u0000\u0084\u008a"+
		"\u0007\u0000\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005"+
		"&\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0002"+
		"\u0000\u0000\u008e\u0007\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0003"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u009b\u0005\u00e4"+
		"\u0000\u0000\u0093\u0094\u0005+\u0000\u0000\u0094\u0096\u0003\n\u0005"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0098\u0005E\u0000\u0000"+
		"\u0098\u009a\u0005W\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0095\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\t\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0004\u0000\u0000\u009e\u000b"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0005\u0000\u0000\u00a0\r\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0006\u0007\uffff\uffff\u0000\u00a2\u00bb"+
		"\u0003\u001c\u000e\u0000\u00a3\u00bb\u0003$\u0012\u0000\u00a4\u00bb\u0003"+
		"\u001e\u000f\u0000\u00a5\u00bb\u0003 \u0010\u0000\u00a6\u00bb\u0003>\u001f"+
		"\u0000\u00a7\u00a8\u0005 \u0000\u0000\u00a8\u00a9\u0003\u000e\u0007\u0000"+
		"\u00a9\u00aa\u0005!\u0000\u0000\u00aa\u00bb\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005,\u0000\u0000\u00ac\u00bb\u0003\u000e\u0007\b\u00ad\u00ae"+
		"\u0005_\u0000\u0000\u00ae\u00bb\u0003\u000e\u0007\u0007\u00af\u00b0\u0005"+
		"\"\u0000\u0000\u00b0\u00b1\u0003\u000e\u0007\u0000\u00b1\u00b2\u0005$"+
		"\u0000\u0000\u00b2\u00bb\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003.\u0017"+
		"\u0000\u00b4\u00b5\u0003\u000e\u0007\u0005\u00b5\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bb\u0003\f\u0006\u0000\u00b7\u00bb\u0005Y\u0000\u0000"+
		"\u00b8\u00bb\u0005\u00e4\u0000\u0000\u00b9\u00bb\u0005W\u0000\u0000\u00ba"+
		"\u00a1\u0001\u0000\u0000\u0000\u00ba\u00a3\u0001\u0000\u0000\u0000\u00ba"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ba\u00a5\u0001\u0000\u0000\u0000\u00ba"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ba\u00a7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ba\u00ad\u0001\u0000\u0000\u0000\u00ba"+
		"\u00af\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00d4\u0001\u0000\u0000\u0000\u00bc\u00bd\n\u000f\u0000\u0000\u00bd\u00be"+
		"\u0005-\u0000\u0000\u00be\u00d3\u0003\u000e\u0007\u0010\u00bf\u00c0\n"+
		"\u000e\u0000\u0000\u00c0\u00c1\u0005*\u0000\u0000\u00c1\u00d3\u0003\u000e"+
		"\u0007\u000f\u00c2\u00c3\n\f\u0000\u0000\u00c3\u00c4\u0005G\u0000\u0000"+
		"\u00c4\u00d3\u0003\u000e\u0007\r\u00c5\u00c6\n\u000b\u0000\u0000\u00c6"+
		"\u00c7\u0005F\u0000\u0000\u00c7\u00d3\u0003\u000e\u0007\f\u00c8\u00c9"+
		"\n\n\u0000\u0000\u00c9\u00ca\u0005B\u0000\u0000\u00ca\u00d3\u0003\u000e"+
		"\u0007\u000b\u00cb\u00cc\n\r\u0000\u0000\u00cc\u00d3\u0005)\u0000\u0000"+
		"\u00cd\u00ce\n\t\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000\u0000\u00cf"+
		"\u00d0\u0003\u000e\u0007\u0000\u00d0\u00d1\u0005\u001f\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00bc\u0001\u0000\u0000\u0000\u00d2"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d2\u00c2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00d2\u00c8\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u000f\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u00a0\u0000\u0000\u00d8"+
		"\u00d9\u0005\u0001\u0000\u0000\u00d9\u00da\u0005 \u0000\u0000\u00da\u00db"+
		"\u0007\u0000\u0000\u0000\u00db\u00e0\u0003\u0012\t\u0000\u00dc\u00dd\u0005"+
		"\'\u0000\u0000\u00dd\u00df\u0003\u0012\t\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007\u0002"+
		"\u0000\u0000\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u0011\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0005\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000"+
		"\u00e8\u010a\u0005\u001a\u0000\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000"+
		"\u00ea\u00eb\u0005+\u0000\u0000\u00eb\u010a\u0005\u001a\u0000\u0000\u00ec"+
		"\u00ed\u0005\b\u0000\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee\u00ef"+
		"\u0005\u001e\u0000\u0000\u00ef\u00f4\u0005\u001a\u0000\u0000\u00f0\u00f1"+
		"\u0005\'\u0000\u0000\u00f1\u00f3\u0005\u001a\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u010a\u0005"+
		"\u001f\u0000\u0000\u00f8\u00f9\u0005\f\u0000\u0000\u00f9\u00fa\u0005+"+
		"\u0000\u0000\u00fa\u010a\u0005X\u0000\u0000\u00fb\u00fc\u0005\u000b\u0000"+
		"\u0000\u00fc\u00fd\u0005+\u0000\u0000\u00fd\u0106\u0005\u001e\u0000\u0000"+
		"\u00fe\u0103\u0007\u0006\u0000\u0000\u00ff\u0100\u0005\'\u0000\u0000\u0100"+
		"\u0102\u0007\u0006\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u0005\u001f\u0000\u0000\u0109\u00e6\u0001\u0000\u0000\u0000\u0109"+
		"\u00e9\u0001\u0000\u0000\u0000\u0109\u00ec\u0001\u0000\u0000\u0000\u0109"+
		"\u00f8\u0001\u0000\u0000\u0000\u0109\u00fb\u0001\u0000\u0000\u0000\u010a"+
		"\u0013\u0001\u0000\u0000\u0000\u010b\u011a\u0003&\u0013\u0000\u010c\u011a"+
		"\u0003$\u0012\u0000\u010d\u011a\u0003\u001e\u000f\u0000\u010e\u011a\u0003"+
		" \u0010\u0000\u010f\u011a\u0003\u0018\f\u0000\u0110\u011a\u0003\u001a"+
		"\r\u0000\u0111\u011a\u0003,\u0016\u0000\u0112\u011a\u00030\u0018\u0000"+
		"\u0113\u011a\u00032\u0019\u0000\u0114\u011a\u0003:\u001d\u0000\u0115\u011a"+
		"\u00038\u001c\u0000\u0116\u011a\u0003F#\u0000\u0117\u011a\u0003R)\u0000"+
		"\u0118\u011a\u0003\u000e\u0007\u0000\u0119\u010b\u0001\u0000\u0000\u0000"+
		"\u0119\u010c\u0001\u0000\u0000\u0000\u0119\u010d\u0001\u0000\u0000\u0000"+
		"\u0119\u010e\u0001\u0000\u0000\u0000\u0119\u010f\u0001\u0000\u0000\u0000"+
		"\u0119\u0110\u0001\u0000\u0000\u0000\u0119\u0111\u0001\u0000\u0000\u0000"+
		"\u0119\u0112\u0001\u0000\u0000\u0000\u0119\u0113\u0001\u0000\u0000\u0000"+
		"\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000"+
		"\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u0015\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005\u0082\u0000\u0000\u011c\u011d\u0005}\u0000\u0000\u011d"+
		"\u0120\u0005\u00e4\u0000\u0000\u011e\u011f\u0007\u0007\u0000\u0000\u011f"+
		"\u0121\u0005\u00e4\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0129\u0007\u0000\u0000\u0000\u0123\u0125\u0003\u0014\n\u0000\u0124\u0126"+
		"\u0005&\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0123\u0001"+
		"\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0007"+
		"\u0002\u0000\u0000\u012d\u0017\u0001\u0000\u0000\u0000\u012e\u0139\u0003"+
		"\b\u0004\u0000\u012f\u0130\u0005(\u0000\u0000\u0130\u0137\u0003\u000e"+
		"\u0007\u0000\u0131\u0132\u0005E\u0000\u0000\u0132\u0135\u0005W\u0000\u0000"+
		"\u0133\u0134\u0005(\u0000\u0000\u0134\u0136\u0005W\u0000\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138"+
		"\u0001\u0000\u0000\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u012f"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0005&\u0000\u0000\u013c\u013b\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0019\u0001"+
		"\u0000\u0000\u0000\u013e\u0141\u0003\b\u0004\u0000\u013f\u0140\u0005\u001e"+
		"\u0000\u0000\u0140\u0142\u0005\u001f\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u014a\u0001\u0000"+
		"\u0000\u0000\u0143\u0147\u0005(\u0000\u0000\u0144\u0146\u0003\u001c\u000e"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u014a\u0143\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014e\u0005&\u0000\u0000"+
		"\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u001b\u0001\u0000\u0000\u0000\u014f\u015d\u0005\u001e\u0000\u0000"+
		"\u0150\u0155\u0003\u000e\u0007\u0000\u0151\u0152\u0005\'\u0000\u0000\u0152"+
		"\u0154\u0003\u000e\u0007\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0005\'\u0000\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0001\u0000\u0000\u0000\u015b\u0150\u0001\u0000\u0000\u0000\u015c\u015f"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u001f\u0000\u0000\u0161\u001d"+
		"\u0001\u0000\u0000\u0000\u0162\u0164\u0003.\u0017\u0000\u0163\u0162\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005\u00e4\u0000\u0000\u0166\u0167\u0003"+
		" \u0010\u0000\u0167\u001f\u0001\u0000\u0000\u0000\u0168\u0179\u0005 \u0000"+
		"\u0000\u0169\u016c\u0003\u000e\u0007\u0000\u016a\u016c\u0003\b\u0004\u0000"+
		"\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000"+
		"\u016c\u0174\u0001\u0000\u0000\u0000\u016d\u0170\u0005\'\u0000\u0000\u016e"+
		"\u0171\u0003\u000e\u0007\u0000\u016f\u0171\u0003\b\u0004\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0173"+
		"\u0001\u0000\u0000\u0000\u0172\u016d\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u016b\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017c\u017f\u0005!\u0000\u0000\u017d\u017e\u0005"+
		"+\u0000\u0000\u017e\u0180\u0003\n\u0005\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u018f\u0001\u0000"+
		"\u0000\u0000\u0181\u0185\u0007\u0000\u0000\u0000\u0182\u0184\u0003\u0014"+
		"\n\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000"+
		"\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000"+
		"\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0007\u0002\u0000\u0000\u0189\u0181\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u0190\u0001\u0000\u0000"+
		"\u0000\u018b\u018d\u0003\u0014\n\u0000\u018c\u018b\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000"+
		"\u018e\u0190\u0003\"\u0011\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u018f"+
		"\u018c\u0001\u0000\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190"+
		"!\u0001\u0000\u0000\u0000\u0191\u0192\u0005U\u0000\u0000\u0192\u0193\u0003"+
		"\u000e\u0007\u0000\u0193#\u0001\u0000\u0000\u0000\u0194\u0196\u0003.\u0017"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u00e4\u0000"+
		"\u0000\u0198\u01a3\u0005 \u0000\u0000\u0199\u019e\u0003\u000e\u0007\u0000"+
		"\u019a\u019b\u0005\'\u0000\u0000\u019b\u019d\u0003\u000e\u0007\u0000\u019c"+
		"\u019a\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1"+
		"\u0199\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0005!\u0000\u0000\u01a7%\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003"+
		".\u0017\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ae\u0005\r\u0000"+
		"\u0000\u01ac\u01ad\u0005-\u0000\u0000\u01ad\u01af\u0005\u00e4\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005 \u0000\u0000\u01b1"+
		"\u01b2\u0005\u001e\u0000\u0000\u01b2\u01b3\u0005\u001a\u0000\u0000\u01b3"+
		"\u01bb\u0005\u001f\u0000\u0000\u01b4\u01b7\u0005\'\u0000\u0000\u01b5\u01b8"+
		"\u0003(\u0014\u0000\u01b6\u01b8\u0003*\u0015\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b4\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0005!\u0000\u0000\u01bf\'\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0007\b\u0000\u0000\u01c1)\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005\"\u0000\u0000\u01c3\u01c4\u0005\u000f\u0000\u0000\u01c4"+
		"\u01c5\u0005+\u0000\u0000\u01c5\u01c6\u0003>\u001f\u0000\u01c6\u01c7\u0005"+
		"$\u0000\u0000\u01c7+\u0001\u0000\u0000\u0000\u01c8\u01ca\u0003.\u0017"+
		"\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u00e4\u0000"+
		"\u0000\u01cc\u01cd\u0005(\u0000\u0000\u01cd\u01ce\u0003\u000e\u0007\u0000"+
		"\u01ce\u01cf\u0005&\u0000\u0000\u01cf-\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0007\t\u0000\u0000\u01d1\u01d2\u0005-\u0000\u0000\u01d2/\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0005f\u0000\u0000\u01d4\u01d6\u0003.\u0017\u0000"+
		"\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003\u000e\u0007\u0000"+
		"\u01d8\u01d9\u0005&\u0000\u0000\u01d91\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0005q\u0000\u0000\u01db\u01dc\u0005 \u0000\u0000\u01dc\u01e2\u00038"+
		"\u001c\u0000\u01dd\u01de\u00036\u001b\u0000\u01de\u01df\u00038\u001c\u0000"+
		"\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005!\u0000\u0000\u01e6"+
		"\u01ea\u0007\u0000\u0000\u0000\u01e7\u01e9\u0003\u0014\n\u0000\u01e8\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ef"+
		"\u0007\u0002\u0000\u0000\u01ee\u01f0\u00034\u001a\u0000\u01ef\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f03\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0005a\u0000\u0000\u01f2\u01fd\u0003\u0014\n"+
		"\u0000\u01f3\u01f4\u0005a\u0000\u0000\u01f4\u01f8\u0007\u0000\u0000\u0000"+
		"\u01f5\u01f7\u0003\u0014\n\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7"+
		"\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fb\u01fd\u0007\u0002\u0000\u0000\u01fc"+
		"\u01f1\u0001\u0000\u0000\u0000\u01fc\u01f3\u0001\u0000\u0000\u0000\u01fd"+
		"5\u0001\u0000\u0000\u0000\u01fe\u01ff\u0007\n\u0000\u0000\u01ff7\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0003\u000e\u0007\u0000\u0201\u0202\u0003"+
		"6\u001b\u0000\u0202\u0203\u0003\u000e\u0007\u0000\u02039\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0005i\u0000\u0000\u0205\u0206\u0005 \u0000\u0000\u0206"+
		"\u0207\u0005\u0085\u0000\u0000\u0207\u0208\u0005\u00e4\u0000\u0000\u0208"+
		"\u0209\u0005\u0096\u0000\u0000\u0209\u020a\u0005\u00e4\u0000\u0000\u020a"+
		"\u020b\u0005!\u0000\u0000\u020b\u020c\u0003<\u001e\u0000\u020c;\u0001"+
		"\u0000\u0000\u0000\u020d\u0217\u0003\u0014\n\u0000\u020e\u0210\u0007\u0000"+
		"\u0000\u0000\u020f\u0211\u0003\u0014\n\u0000\u0210\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0007\u0002\u0000\u0000\u0215\u0217\u0001\u0000\u0000"+
		"\u0000\u0216\u020d\u0001\u0000\u0000\u0000\u0216\u020e\u0001\u0000\u0000"+
		"\u0000\u0217=\u0001\u0000\u0000\u0000\u0218\u0219\u0007\u0000\u0000\u0000"+
		"\u0219\u021a\u0005\u00e4\u0000\u0000\u021a\u021b\u0005+\u0000\u0000\u021b"+
		"\u0222\u0003\u000e\u0007\u0000\u021c\u021d\u0005\'\u0000\u0000\u021d\u021e"+
		"\u0005\u00e4\u0000\u0000\u021e\u021f\u0005+\u0000\u0000\u021f\u0221\u0003"+
		"\u000e\u0007\u0000\u0220\u021c\u0001\u0000\u0000\u0000\u0221\u0224\u0001"+
		"\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0225\u0227\u0005\'\u0000\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228\u0229\u0007\u0002\u0000\u0000\u0229?\u0001\u0000\u0000"+
		"\u0000\u022a\u0241\u0003B!\u0000\u022b\u0241\u0003D\"\u0000\u022c\u022d"+
		"\u0007\u000b\u0000\u0000\u022d\u022e\u0005(\u0000\u0000\u022e\u0241\u0007"+
		"\f\u0000\u0000\u022f\u0230\u0005\u001e\u0000\u0000\u0230\u0231\u0007\u000b"+
		"\u0000\u0000\u0231\u0232\u0005\u001f\u0000\u0000\u0232\u0233\u0005(\u0000"+
		"\u0000\u0233\u0241\u0007\r\u0000\u0000\u0234\u0235\u0005 \u0000\u0000"+
		"\u0235\u0236\u0007\u000b\u0000\u0000\u0236\u0237\u0005!\u0000\u0000\u0237"+
		"\u0238\u0005(\u0000\u0000\u0238\u0241\u0007\f\u0000\u0000\u0239\u023a"+
		"\u0005\u001e\u0000\u0000\u023a\u023b\u0005 \u0000\u0000\u023b\u023c\u0005"+
		"\u0004\u0000\u0000\u023c\u023d\u0005!\u0000\u0000\u023d\u023e\u0005\u001f"+
		"\u0000\u0000\u023e\u023f\u0005(\u0000\u0000\u023f\u0241\u0005\u001a\u0000"+
		"\u0000\u0240\u022a\u0001\u0000\u0000\u0000\u0240\u022b\u0001\u0000\u0000"+
		"\u0000\u0240\u022c\u0001\u0000\u0000\u0000\u0240\u022f\u0001\u0000\u0000"+
		"\u0000\u0240\u0234\u0001\u0000\u0000\u0000\u0240\u0239\u0001\u0000\u0000"+
		"\u0000\u0241A\u0001\u0000\u0000\u0000\u0242\u0243\u00054\u0000\u0000\u0243"+
		"\u0244\u0005\u0002\u0000\u0000\u0244\u0245\u0005(\u0000\u0000\u0245\u0246"+
		"\u0005\u0085\u0000\u0000\u0246\u0247\u0005\u00e4\u0000\u0000\u0247\u0248"+
		"\u0005\u0096\u0000\u0000\u0248\u0249\u0005\u00e4\u0000\u0000\u0249\u024b"+
		"\u0001\u0000\u0000\u0000\u024a\u024c\u0005&\u0000\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u0251\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0005\u0085\u0000\u0000\u024e\u024f\u0005"+
		"\u00e4\u0000\u0000\u024f\u0250\u0005(\u0000\u0000\u0250\u0252\u0005\u00e4"+
		"\u0000\u0000\u0251\u024d\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000"+
		"\u0000\u0000\u0252C\u0001\u0000\u0000\u0000\u0253\u0254\u00054\u0000\u0000"+
		"\u0254\u0255\u0005\u0003\u0000\u0000\u0255\u0258\u0005(\u0000\u0000\u0256"+
		"\u0259\u0005\u00e4\u0000\u0000\u0257\u0259\u00038\u001c\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259E\u0001"+
		"\u0000\u0000\u0000\u025a\u025e\u0003L&\u0000\u025b\u025d\u0003F#\u0000"+
		"\u025c\u025b\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000"+
		"\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0003N\'\u0000\u0262\u0267\u0001\u0000\u0000\u0000\u0263"+
		"\u0267\u0003P(\u0000\u0264\u0267\u0005\u00eb\u0000\u0000\u0265\u0267\u0003"+
		"H$\u0000\u0266\u025a\u0001\u0000\u0000\u0000\u0266\u0263\u0001\u0000\u0000"+
		"\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0265\u0001\u0000\u0000"+
		"\u0000\u0267G\u0001\u0000\u0000\u0000\u0268\u026c\u0007\u000e\u0000\u0000"+
		"\u0269\u026b\u0003\u000e\u0007\u0000\u026a\u0269\u0001\u0000\u0000\u0000"+
		"\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000"+
		"\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0270\u0007\u000f\u0000\u0000"+
		"\u0270I\u0001\u0000\u0000\u0000\u0271\u0272\u0007\u0010\u0000\u0000\u0272"+
		"K\u0001\u0000\u0000\u0000\u0273\u0276\u0007\u0011\u0000\u0000\u0274\u0277"+
		"\u0003J%\u0000\u0275\u0277\u0005\u00e4\u0000\u0000\u0276\u0274\u0001\u0000"+
		"\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0277\u027b\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0003@ \u0000\u0279\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000"+
		"\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f\u0007\u0012\u0000\u0000"+
		"\u027fM\u0001\u0000\u0000\u0000\u0280\u0281\u0007\u0011\u0000\u0000\u0281"+
		"\u0284\u00055\u0000\u0000\u0282\u0285\u0003J%\u0000\u0283\u0285\u0005"+
		"\u00e4\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0283\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0007"+
		"\u0012\u0000\u0000\u0287O\u0001\u0000\u0000\u0000\u0288\u028b\u0007\u0011"+
		"\u0000\u0000\u0289\u028c\u0003J%\u0000\u028a\u028c\u0005\u00e4\u0000\u0000"+
		"\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000"+
		"\u028c\u0290\u0001\u0000\u0000\u0000\u028d\u028f\u0003@ \u0000\u028e\u028d"+
		"\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293"+
		"\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u00055\u0000\u0000\u0294\u0295\u0007\u0012\u0000\u0000\u0295Q\u0001\u0000"+
		"\u0000\u0000\u0296\u0298\u0003b1\u0000\u0297\u0296\u0001\u0000\u0000\u0000"+
		"\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u029d\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0005\'\u0000\u0000\u029a\u029c\u0003b1\u0000\u029b\u0299"+
		"\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u02a3"+
		"\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a2"+
		"\u0003T*\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a6\u02aa\u0005\"\u0000\u0000\u02a7\u02a9\u0003X,\u0000"+
		"\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9\u02ac\u0001\u0000\u0000\u0000"+
		"\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0005$\u0000\u0000\u02aeS\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0005-\u0000\u0000\u02b0\u02b2\u0005\u00e4\u0000\u0000\u02b1\u02b3\u0003"+
		"b1\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b7\u0001\u0000\u0000\u0000\u02b4\u02b6\u0003V+\u0000\u02b5"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8"+
		"\u02bc\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bc\u0005\u00cc\u0000\u0000\u02bb\u02af\u0001\u0000\u0000\u0000\u02bb"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bcU\u0001\u0000\u0000\u0000\u02bd\u02bf"+
		"\u0005+\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005"+
		"\u00e4\u0000\u0000\u02c1W\u0001\u0000\u0000\u0000\u02c2\u02c3\u0003Z-"+
		"\u0000\u02c3\u02c7\u0005+\u0000\u0000\u02c4\u02c6\u0003\\.\u0000\u02c5"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8"+
		"\u02ca\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0003d2\u0000\u02cbY\u0001\u0000\u0000\u0000\u02cc\u02cd\u0007"+
		"\u0013\u0000\u0000\u02cd[\u0001\u0000\u0000\u0000\u02ce\u02da\u0003^/"+
		"\u0000\u02cf\u02da\u0005\u00b4\u0000\u0000\u02d0\u02da\u0005\u00c0\u0000"+
		"\u0000\u02d1\u02da\u0005\u00b8\u0000\u0000\u02d2\u02da\u0005\u00b9\u0000"+
		"\u0000\u02d3\u02da\u0005\u00b5\u0000\u0000\u02d4\u02da\u0005\u00b6\u0000"+
		"\u0000\u02d5\u02da\u0005\u00b7\u0000\u0000\u02d6\u02da\u0005V\u0000\u0000"+
		"\u02d7\u02da\u0007\f\u0000\u0000\u02d8\u02da\u0005\u00e4\u0000\u0000\u02d9"+
		"\u02ce\u0001\u0000\u0000\u0000\u02d9\u02cf\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d9\u02d1\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d9\u02d3\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d9\u02d5\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d8\u0001\u0000\u0000\u0000\u02da]\u0001\u0000\u0000\u0000\u02db\u02df"+
		"\u0003`0\u0000\u02dc\u02de\u0005Y\u0000\u0000\u02dd\u02dc\u0001\u0000"+
		"\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02ea\u0001\u0000"+
		"\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e3\u0003`0\u0000"+
		"\u02e3\u02e4\u0005\u00ba\u0000\u0000\u02e4\u02e5\u0005V\u0000\u0000\u02e5"+
		"\u02ea\u0001\u0000\u0000\u0000\u02e6\u02e7\u0003Z-\u0000\u02e7\u02e8\u0003"+
		"`0\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02db\u0001\u0000\u0000"+
		"\u0000\u02e9\u02e2\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001\u0000\u0000"+
		"\u0000\u02ea_\u0001\u0000\u0000\u0000\u02eb\u02ed\u0005Y\u0000\u0000\u02ec"+
		"\u02ee\u0003f3\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001"+
		"\u0000\u0000\u0000\u02eea\u0001\u0000\u0000\u0000\u02ef\u0300\u0005\u00a1"+
		"\u0000\u0000\u02f0\u0300\u0005\u00a2\u0000\u0000\u02f1\u0300\u0005\u00a3"+
		"\u0000\u0000\u02f2\u0300\u0005\u00a4\u0000\u0000\u02f3\u0300\u0005\u00ab"+
		"\u0000\u0000\u02f4\u0300\u0005\u00a9\u0000\u0000\u02f5\u0300\u0005*\u0000"+
		"\u0000\u02f6\u0300\u0005#\u0000\u0000\u02f7\u0300\u0005%\u0000\u0000\u02f8"+
		"\u0300\u0005\u00a8\u0000\u0000\u02f9\u0300\u0005\u00b1\u0000\u0000\u02fa"+
		"\u0300\u0005\u00b3\u0000\u0000\u02fb\u0300\u0005\u00b2\u0000\u0000\u02fc"+
		"\u0300\u0005\u00cc\u0000\u0000\u02fd\u02fe\u0005-\u0000\u0000\u02fe\u0300"+
		"\u0005\u00e4\u0000\u0000\u02ff\u02ef\u0001\u0000\u0000\u0000\u02ff\u02f0"+
		"\u0001\u0000\u0000\u0000\u02ff\u02f1\u0001\u0000\u0000\u0000\u02ff\u02f2"+
		"\u0001\u0000\u0000\u0000\u02ff\u02f3\u0001\u0000\u0000\u0000\u02ff\u02f4"+
		"\u0001\u0000\u0000\u0000\u02ff\u02f5\u0001\u0000\u0000\u0000\u02ff\u02f6"+
		"\u0001\u0000\u0000\u0000\u02ff\u02f7\u0001\u0000\u0000\u0000\u02ff\u02f8"+
		"\u0001\u0000\u0000\u0000\u02ff\u02f9\u0001\u0000\u0000\u0000\u02ff\u02fa"+
		"\u0001\u0000\u0000\u0000\u02ff\u02fb\u0001\u0000\u0000\u0000\u02ff\u02fc"+
		"\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300c\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0005&\u0000\u0000\u0302e\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0007\u0014\u0000\u0000\u0304g\u0001\u0000\u0000\u0000"+
		"Ukt{\u008a\u0090\u0095\u0099\u009b\u00ba\u00d2\u00d4\u00e0\u00f4\u0103"+
		"\u0106\u0109\u0119\u0120\u0125\u0129\u0135\u0137\u0139\u013c\u0141\u0147"+
		"\u014a\u014d\u0155\u0159\u015d\u0163\u016b\u0170\u0174\u0179\u017f\u0185"+
		"\u0189\u018c\u018f\u0195\u019e\u01a3\u01a9\u01ae\u01b7\u01bb\u01c9\u01d5"+
		"\u01e2\u01ea\u01ef\u01f8\u01fc\u0212\u0216\u0222\u0226\u0240\u024b\u0251"+
		"\u0258\u025e\u0266\u026c\u0276\u027b\u0284\u028b\u0290\u0297\u029d\u02a3"+
		"\u02aa\u02b2\u02b7\u02bb\u02be\u02c7\u02d9\u02df\u02e9\u02ed\u02ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}