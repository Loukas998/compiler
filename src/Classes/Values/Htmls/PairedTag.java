package Classes.Values.Htmls;

import Classes.Values.Htmls.Tags.CloseTag;
import Classes.Values.Htmls.Tags.OpenTag;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PairedTag extends HtmlTagValue{
    public OpenTag openTag;
    public List<HtmlTagValue> htmlTags;
    public CloseTag closeTag;

    public PairedTag(OpenTag openTag, List<HtmlTagValue> htmlTags, CloseTag closeTag) {
        this.openTag = openTag;
        this.htmlTags = htmlTags;
        this.closeTag = closeTag;
    }

    public PairedTag() {
        htmlTags = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "\n PairedTag {"+
                "\n openTag: " + this.openTag.toString() + ","+
                "\n innerTags: " + this.htmlTags.toString() + ","+
                "\n closeTag: " + this.closeTag.toString() +
                "\n }";
    }

    @Override
    public String codeGen() {
        StringBuilder htmlBuilder = new StringBuilder();

        // 1) Emit opening tag (may include inline <script> blocks for bindings on THIS element)
        String open = (openTag != null) ? openTag.codeGen() : "";
        htmlBuilder.append(open);

        // 2) Emit children (they may also include inline <script> blocks)
        if (htmlTags != null) {
            for (HtmlTagValue child : htmlTags) {
                htmlBuilder.append(child.codeGen());
            }
        }

        // 3) Emit closing tag
        String close = (closeTag != null) ? closeTag.codeGen() : "";
        htmlBuilder.append(close);

        // 4) Move executable <script> tags (type absent or not text/html) AFTER the inner HTML
        //    This ensures that scripts that depend on children run after children are in the DOM.
        String combined = htmlBuilder.toString();

        // Regex to match <script> blocks but skip type="text/html" placeholders
        // (?is) -> DOTALL + CASE_INSENSITIVE
        Pattern p = Pattern.compile("(?is)<script(?![^>]*type\\s*=\\s*\\\"text/html\\\")[^>]*>.*?</script>");
        Matcher m = p.matcher(combined);

        List<String> scripts = new ArrayList<>();
        int lastEnd = 0;
        StringBuilder withoutScripts = new StringBuilder();
        while (m.find()) {
            // Append preceding HTML
            withoutScripts.append(combined, lastEnd, m.start());
            // Collect script
            scripts.add(m.group());
            lastEnd = m.end();
        }
        // Append the rest of the HTML after last script
        withoutScripts.append(combined.substring(lastEnd));

        // Append collected scripts at the end (after close tag/content)
        StringBuilder finalOut = new StringBuilder(withoutScripts);
        for (String s : scripts) {
            finalOut.append('\n').append(s);
        }

        return finalOut.toString();
    }
}
