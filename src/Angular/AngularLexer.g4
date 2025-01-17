lexer grammar AngularLexer;

//ANGULARSPECIFIC
Component:'Component';
NgFor: 'NgFor' | 'ngFor' | 'ngfor';
NgIf:  'NgIf' | 'ngIf' | 'ngif';
Selector: 'selector';
TemplateUrl:'templateUrl';
Template:'template';
StyleUrls:'styleUrls';
StyleUrl: 'styleUrl';
Styles:'styles';
Imports:'imports';
Standalone:'standalone';
Get : 'get';
//HTML
HTML_COMMENT: '<!--' .*? '-->';

HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';

XML: '<?xml' .*? '>';

CDATA: '<![CDATA[' .*? ']]>';

DTD: '<!' .*? '>';

SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

SEA_WS: (' ' | '\t' | '\r'? '\n')+->skip;

//TAG_OPEN: '<' -> pushMode(TAG);

//TYPE SCRIPT
DoubleQuotationMark        :'"';
MultiLineComment           :'/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment          :'//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
SingleQuote                :'\'' ~[ESC<'\n\t]* '\'';
DoubleQuote                :'"' ~[ESC<'\n\t]* '"';
BackTickQuote              :'`' ~[ESC<'\n\t]* '`';
OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{' ;
CloseBrace                 : '}' ;
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
// We can't match these in the lexer because it would cause issues when parsing
// types like Map<string, Map<string, string>>
// RightShiftArithmetic       : '>>';
// RightShiftLogical          : '>>>';
LessThan                   : '<';
MoreThan                   : '>' ->pushMode(HTML_TEXT_MODE);
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
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

/// The following tokens are also considered to be FutureReservedWords
/// when parsing strict mode

Implements : 'implements';
Let        : 'let';
Private    : 'private';
Public     : 'public';
Interface  : 'interface';
Package    : 'package';
Protected  : 'protected';
Static     : 'static';

//keywords:
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
WhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);
/// Comments
Comment             : '//' ~([\n\t\r])*     -> channel(HIDDEN);
HtmlComment         : '<!--' .*? '-->'      -> channel(HIDDEN);
CDataComment        : '<![CDATA[' .*? ']]>' -> channel(HIDDEN);
ID  : [a-zA-Z_] [a-zA-Z0-9_-]*;
// Fragment rules
fragment ESC: '\\'[\n\t];
mode HTML_TEXT_MODE;
OpenTag : '<'->popMode;
CloseTag : '>' ->popMode;
OpenBraceHTML: '{' ->popMode;
CloseBraceHTML: '}' ->popMode;
TEXT: (ESC | ~[<> {}])+;
WS: (' ' | '\t' | '\r'? '\n')+->skip;