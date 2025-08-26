parser grammar CssParser;
options{
tokenVocab = CssLexer;
}


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
        | Percent
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
