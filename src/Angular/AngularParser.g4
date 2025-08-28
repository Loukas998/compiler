parser grammar AngularParser;
options {
tokenVocab=AngularLexer;
    }

    prog: expression+ EOF # Program
        ;
    expression:
                importStatement # Import
              | interface # InterfaceDecl
              | componentDeclaration # Component
              | classStructure # Class
              | genericStatement # Generic
              ;

importStatement: Import (OpenBrace |OpenBraceHTML)
(Component | NgFor | NgIf | ID |Router)(As ID)? (CloseBrace|CloseBraceHTML) From SingleQuote SemiColon ;

interface: Interface ID (OpenBrace|OpenBraceHTML) (variableNaming SemiColon)* (CloseBrace|CloseBraceHTML);

variableNaming: (Let|Var|Const | ID)? ID ((Colon varType)? (BitOr NullLiteral)? )? ;

varType: String
       | Int
       | Boolean
       | Number
       | Void
       | Any
       | ID
       ;

string:  SingleQuote | BackTickQuote| DoubleQuote ;

value:
       arrayInfo # ArrayInfoValue
      | functionCall # FunctionCallValue
     |functionDeclaration # FunctionValue
     | functionBody # FunctionStatementValue
     | jsonObject # JsonObjectValue
     | OpenParen value CloseParen # EventValue
     | value Dot value # ValueDotValue
     | value QuestionMarkDot value # NullableDotValue
     | value QuestionMark # NullableValue
     | value Or value # ValueOrValue
     | value And value # ValueAndValue
     | value IdentityNotEquals value # ValueIdentityNotEqualsValue
     | value OpenBracket value CloseBracket # ArrayIndexValue
     | Ellipsis value # EllipsisValue
     | Typeof value # TypeOfValue
     | OpenBrace value CloseBrace # BracedValue
     | thisorId value  # ThisDotValue
     | string # StringValue
     | DecimalLiteral # DecimalNumberValue
     | ID # VariableValue
     | NullLiteral # NullValue

     ;

componentDeclaration : At Component OpenParen (OpenBrace|OpenBraceHTML) componentInfo (Comma componentInfo )*
(CloseBrace|CloseBraceHTML) CloseParen ;

componentInfo: Selector Colon (SingleQuote ) # Select
             | TemplateUrl Colon (SingleQuote ) # TempUrl
             | StyleUrls Colon OpenBracket (SingleQuote)
             (Comma(SingleQuote))* CloseBracket # Styles
             | Standalone Colon BooleanLiteral # StandaloneStatus
             | Imports Colon OpenBracket ((NgFor|NgIf|ID|Router)
             (Comma (NgFor|NgIf|ID|Router))*)? CloseBracket # Importss
             ;

genericStatement:
                 routerFunctionCall #RouterCall
                | functionCall # FunctionSummoning
                | functionDeclaration # Function
                | functionBody # FunctionStatement
                | variableDeclaration # VariableDecl
                | arrayDeclaration # ArrayDecl
                | assignStatement # Assign
                | returnStatement # Return
                | ifStatement # If
                | forLoop # For
                | logicalStatement # LogicalStatementGen
                | htmlTags # HtmlTagStatement
                |cssElement #CssElementStatement
                | value # ValueType

                ;
classStructure: Export Class ID ((Implements|Extends) ID)? (OpenBrace|OpenBraceHTML)
(genericStatement (SemiColon)?)* (CloseBrace|CloseBraceHTML);

variableDeclaration: variableNaming (Assign value (BitOr NullLiteral (Assign NullLiteral)?)?)? (SemiColon)?;

arrayDeclaration: variableNaming (OpenBracket CloseBracket)? (Assign arrayInfo*)?(SemiColon)?;
arrayInfo: OpenBracket (value (Comma value)* (Comma)?)* CloseBracket;

functionDeclaration: (thisorId)?ID functionBody;
functionBody:  OpenParen ((value | variableNaming)(Comma (value |variableNaming))*)* CloseParen ((Colon varType)?)
(
((OpenBrace|OpenBraceHTML) genericStatement* (CloseBrace|CloseBraceHTML))?
|(genericStatement)?
|arrowFunction
);
arrowFunction : (ARROW value);
functionCall: (thisorId)?ID OpenParen(value (Comma value)*)* CloseParen;
routerFunctionCall :thisorId?(Router(Dot ID)?)OpenParen OpenBracket (SingleQuote)CloseBracket
((Comma (routerFunctionParams|routerFunctionQueryParams))*)CloseParen;
routerFunctionParams : (ID|IntegerNumber|SingleQuote);
routerFunctionQueryParams:OpenBrace QueryParams Colon jsonObject CloseBrace;
assignStatement:(thisorId)? ID Assign value SemiColon;
thisorId: ((ID|This) Dot);
returnStatement: Return (thisorId)?value SemiColon;

ifStatement: If OpenParen logicalStatement(logicalOp logicalStatement)*
CloseParen (OpenBrace|OpenBraceHTML) genericStatement* (CloseBrace|CloseBraceHTML) elseStatement?
           ;
