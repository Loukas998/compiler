import Angular.AngularLexer;
import Angular.AngularParser;
import Classes.ExpressionProcessor;
import Classes.Program;
import Classes.Visitor.AntlrToProgram;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       {

            AngularParser parser = getParser("tests\\angularTest.txt");

            ParseTree antlrAST = parser.prog();

            AntlrToProgram progVisitor = new AntlrToProgram();
            Program prog = progVisitor.visit(antlrAST);
            ExpressionProcessor ep = new ExpressionProcessor(prog.expressionList);
            for(String evaluation : ep.getEvaluationResults()){
                System.out.println(evaluation);
            } // for printing AST
          // progVisitor.symbolTable.printTable(); //For printing symbol table
           System.out.println(progVisitor.globalScope.print());
        }
    }

        private static AngularParser getParser(String fileName){
            AngularParser parser = null;

            try {
                CharStream input = CharStreams.fromFileName(fileName);
                AngularLexer lexer = new AngularLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                parser = new AngularParser(tokens);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return parser;
        }
}
