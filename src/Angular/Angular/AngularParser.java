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
		DoubleQuote=24, BackTickQuote=25, OpenBracket=26, CloseBracket=27, OpenParen=28, 
		CloseParen=29, OpenBrace=30, CloseBrace=31, SemiColon=32, Comma=33, Assign=34, 
		QuestionMark=35, QuestionMarkDot=36, Colon=37, Ellipsis=38, Dot=39, PlusPlus=40, 
		MinusMinus=41, Plus=42, Minus=43, BitNot=44, Not=45, Multiply=46, Divide=47, 
		Modulus=48, Power=49, NullCoalesce=50, Hashtag=51, LeftShiftArithmetic=52, 
		LessThan=53, MoreThan=54, LessThanEquals=55, GreaterThanEquals=56, Equals_=57, 
		NotEquals=58, IdentityEquals=59, IdentityNotEquals=60, BitAnd=61, BitXOr=62, 
		BitOr=63, And=64, Or=65, MultiplyAssign=66, DivideAssign=67, ModulusAssign=68, 
		PlusAssign=69, MinusAssign=70, LeftShiftArithmeticAssign=71, RightShiftArithmeticAssign=72, 
		RightShiftLogicalAssign=73, BitAndAssign=74, BitXorAssign=75, BitOrAssign=76, 
		PowerAssign=77, NullishCoalescingAssign=78, ARROW=79, NullLiteral=80, 
		BooleanLiteral=81, DecimalLiteral=82, BigDecimalIntegerLiteral=83, Break=84, 
		Do=85, Instanceof=86, Typeof=87, Case=88, Else=89, New=90, Var=91, Catch=92, 
		Finally=93, Return=94, Void=95, Continue=96, For=97, Switch=98, While=99, 
		Debugger=100, Function_=101, This=102, With=103, Default=104, If=105, 
		Throw=106, Delete=107, In=108, Try=109, As=110, From=111, ReadOnly=112, 
		Async=113, Await=114, Yield=115, YieldStar=116, Class=117, Enum=118, Extends=119, 
		Super=120, Const=121, Export=122, Import=123, Implements=124, Let=125, 
		Private=126, Public=127, Interface=128, Package=129, Protected=130, Static=131, 
		Any=132, Number=133, Never=134, Boolean=135, String=136, Int=137, Unique=138, 
		Symbol=139, Undefined=140, Object=141, Of=142, KeyOf=143, TypeAlias=144, 
		Constructor=145, Namespace=146, Require=147, Module=148, Declare=149, 
		Abstract=150, Is=151, At=152, WhiteSpaces=153, Comment=154, HtmlComment=155, 
		CDataComment=156, ID=157, OpenTag=158, CloseTag=159, OpenBraceHTML=160, 
		CloseBraceHTML=161, TEXT=162, WS=163;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_importStatement = 2, RULE_interface = 3, 
		RULE_variableNaming = 4, RULE_varType = 5, RULE_string = 6, RULE_value = 7, 
		RULE_componentDeclaration = 8, RULE_componentInfo = 9, RULE_genericStatement = 10, 
		RULE_classStructure = 11, RULE_variableDeclaration = 12, RULE_arrayDeclaration = 13, 
		RULE_arrayInfo = 14, RULE_functionDeclaration = 15, RULE_functionBody = 16, 
		RULE_functionCall = 17, RULE_assignStatement = 18, RULE_thisorId = 19, 
		RULE_returnStatement = 20, RULE_ifStatement = 21, RULE_conditionalState = 22, 
		RULE_logicalOp = 23, RULE_logicalStatement = 24, RULE_forLoop = 25, RULE_forBody = 26, 
		RULE_jsonObject = 27, RULE_attribute = 28, RULE_ngForStatement = 29, RULE_ngIfStatement = 30, 
		RULE_htmlTags = 31, RULE_interpolation = 32, RULE_openTag = 33, RULE_closeTag = 34, 
		RULE_selfClosingTag = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expression", "importStatement", "interface", "variableNaming", 
			"varType", "string", "value", "componentDeclaration", "componentInfo", 
			"genericStatement", "classStructure", "variableDeclaration", "arrayDeclaration", 
			"arrayInfo", "functionDeclaration", "functionBody", "functionCall", "assignStatement", 
			"thisorId", "returnStatement", "ifStatement", "conditionalState", "logicalOp", 
			"logicalStatement", "forLoop", "forBody", "jsonObject", "attribute", 
			"ngForStatement", "ngIfStatement", "htmlTags", "interpolation", "openTag", 
			"closeTag", "selfClosingTag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", null, null, "'selector'", "'templateUrl'", "'template'", 
			"'styleUrls'", "'styleUrl'", "'styles'", "'imports'", "'standalone'", 
			"'get'", null, null, null, null, null, null, null, "'\"'", null, null, 
			null, null, null, "'['", "']'", "'('", "')'", null, null, "';'", "','", 
			"'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", 
			"'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", "'<<'", null, 
			null, "'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", 
			"'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
			"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='", "'??='", "'=>'", 
			"'null'", null, null, null, "'break'", "'do'", "'instanceof'", "'typeof'", 
			"'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", 
			"'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
			"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'try'", "'as'", "'from'", "'readonly'", "'async'", "'await'", 
			"'yield'", "'yield*'", "'class'", "'enum'", "'extends'", "'super'", "'const'", 
			"'export'", "'import'", "'implements'", "'let'", "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", "'any'", "'number'", 
			"'never'", "'boolean'", "'string'", "'int'", "'unique'", "'symbol'", 
			"'undefined'", "'object'", "'of'", "'keyof'", "'type'", "'constructor'", 
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
			"DoubleQuote", "BackTickQuote", "OpenBracket", "CloseBracket", "OpenParen", 
			"CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign", 
			"QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", "Dot", "PlusPlus", 
			"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
			"Modulus", "Power", "NullCoalesce", "Hashtag", "LeftShiftArithmetic", 
			"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", 
			"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
			"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "NullishCoalescingAssign", "ARROW", "NullLiteral", "BooleanLiteral", 
			"DecimalLiteral", "BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", 
			"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
			"Void", "Continue", "For", "Switch", "While", "Debugger", "Function_", 
			"This", "With", "Default", "If", "Throw", "Delete", "In", "Try", "As", 
			"From", "ReadOnly", "Async", "Await", "Yield", "YieldStar", "Class", 
			"Enum", "Extends", "Super", "Const", "Export", "Import", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Any", "Number", "Never", "Boolean", "String", "Int", "Unique", "Symbol", 
			"Undefined", "Object", "Of", "KeyOf", "TypeAlias", "Constructor", "Namespace", 
			"Require", "Module", "Declare", "Abstract", "Is", "At", "WhiteSpaces", 
			"Comment", "HtmlComment", "CDataComment", "ID", "OpenTag", "CloseTag", 
			"OpenBraceHTML", "CloseBraceHTML", "TEXT", "WS"
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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				expression();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007200722747392L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 332052549486597L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 1377L) != 0) );
			setState(77);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				importStatement();
				}
				break;
			case Interface:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				interface_();
				}
				break;
			case At:
				_localctx = new ComponentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				componentDeclaration();
				}
				break;
			case Export:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				classStructure();
				}
				break;
			case SingleQuote:
			case DoubleQuote:
			case BackTickQuote:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case LessThan:
			case NullLiteral:
			case DecimalLiteral:
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
				setState(83);
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
			setState(86);
			match(Import);
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(89);
				match(As);
				setState(90);
				match(ID);
				}
			}

			setState(93);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(From);
			setState(95);
			match(SingleQuote);
			setState(96);
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
			setState(98);
			match(Interface);
			setState(99);
			match(ID);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 18253611009L) != 0) || _la==ID) {
				{
				{
				setState(101);
				variableNaming();
				setState(102);
				match(SemiColon);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		public List<TerminalNode> NullLiteral() { return getTokens(AngularParser.NullLiteral); }
		public TerminalNode NullLiteral(int i) {
			return getToken(AngularParser.NullLiteral, i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(111);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 18253611009L) != 0) || _la==ID) ) {
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
			setState(114);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(115);
					match(Colon);
					setState(116);
					varType();
					}
				}

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BitOr) {
					{
					setState(119);
					match(BitOr);
					setState(120);
					match(NullLiteral);
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(121);
						match(Assign);
						setState(122);
						match(NullLiteral);
						}
						break;
					}
					}
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
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 4611693852447735809L) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
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
	public static class FunctionSummoningContext extends ValueContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionSummoningContext(ValueContext ctx) { copyFrom(ctx); }
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
	public static class FunctionContext extends ValueContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionContext(ValueContext ctx) { copyFrom(ctx); }
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
	public static class FunctionStatementContext extends ValueContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionStatementContext(ValueContext ctx) { copyFrom(ctx); }
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				functionDeclaration();
				}
				break;
			case 3:
				{
				_localctx = new FunctionSummoningContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new FunctionStatementContext(_localctx);
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
				_localctx = new HtmlTagValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				htmlTags();
				}
				break;
			case 8:
				{
				_localctx = new StringValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				string();
				}
				break;
			case 9:
				{
				_localctx = new DecimalNumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(DecimalLiteral);
				}
				break;
			case 10:
				{
				_localctx = new VariableValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new NullValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(NullLiteral);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ValueDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						match(Dot);
						setState(152);
						value(10);
						}
						break;
					case 2:
						{
						_localctx = new NullableDotValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154);
						match(QuestionMarkDot);
						setState(155);
						value(9);
						}
						break;
					case 3:
						{
						_localctx = new ValueOrValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						match(Or);
						setState(158);
						value(7);
						}
						break;
					case 4:
						{
						_localctx = new NullableValueContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(159);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(160);
						match(QuestionMark);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(166);
			match(At);
			setState(167);
			match(Component);
			setState(168);
			match(OpenParen);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			componentInfo();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(171);
				match(Comma);
				setState(172);
				componentInfo();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(179);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Selector);
				setState(182);
				match(Colon);
				setState(183);
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
				setState(184);
				match(TemplateUrl);
				setState(185);
				match(Colon);
				setState(186);
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
				setState(187);
				match(StyleUrls);
				setState(188);
				match(Colon);
				setState(189);
				match(OpenBracket);
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==SingleQuote || _la==BackTickQuote) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(191);
					match(Comma);
					setState(192);
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
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(CloseBracket);
				}
				break;
			case Standalone:
				_localctx = new StandaloneStatusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(Standalone);
				setState(200);
				match(Colon);
				setState(201);
				match(BooleanLiteral);
				}
				break;
			case Imports:
				_localctx = new ImportssContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(Imports);
				setState(203);
				match(Colon);
				setState(204);
				match(OpenBracket);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NgFor || _la==NgIf || _la==ID) {
					{
					setState(205);
					_la = _input.LA(1);
					if ( !(_la==NgFor || _la==NgIf || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(206);
						match(Comma);
						setState(207);
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
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(215);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				arrayDeclaration();
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				assignStatement();
				}
				break;
			case 4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				returnStatement();
				}
				break;
			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				ifStatement();
				}
				break;
			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				forLoop();
				}
				break;
			case 7:
				_localctx = new ValueTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
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
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
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
			setState(227);
			match(Export);
			setState(228);
			match(Class);
			setState(229);
			match(ID);
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007200722747392L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 37383433242629L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 43L) != 0)) {
				{
				{
				setState(231);
				genericStatement();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(232);
					match(SemiColon);
					}
				}

				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			variableNaming();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(243);
				match(Assign);
				setState(244);
				value(0);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BitOr) {
					{
					setState(245);
					match(BitOr);
					setState(246);
					match(NullLiteral);
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(247);
						match(Assign);
						setState(248);
						match(NullLiteral);
						}
					}

					}
				}

				}
			}

			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(255);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			variableNaming();
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(259);
				match(OpenBracket);
				setState(260);
				match(CloseBracket);
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(263);
				match(Assign);
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						arrayInfo();
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
			}

			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(272);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
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
			setState(275);
			match(OpenBracket);
			setState(276);
			value(0);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(Comma);
					setState(278);
					value(0);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(284);
				match(Comma);
				}
			}

			setState(287);
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
			setState(289);
			match(ID);
			setState(290);
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
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
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
			setState(292);
			match(OpenParen);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 18253611009L) != 0) || _la==ID) {
				{
				{
				setState(293);
				variableNaming();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(294);
					match(Comma);
					setState(295);
					variableNaming();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(CloseParen);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(307);
				match(ARROW);
				}
			}

			setState(310);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007200722747392L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 37383433242629L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 43L) != 0)) {
				{
				{
				setState(311);
				genericStatement();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
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
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ID);
			setState(320);
			match(OpenParen);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 720575941453021359L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 43L) != 0)) {
				{
				{
				setState(321);
				value(0);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(322);
					match(Comma);
					setState(323);
					value(0);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
		enterRule(_localctx, 36, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(336);
				thisorId();
				}
				break;
			}
			setState(339);
			match(ID);
			setState(340);
			match(Assign);
			setState(341);
			value(0);
			setState(342);
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
		enterRule(_localctx, 38, RULE_thisorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==This || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(345);
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
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Return);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(348);
				thisorId();
				}
				break;
			}
			setState(351);
			value(0);
			setState(352);
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
		public ConditionalStateContext conditionalState() {
			return getRuleContext(ConditionalStateContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
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
		public List<TerminalNode> Else() { return getTokens(AngularParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(AngularParser.Else, i);
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
		enterRule(_localctx, 42, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(If);
			setState(355);
			match(OpenParen);
			setState(356);
			conditionalState();
			setState(357);
			match(CloseParen);
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007200722747392L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 37383433242629L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 43L) != 0)) {
				{
				{
				setState(359);
				genericStatement();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					match(Else);
					setState(367);
					genericStatement();
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class ConditionalStateContext extends ParserRuleContext {
		public ConditionalStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalState; }
	 
		public ConditionalStateContext() { }
		public void copyFrom(ConditionalStateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends ConditionalStateContext {
		public List<LogicalStatementContext> logicalStatement() {
			return getRuleContexts(LogicalStatementContext.class);
		}
		public LogicalStatementContext logicalStatement(int i) {
			return getRuleContext(LogicalStatementContext.class,i);
		}
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public ConditionalStatementContext(ConditionalStateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ConditionalStateContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public VariableNameContext(ConditionalStateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStateContext conditionalState() throws RecognitionException {
		ConditionalStateContext _localctx = new ConditionalStateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionalState);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				logicalStatement();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 2047L) != 0)) {
					{
					{
					setState(374);
					logicalOp();
					setState(375);
					logicalStatement();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new VariableNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
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
	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode LessThanEquals() { return getToken(AngularParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(AngularParser.GreaterThanEquals, 0); }
		public TerminalNode Equals_() { return getToken(AngularParser.Equals_, 0); }
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
		enterRule(_localctx, 46, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 2047L) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_logicalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(387);
			value(0);
			{
			setState(388);
			logicalOp();
			}
			setState(389);
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
		enterRule(_localctx, 50, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(For);
			setState(392);
			match(OpenParen);
			setState(393);
			match(Let);
			setState(394);
			match(ID);
			setState(395);
			match(Of);
			setState(396);
			match(ID);
			setState(397);
			match(CloseParen);
			setState(398);
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
		enterRule(_localctx, 52, RULE_forBody);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new SingleLineForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				genericStatement();
				}
				break;
			case 2:
				_localctx = new MultipleLinesForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(402);
					genericStatement();
					}
					}
					setState(405); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9007200722747392L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 37383433242629L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 43L) != 0) );
				setState(407);
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
		enterRule(_localctx, 54, RULE_jsonObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(412);
			match(ID);
			setState(413);
			match(Colon);
			setState(414);
			value(0);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(415);
				match(Comma);
				setState(416);
				match(ID);
				setState(417);
				match(Colon);
				setState(418);
				value(0);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
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
		public TerminalNode DoubleQuote() { return getToken(AngularParser.DoubleQuote, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
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
		enterRule(_localctx, 56, RULE_attribute);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new NgForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				ngForStatement();
				}
				break;
			case 2:
				_localctx = new NgIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				ngIfStatement();
				}
				break;
			case 3:
				_localctx = new DoubleQuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				match(Assign);
				setState(430);
				match(DoubleQuote);
				}
				break;
			case 4:
				_localctx = new OpenBracketAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(OpenBracket);
				setState(432);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(433);
				match(CloseBracket);
				setState(434);
				match(Assign);
				setState(435);
				match(DoubleQuote);
				}
				break;
			case 5:
				_localctx = new OpenParenAttributeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				match(OpenParen);
				setState(437);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(438);
				match(CloseParen);
				setState(439);
				match(Assign);
				setState(440);
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
		enterRule(_localctx, 58, RULE_ngForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(Multiply);
			setState(444);
			match(NgFor);
			setState(445);
			match(Assign);
			{
			setState(446);
			match(Let);
			setState(447);
			match(ID);
			setState(448);
			match(Of);
			setState(449);
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
		enterRule(_localctx, 60, RULE_ngIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(Multiply);
			setState(452);
			match(NgIf);
			setState(453);
			match(Assign);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(454);
				match(ID);
				}
				break;
			case 2:
				{
				setState(455);
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
		enterRule(_localctx, 62, RULE_htmlTags);
		try {
			int _alt;
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new PairedTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				openTag();
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(459);
						htmlTags();
						}
						} 
					}
					setState(464);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(465);
				closeTag();
				}
				break;
			case 2:
				_localctx = new UnpairedTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new NormalHtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(TEXT);
				}
				break;
			case 4:
				_localctx = new HtmlInterpolationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
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
		enterRule(_localctx, 64, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 720575941453021359L) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 43L) != 0)) {
				{
				{
				setState(474);
				value(0);
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceHTML) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(481);
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
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
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
		enterRule(_localctx, 66, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(484);
			match(ID);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70369079721984L) != 0) || _la==Class || _la==ID) {
				{
				{
				setState(485);
				attribute();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
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
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
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
		enterRule(_localctx, 68, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(494);
			match(Divide);
			setState(495);
			match(ID);
			setState(496);
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
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode MoreThan() { return getToken(AngularParser.MoreThan, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
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
		enterRule(_localctx, 70, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==LessThan || _la==OpenTag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(499);
			match(ID);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70369079721984L) != 0) || _la==Class || _la==ID) {
				{
				{
				setState(500);
				attribute();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(Divide);
			setState(507);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00a3\u01fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0001\u0000\u0004\u0000J\b\u0000\u000b\u0000\f\u0000"+
		"K\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003i\b\u0003\n\u0003\f\u0003"+
		"l\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004q\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004|\b\u0004\u0003\u0004~\b\u0004"+
		"\u0003\u0004\u0080\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a2\b\u0007"+
		"\n\u0007\f\u0007\u00a5\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00ae\b\b\n\b\f\b\u00b1\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c2\b\t\n\t\f\t\u00c5\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00d1\b\t\n\t\f\t\u00d4\t\t\u0003\t\u00d6\b\t\u0001\t\u0003"+
		"\t\u00d9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00e2\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ea\b\u000b\u0005\u000b\u00ec\b\u000b\n\u000b"+
		"\f\u000b\u00ef\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fa\b\f\u0003\f\u00fc\b\f\u0003"+
		"\f\u00fe\b\f\u0001\f\u0003\f\u0101\b\f\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u0106\b\r\u0001\r\u0001\r\u0005\r\u010a\b\r\n\r\f\r\u010d\t\r\u0003\r"+
		"\u010f\b\r\u0001\r\u0003\r\u0112\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0118\b\u000e\n\u000e\f\u000e\u011b\t\u000e\u0001"+
		"\u000e\u0003\u000e\u011e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0129\b\u0010\n\u0010\f\u0010\u012c\t\u0010\u0005\u0010\u012e\b"+
		"\u0010\n\u0010\f\u0010\u0131\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0135\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0139\b\u0010\n\u0010"+
		"\f\u0010\u013c\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0145\b\u0011\n\u0011"+
		"\f\u0011\u0148\t\u0011\u0005\u0011\u014a\b\u0011\n\u0011\f\u0011\u014d"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u0152\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u015e\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0169\b\u0015\n\u0015"+
		"\f\u0015\u016c\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0171\b\u0015\n\u0015\f\u0015\u0174\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u017a\b\u0016\n\u0016\f\u0016\u017d\t\u0016"+
		"\u0001\u0016\u0003\u0016\u0180\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u0194\b\u001a\u000b\u001a"+
		"\f\u001a\u0195\u0001\u001a\u0001\u001a\u0003\u001a\u019a\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01a4\b\u001b\n\u001b\f\u001b\u01a7\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01ba\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01c9\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01cd\b\u001f\n\u001f\f\u001f\u01d0\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01d7\b\u001f\u0001"+
		" \u0001 \u0001 \u0005 \u01dc\b \n \f \u01df\t \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0005!\u01e7\b!\n!\f!\u01ea\t!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u01f6\b#\n#\f#"+
		"\u01f9\t#\u0001#\u0001#\u0001#\u0001#\u0000\u0001\u000e$\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDF\u0000\r\u0002\u0000\u001e\u001e\u00a0\u00a0\u0002\u0000"+
		"\u0001\u0003\u009d\u009d\u0002\u0000\u001f\u001f\u00a1\u00a1\u0004\u0000"+
		"[[yy}}\u009d\u009d\u0004\u0000__\u0084\u0084\u0087\u0089\u009d\u009d\u0001"+
		"\u0000\u0017\u0019\u0002\u0000\u0017\u0017\u0019\u0019\u0002\u0000\u0002"+
		"\u0003\u009d\u009d\u0002\u0000ff\u009d\u009d\u0001\u00007A\u0002\u0000"+
		"uu\u009d\u009d\u0002\u000055\u009e\u009e\u0002\u000066\u009f\u009f\u0228"+
		"\u0000I\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004V"+
		"\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bp\u0001\u0000"+
		"\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u0083\u0001\u0000\u0000"+
		"\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00a6\u0001\u0000\u0000"+
		"\u0000\u0012\u00d8\u0001\u0000\u0000\u0000\u0014\u00e1\u0001\u0000\u0000"+
		"\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018\u00f2\u0001\u0000\u0000"+
		"\u0000\u001a\u0102\u0001\u0000\u0000\u0000\u001c\u0113\u0001\u0000\u0000"+
		"\u0000\u001e\u0121\u0001\u0000\u0000\u0000 \u0124\u0001\u0000\u0000\u0000"+
		"\"\u013f\u0001\u0000\u0000\u0000$\u0151\u0001\u0000\u0000\u0000&\u0158"+
		"\u0001\u0000\u0000\u0000(\u015b\u0001\u0000\u0000\u0000*\u0162\u0001\u0000"+
		"\u0000\u0000,\u017f\u0001\u0000\u0000\u0000.\u0181\u0001\u0000\u0000\u0000"+
		"0\u0183\u0001\u0000\u0000\u00002\u0187\u0001\u0000\u0000\u00004\u0199"+
		"\u0001\u0000\u0000\u00006\u019b\u0001\u0000\u0000\u00008\u01b9\u0001\u0000"+
		"\u0000\u0000:\u01bb\u0001\u0000\u0000\u0000<\u01c3\u0001\u0000\u0000\u0000"+
		">\u01d6\u0001\u0000\u0000\u0000@\u01d8\u0001\u0000\u0000\u0000B\u01e3"+
		"\u0001\u0000\u0000\u0000D\u01ed\u0001\u0000\u0000\u0000F\u01f2\u0001\u0000"+
		"\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0005\u0000\u0000\u0001N\u0001\u0001\u0000"+
		"\u0000\u0000OU\u0003\u0004\u0002\u0000PU\u0003\u0006\u0003\u0000QU\u0003"+
		"\u0010\b\u0000RU\u0003\u0016\u000b\u0000SU\u0003\u0014\n\u0000TO\u0001"+
		"\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0003\u0001\u0000"+
		"\u0000\u0000VW\u0005{\u0000\u0000WX\u0007\u0000\u0000\u0000X[\u0007\u0001"+
		"\u0000\u0000YZ\u0005n\u0000\u0000Z\\\u0005\u009d\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0007"+
		"\u0002\u0000\u0000^_\u0005o\u0000\u0000_`\u0005\u0017\u0000\u0000`a\u0005"+
		" \u0000\u0000a\u0005\u0001\u0000\u0000\u0000bc\u0005\u0080\u0000\u0000"+
		"cd\u0005\u009d\u0000\u0000dj\u0007\u0000\u0000\u0000ef\u0003\b\u0004\u0000"+
		"fg\u0005 \u0000\u0000gi\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0007\u0002"+
		"\u0000\u0000n\u0007\u0001\u0000\u0000\u0000oq\u0007\u0003\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u007f\u0005\u009d\u0000\u0000st\u0005%\u0000\u0000tv\u0003\n\u0005"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v}\u0001\u0000"+
		"\u0000\u0000wx\u0005?\u0000\u0000x{\u0005P\u0000\u0000yz\u0005\"\u0000"+
		"\u0000z|\u0005P\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007fu\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0007\u0004\u0000\u0000\u0082\u000b\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0007\u0005\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0006\u0007\uffff\uffff\u0000\u0086\u0095\u0003\u001c\u000e\u0000\u0087"+
		"\u0095\u0003\u001e\u000f\u0000\u0088\u0095\u0003\"\u0011\u0000\u0089\u0095"+
		"\u0003 \u0010\u0000\u008a\u0095\u00036\u001b\u0000\u008b\u008c\u0005\u001c"+
		"\u0000\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0005\u001d"+
		"\u0000\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f\u0095\u0003>\u001f"+
		"\u0000\u0090\u0095\u0003\f\u0006\u0000\u0091\u0095\u0005R\u0000\u0000"+
		"\u0092\u0095\u0005\u009d\u0000\u0000\u0093\u0095\u0005P\u0000\u0000\u0094"+
		"\u0085\u0001\u0000\u0000\u0000\u0094\u0087\u0001\u0000\u0000\u0000\u0094"+
		"\u0088\u0001\u0000\u0000\u0000\u0094\u0089\u0001\u0000\u0000\u0000\u0094"+
		"\u008a\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094"+
		"\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0094"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u00a3\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\n\t\u0000\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098\u00a2\u0003"+
		"\u000e\u0007\n\u0099\u009a\n\b\u0000\u0000\u009a\u009b\u0005$\u0000\u0000"+
		"\u009b\u00a2\u0003\u000e\u0007\t\u009c\u009d\n\u0006\u0000\u0000\u009d"+
		"\u009e\u0005A\u0000\u0000\u009e\u00a2\u0003\u000e\u0007\u0007\u009f\u00a0"+
		"\n\u0007\u0000\u0000\u00a0\u00a2\u0005#\u0000\u0000\u00a1\u0096\u0001"+
		"\u0000\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000\u00a1\u009c\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0098\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0001\u0000\u0000\u00a8\u00a9\u0005\u001c\u0000\u0000\u00a9\u00aa\u0007"+
		"\u0000\u0000\u0000\u00aa\u00af\u0003\u0012\t\u0000\u00ab\u00ac\u0005!"+
		"\u0000\u0000\u00ac\u00ae\u0003\u0012\t\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0002\u0000"+
		"\u0000\u00b3\u00b4\u0005\u001d\u0000\u0000\u00b4\u0011\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b7\u0005%\u0000\u0000"+
		"\u00b7\u00d9\u0007\u0006\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000"+
		"\u00b9\u00ba\u0005%\u0000\u0000\u00ba\u00d9\u0007\u0006\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0007\u0000\u0000\u00bc\u00bd\u0005%\u0000\u0000\u00bd\u00be"+
		"\u0005\u001a\u0000\u0000\u00be\u00c3\u0007\u0006\u0000\u0000\u00bf\u00c0"+
		"\u0005!\u0000\u0000\u00c0\u00c2\u0007\u0006\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00d9\u0005"+
		"\u001b\u0000\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8\u00c9\u0005"+
		"%\u0000\u0000\u00c9\u00d9\u0005Q\u0000\u0000\u00ca\u00cb\u0005\n\u0000"+
		"\u0000\u00cb\u00cc\u0005%\u0000\u0000\u00cc\u00d5\u0005\u001a\u0000\u0000"+
		"\u00cd\u00d2\u0007\u0007\u0000\u0000\u00ce\u00cf\u0005!\u0000\u0000\u00cf"+
		"\u00d1\u0007\u0007\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0005\u001b\u0000\u0000\u00d8\u00b5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00b8\u0001\u0000\u0000\u0000\u00d8\u00bb\u0001\u0000\u0000\u0000\u00d8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d8\u00ca\u0001\u0000\u0000\u0000\u00d9"+
		"\u0013\u0001\u0000\u0000\u0000\u00da\u00e2\u0003\u0018\f\u0000\u00db\u00e2"+
		"\u0003\u001a\r\u0000\u00dc\u00e2\u0003$\u0012\u0000\u00dd\u00e2\u0003"+
		"(\u0014\u0000\u00de\u00e2\u0003*\u0015\u0000\u00df\u00e2\u00032\u0019"+
		"\u0000\u00e0\u00e2\u0003\u000e\u0007\u0000\u00e1\u00da\u0001\u0000\u0000"+
		"\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u0015\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005z\u0000\u0000"+
		"\u00e4\u00e5\u0005u\u0000\u0000\u00e5\u00e6\u0005\u009d\u0000\u0000\u00e6"+
		"\u00ed\u0007\u0000\u0000\u0000\u00e7\u00e9\u0003\u0014\n\u0000\u00e8\u00ea"+
		"\u0005 \u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007"+
		"\u0002\u0000\u0000\u00f1\u0017\u0001\u0000\u0000\u0000\u00f2\u00fd\u0003"+
		"\b\u0004\u0000\u00f3\u00f4\u0005\"\u0000\u0000\u00f4\u00fb\u0003\u000e"+
		"\u0007\u0000\u00f5\u00f6\u0005?\u0000\u0000\u00f6\u00f9\u0005P\u0000\u0000"+
		"\u00f7\u00f8\u0005\"\u0000\u0000\u00f8\u00fa\u0005P\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u0100\u0001\u0000\u0000\u0000\u00ff\u0101\u0005 \u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0019"+
		"\u0001\u0000\u0000\u0000\u0102\u0105\u0003\b\u0004\u0000\u0103\u0104\u0005"+
		"\u001a\u0000\u0000\u0104\u0106\u0005\u001b\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010e\u0001"+
		"\u0000\u0000\u0000\u0107\u010b\u0005\"\u0000\u0000\u0108\u010a\u0003\u001c"+
		"\u000e\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u0107\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0112\u0005 \u0000"+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u001b\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u001a\u0000"+
		"\u0000\u0114\u0119\u0003\u000e\u0007\u0000\u0115\u0116\u0005!\u0000\u0000"+
		"\u0116\u0118\u0003\u000e\u0007\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011e\u0005!\u0000\u0000\u011d"+
		"\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u001b\u0000\u0000\u0120"+
		"\u001d\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u009d\u0000\u0000\u0122"+
		"\u0123\u0003 \u0010\u0000\u0123\u001f\u0001\u0000\u0000\u0000\u0124\u012f"+
		"\u0005\u001c\u0000\u0000\u0125\u012a\u0003\b\u0004\u0000\u0126\u0127\u0005"+
		"!\u0000\u0000\u0127\u0129\u0003\b\u0004\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000"+
		"\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0125\u0001\u0000"+
		"\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0134\u0005\u001d"+
		"\u0000\u0000\u0133\u0135\u0005O\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u013a\u0007\u0000\u0000\u0000\u0137\u0139\u0003\u0014\n\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0007\u0002\u0000\u0000\u013e!\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\u009d\u0000\u0000\u0140\u014b\u0005\u001c\u0000\u0000\u0141"+
		"\u0146\u0003\u000e\u0007\u0000\u0142\u0143\u0005!\u0000\u0000\u0143\u0145"+
		"\u0003\u000e\u0007\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u014a\u014d"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u001d\u0000\u0000\u014f#\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0003&\u0013\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005\u009d\u0000\u0000\u0154\u0155\u0005\"\u0000"+
		"\u0000\u0155\u0156\u0003\u000e\u0007\u0000\u0156\u0157\u0005 \u0000\u0000"+
		"\u0157%\u0001\u0000\u0000\u0000\u0158\u0159\u0007\b\u0000\u0000\u0159"+
		"\u015a\u0005\'\u0000\u0000\u015a\'\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0005^\u0000\u0000\u015c\u015e\u0003&\u0013\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0003\u000e\u0007\u0000\u0160\u0161\u0005 \u0000"+
		"\u0000\u0161)\u0001\u0000\u0000\u0000\u0162\u0163\u0005i\u0000\u0000\u0163"+
		"\u0164\u0005\u001c\u0000\u0000\u0164\u0165\u0003,\u0016\u0000\u0165\u0166"+
		"\u0005\u001d\u0000\u0000\u0166\u016a\u0007\u0000\u0000\u0000\u0167\u0169"+
		"\u0003\u0014\n\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001"+
		"\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016d\u0172\u0007\u0002\u0000\u0000\u016e\u016f\u0005"+
		"Y\u0000\u0000\u016f\u0171\u0003\u0014\n\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173+\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u017b\u00030\u0018\u0000"+
		"\u0176\u0177\u0003.\u0017\u0000\u0177\u0178\u00030\u0018\u0000\u0178\u017a"+
		"\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000\u0000\u0000\u017a\u017d"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c\u0180\u0001\u0000\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017e\u0180\u0005\u009d\u0000\u0000\u017f\u0175"+
		"\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180-\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0007\t\u0000\u0000\u0182/\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0003\u000e\u0007\u0000\u0184\u0185\u0003.\u0017"+
		"\u0000\u0185\u0186\u0003\u000e\u0007\u0000\u01861\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0005a\u0000\u0000\u0188\u0189\u0005\u001c\u0000\u0000\u0189"+
		"\u018a\u0005}\u0000\u0000\u018a\u018b\u0005\u009d\u0000\u0000\u018b\u018c"+
		"\u0005\u008e\u0000\u0000\u018c\u018d\u0005\u009d\u0000\u0000\u018d\u018e"+
		"\u0005\u001d\u0000\u0000\u018e\u018f\u00034\u001a\u0000\u018f3\u0001\u0000"+
		"\u0000\u0000\u0190\u019a\u0003\u0014\n\u0000\u0191\u0193\u0007\u0000\u0000"+
		"\u0000\u0192\u0194\u0003\u0014\n\u0000\u0193\u0192\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0007\u0002\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000"+
		"\u0199\u0190\u0001\u0000\u0000\u0000\u0199\u0191\u0001\u0000\u0000\u0000"+
		"\u019a5\u0001\u0000\u0000\u0000\u019b\u019c\u0007\u0000\u0000\u0000\u019c"+
		"\u019d\u0005\u009d\u0000\u0000\u019d\u019e\u0005%\u0000\u0000\u019e\u01a5"+
		"\u0003\u000e\u0007\u0000\u019f\u01a0\u0005!\u0000\u0000\u01a0\u01a1\u0005"+
		"\u009d\u0000\u0000\u01a1\u01a2\u0005%\u0000\u0000\u01a2\u01a4\u0003\u000e"+
		"\u0007\u0000\u01a3\u019f\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0007\u0002\u0000\u0000\u01a97\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ba\u0003:\u001d\u0000\u01ab\u01ba\u0003<\u001e\u0000\u01ac"+
		"\u01ad\u0007\n\u0000\u0000\u01ad\u01ae\u0005\"\u0000\u0000\u01ae\u01ba"+
		"\u0005\u0018\u0000\u0000\u01af\u01b0\u0005\u001a\u0000\u0000\u01b0\u01b1"+
		"\u0007\n\u0000\u0000\u01b1\u01b2\u0005\u001b\u0000\u0000\u01b2\u01b3\u0005"+
		"\"\u0000\u0000\u01b3\u01ba\u0005\u0018\u0000\u0000\u01b4\u01b5\u0005\u001c"+
		"\u0000\u0000\u01b5\u01b6\u0007\n\u0000\u0000\u01b6\u01b7\u0005\u001d\u0000"+
		"\u0000\u01b7\u01b8\u0005\"\u0000\u0000\u01b8\u01ba\u0005\u0018\u0000\u0000"+
		"\u01b9\u01aa\u0001\u0000\u0000\u0000\u01b9\u01ab\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ac\u0001\u0000\u0000\u0000\u01b9\u01af\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b4\u0001\u0000\u0000\u0000\u01ba9\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0005.\u0000\u0000\u01bc\u01bd\u0005\u0002\u0000\u0000\u01bd\u01be"+
		"\u0005\"\u0000\u0000\u01be\u01bf\u0005}\u0000\u0000\u01bf\u01c0\u0005"+
		"\u009d\u0000\u0000\u01c0\u01c1\u0005\u008e\u0000\u0000\u01c1\u01c2\u0005"+
		"\u009d\u0000\u0000\u01c2;\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005.\u0000"+
		"\u0000\u01c4\u01c5\u0005\u0003\u0000\u0000\u01c5\u01c8\u0005\"\u0000\u0000"+
		"\u01c6\u01c9\u0005\u009d\u0000\u0000\u01c7\u01c9\u00030\u0018\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"=\u0001\u0000\u0000\u0000\u01ca\u01ce\u0003B!\u0000\u01cb\u01cd\u0003"+
		">\u001f\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0003D\"\u0000\u01d2\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d7\u0003F#\u0000\u01d4\u01d7\u0005\u00a2\u0000\u0000\u01d5"+
		"\u01d7\u0003@ \u0000\u01d6\u01ca\u0001\u0000\u0000\u0000\u01d6\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d7?\u0001\u0000\u0000\u0000\u01d8\u01d9\u0007\u0000"+
		"\u0000\u0000\u01d9\u01dd\u0007\u0000\u0000\u0000\u01da\u01dc\u0003\u000e"+
		"\u0007\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000"+
		"\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000"+
		"\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0007\u0002\u0000\u0000\u01e1\u01e2\u0007\u0002"+
		"\u0000\u0000\u01e2A\u0001\u0000\u0000\u0000\u01e3\u01e4\u0007\u000b\u0000"+
		"\u0000\u01e4\u01e8\u0005\u009d\u0000\u0000\u01e5\u01e7\u00038\u001c\u0000"+
		"\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0007\f\u0000\u0000\u01ecC\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0007\u000b\u0000\u0000\u01ee\u01ef\u0005/\u0000\u0000\u01ef\u01f0"+
		"\u0005\u009d\u0000\u0000\u01f0\u01f1\u0007\f\u0000\u0000\u01f1E\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0007\u000b\u0000\u0000\u01f3\u01f7\u0005"+
		"\u009d\u0000\u0000\u01f4\u01f6\u00038\u001c\u0000\u01f5\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005/\u0000"+
		"\u0000\u01fb\u01fc\u0007\f\u0000\u0000\u01fcG\u0001\u0000\u0000\u0000"+
		"4KT[jpu{}\u007f\u0094\u00a1\u00a3\u00af\u00c3\u00d2\u00d5\u00d8\u00e1"+
		"\u00e9\u00ed\u00f9\u00fb\u00fd\u0100\u0105\u010b\u010e\u0111\u0119\u011d"+
		"\u012a\u012f\u0134\u013a\u0146\u014b\u0151\u015d\u016a\u0172\u017b\u017f"+
		"\u0195\u0199\u01a5\u01b9\u01c8\u01ce\u01d6\u01dd\u01e8\u01f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}