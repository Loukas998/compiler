package Classes.Values;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;

public abstract class ValueType extends GenericStatement {

    public abstract void codeGen(String s, FileWriter fw);


}
