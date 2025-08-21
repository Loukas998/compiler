package Classes.Values.Htmls.Tags.Attributes;

import Classes.Values.Htmls.HtmlTagValue;

public class NgModel extends Attribute {
    public String assignedValue;

    public NgModel(String assignedValue) {
        this.assignedValue = assignedValue;
    }

    public NgModel() {
    }

    @Override
    public String toString() {
        return "\n NgModelAttribute";
    }

    @Override
    public String codeGen() {
        return "id = \"ngModel_"+this.hashCode()+"\"";
    }
}
