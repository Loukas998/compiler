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
		Component=1, NgFor=2, NgIf=3, Selector=4, TemplateUrl=5, Template=6, StyleUrls=7, 
		StyleUrl=8, Styles=9, Imports=10, Standalone=11, Get=12, HTML_COMMENT=13, 
		HTML_CONDITIONAL_COMMENT=14, XML=15, CDATA=16, DTD=17, SCRIPTLET=18, SEA_WS=19, 
		DoubleQuotationMark=20, MultiLineComment=21, SingleLineComment=22, SingleQuote=23, 
		TripleQuote=24, DoubleQuote=25, BackTickQuote=26, OpenBracket=27, CloseBracket=28, 
		OpenParen=29, CloseParen=30, OpenBrace=31, CloseBrace=32, SemiColon=33, 
		Comma=34, Assign=35, QuestionMark=36, QuestionMarkDot=37, Colon=38, Ellipsis=39, 
		Dot=40, PlusPlus=41, MinusMinus=42, Plus=43, Minus=44, BitNot=45, Not=46, 
		Multiply=47, Divide=48, Modulus=49, Power=50, NullCoalesce=51, Hashtag=52, 
		LeftShiftArithmetic=53, LessThan=54, MoreThan=55, LessThanEquals=56, GreaterThanEquals=57, 
		Equals=58, NotEquals=59, IdentityEquals=60, IdentityNotEquals=61, BitAnd=62, 
		BitXOr=63, BitOr=64, And=65, Or=66, MultiplyAssign=67, DivideAssign=68, 
		ModulusAssign=69, PlusAssign=70, MinusAssign=71, LeftShiftArithmeticAssign=72, 
		RightShiftArithmeticAssign=73, RightShiftLogicalAssign=74, BitAndAssign=75, 
		BitXorAssign=76, BitOrAssign=77, PowerAssign=78, NullishCoalescingAssign=79, 
		ARROW=80, NullLiteral=81, BooleanLiteral=82, DecimalLiteral=83, BigDecimalIntegerLiteral=84, 
		Break=85, Do=86, Instanceof=87, Typeof=88, Case=89, Else=90, New=91, Var=92, 
		Catch=93, Finally=94, Return=95, Void=96, Continue=97, For=98, Switch=99, 
		While=100, Debugger=101, Function_=102, This=103, With=104, Default=105, 
		If=106, Throw=107, Delete=108, In=109, Try=110, As=111, From=112, ReadOnly=113, 
		Async=114, Await=115, Yield=116, YieldStar=117, H1=118, H2=119, H3=120, 
		H4=121, H5=122, H6=123, AnchorTag=124, Div=125, ParagprahTag=126, SpanTag=127, 
		ImageTag=128, UnorderedListTag=129, OrderedListTag=130, ListItemTag=131, 
		LineBreakTag=132, StrongTextTag=133, Button=134, Class=135, Enum=136, 
		Extends=137, Super=138, Const=139, Export=140, Import=141, Implements=142, 
		Let=143, Private=144, Public=145, Interface=146, Package=147, Protected=148, 
		Static=149, Any=150, Number=151, Never=152, Boolean=153, String=154, Int=155, 
		Unique=156, Symbol=157, Undefined=158, Object=159, Of=160, KeyOf=161, 
		TypeAlias=162, Constructor=163, Namespace=164, Require=165, Module=166, 
		Declare=167, Abstract=168, Is=169, At=170, WhiteSpaces=171, Comment=172, 
		HtmlComment=173, CDataComment=174, ID=175, OpenTag=176, CloseTag=177, 
		OpenBraceHTML=178, CloseBraceHTML=179, TEXT=180, WS=181;
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
		RULE_selfClosingTag = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "importStatement", "interface", "variableNaming", 
			"varType", "string", "value", "componentDeclaration", "componentInfo", 
			"genericStatement", "classStructure", "variableDeclaration", "arrayDeclaration", 
			"arrayInfo", "functionDeclaration", "functionBody", "arrowFunction", 
			"functionCall", "assignStatement", "thisorId", "returnStatement", "ifStatement", 
			"elseStatement", "logicalOp", "logicalStatement", "forLoop", "forBody", 
			"jsonObject", "attribute", "ngForStatement", "ngIfStatement", "htmlTags", 
			"interpolation", "knownHtmlTags", "openTag", "closeTag", "selfClosingTag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", null, null, "'selector'", "'templateUrl'", "'template'", 
			"'styleUrls'", "'styleUrl'", "'styles'", "'imports'", "'standalone'", 
			"'get'", null, null, null, null, null, null, null, "'\"'", null, null, 
			null, null, null, null, "'['", "']'", "'('", "')'", null, null, "';'", 
			"','", "'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", 
			"'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", "'<<'", 
			null, null, "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", "'??='", 
			"'=>'", "'null'", null, null, null, "'break'", "'do'", "'instanceof'", 
			"'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", 
			"'return'", "'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'as'", "'from'", "'readonly'", "'async'", "'await'", 
			"'yield'", "'yield*'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'h6'", 
			"'a'", "'div'", "'p'", "'span'", "'img'", "'ul'", "'ol'", "'li'", "'br'", 
			"'strong'", "'button'", "'class'", "'enum'", "'extends'", "'super'", 
			"'const'", "'export'", "'import'", "'implements'", "'let'", "'private'", 
			"'public'", "'interface'", "'package'", "'protected'", "'static'", "'any'", 
			"'number'", "'never'", "'boolean'", "'string'", "'int'", "'unique'", 
			"'symbol'", "'undefined'", "'object'", "'of'", "'keyof'", "'type'", "'constructor'", 
			"'namespace'", "'require'", "'module'", "'declare'", "'abstract'", "'is'", 
			"'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Component", "NgFor", "NgIf", "Selector", "TemplateUrl", "Template", 
			"StyleUrls", "StyleUrl", "Styles", "Imports", "Standalone", "Get", "HTML_COMMENT", 
			"HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", 
			"DoubleQuotationMark", "MultiLineComment", "SingleLineComment", "SingleQuote", 
			"TripleQuote", "DoubleQuote", "BackTickQuote", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", "Dot", 
			"PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", 
			"Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", "LeftShiftArithmetic", 
			"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
			"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
			"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "NullLiteral", "BooleanLiteral", 
			"DecimalLiteral", "BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", 
			"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
			"Void", "Continue", "For", "Switch", "While", "Debugger", "Function_", 
			"This", "With", "Default", "If", "Throw", "Delete", "In", "Try", "As", 
			"From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", "H1", "H2", 
			"H3", "H4", "H5", "H6", "AnchorTag", "Div", "ParagprahTag", "SpanTag", 
			"ImageTag", "UnorderedListTag", "OrderedListTag", "ListItemTag", "LineBreakTag", 
			"StrongTextTag", "Button", "Class", "Enum", "Extends", "Super", "Const", 
			"Export", "Import", "Implements", "Let", "Private", "Public", "Interface", 
			"Package", "Protected", "Static", "Any", "Number", "Never", "Boolean", 
			"String", "Int", "Unique", "Symbol", "Undefined", "Object", "Of", "KeyOf", 
			"TypeAlias", "Constructor", "Namespace", "Require", "Module", "Declare", 
			"Abstract", "Is", "At", "WhiteSpaces", "Comment", "HtmlComment", "CDataComment", 
			"ID", "OpenTag", "CloseTag", "OpenBraceHTML", "CloseBraceHTML", "TEXT", 
			"WS"
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
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				expression();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 6629298651527268485L) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 23102226433L) != 0) );
			setState(81);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				importStatement();
				}
				break;
			case Interface:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				interface_();
				}
				break;
			case At:
				_localctx = new ComponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				componentDeclaration();
				}
				break;
			case Export:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				classStructure();
				}
				break;
			case SingleQuote:
			case DoubleQuote:
			case BackTickQuote:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case Ellipsis:
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
			case ID:
			case OpenTag:
			case OpenBraceHTML:
			case TEXT:
				_localctx = new GenericContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
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
			setState(90);
			match(Import);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(93);
				match(As);
				setState(94);
				match(ID);
				}
			}

			setState(97);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(From);
			setState(99);
			match(SingleQuote);
			setState(100);
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
			setState(102);
			match(Interface);
			setState(103);
			match(ID);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 2392537302040577L) != 0) || _la==ID) {
				{
				{
				setState(105);
				variableNaming();
				setState(106);
				match(SemiColon);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 2392537302040577L) != 0) || _la==ID) ) {
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
			setState(118);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(119);
					match(Colon);
					setState(120);
					varType();
					}
					break;
				}
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(123);
					match(BitOr);
					setState(124);
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
			setState(129);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 1062849512059437057L) != 0) || _la==ID) ) {
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
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 109051904L) != 0)) ) {
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
	public static class HtmlTagValueContext extends ValueContext {
		public HtmlTagsContext htmlTags() {
			return getRuleContext(HtmlTagsContext.class,0);
		}
		public HtmlTagValueContext(ValueContext ctx) { copyFrom(ctx); }
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayInfoValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134);
				arrayInfo();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new FunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				functionDeclaration();
				}
				break;
			case 4:
				{
				_localctx = new FunctionStatementValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				functionBody();
				}
				break;
			case 5:
				{
				_localctx = new JsonObjectValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				jsonObject();
				}
				break;
			case 6:
				{
				_localctx = new EventValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(OpenParen);
				setState(140);
				value(0);
				setState(141);
				match(CloseParen);
				}
				break;
			case 7:
				{
				_localctx = new EllipsisValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(Ellipsis);
				setState(144);
				value(9);
				}
				break;
			case 8:
				{
				_localctx = new TypeOfValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(Typeof);
				setState(146);
				value(8);
				}
				break;
			case 9:
				{
				_localctx = new BracedValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(OpenBrace);
				setState(148);
				value(0);
				setState(149);
				match(CloseBrace);
				}
				break;
			case 10:
				{
				_localctx = new ThisDotValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				thisorId();
				setState(152);
				value(6);
				}
				break;
			case 11:
				{
				_localctx = new HtmlTagValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				htmlTags();
				}
				break;
			case 12:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				string();
				}
				break;
			case 13:
				{
				_localctx = new DecimalNumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(DecimalLiteral);
				}
				break;
			case 14:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(ID);
				}
				break;
			case 15:
				{
				_localctx = new NullValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NullLiteral);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ValueDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(161);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(162);
						match(Dot);
						setState(163);
						value(16);
						}
						break;
					case 2:
						{
						_localctx = new NullableDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(164);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(165);
						match(QuestionMarkDot);
						setState(166);
						value(15);
						}
						break;
					case 3:
						{
						_localctx = new ValueOrValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(167);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(168);
						match(Or);
						setState(169);
						value(13);
						}
						break;
					case 4:
						{
						_localctx = new ValueAndValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(170);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(171);
						match(And);
						setState(172);
						value(12);
						}
						break;
					case 5:
						{
						_localctx = new NullableValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(173);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(174);
						match(QuestionMark);
						}
						break;
					case 6:
						{
						_localctx = new ArrayIndexValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(175);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(176);
						match(OpenBracket);
						setState(177);
						value(0);
						setState(178);
						match(CloseBracket);
						}
						break;
					}
					} 
				}
				setState(184);
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
			setState(185);
			match(At);
			setState(186);
			match(Component);
			setState(187);
			match(OpenParen);
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			componentInfo();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(190);
				match(Comma);
				setState(191);
				componentInfo();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(Selector);
				setState(201);
				match(Colon);
				setState(202);
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
				setState(203);
				match(TemplateUrl);
				setState(204);
				match(Colon);
				setState(205);
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
				setState(206);
				match(StyleUrls);
				setState(207);
				match(Colon);
				setState(208);
				match(OpenBracket);
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==BackTickQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(210);
					match(Comma);
					setState(211);
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
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(CloseBracket);
				}
				break;
			case Standalone:
				_localctx = new StandaloneStatusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(Standalone);
				setState(219);
				match(Colon);
				setState(220);
				match(BooleanLiteral);
				}
				break;
			case Imports:
				_localctx = new ImportssContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(Imports);
				setState(222);
				match(Colon);
				setState(223);
				match(OpenBracket);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NgFor || _la==NgIf || _la==ID) {
					{
					setState(224);
					_la = _input.LA(1);
					if ( !(_la==NgFor || _la==NgIf || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(225);
						match(Comma);
						setState(226);
						_la = _input.LA(1);
						if ( !(_la==NgFor || _la==NgIf || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(234);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				functionDeclaration();
				}
				break;
			case 2:
				_localctx = new FunctionSummoningContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				functionCall();
				}
				break;
			case 3:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				functionBody();
				}
				break;
			case 4:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				variableDeclaration();
				}
				break;
			case 5:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				arrayDeclaration();
				}
				break;
			case 6:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				assignStatement();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				returnStatement();
				}
				break;
			case 8:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				ifStatement();
				}
				break;
			case 9:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				forLoop();
				}
				break;
			case 10:
				_localctx = new LogicalStatementGenContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				logicalStatement();
				}
				break;
			case 11:
				_localctx = new ValueTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(247);
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
			setState(250);
			match(Export);
			setState(251);
			match(Class);
			setState(252);
			match(ID);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==Implements) {
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Implements) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				match(ID);
				}
			}

			setState(257);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4899916394616998021L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
				{
				{
				setState(258);
				genericStatement();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(259);
					match(SemiColon);
					}
				}

				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
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
			setState(269);
			variableNaming();
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(270);
				match(Assign);
				setState(271);
				value(0);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(272);
					match(BitOr);
					setState(273);
					match(NullLiteral);
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(274);
						match(Assign);
						setState(275);
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
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(282);
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
			setState(285);
			variableNaming();
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(286);
				match(OpenBracket);
				setState(287);
				match(CloseBracket);
				}
				break;
			}
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(290);
				match(Assign);
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						arrayInfo();
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(299);
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
			setState(302);
			match(OpenBracket);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4194437L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
				{
				{
				setState(303);
				value(0);
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(304);
						match(Comma);
						setState(305);
						value(0);
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(311);
					match(Comma);
					}
				}

				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(321);
				thisorId();
				}
				break;
			}
			setState(324);
			match(ID);
			setState(325);
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
			setState(327);
			match(OpenParen);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4899916394583296133L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
				{
				{
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(328);
					value(0);
					}
					break;
				case 2:
					{
					setState(329);
					variableNaming();
					}
					break;
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(332);
					match(Comma);
					setState(335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(333);
						value(0);
						}
						break;
					case 2:
						{
						setState(334);
						variableNaming();
						}
						break;
					}
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(CloseParen);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(348);
				match(Colon);
				setState(349);
				varType();
				}
				break;
			}
			}
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(352);
					_la = _input.LA(1);
					if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4899916394616998021L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
						{
						{
						setState(353);
						genericStatement();
						}
						}
						setState(358);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(359);
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
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(362);
					genericStatement();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(365);
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
			setState(368);
			match(ARROW);
			setState(369);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(371);
				thisorId();
				}
				break;
			}
			setState(374);
			match(ID);
			setState(375);
			match(OpenParen);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4194437L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
				{
				{
				setState(376);
				value(0);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(377);
					match(Comma);
					setState(378);
					value(0);
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(391);
				thisorId();
				}
				break;
			}
			setState(394);
			match(ID);
			setState(395);
			match(Assign);
			setState(396);
			value(0);
			setState(397);
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
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==This || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(400);
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
			setState(402);
			match(Return);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(403);
				thisorId();
				}
				break;
			}
			setState(406);
			value(0);
			setState(407);
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
			setState(409);
			match(If);
			setState(410);
			match(OpenParen);
			setState(411);
			logicalStatement();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 2047L) != 0)) {
				{
				{
				setState(412);
				logicalOp();
				setState(413);
				logicalStatement();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(CloseParen);
			setState(421);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4899916394616998021L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
				{
				{
				setState(422);
				genericStatement();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(429);
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
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new SingleLineElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(432);
				match(Else);
				setState(433);
				genericStatement();
				}
				}
				break;
			case 2:
				_localctx = new MultipleLineElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(434);
				match(Else);
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4899916394616998021L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
					{
					{
					setState(436);
					genericStatement();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
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
			setState(445);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 2047L) != 0)) ) {
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
			setState(447);
			value(0);
			{
			setState(448);
			logicalOp();
			}
			setState(449);
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
			setState(451);
			match(For);
			setState(452);
			match(OpenParen);
			setState(453);
			match(Let);
			setState(454);
			match(ID);
			setState(455);
			match(Of);
			setState(456);
			match(ID);
			setState(457);
			match(CloseParen);
			setState(458);
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
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new SingleLineForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				genericStatement();
				}
				break;
			case 2:
				_localctx = new MultipleLinesForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(462);
					genericStatement();
					}
					}
					setState(465); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4899916394616998021L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0) );
				setState(467);
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
			setState(471);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(472);
			match(ID);
			setState(473);
			match(Colon);
			setState(474);
			value(0);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(475);
					match(Comma);
					setState(476);
					match(ID);
					setState(477);
					match(Colon);
					setState(478);
					value(0);
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(484);
				match(Comma);
				}
			}

			setState(487);
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
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
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
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
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

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attribute);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new NgForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				ngForStatement();
				}
				break;
			case 2:
				_localctx = new NgIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				ngIfStatement();
				}
				break;
			case 3:
				_localctx = new DoubleQuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(492);
				match(Assign);
				setState(493);
				match(DoubleQuote);
				}
				break;
			case 4:
				_localctx = new OpenBracketAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(OpenBracket);
				setState(495);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(496);
				match(CloseBracket);
				setState(497);
				match(Assign);
				setState(498);
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
				setState(499);
				match(OpenParen);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				match(CloseParen);
				setState(502);
				match(Assign);
				setState(503);
				match(DoubleQuote);
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
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode Of() { return getToken(AngularParser.Of, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(Multiply);
			setState(507);
			match(NgFor);
			setState(508);
			match(Assign);
			{
			setState(509);
			match(Let);
			setState(510);
			match(ID);
			setState(511);
			match(Of);
			setState(512);
			match(ID);
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
			setState(514);
			match(Multiply);
			setState(515);
			match(NgIf);
			setState(516);
			match(Assign);
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(517);
				match(ID);
				}
				break;
			case 2:
				{
				setState(518);
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
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new PairedTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				openTag();
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(522);
						htmlTags();
						}
						} 
					}
					setState(527);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(528);
				closeTag();
				}
				break;
			case 2:
				_localctx = new UnpairedTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new NormalHtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				match(TEXT);
				}
				break;
			case 4:
				_localctx = new HtmlInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
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
		public List<TerminalNode> OpenBrace() { return getTokens(AngularParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngularParser.OpenBrace, i);
		}
		public List<TerminalNode> OpenBraceHTML() { return getTokens(AngularParser.OpenBraceHTML); }
		public TerminalNode OpenBraceHTML(int i) {
			return getToken(AngularParser.OpenBraceHTML, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(AngularParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngularParser.CloseBrace, i);
		}
		public List<TerminalNode> CloseBraceHTML() { return getTokens(AngularParser.CloseBraceHTML); }
		public TerminalNode CloseBraceHTML(int i) {
			return getToken(AngularParser.CloseBraceHTML, i);
		}
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
			setState(535);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014951192920064L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4194437L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 43L) != 0)) {
				{
				{
				setState(537);
				value(0);
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(544);
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
			setState(546);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 131071L) != 0)) ) {
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
			setState(548);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(551);
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
				{
				setState(549);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(550);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738159443968L) != 0) || _la==Class || _la==ID) {
				{
				{
				setState(553);
				attribute();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
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
			setState(561);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(562);
			match(Divide);
			setState(565);
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
				{
				setState(563);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(564);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(567);
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
			setState(569);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(572);
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
				{
				setState(570);
				knownHtmlTags();
				}
				break;
			case ID:
				{
				setState(571);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140738159443968L) != 0) || _la==Class || _la==ID) {
				{
				{
				setState(574);
				attribute();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(Divide);
			setState(581);
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
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b5\u0248\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0004\u0000N"+
		"\b\u0000\u000b\u0000\f\u0000O\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002`\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003m\b\u0003\n\u0003\f\u0003p\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u0004u\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004z\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b\u0004\u0003\u0004"+
		"\u0080\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a0\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b5\b\u0007"+
		"\n\u0007\f\u0007\u00b8\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00c1\b\b\n\b\f\b\u00c4\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d5\b\t\n\t\f\t\u00d8\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00e4\b\t\n\t\f\t\u00e7\t\t\u0003\t\u00e9\b\t\u0001\t\u0003"+
		"\t\u00ec\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f9\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0100\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0105\b\u000b\u0005\u000b\u0107\b\u000b"+
		"\n\u000b\f\u000b\u010a\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0115\b\f\u0003\f\u0117"+
		"\b\f\u0003\f\u0119\b\f\u0001\f\u0003\f\u011c\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0121\b\r\u0001\r\u0001\r\u0005\r\u0125\b\r\n\r\f\r\u0128\t"+
		"\r\u0003\r\u012a\b\r\u0001\r\u0003\r\u012d\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0133\b\u000e\n\u000e\f\u000e\u0136"+
		"\t\u000e\u0001\u000e\u0003\u000e\u0139\b\u000e\u0005\u000e\u013b\b\u000e"+
		"\n\u000e\f\u000e\u013e\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003"+
		"\u000f\u0143\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u014b\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0150\b\u0010\u0005\u0010\u0152\b\u0010\n\u0010\f\u0010"+
		"\u0155\t\u0010\u0005\u0010\u0157\b\u0010\n\u0010\f\u0010\u015a\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015f\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0163\b\u0010\n\u0010\f\u0010\u0166\t\u0010\u0001"+
		"\u0010\u0003\u0010\u0169\b\u0010\u0001\u0010\u0003\u0010\u016c\b\u0010"+
		"\u0001\u0010\u0003\u0010\u016f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0003\u0012\u0175\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u017c\b\u0012\n\u0012\f\u0012\u017f"+
		"\t\u0012\u0005\u0012\u0181\b\u0012\n\u0012\f\u0012\u0184\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0189\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0195\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01a0\b\u0016\n\u0016\f\u0016\u01a3\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01a8\b\u0016\n\u0016"+
		"\f\u0016\u01ab\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01af\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u01b6\b\u0017\n\u0017\f\u0017\u01b9\t\u0017\u0001\u0017\u0003\u0017\u01bc"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u01d0\b\u001b\u000b\u001b\f\u001b\u01d1\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01d6\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01e0\b\u001c\n\u001c\f\u001c\u01e3\t\u001c\u0001\u001c\u0003\u001c\u01e6"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01f9\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0208\b\u001f\u0001 \u0001"+
		" \u0005 \u020c\b \n \f \u020f\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0216\b \u0001!\u0001!\u0001!\u0005!\u021b\b!\n!\f!\u021e\t!\u0001!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u0228\b#\u0001"+
		"#\u0005#\u022b\b#\n#\f#\u022e\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0236\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u023d\b%\u0001"+
		"%\u0005%\u0240\b%\n%\f%\u0243\t%\u0001%\u0001%\u0001%\u0001%\u0000\u0001"+
		"\u000e&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0010\u0002\u0000\u001f"+
		"\u001f\u00b2\u00b2\u0002\u0000\u0001\u0003\u00af\u00af\u0002\u0000  \u00b3"+
		"\u00b3\u0004\u0000\\\\\u008b\u008b\u008f\u008f\u00af\u00af\u0004\u0000"+
		"``\u0096\u0097\u0099\u009b\u00af\u00af\u0002\u0000\u0017\u0017\u0019\u001a"+
		"\u0002\u0000\u0017\u0017\u001a\u001a\u0002\u0000\u0002\u0003\u00af\u00af"+
		"\u0002\u0000\u0089\u0089\u008e\u008e\u0002\u0000gg\u00af\u00af\u0001\u0000"+
		"8B\u0002\u0000\u0087\u0087\u00af\u00af\u0001\u0000\u0018\u0019\u0001\u0000"+
		"v\u0086\u0002\u000066\u00b0\u00b0\u0002\u000077\u00b1\u00b1\u0288\u0000"+
		"M\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004Z\u0001"+
		"\u0000\u0000\u0000\u0006f\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000"+
		"\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000\u0000\u0000"+
		"\u000e\u009f\u0001\u0000\u0000\u0000\u0010\u00b9\u0001\u0000\u0000\u0000"+
		"\u0012\u00eb\u0001\u0000\u0000\u0000\u0014\u00f8\u0001\u0000\u0000\u0000"+
		"\u0016\u00fa\u0001\u0000\u0000\u0000\u0018\u010d\u0001\u0000\u0000\u0000"+
		"\u001a\u011d\u0001\u0000\u0000\u0000\u001c\u012e\u0001\u0000\u0000\u0000"+
		"\u001e\u0142\u0001\u0000\u0000\u0000 \u0147\u0001\u0000\u0000\u0000\""+
		"\u0170\u0001\u0000\u0000\u0000$\u0174\u0001\u0000\u0000\u0000&\u0188\u0001"+
		"\u0000\u0000\u0000(\u018f\u0001\u0000\u0000\u0000*\u0192\u0001\u0000\u0000"+
		"\u0000,\u0199\u0001\u0000\u0000\u0000.\u01bb\u0001\u0000\u0000\u00000"+
		"\u01bd\u0001\u0000\u0000\u00002\u01bf\u0001\u0000\u0000\u00004\u01c3\u0001"+
		"\u0000\u0000\u00006\u01d5\u0001\u0000\u0000\u00008\u01d7\u0001\u0000\u0000"+
		"\u0000:\u01f8\u0001\u0000\u0000\u0000<\u01fa\u0001\u0000\u0000\u0000>"+
		"\u0202\u0001\u0000\u0000\u0000@\u0215\u0001\u0000\u0000\u0000B\u0217\u0001"+
		"\u0000\u0000\u0000D\u0222\u0001\u0000\u0000\u0000F\u0224\u0001\u0000\u0000"+
		"\u0000H\u0231\u0001\u0000\u0000\u0000J\u0239\u0001\u0000\u0000\u0000L"+
		"N\u0003\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0005\u0000\u0000\u0001R\u0001\u0001\u0000\u0000\u0000"+
		"SY\u0003\u0004\u0002\u0000TY\u0003\u0006\u0003\u0000UY\u0003\u0010\b\u0000"+
		"VY\u0003\u0016\u000b\u0000WY\u0003\u0014\n\u0000XS\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u008d\u0000\u0000[\\\u0007\u0000\u0000\u0000\\_\u0007\u0001\u0000\u0000"+
		"]^\u0005o\u0000\u0000^`\u0005\u00af\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0007\u0002\u0000"+
		"\u0000bc\u0005p\u0000\u0000cd\u0005\u0017\u0000\u0000de\u0005!\u0000\u0000"+
		"e\u0005\u0001\u0000\u0000\u0000fg\u0005\u0092\u0000\u0000gh\u0005\u00af"+
		"\u0000\u0000hn\u0007\u0000\u0000\u0000ij\u0003\b\u0004\u0000jk\u0005!"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0007\u0002\u0000"+
		"\u0000r\u0007\u0001\u0000\u0000\u0000su\u0007\u0003\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v\u007f\u0005\u00af\u0000\u0000wx\u0005&\u0000\u0000xz\u0003\n\u0005\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{|\u0005@\u0000\u0000|~\u0005Q\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007fy\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0007\u0004\u0000\u0000\u0082\u000b\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0007\u0005\u0000\u0000\u0084\r\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0006\u0007\uffff\uffff\u0000\u0086\u00a0\u0003\u001c"+
		"\u000e\u0000\u0087\u00a0\u0003$\u0012\u0000\u0088\u00a0\u0003\u001e\u000f"+
		"\u0000\u0089\u00a0\u0003 \u0010\u0000\u008a\u00a0\u00038\u001c\u0000\u008b"+
		"\u008c\u0005\u001d\u0000\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d"+
		"\u008e\u0005\u001e\u0000\u0000\u008e\u00a0\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\'\u0000\u0000\u0090\u00a0\u0003\u000e\u0007\t\u0091\u0092"+
		"\u0005X\u0000\u0000\u0092\u00a0\u0003\u000e\u0007\b\u0093\u0094\u0005"+
		"\u001f\u0000\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0005"+
		" \u0000\u0000\u0096\u00a0\u0001\u0000\u0000\u0000\u0097\u0098\u0003(\u0014"+
		"\u0000\u0098\u0099\u0003\u000e\u0007\u0006\u0099\u00a0\u0001\u0000\u0000"+
		"\u0000\u009a\u00a0\u0003@ \u0000\u009b\u00a0\u0003\f\u0006\u0000\u009c"+
		"\u00a0\u0005S\u0000\u0000\u009d\u00a0\u0005\u00af\u0000\u0000\u009e\u00a0"+
		"\u0005Q\u0000\u0000\u009f\u0085\u0001\u0000\u0000\u0000\u009f\u0087\u0001"+
		"\u0000\u0000\u0000\u009f\u0088\u0001\u0000\u0000\u0000\u009f\u0089\u0001"+
		"\u0000\u0000\u0000\u009f\u008a\u0001\u0000\u0000\u0000\u009f\u008b\u0001"+
		"\u0000\u0000\u0000\u009f\u008f\u0001\u0000\u0000\u0000\u009f\u0091\u0001"+
		"\u0000\u0000\u0000\u009f\u0093\u0001\u0000\u0000\u0000\u009f\u0097\u0001"+
		"\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009b\u0001"+
		"\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00b6\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\n\u000f\u0000\u0000\u00a2\u00a3\u0005("+
		"\u0000\u0000\u00a3\u00b5\u0003\u000e\u0007\u0010\u00a4\u00a5\n\u000e\u0000"+
		"\u0000\u00a5\u00a6\u0005%\u0000\u0000\u00a6\u00b5\u0003\u000e\u0007\u000f"+
		"\u00a7\u00a8\n\f\u0000\u0000\u00a8\u00a9\u0005B\u0000\u0000\u00a9\u00b5"+
		"\u0003\u000e\u0007\r\u00aa\u00ab\n\u000b\u0000\u0000\u00ab\u00ac\u0005"+
		"A\u0000\u0000\u00ac\u00b5\u0003\u000e\u0007\f\u00ad\u00ae\n\r\u0000\u0000"+
		"\u00ae\u00b5\u0005$\u0000\u0000\u00af\u00b0\n\n\u0000\u0000\u00b0\u00b1"+
		"\u0005\u001b\u0000\u0000\u00b1\u00b2\u0003\u000e\u0007\u0000\u00b2\u00b3"+
		"\u0005\u001c\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00a1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00a4\u0001\u0000\u0000\u0000\u00b4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001\u0000\u0000\u0000\u00b4\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u000f\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u00aa\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0001\u0000\u0000\u00bb\u00bc\u0005\u001d\u0000\u0000\u00bc\u00bd"+
		"\u0007\u0000\u0000\u0000\u00bd\u00c2\u0003\u0012\t\u0000\u00be\u00bf\u0005"+
		"\"\u0000\u0000\u00bf\u00c1\u0003\u0012\t\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0002"+
		"\u0000\u0000\u00c6\u00c7\u0005\u001e\u0000\u0000\u00c7\u0011\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u00ca\u0005&\u0000"+
		"\u0000\u00ca\u00ec\u0007\u0006\u0000\u0000\u00cb\u00cc\u0005\u0005\u0000"+
		"\u0000\u00cc\u00cd\u0005&\u0000\u0000\u00cd\u00ec\u0007\u0006\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0"+
		"\u00d1\u0005\u001b\u0000\u0000\u00d1\u00d6\u0007\u0006\u0000\u0000\u00d2"+
		"\u00d3\u0005\"\u0000\u0000\u00d3\u00d5\u0007\u0006\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00ec"+
		"\u0005\u001c\u0000\u0000\u00da\u00db\u0005\u000b\u0000\u0000\u00db\u00dc"+
		"\u0005&\u0000\u0000\u00dc\u00ec\u0005R\u0000\u0000\u00dd\u00de\u0005\n"+
		"\u0000\u0000\u00de\u00df\u0005&\u0000\u0000\u00df\u00e8\u0005\u001b\u0000"+
		"\u0000\u00e0\u00e5\u0007\u0007\u0000\u0000\u00e1\u00e2\u0005\"\u0000\u0000"+
		"\u00e2\u00e4\u0007\u0007\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0005\u001c\u0000\u0000\u00eb\u00c8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00cb\u0001\u0000\u0000\u0000\u00eb\u00ce\u0001\u0000\u0000\u0000"+
		"\u00eb\u00da\u0001\u0000\u0000\u0000\u00eb\u00dd\u0001\u0000\u0000\u0000"+
		"\u00ec\u0013\u0001\u0000\u0000\u0000\u00ed\u00f9\u0003\u001e\u000f\u0000"+
		"\u00ee\u00f9\u0003$\u0012\u0000\u00ef\u00f9\u0003 \u0010\u0000\u00f0\u00f9"+
		"\u0003\u0018\f\u0000\u00f1\u00f9\u0003\u001a\r\u0000\u00f2\u00f9\u0003"+
		"&\u0013\u0000\u00f3\u00f9\u0003*\u0015\u0000\u00f4\u00f9\u0003,\u0016"+
		"\u0000\u00f5\u00f9\u00034\u001a\u0000\u00f6\u00f9\u00032\u0019\u0000\u00f7"+
		"\u00f9\u0003\u000e\u0007\u0000\u00f8\u00ed\u0001\u0000\u0000\u0000\u00f8"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f8\u00ef\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u0015\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u008c\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0087\u0000\u0000\u00fc\u00ff\u0005\u00af\u0000\u0000\u00fd"+
		"\u00fe\u0007\b\u0000\u0000\u00fe\u0100\u0005\u00af\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0108\u0007\u0000\u0000\u0000\u0102\u0104"+
		"\u0003\u0014\n\u0000\u0103\u0105\u0005!\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001"+
		"\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0107\u010a\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0007\u0002\u0000\u0000\u010c\u0017\u0001"+
		"\u0000\u0000\u0000\u010d\u0118\u0003\b\u0004\u0000\u010e\u010f\u0005#"+
		"\u0000\u0000\u010f\u0116\u0003\u000e\u0007\u0000\u0110\u0111\u0005@\u0000"+
		"\u0000\u0111\u0114\u0005Q\u0000\u0000\u0112\u0113\u0005#\u0000\u0000\u0113"+
		"\u0115\u0005Q\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0110"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u010e\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0005!\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u0019\u0001\u0000\u0000\u0000\u011d\u0120\u0003"+
		"\b\u0004\u0000\u011e\u011f\u0005\u001b\u0000\u0000\u011f\u0121\u0005\u001c"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0129\u0001\u0000\u0000\u0000\u0122\u0126\u0005#\u0000"+
		"\u0000\u0123\u0125\u0003\u001c\u000e\u0000\u0124\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u0122\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000"+
		"\u0000\u012b\u012d\u0005!\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u001b\u0001\u0000\u0000\u0000"+
		"\u012e\u013c\u0005\u001b\u0000\u0000\u012f\u0134\u0003\u000e\u0007\u0000"+
		"\u0130\u0131\u0005\"\u0000\u0000\u0131\u0133\u0003\u000e\u0007\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0005\"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u012f"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\u001c\u0000\u0000\u0140\u001d\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0003(\u0014\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"\u00af\u0000\u0000\u0145\u0146\u0003 \u0010\u0000\u0146\u001f\u0001\u0000"+
		"\u0000\u0000\u0147\u0158\u0005\u001d\u0000\u0000\u0148\u014b\u0003\u000e"+
		"\u0007\u0000\u0149\u014b\u0003\b\u0004\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u0153\u0001\u0000\u0000"+
		"\u0000\u014c\u014f\u0005\"\u0000\u0000\u014d\u0150\u0003\u000e\u0007\u0000"+
		"\u014e\u0150\u0003\b\u0004\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151"+
		"\u014c\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156"+
		"\u014a\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b"+
		"\u015e\u0005\u001e\u0000\u0000\u015c\u015d\u0005&\u0000\u0000\u015d\u015f"+
		"\u0003\n\u0005\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u016e\u0001\u0000\u0000\u0000\u0160\u0164\u0007"+
		"\u0000\u0000\u0000\u0161\u0163\u0003\u0014\n\u0000\u0162\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0169\u0007\u0002"+
		"\u0000\u0000\u0168\u0160\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016f\u0001\u0000\u0000\u0000\u016a\u016c\u0003\u0014"+
		"\n\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016f\u0003\"\u0011\u0000"+
		"\u016e\u0168\u0001\u0000\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000"+
		"\u016e\u016d\u0001\u0000\u0000\u0000\u016f!\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0005P\u0000\u0000\u0171\u0172\u0003\u000e\u0007\u0000\u0172#\u0001"+
		"\u0000\u0000\u0000\u0173\u0175\u0003(\u0014\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005\u00af\u0000\u0000\u0177\u0182\u0005\u001d"+
		"\u0000\u0000\u0178\u017d\u0003\u000e\u0007\u0000\u0179\u017a\u0005\"\u0000"+
		"\u0000\u017a\u017c\u0003\u000e\u0007\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0178\u0001\u0000\u0000"+
		"\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u001e\u0000"+
		"\u0000\u0186%\u0001\u0000\u0000\u0000\u0187\u0189\u0003(\u0014\u0000\u0188"+
		"\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u00af\u0000\u0000\u018b"+
		"\u018c\u0005#\u0000\u0000\u018c\u018d\u0003\u000e\u0007\u0000\u018d\u018e"+
		"\u0005!\u0000\u0000\u018e\'\u0001\u0000\u0000\u0000\u018f\u0190\u0007"+
		"\t\u0000\u0000\u0190\u0191\u0005(\u0000\u0000\u0191)\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0005_\u0000\u0000\u0193\u0195\u0003(\u0014\u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0003\u000e\u0007\u0000\u0197"+
		"\u0198\u0005!\u0000\u0000\u0198+\u0001\u0000\u0000\u0000\u0199\u019a\u0005"+
		"j\u0000\u0000\u019a\u019b\u0005\u001d\u0000\u0000\u019b\u01a1\u00032\u0019"+
		"\u0000\u019c\u019d\u00030\u0018\u0000\u019d\u019e\u00032\u0019\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u019c\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u001e\u0000\u0000\u01a5"+
		"\u01a9\u0007\u0000\u0000\u0000\u01a6\u01a8\u0003\u0014\n\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ae"+
		"\u0007\u0002\u0000\u0000\u01ad\u01af\u0003.\u0017\u0000\u01ae\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af-\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005Z\u0000\u0000\u01b1\u01bc\u0003\u0014\n"+
		"\u0000\u01b2\u01b3\u0005Z\u0000\u0000\u01b3\u01b7\u0007\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0003\u0014\n\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bc\u0007\u0002\u0000\u0000\u01bb"+
		"\u01b0\u0001\u0000\u0000\u0000\u01bb\u01b2\u0001\u0000\u0000\u0000\u01bc"+
		"/\u0001\u0000\u0000\u0000\u01bd\u01be\u0007\n\u0000\u0000\u01be1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0003\u000e\u0007\u0000\u01c0\u01c1\u0003"+
		"0\u0018\u0000\u01c1\u01c2\u0003\u000e\u0007\u0000\u01c23\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0005b\u0000\u0000\u01c4\u01c5\u0005\u001d\u0000\u0000"+
		"\u01c5\u01c6\u0005\u008f\u0000\u0000\u01c6\u01c7\u0005\u00af\u0000\u0000"+
		"\u01c7\u01c8\u0005\u00a0\u0000\u0000\u01c8\u01c9\u0005\u00af\u0000\u0000"+
		"\u01c9\u01ca\u0005\u001e\u0000\u0000\u01ca\u01cb\u00036\u001b\u0000\u01cb"+
		"5\u0001\u0000\u0000\u0000\u01cc\u01d6\u0003\u0014\n\u0000\u01cd\u01cf"+
		"\u0007\u0000\u0000\u0000\u01ce\u01d0\u0003\u0014\n\u0000\u01cf\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0007\u0002\u0000\u0000\u01d4\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d5\u01cc\u0001\u0000\u0000\u0000\u01d5\u01cd\u0001"+
		"\u0000\u0000\u0000\u01d67\u0001\u0000\u0000\u0000\u01d7\u01d8\u0007\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0005\u00af\u0000\u0000\u01d9\u01da\u0005&\u0000"+
		"\u0000\u01da\u01e1\u0003\u000e\u0007\u0000\u01db\u01dc\u0005\"\u0000\u0000"+
		"\u01dc\u01dd\u0005\u00af\u0000\u0000\u01dd\u01de\u0005&\u0000\u0000\u01de"+
		"\u01e0\u0003\u000e\u0007\u0000\u01df\u01db\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005\"\u0000\u0000\u01e5\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0007\u0002\u0000\u0000\u01e89\u0001"+
		"\u0000\u0000\u0000\u01e9\u01f9\u0003<\u001e\u0000\u01ea\u01f9\u0003>\u001f"+
		"\u0000\u01eb\u01ec\u0007\u000b\u0000\u0000\u01ec\u01ed\u0005#\u0000\u0000"+
		"\u01ed\u01f9\u0005\u0019\u0000\u0000\u01ee\u01ef\u0005\u001b\u0000\u0000"+
		"\u01ef\u01f0\u0007\u000b\u0000\u0000\u01f0\u01f1\u0005\u001c\u0000\u0000"+
		"\u01f1\u01f2\u0005#\u0000\u0000\u01f2\u01f9\u0007\f\u0000\u0000\u01f3"+
		"\u01f4\u0005\u001d\u0000\u0000\u01f4\u01f5\u0007\u000b\u0000\u0000\u01f5"+
		"\u01f6\u0005\u001e\u0000\u0000\u01f6\u01f7\u0005#\u0000\u0000\u01f7\u01f9"+
		"\u0005\u0019\u0000\u0000\u01f8\u01e9\u0001\u0000\u0000\u0000\u01f8\u01ea"+
		"\u0001\u0000\u0000\u0000\u01f8\u01eb\u0001\u0000\u0000\u0000\u01f8\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f3\u0001\u0000\u0000\u0000\u01f9;\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0005/\u0000\u0000\u01fb\u01fc\u0005\u0002"+
		"\u0000\u0000\u01fc\u01fd\u0005#\u0000\u0000\u01fd\u01fe\u0005\u008f\u0000"+
		"\u0000\u01fe\u01ff\u0005\u00af\u0000\u0000\u01ff\u0200\u0005\u00a0\u0000"+
		"\u0000\u0200\u0201\u0005\u00af\u0000\u0000\u0201=\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0005/\u0000\u0000\u0203\u0204\u0005\u0003\u0000\u0000\u0204"+
		"\u0207\u0005#\u0000\u0000\u0205\u0208\u0005\u00af\u0000\u0000\u0206\u0208"+
		"\u00032\u0019\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001"+
		"\u0000\u0000\u0000\u0208?\u0001\u0000\u0000\u0000\u0209\u020d\u0003F#"+
		"\u0000\u020a\u020c\u0003@ \u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020c"+
		"\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0001\u0000\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u0210\u0211\u0003H$\u0000\u0211\u0216\u0001"+
		"\u0000\u0000\u0000\u0212\u0216\u0003J%\u0000\u0213\u0216\u0005\u00b4\u0000"+
		"\u0000\u0214\u0216\u0003B!\u0000\u0215\u0209\u0001\u0000\u0000\u0000\u0215"+
		"\u0212\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0216A\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0007\u0000\u0000\u0000\u0218\u021c\u0007\u0000\u0000\u0000\u0219\u021b"+
		"\u0003\u000e\u0007\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021e"+
		"\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0001\u0000\u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u021c"+
		"\u0001\u0000\u0000\u0000\u021f\u0220\u0007\u0002\u0000\u0000\u0220\u0221"+
		"\u0007\u0002\u0000\u0000\u0221C\u0001\u0000\u0000\u0000\u0222\u0223\u0007"+
		"\r\u0000\u0000\u0223E\u0001\u0000\u0000\u0000\u0224\u0227\u0007\u000e"+
		"\u0000\u0000\u0225\u0228\u0003D\"\u0000\u0226\u0228\u0005\u00af\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u022c\u0001\u0000\u0000\u0000\u0229\u022b\u0003:\u001d\u0000"+
		"\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u0007\u000f\u0000\u0000\u0230G\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0007\u000e\u0000\u0000\u0232\u0235\u00050\u0000\u0000\u0233\u0236"+
		"\u0003D\"\u0000\u0234\u0236\u0005\u00af\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0007\u000f\u0000\u0000\u0238I\u0001\u0000"+
		"\u0000\u0000\u0239\u023c\u0007\u000e\u0000\u0000\u023a\u023d\u0003D\""+
		"\u0000\u023b\u023d\u0005\u00af\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023d\u0241\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0003:\u001d\u0000\u023f\u023e\u0001\u0000\u0000\u0000"+
		"\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000"+
		"\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0245\u00050\u0000\u0000\u0245"+
		"\u0246\u0007\u000f\u0000\u0000\u0246K\u0001\u0000\u0000\u0000AOX_nty}"+
		"\u007f\u009f\u00b4\u00b6\u00c2\u00d6\u00e5\u00e8\u00eb\u00f8\u00ff\u0104"+
		"\u0108\u0114\u0116\u0118\u011b\u0120\u0126\u0129\u012c\u0134\u0138\u013c"+
		"\u0142\u014a\u014f\u0153\u0158\u015e\u0164\u0168\u016b\u016e\u0174\u017d"+
		"\u0182\u0188\u0194\u01a1\u01a9\u01ae\u01b7\u01bb\u01d1\u01d5\u01e1\u01e5"+
		"\u01f8\u0207\u020d\u0215\u021c\u0227\u022c\u0235\u023c\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}