package Classes.Visitor;

import Angular.AngularParser;
import Angular.AngularParserBaseVisitor;
import Classes.Errors.DuplicateValueError;
import Classes.Errors.SemError;
import Classes.GenericStatements.Functions.Function;
import Classes.GenericStatements.Functions.FunctionStatement;
import Classes.GenericStatements.Functions.FunctionSummoning;
import Classes.SymbolTable.Scope;
import Classes.SymbolTable.Symbol;
import Classes.SymbolTable.SymbolTable;
import Classes.Values.*;
import Classes.Values.Dots.NullableDotValue;
import Classes.Values.Dots.ValueDotValue;
import Classes.Values.Simples.DecimalNumberValue;
import Classes.Values.Simples.NullValue;
import Classes.Values.Simples.StringValue;
import Classes.Values.Simples.VariableValue;

import java.util.ArrayList;
import java.util.Stack;

public class ValueVisitor extends AngularParserBaseVisitor<ValueType>
{
    public  Stack<Scope>currentScope = new Stack<>();
    public SymbolTable symbolTable = new SymbolTable();
    public int currId;
    public  ArrayList<SemError>semanticErrors = new ArrayList<>();
/*    public ValueType visitValue(AngularParser.ValueContext ctx){
       if(ctx instanceof AngularParser.StringValueContext){

            return this.visitStringValue((AngularParser.StringValueContext) ctx);

       }else if(ctx instanceof AngularParser.DecimalNumberValueContext){

           return this.visitDecimalNumberValue((AngularParser.DecimalNumberValueContext) ctx);

       }else if(ctx instanceof AngularParser.VariableValueContext) {

           return this.visitVariableValue((AngularParser.VariableValueContext) ctx);

       }else if(ctx instanceof AngularParser.NullValueContext){

           return this.visitNullValue((AngularParser.NullValueContext) ctx);

       }else if(ctx instanceof AngularParser.ArrayInfoValueContext){

           return this.visitArrayInfoValue((AngularParser.ArrayInfoValueContext) ctx);

       }else if(ctx instanceof AngularParser.FunctionContext){

           return this.visitFunction((AngularParser.FunctionContext) ctx);

       }else if(ctx instanceof AngularParser.FunctionSummoningContext){

           return this.visitFunctionSummoning((AngularParser.FunctionSummoningContext) ctx);

       }else if(ctx instanceof AngularParser.JsonObjectValueContext){

           return this.visitJsonObjectValue((AngularParser.JsonObjectValueContext) ctx);

       }else if(ctx instanceof AngularParser.EventValueContext){

           return this.visitEventValue((AngularParser.EventValueContext) ctx);

       }else if(ctx instanceof AngularParser.ValueDotValueContext){

           return this.visitValueDotValue((AngularParser.ValueDotValueContext) ctx);

       }else if(ctx instanceof AngularParser.NullableDotValueContext){

           return this.visitNullableDotValue((AngularParser.NullableDotValueContext) ctx);

       }else if(ctx instanceof AngularParser.NullableValueContext){

           return this.visitNullableValue((AngularParser.NullableValueContext) ctx);

       }else if(ctx instanceof AngularParser.ValueOrValueContext){

           return this.visitValueOrValue((AngularParser.ValueOrValueContext) ctx);

       }
       else if (ctx instanceof AngularParser.FunctionStatementContext){
           return this.visitFunctionStatement((AngularParser.FunctionStatementContext) ctx);
       }*/
    //   return this.visitHtmlTagValue((AngularParser.HtmlTagValueContext) ctx);
   // }

    @Override
    public StringValue visitString(AngularParser.StringContext ctx) {
        Scope scope = currentScope.peek();
        String s;
        if(ctx.SingleQuote()!=null){
            s=ctx.SingleQuote().getText();
        }
        else if(ctx.DoubleQuote()!=null){
            s=ctx.DoubleQuote().getText();
        }
        else {
            s=ctx.BackTickQuote().getText();
        }
//        Symbol symbol = new Symbol();
//        symbol.type = "String";
//        symbol.value = s;
//        symbol.scope = scope;
//        scope.addSymbol("Just a string",symbol);
        return new StringValue(s);
    }

