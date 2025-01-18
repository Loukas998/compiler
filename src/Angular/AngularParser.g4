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

importStatement: Import (OpenBrace |OpenBraceHTML) (Component | NgFor | NgIf | ID) (CloseBrace|CloseBraceHTML) From SingleQuote SemiColon ;

interface: Interface ID (OpenBrace|OpenBraceHTML) (variableNaming SemiColon)* (CloseBrace|CloseBraceHTML);

variableNaming: (Let|Var|Const)? ID (Colon varType (BitOr NullLiteral (Assign NullLiteral )?)? )? ;

varType: String
       | Int
       | Boolean
       | Void
       | Any
       | ID
       ;

string: SingleQuote | BackTickQuote| DoubleQuote ;

value:
     arrayInfo # ArrayInfoValue
     | functionDeclaration # Function
     | functionCall # FunctionSummoning
     | functionBody # FunctionStatement
     | jsonObject # JsonObjectValue
     | OpenParen value CloseParen # EventValue
     | value Dot value # ValueDotValue
     | value QuestionMarkDot value # NullableDotValue
     | value QuestionMark # NullableValue
     | value Or value # ValueOrValue
     | htmlTags # HtmlTagValue
     | string # StringValue
     | DecimalLiteral # DecimalNumberValue
     | ID # VariableValue
     | NullLiteral # NullValue
     ;

componentDeclaration : At Component OpenParen (OpenBrace|OpenBraceHTML) componentInfo (Comma componentInfo )* (CloseBrace|CloseBraceHTML) CloseParen ;

componentInfo: Selector Colon (SingleQuote | BackTickQuote) # Select
             | TemplateUrl Colon (SingleQuote | BackTickQuote) # TempUrl
             | StyleUrls Colon OpenBracket (SingleQuote | BackTickQuote) CloseBracket # Styles
             | Standalone Colon BooleanLiteral # StandaloneStatus
             | Imports Colon OpenBracket ((NgFor|NgIf|ID) (Comma (NgFor|NgIf|ID))*)? CloseBracket # Importss
             ;

genericStatement:
                 value # ValueType
                | variableDeclaration # VariableDecl
                | arrayDeclaration # ArrayDecl
                | assignStatement # Assign
                | returnStatement # Return
                | ifStatement # If
                | forLoop # For

                ;
classStructure: Export Class ID (OpenBrace|OpenBraceHTML) (genericStatement (SemiColon)?)* (CloseBrace|CloseBraceHTML);

variableDeclaration: variableNaming (Assign value (BitOr NullLiteral (Assign NullLiteral)?)?)? (SemiColon)?;

arrayDeclaration: variableNaming (OpenBracket CloseBracket)? (Assign arrayInfo*)?(SemiColon)?;
arrayInfo: OpenBracket value (Comma value)* (Comma)? CloseBracket;

functionDeclaration: ID functionBody;
functionBody:  OpenParen (variableNaming(Comma variableNaming)*)* CloseParen ARROW? (OpenBrace|OpenBraceHTML) genericStatement* (CloseBrace|CloseBraceHTML);
functionCall: ID OpenParen(value (Comma value)*)* CloseParen;

assignStatement:(thisorId)? ID Assign value SemiColon;
thisorId: ((ID|This) Dot);
returnStatement: Return (thisorId)?value SemiColon;

ifStatement: If OpenParen  conditionalState CloseParen (OpenBrace|OpenBraceHTML) genericStatement* (CloseBrace|CloseBraceHTML) (Else genericStatement)*
           ;

conditionalState: logicalStatement(logicalOp logicalStatement)* # ConditionalStatement
                | ID # VariableName
                ;

logicalOp: LessThanEquals
         | GreaterThanEquals
         | Equals_
         | NotEquals
         | IdentityEquals
         | IdentityNotEquals
         | BitAnd
         | BitXOr
         | BitOr
         | And
         | Or
         ;

logicalStatement: (value (logicalOp)value);

forLoop: For OpenParen Let ID Of ID CloseParen forBody;

forBody: genericStatement # SingleLineForLoop
       | (OpenBrace|OpenBraceHTML) genericStatement+ (CloseBrace|CloseBraceHTML) # MultipleLinesForLoop
       ;

jsonObject:(OpenBrace|OpenBraceHTML) ID Colon value (Comma ID Colon value)* (CloseBrace|CloseBraceHTML);

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