package Classes.GenericStatements.ForLoops;

public class For {
    public String singular;
    public String plural;
    public ForBody forBody;

    public For(){}

    public For(String singular, String plural, ForBody forBody) {
        this.singular = singular;
        this.plural = plural;
        this.forBody = forBody;
    }

    @Override
    public String toString(){
        return "For Loop " + forBody.toString();
    }
}
