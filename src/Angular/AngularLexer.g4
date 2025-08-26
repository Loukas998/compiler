lexer grammar AngularLexer;

//ANGULARSPECIFIC
Component:'Component';
NgFor: 'NgFor' | 'ngFor' | 'ngfor';
NgIf:  'NgIf' | 'ngIf' | 'ngif';
NgModel : 'ngModel' | 'NgModel'|'ngmodel';
Selector: 'selector';
TemplateUrl:'templateUrl';
Template:'template';
StyleUrls:'styleUrls';
StyleUrl: 'styleUrl';
Styles:'styles';
Imports:'imports';
Standalone:'standalone';
Router : 'Router'|'router';
Get : 'get';
//HTML
HTML_COMMENT: '<!--' .*? '-->';

HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';

XML: '<?xml' .*? '>';

CDATA: '<![CDATA[' .*? ']]>';

DTD: '<!' .*? '>';

SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

SEA_WS: (' ' | '\t' | '\r'? '\n')+->skip;
//TYPE SCRIPT
DoubleQuotationMark        :'"';
MultiLineComment           :'/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment          :'//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
SingleQuote                : '\'' ( ESC | ~['\\\r\n] )* '\'';
TripleQuote                : '"' '\'' ~[ESC<'\n\t"]* '\'' '"';
DoubleQuote                :'"' ~[ESC<'\n\t"]* '"';
BackTickQuote              :'`' ~[ESC<'\n\t]* '`';
OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{' ;
DoubleOpenBrace            : '{{' ;
CloseBrace                 : '}' ;
DoubleCloseBrace           : '}}' ;
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
QuestionMarkDot            : '?.';
Colon                      : ':';
Ellipsis                   : '...';
Dot                        : '.';
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
Power                      : '**';
NullCoalesce               : '??';
Hashtag                    : '#';
LeftShiftArithmetic        : '<<';
LessThan                   : '<';
MoreThan                   : '>' ->pushMode(HTML_TEXT_MODE);

LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals                     : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
PowerAssign                : '**=';
NullishCoalescingAssign    : '??=';
ARROW                      : '=>';
HEXCHAR                    : '#'[0-9a-fA-F]+;

/// Null Literals

NullLiteral: 'null';

/// Boolean Literals

BooleanLiteral: 'true' | 'false';

/// Numeric Literals

DecimalLiteral:
    DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?
;
BigDecimalIntegerLiteral : DecimalIntegerLiteral 'n';
fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;
fragment ExponentPart: [eE] [+-]? [0-9_]+;
/// Keywords

Break      : 'break';
Do         : 'do';
Instanceof : 'instanceof';
Typeof     : 'typeof';
Case       : 'case';
Else       : 'else';
New        : 'new';
Var        : 'var';
Catch      : 'catch';
Finally    : 'finally';
Return     : 'return';
Void       : 'void';
Continue   : 'continue';
For        : 'for';
Switch     : 'switch';
While      : 'while';
Debugger   : 'debugger';
Function_  : 'function';
This       : 'this';
With       : 'with';
Default    : 'default';
If         : 'if';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
From       : 'from';
ReadOnly   : 'readonly';
Async      : 'async';
Await      : 'await';
Yield      : 'yield';
YieldStar  : 'yield*';

/// Future Reserved Words
Class   : 'class';
Enum    : 'enum';
Extends : 'extends';
Super   : 'super';
Const   : 'const';
Export  : 'export';
Import  : 'import';
Implements : 'implements';
Let        : 'let';
Private    : 'private';
Public     : 'public';
Interface  : 'interface';
Package    : 'package';
Protected  : 'protected';
Static     : 'static';
Any        : 'any';
Number     : 'number';
Never      : 'never';
Boolean    : 'boolean';
String     : 'string';
Int        : 'int';
Unique     : 'unique';
Symbol     : 'symbol';
Undefined  : 'undefined';
Object     : 'object';
Of      : 'of';
KeyOf   : 'keyof';
TypeAlias: 'type';
Constructor : 'constructor';
Namespace   : 'namespace';
Require     : 'require';
Module      : 'module';
Declare     : 'declare';
Abstract    : 'abstract';
Is          : 'is';
At          : '@';


//known Html Tags
H1 : 'h1';
H2 : 'h2';
H3 : 'h3';
H4 : 'h4';
H5 : 'h5';
H6 : 'h6';
AnchorTag : 'a';
Div : 'div';
ParagprahTag: 'p';
SpanTag : 'span';
ImageTag : 'img';
UnorderedListTag : 'ul';
OrderedListTag: 'ol';
ListItemTag : 'li';
LineBreakTag : 'br';
StrongTextTag : 'strong'; //boldText
Button :'button';
Input :'input';
Label : 'label';


//Css Features
Row: 'row';
Column :'column';
Auto :'auto';
Pointer:'pointer';
Border_Box:'border-box';
Center :'center';
Solid:'solid';
Display:'display';
Flex_Direction:'flex-direction';
Gap:'gap';
Padding :'padding';
Box_Size:'box-sizing';
Flex :'flex';
Border:'border';
Text_Align:'text-align';
Max_With:'max-width';
Height :'height';
Width :'width';
Cursor :'cursor';
Transition :'transition';
Color :'color';
Font_Size :'font-size';
Margin :'margin';
Background_Color :'background-color';
Textarea :'textarea';
//size unit
// Absolute units
PX      : 'px';
CM      : 'cm';
MM      : 'mm';
PT      : 'pt';
PC      : 'pc';

// Relative units
EM      : 'em';
REM     : 'rem';
EX      : 'ex';
CH      : 'ch';

// Viewport units
VW      : 'vw';
VH      : 'vh';
VMIN    : 'vmin';
VMAX    : 'vmax';

// Container query units (modern CSS)
CQW     : 'cqw';
CQH     : 'cqh';
CQI     : 'cqi';
CQB     : 'cqb';
CQMIN   : 'cqmin';
CQMAX   : 'cqmax';



WhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);
/// Comments
Comment             : '//' ~([\n\t\r])*     -> channel(HIDDEN);
HtmlComment         : '<!--' .*? '-->'      -> channel(HIDDEN);
CDataComment        : '<![CDATA[' .*? ']]>' -> channel(HIDDEN);
ID  : [a-zA-Z_] [a-zA-Z0-9_-]*;
// Fragment rules
fragment ESC: '\\' [nrt'\\];
mode HTML_TEXT_MODE;
OpenTag : '<'->popMode;
CloseTag : '>' ->popMode;
OpenBraceHTML: '{' ->popMode;
CloseBraceHTML: '}' ->popMode;
DoubleOpenBraceHtml   : '{{'->popMode ;
DoubleCloseBraceHtml  : '}}'->popMode ;
TEXT: (ESC | ~[<> {}])+;
WS: (' ' | '\t' | '\r'? '\n')+->skip;