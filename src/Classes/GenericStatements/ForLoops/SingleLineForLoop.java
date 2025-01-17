package Classes.GenericStatements.ForLoops;

import Classes.GenericStatements.GenericStatement;

import java.util.ArrayList;
import java.util.List;

public class SingleLineForLoop extends ForBody{
    public GenericStatement genericStatement;
    public SingleLineForLoop(){
    }
    public SingleLineForLoop(GenericStatement genericStatements){
        this.genericStatement = genericStatements;
    }

    @Override
    public String toString(){
        return genericStatement.toString();
    }
}
