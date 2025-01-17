package Classes.GenericStatements.ForLoops;

import Classes.GenericStatements.GenericStatement;

import java.util.ArrayList;
import java.util.List;

public class MultipleLinesForLoop extends ForBody{
    public List<GenericStatement> genericStatements;
    public MultipleLinesForLoop(){
        this.genericStatements = new ArrayList<>();
    }
    public MultipleLinesForLoop(List<GenericStatement> genericStatements){
        this.genericStatements = genericStatements;
    }

    @Override
    public String toString(){
        return genericStatements.toString();
    }
}
