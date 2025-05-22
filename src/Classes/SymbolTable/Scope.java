package Classes.SymbolTable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Scope {

    public Scope parent;
    public String name;
    public int id;
    public ArrayList<Scope>childrenScopes = new ArrayList<>();
    public HashMap<String, Symbol> variables = new HashMap<String, Symbol>();
    public HashMap<String, Symbol> functions = new HashMap<String, Symbol>();

    public Scope(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public Scope(){}

    public Scope(String name, int id, Scope parent)
    {
        this.name = name;
        this.id = id;
        this.parent = parent;
    }

    public Symbol getSymbol(String symbolName)
    {
        Symbol symbol = variables.get(symbolName);
        if (symbol != null)
        {
            return symbol;
        }
        if (parent != null)
        {
            return parent.getSymbol(symbolName);
        }
        return null;
    }

    public Symbol exists(String symbolName)
    {
        return variables.get(symbolName);
    }

    public Symbol getFunctions(String functionName)
    {
        Symbol symbol = functions.get(functionName);
        if (symbol != null)
        {
            return symbol;
        }
        if (parent != null)
        {
            return parent.getFunctions(functionName);
        }
        return null;
    }

    public Symbol functionExists(String functionName)
    {
        return functions.get(functionName);
    }

    public boolean addSymbol(String name, Symbol symbol)
    {
        if(variables.containsKey(name))
        {
            return false;
        }
        variables.put(name, symbol);
        return true;
    }

    public boolean addFunction(String name, Symbol symbol) {
        if (functions.containsKey(name)) {
            return false;
        }
        functions.put(name, symbol);
        return true;
    }
    public String printVars(){
        ArrayList<String> ans = new ArrayList<>();
       variables.forEach((k,v)->{
             var symbol = v.print();
             ans.add(symbol);
       });
       String res = " " ;
       for(int i = 0 ; i < ans.size();i++){
           res+=ans.get(i);
           res+="\n";
       }
       return res;
    }
    public String printChildren(){
        String ans = " " ;
        for(int i = 0;i<childrenScopes.size();i++){
            ans += childrenScopes.get(i).print();
            ans += "\n";
           // ans+=childrenScopes.get(i).printChildren();
        }
        return ans;
    }
    public String print(){
        return "\n---------------------------------------" + "\n"
              + "Name : "   + this.name.toString() + "\n"
                 + "ID : " +  this.id +"\n"
                + "Variables " + this.printVars()  + "\n"
                + this.printChildren() + "\n"
                + "\n---------------------------------------";

    }
}
