import Angular.AngularLexer;
import Angular.AngularParser;
import Classes.CSS.CssGeneric;
import Classes.CSS.Visitor.CssVisitor;
import Classes.Errors.SemError;
import Classes.ExpressionProcessor;
import Classes.Program;
import Classes.Values.Htmls.HtmlTagValue;
import Classes.Visitor.AntlrToProgram;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       {
           ArrayList<SemError>semanticErrors = new ArrayList<>();
            AngularParser parser = getParser("tests\\angular.txt");
            ParseTree antlrAST = parser.prog();
            AntlrToProgram progVisitor = new AntlrToProgram();
            progVisitor.semanticErrors = semanticErrors;
            Program prog = progVisitor.visit(antlrAST);
            ExpressionProcessor ep = new ExpressionProcessor(prog.expressionList);
            if(semanticErrors.isEmpty()) {
                for (String evaluation : ep.getEvaluationResults()) {
                    System.out.println(evaluation);

                } // for printing AST

                System.out.println(progVisitor.globalScope.print());
                try{
                    codeGen(prog);
                    //cssGen(prog);
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            else{
                for(int i = 0 ; i < semanticErrors.size();i++){
                    System.out.println(semanticErrors.get(i).print());
                    System.out.println();
                }
            }


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
        public static void codeGen(Program program) throws IOException {
        StringBuilder space = new StringBuilder("\t\t");
        StringBuilder htmlSpace = new StringBuilder("\t\t");
        try {
            FileWriter fw = new FileWriter("GenCode.html");
            codeGen("<!DOCTYPE html>",fw);
            codeGen("\n<html>",fw);
            codeGen("\n<head>",fw);
            codeGen("\n<title>Angular Project</title>",fw);
            codeGen("\n<link rel = \"stylesheet\" href = \"gen.css\"/>",fw);
            codeGen("\n<script>",fw);
            if(!program.expressionList.isEmpty()) {
                for(int i = 0 ; i<program.expressionList.size();i++){
                    if((!(program.expressionList.get(i)instanceof HtmlTagValue)) &&(!(program.expressionList.get(i) instanceof CssGeneric)))
                    {
                        space.append(program.expressionList.get(i).codeGen());
                    }

                }
            }
            codeGen(space.toString(),fw);
            codeGen("\n</script>",fw);
            codeGen("\n</head>",fw);
            codeGen("\n<body>",fw);
            codeGen("\n<div id = \"app\"></div>\n\n",fw);
           if(!program.expressionList.isEmpty()){
               for(int i = 0;i<program.expressionList.size();i++){
                   if(program.expressionList.get(i) instanceof HtmlTagValue){
                       htmlSpace.append(program.expressionList.get(i).codeGen());
                   }
               }
           }
           codeGen(htmlSpace.toString(),fw);
            codeGen("\n</body>",fw);
           // codeGen("<DOCTYPE html>",fw);
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
        public static void cssGen(Program program)throws IOException{
            StringBuilder space = new StringBuilder("\t\t");
            try{
                FileWriter fw1 = new FileWriter("gen.css");
                if(!program.expressionList.isEmpty()) {
                    for(int i = 0 ; i<program.expressionList.size();i++){
                        if(((program.expressionList.get(i) instanceof CssGeneric)))
                        {
                            space.append(program.expressionList.get(i).codeGen());
                        }

                    }
                    codeGen(space.toString(),fw1);
                }
                fw1.close();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    private  static void codeGen(String s,FileWriter fw) throws  IOException{
        fw.write(s);
    }
}
