package Classes.SymbolTable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {

    public Scope parent;
    public String name;
    public int id;
    public ArrayList<Scope>childrenScopes = new ArrayList<>();
    public Map<String, Symbol> variables = new LinkedHashMap<String, Symbol>();
    //public Map<String, Symbol> functions = new LinkedHashMap<String,Symbol>();

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
        this.parent.childrenScopes.add(this);
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
    public boolean addSymbol(String name, Symbol symbol)
    {
        if(variables.containsKey(name))
        {
            return false;
        }
        variables.put(name, symbol);
        return true;
    }

//    public boolean addFunction(String name, Symbol symbol) {
//        if (functions.containsKey(name)) {
//            return false;
//        }
//        functions.put(name, symbol);
//        return true;
//    }
    public String printVars(){
        ArrayList<String> ans = new ArrayList<>();
       variables.forEach((k,v)->{
           ans.add("name: " + k);
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
        StringBuilder ans = new StringBuilder(" ");
        for(int i = 0;i<childrenScopes.size();i++){
            ans.append(childrenScopes.get(i).print());
            ans.append("\n");
           // ans+=childrenScopes.get(i).printChildren();
        }
        return ans.toString();
    }
    public String print(){
        return "\n---------------------------------------" + "\n"
                + "Name : "   + this.name.toString() + "\n"
                + "ID : " +  this.id +"\n"
                + "Variables " +"\n"
                + this.printVars()  + "\n"
                + this.printChildren() + "\n"
                + "\n---------------------------------------";

    }
}