elseStatement :(Else genericStatement) #SingleLineElse
              | (Else ((OpenBrace|OpenBraceHTML) genericStatement*(CloseBrace|CloseBraceHTML))) #MultipleLineElse;


logicalOp: LessThanEquals
         | GreaterThanEquals
         | Equals
         | NotEquals
         | IdentityEquals
         | IdentityNotEquals
         | BitAnd
         | BitXOr
         | BitOr
         | And
         | Or
         ;

logicalStatement: (value (logicalOp) value);

forLoop: For OpenParen Let ID Of ID CloseParen forBody;

forBody: genericStatement # SingleLineForLoop
       | (OpenBrace|OpenBraceHTML) genericStatement+ (CloseBrace|CloseBraceHTML) # MultipleLinesForLoop
       ;

jsonObject:(OpenBrace|OpenBraceHTML) ID Colon value (Comma ID Colon value)*(Comma)? (CloseBrace|CloseBraceHTML);

attribute: ngForStatement # NgFor
         | ngIfStatement # NgIf
         | (ID|Class|TypeAlias) Assign (DoubleQuote|SingleQuote) # DoubleQuotedAttribute
         | OpenBracket (ID|Class|TypeAlias) CloseBracket Assign (DoubleQuote | TripleQuote) # OpenBracketAttribute // [src]
         | OpenParen (ID|Class|TypeAlias) CloseParen Assign (DoubleQuote|SingleQuote) # OpenParenAttribute // (click)
         | OpenBracket OpenParen NgModel CloseParen CloseBracket Assign (SingleQuote) # NgModelAttribute // [(ngModel)]
         ;

ngForStatement: Multiply NgFor Assign (Let ID Of ID) (SemiColon)?(Let ID Assign ID)?;


ngIfStatement: Multiply NgIf Assign (ID | logicalStatement)
             ;

htmlTags: openTag (htmlTags)* closeTag # PairedTag
        | selfClosingTag # UnpairedTag
        | TEXT # NormalHtmlText
        | interpolation # HtmlInterpolation
        ;

interpolation: (DoubleOpenBrace|DoubleOpenBraceHtml) (value)* (DoubleCloseBrace|DoubleOpenBraceHtml)
;


knownHtmlTags:H1 |
              H2 |
              H3 |
              H4 |
              H5 |
              H6 |
              AnchorTag |
              Div |
              ParagprahTag|
              SpanTag |
              ImageTag |
              UnorderedListTag |
              OrderedListTag |
              ListItemTag |
              LineBreakTag |
              Button |
              Input |
              Label |
              StrongTextTag;




openTag: (LessThan |OpenTag) (knownHtmlTags|ID) (attribute)* (MoreThan|CloseTag);
closeTag: (LessThan |OpenTag) Divide (knownHtmlTags|ID)  (MoreThan|CloseTag);
selfClosingTag:(LessThan |OpenTag) (knownHtmlTags|ID)  (attribute)* Divide (MoreThan|CloseTag);


//css
cssElement
    : (tagName)? (Comma tagName)* selector* OpenBrace cssProperty* CloseBrace
    ;

selector
    :(Dot) ID tagName? simpleSelector*
    |Textarea
    ;

simpleSelector
    : Colon? ID
    ;

cssProperty
    : css Colon cssValue* eos
    ;

css
    : Display
    | Flex_Direction
    | Gap
    | Padding
    | Box_Size
    | Flex
    | Border
    | Text_Align
    | Max_With
    | Height
    | Cursor
    | Transition
    | Background_Color
    | Margin
    | Font_Size
    | Color
    | Width
    ;

cssValue
    : decimalLiteral_UNIT
    | Row
    | Flex
    | Border_Box
    | Center
    | Column
    | Auto
    | Pointer
    | HEXCHAR
    | (DoubleQuote|SingleQuote)
    |ID

    ;

decimalLiteral_UNIT
    : decimalLiteralUnit DecimalLiteral*                 #UnitNumberList
    | decimalLiteralUnit Solid HEXCHAR                   #UnitSolidColor
    | css decimalLiteralUnit                             #BackgroundColorUnit
    ;

decimalLiteralUnit
    : DecimalLiteral (unit)?
    ;


// ===== TAGS =====
tagName
    : H1
    | H2
    | H3
    | H4
    | ImageTag
    | ParagprahTag
    | QuestionMarkDot
    | DoubleOpenBrace
    | DoubleCloseBrace
    | Div
    | Button
    | Label
    | Input
    |Textarea
    |Dot ID
    ;

    eos:
    SemiColon
    ;

    unit
        : PX
        | CM
        | MM
        | In
        | PT
        | PC
        | EM
        | REM
        | Modulus
        | EX
        | CH
        | VW
        | VH
        | VMIN
        | VMAX
        | CQW
        | CQH
        | CQI
        | CQB
        | CQMIN
        | CQMAX
        |ID
        ;
