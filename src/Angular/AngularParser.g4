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

importStatement: Import (OpenBrace |OpenBraceHTML) (Component | NgFor | NgIf | ID)(As ID)? (CloseBrace|CloseBraceHTML) From SingleQuote SemiColon ;

interface: Interface ID (OpenBrace|OpenBraceHTML) (variableNaming SemiColon)* (CloseBrace|CloseBraceHTML);

variableNaming: (Let|Var|Const | ID)? ID ((Colon varType)? (BitOr NullLiteral (Assign NullLiteral )?)? )? ;

varType: String
       | Int
       | Boolean
       | Number
       | Void
       | Any
       | ID
       ;

string: SingleQuote | BackTickQuote| DoubleQuote ;

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
     | value OpenBracket value CloseBracket # ArrayIndexValue
     | Ellipsis value # EllipsisValue
     | OpenBrace value CloseBrace # BracedValue
     | thisorId value  # ThisDotValue
     | htmlTags # HtmlTagValue
     | string # StringValue
     | DecimalLiteral # DecimalNumberValue
     | ID # VariableValue
     | NullLiteral # NullValue

     ;

componentDeclaration : At Component OpenParen (OpenBrace|OpenBraceHTML) componentInfo (Comma componentInfo )* (CloseBrace|CloseBraceHTML) CloseParen ;

componentInfo: Selector Colon (SingleQuote | BackTickQuote) # Select
             | TemplateUrl Colon (SingleQuote | BackTickQuote) # TempUrl
             | StyleUrls Colon OpenBracket (SingleQuote | BackTickQuote)(Comma(SingleQuote | BackTickQuote))* CloseBracket # Styles
             | Standalone Colon BooleanLiteral # StandaloneStatus
             | Imports Colon OpenBracket ((NgFor|NgIf|ID) (Comma (NgFor|NgIf|ID))*)? CloseBracket # Importss
             ;

genericStatement:
                 functionDeclaration # Function
                | functionCall # FunctionSummoning
                | functionBody # FunctionStatement
                | variableDeclaration # VariableDecl
                | arrayDeclaration # ArrayDecl
                | assignStatement # Assign
                | returnStatement # Return
                | ifStatement # If
                | forLoop # For
                | logicalStatement # LogicalStatementGen
                | value # ValueType

                ;
classStructure: Export Class ID ((Implements|Extends) ID)? (OpenBrace|OpenBraceHTML) (genericStatement (SemiColon)?)* (CloseBrace|CloseBraceHTML);

variableDeclaration: variableNaming (Assign value (BitOr NullLiteral (Assign NullLiteral)?)?)? (SemiColon)?;

arrayDeclaration: variableNaming (OpenBracket CloseBracket)? (Assign arrayInfo*)?(SemiColon)?;
arrayInfo: OpenBracket (value (Comma value)* (Comma)?)* CloseBracket;

functionDeclaration: (thisorId)?ID functionBody;
functionBody:  OpenParen ((value | variableNaming)(Comma (value |variableNaming))*)* CloseParen ((Colon varType)?) (ARROW? (OpenBrace|OpenBraceHTML) genericStatement* (CloseBrace|CloseBraceHTML))?;
functionCall: (thisorId)?ID OpenParen(value (Comma value)*)* CloseParen;

assignStatement:(thisorId)? ID Assign value SemiColon;
thisorId: ((ID|This) Dot);
returnStatement: Return (thisorId)?value SemiColon;

ifStatement: If OpenParen  logicalStatement(logicalOp logicalStatement)* CloseParen (OpenBrace|OpenBraceHTML) genericStatement* (CloseBrace|CloseBraceHTML) (Else genericStatement)*
           ;

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

logicalStatement: ((Typeof)?value (logicalOp) (Typeof)?value);

forLoop: For OpenParen Let ID Of ID CloseParen forBody;

forBody: genericStatement # SingleLineForLoop
       | (OpenBrace|OpenBraceHTML) genericStatement+ (CloseBrace|CloseBraceHTML) # MultipleLinesForLoop
       ;

jsonObject:(OpenBrace|OpenBraceHTML) ID Colon value (Comma ID Colon value)*(Comma)? (CloseBrace|CloseBraceHTML);

attribute: ngForStatement # NgFor
         | ngIfStatement # NgIf
         | (ID|Class) Assign DoubleQuote # DoubleQuotedAttribute
         | OpenBracket (ID|Class) CloseBracket Assign DoubleQuote # OpenBracketAttribute // [src]
         | OpenParen (ID|Class) CloseParen Assign DoubleQuote # OpenParenAttribute // (click)
         ;

ngForStatement: Multiply NgFor Assign (Let ID Of ID)
              ;

ngIfStatement: Multiply NgIf Assign (ID | logicalStatement)
             ;

htmlTags: openTag (htmlTags)* closeTag # PairedTag
        | selfClosingTag # UnpairedTag
        | TEXT # NormalHtmlText
        | interpolation # HtmlInterpolation
        ;

interpolation: (OpenBrace|OpenBraceHTML)(OpenBrace|OpenBraceHTML) (value)* (CloseBrace|CloseBraceHTML)(CloseBrace|CloseBraceHTML);
openTag: (LessThan |OpenTag) ID (attribute)* (MoreThan|CloseTag);
closeTag: (LessThan |OpenTag) Divide ID (MoreThan|CloseTag);
selfClosingTag:(LessThan |OpenTag) ID (attribute)* Divide (MoreThan|CloseTag);

// fix html tags rules from lexer
// ability to write html in the template url
// fix symbol table (hash map)


// css: flex box