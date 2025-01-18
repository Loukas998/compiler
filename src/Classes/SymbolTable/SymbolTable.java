package Classes.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    public List<Row> rowList=new ArrayList<>();
    public void addRow(Row row){
        this.rowList.add(row);
    }
    public void printTable(){
        System.out.println("Type\t\t\t\t\t\t\t\t\t\tValue");
        System.out.println("---------------------------------------------------------------");
        for(int i=0;i<rowList.size();i++){
            if(rowList.get(i)!=null){
                String type=rowList.get(i).type;
                String value=rowList.get(i).value;
                type=String.format("%-20s",type);
                value=String.format("%-20s",value);
                System.out.println(type +"\t\t\t" + "|" + "\t\t\t" + value);
                System.out.println("---------------------------------------------------------------");
                System.out.println();
            }
        }
    }
}