    @Override
    public StringValue visitStringValue(AngularParser.StringValueContext ctx) {
        return this.visitString(ctx.string());
    }

    @Override
    public DecimalNumberValue visitDecimalNumberValue(AngularParser.DecimalNumberValueContext ctx) {
        DecimalNumberValue dcv=new DecimalNumberValue();
        String number=ctx.DecimalLiteral().getText();
        dcv.decimalNumberValue=Double.parseDouble(number);
        return dcv;
    }

    @Override
    public NullValue visitNullValue(AngularParser.NullValueContext ctx) {
        Symbol sym = new Symbol();
        sym.type = "nullValue";
        sym.value = "Null";
        sym.scope = currentScope.peek();
        return new NullValue();
    }

    @Override
    public ValueType visitVariableValue(AngularParser.VariableValueContext ctx) {
        return new VariableValue(ctx.ID().getText());
    }

    @Override
    public ArrayInfoValue visitArrayInfo(AngularParser.ArrayInfoContext ctx) {

        ArrayInfoValue arrayInfoValue=new ArrayInfoValue();
        for(int i=0;i<ctx.value().size();i++){
            arrayInfoValue.addArrayValue(visit(ctx.value(i)));
        }
        return arrayInfoValue;
    }

    @Override
    public ArrayInfoValue visitArrayInfoValue(AngularParser.ArrayInfoValueContext ctx) {
        return this.visitArrayInfo(ctx.arrayInfo());
    }
    @Override
    public JsonObjectValue visitJsonObjectValue(AngularParser.JsonObjectValueContext ctx) {
        return this.visitJsonObject(ctx.jsonObject());
    }

    @Override
    public JsonObjectValue visitJsonObject(AngularParser.JsonObjectContext ctx) {
        Scope scope = new Scope("JsonObject " + currId+1 , currId+1,currentScope.peek());
        currId++;
        currentScope.push(scope);
        JsonObjectValue jsonObjectValue=new JsonObjectValue();
        for(int i=0;i<ctx.ID().size();i++){
            String name = ctx.ID(i).getText();
            var valueObject = this.visit(ctx.value(i));
            Symbol symbol = new Symbol();
            symbol.type = ctx.ID(i).getText();
            symbol.value = valueObject;
            Symbol existingSymbol = scope.exists(ctx.ID(i).getText());
            if(existingSymbol != null){
                int line = ctx.ID(i).getSymbol().getLine();
                int charPos = ctx.ID(i).getSymbol().getCharPositionInLine();
                semanticErrors.add(new DuplicateValueError(ctx.ID(i).getText(),line,charPos));
            }
            else{
                scope.addSymbol(name,symbol);
            }

            jsonObjectValue.addJsons(ctx.ID(i).getText(),valueObject);
        }
        currentScope.pop();
        return jsonObjectValue;
    }

    @Override
    public ValueType visitEventValue(AngularParser.EventValueContext ctx) {
        return this.visit(ctx.value());
    }

    @Override
    public ValueType visitNullableValue(AngularParser.NullableValueContext ctx) {
        return this.visit(ctx.value());
    }

    @Override
    public ValueType visitEllipsisValue(AngularParser.EllipsisValueContext ctx) {
        return new EllipsisValue(this.visit(ctx.value()));
    }

    @Override
    public ValueType visitValueAndValue(AngularParser.ValueAndValueContext ctx) {
      var value1 = this.visit(ctx.value(0));
      var value2 = this.visit(ctx.value(1));
      return new ValueAndValue(value1,value2);
    }

    @Override
    public ValueDotValue visitValueDotValue(AngularParser.ValueDotValueContext ctx) {
        ValueDotValue valueDotValue = new ValueDotValue();
        valueDotValue.firstValue = visit(ctx.value(0));
        valueDotValue.secondValue = visit(ctx.value(1));
        return valueDotValue;
    }

    @Override
    public ValueType visitThisDotValue(AngularParser.ThisDotValueContext ctx) {
        return super.visitThisDotValue(ctx);
    }

    @Override
    public NullableDotValue visitNullableDotValue(AngularParser.NullableDotValueContext ctx) {
        NullableDotValue nullableDotValue = new NullableDotValue();
        nullableDotValue.firstValue = visit(ctx.value(0));
        nullableDotValue.secondValue = visit(ctx.value(1));
        return nullableDotValue;
    }

