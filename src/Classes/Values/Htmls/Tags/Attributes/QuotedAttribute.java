package Classes.Values.Htmls.Tags.Attributes;

public class QuotedAttribute extends Attribute{
    public String attributeName;
    public String attributeValue;
    public QuotedAttribute(){}

    public QuotedAttribute(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString(){
        return "\n QuotedAttribute{" +
                "\n attributeName: " + this.attributeName + "," +
                "\n attributeValue: " + this.attributeValue +
                "\n }";
    }
}
