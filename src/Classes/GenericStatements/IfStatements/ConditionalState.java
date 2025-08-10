package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;

public abstract class ConditionalState extends GenericStatement {
    public  abstract  void codeGen(String s, FileWriter fw);
}