    @Override
    public ValueType visitBracedValue(AngularParser.BracedValueContext ctx) {
        return this.visit(ctx.value());
    }

    @Override
    public ValueOrValue visitValueOrValue(AngularParser.ValueOrValueContext ctx) {
        ValueOrValue valueOrValue = new ValueOrValue();
        valueOrValue.firstValue = visit(ctx.value(0));
        valueOrValue.secondValue = visit(ctx.value(1));
        return valueOrValue;
    }

    @Override
    public ValueType visitArrayIndexValue(AngularParser.ArrayIndexValueContext ctx) {
        ArrayIndexedValue arrayIndexedValue = new ArrayIndexedValue();
        arrayIndexedValue.value = visit(ctx.value(0));
        arrayIndexedValue.indexAt = visit(ctx.value(1));
        return arrayIndexedValue;
    }

    @Override
    public ValueType visitHtmlTagValue(AngularParser.HtmlTagValueContext ctx) {
        HtmlVisitor htmlVisitor=new HtmlVisitor();
        htmlVisitor.currentScope = this.currentScope;
       // htmlVisitor.currId = this.currId;
        htmlVisitor.semanticErrors = semanticErrors;
        htmlVisitor.currId = currId;
        ValueType htmlValueType = htmlVisitor.visitHtmlTags(ctx.htmlTags());

        return htmlValueType;
    }
    @Override
    public Function visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {

        Function function=new Function();
        function.functionName=ctx.ID().getText();
        function.functionStatement=this.visitFunctionBody(ctx.functionBody());
        return function;
    }

    @Override
    public FunctionStatement visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        Scope scope = new Scope("Function" + currId+1, currId+1,currentScope.peek());
        currId++;
        currentScope.push(scope);
        ValueVisitor valueVisitor = new ValueVisitor();
        valueVisitor.currentScope = currentScope;
        VariableNamingVisitor variableNamingVisitor = new VariableNamingVisitor();
        variableNamingVisitor.currScopeStack = currentScope;
        GenericStatementVisitor genericStatementVisitor=new GenericStatementVisitor();
        genericStatementVisitor.currentScope = currentScope;
        FunctionStatement functionStatement=new FunctionStatement();
        for(int i=0;i<ctx.value().size();i++){
            functionStatement.addValueType(valueVisitor.visit(ctx.value(i)));
        }
        for(int i=0;i<ctx.variableNaming().size();i++){
            functionStatement.addVariableNamings (variableNamingVisitor.visit(ctx.variableNaming(i)));
        }
        if(ctx.genericStatement()!=null) {
            for (int i = 0; i < ctx.genericStatement().size(); i++) {
                functionStatement.addFunctionBodyLine(
                        genericStatementVisitor.visit(ctx.genericStatement(i)));
            }
        }

        for(int i = 0 ; i < functionStatement.params.size();i++){
            Symbol paramSymbol = new Symbol();
            paramSymbol.type = "Function Parameter  " + functionStatement.params.get(i);
            paramSymbol.value = functionStatement.params.get(i);
            scope.addSymbol(functionStatement.params.get(i).toString(),paramSymbol);
        }

        currentScope.pop();
        return functionStatement;
    }

    @Override
    public ValueType visitFunctionCallValue(AngularParser.FunctionCallValueContext ctx) {
        return this.visitFunctionCall(ctx.functionCall());
    }

    @Override
    public ValueType visitFunctionStatementValue(AngularParser.FunctionStatementValueContext ctx) {
        return this.visitFunctionBody(ctx.functionBody());
    }

    @Override
    public ValueType visitFunctionValue(AngularParser.FunctionValueContext ctx) {
        return this.visitFunctionDeclaration(ctx.functionDeclaration());
    }

    @Override
    public FunctionSummoning visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionSummoning funCall=new FunctionSummoning();
        funCall.functionName = ctx.ID().getText();
        //Row row = new Row();
        // row.type = "FunctionCall";
        for(int i=0;i<ctx.value().size();i++){
            funCall.addArgument(this.visit(ctx.value(i)));
        }
        return funCall;
    }
}
