package Classes.GenericStatements;

import Classes.Expression;

import java.io.FileWriter;

public abstract class GenericStatement extends Expression {

    public abstract void codeGen(String s, FileWriter fw);
}
