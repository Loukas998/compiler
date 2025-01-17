package Classes.Values.Htmls.Tags.Attributes;

import Classes.GenericStatements.ForLoops.ForBody;

public class NgFor extends Attribute{
    public String singular;
    public String plural;

    public NgFor(){}

    public NgFor(String singular, String plural) {
        this.singular = singular;
        this.plural = plural;
    }

    @Override
    public String toString(){
        return "\n NgFor{" +
                "\n variableName: " + this.singular + "," +
                "\n loopedList: " + this.plural +
                "\n }"
                ;
    }
}
