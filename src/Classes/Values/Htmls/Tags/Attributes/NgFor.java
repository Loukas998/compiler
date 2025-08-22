package Classes.Values.Htmls.Tags.Attributes;

import Classes.GenericStatements.ForLoops.ForBody;

public class NgFor extends Attribute{
    public String singular;
    public String plural;
    private String uniqueId;

    public NgFor(){
        this.uniqueId = "ngFor_" + System.nanoTime(); // Generate unique ID
    }

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

    @Override
    public String codeGen() {
        return "" ;
    }
    public String codeGen(String innerTemplateHtml) {
        // HTML Container for the list (placeholder)
        String htmlContainer = String.format("<ul id=\"ngFor-container-%s\"></ul>\n", this.uniqueId);
        // JavaScript Template for a single item within the loop
        String jsInnerTemplate = innerTemplateHtml;

        String jsLogic = String.format(
                "const ngForContainer_%1$s = document.getElementById(\"ngFor-container-%1$s\");\n" +
                        "function createNgForItemElement_%1$s(item, index) {\n" +
                        "  const tempDiv = document.createElement(\"div\");\n" +
                        "  let itemHtml = String.raw`%2$s`;\n" +
                        "  itemHtml = itemHtml\n" +
                        "    .replace(/\\{\\{%3$s\\.([^\\}]+)\\}\\}/g, (match, prop) => item[prop] !== undefined ? item[prop] : \"\")\n" +
                        "    .replace(/\\{\\{index\\}\\}\\}/g, index);\n" +
                        "  tempDiv.innerHTML = itemHtml;\n" +
                        "  const newElement = tempDiv.firstElementChild;\n" +
                        "  const itemId = item.id; // Assuming item has an `id` property for trackBy\n" +
                        "  newElement.dataset.ngforItemId = itemId;\n" +
                        "  if (typeof window.processDynamicContent === \"function\") {\n" +
                        "    window.processDynamicContent(newElement);\n" +
                        "  }\n" +
                        "  return newElement;\n" +
                        "}\n" +
                        "function updateNgFor_%1$s(newCollection) {\n" +
                        "  const oldElementsMap = new Map();\n" +
                        "  Array.from(ngForContainer_%1$s.children).forEach(child => {\n" +
                        "    oldElementsMap.set(child.dataset.ngforItemId, child);\n" +
                        "  });\n" +
                        "  const fragment = document.createDocumentFragment();\n" +
                        "  newCollection.forEach((item, index) => {\n" +
                        "    const itemId = item.id;\n" +
                        "    let element = oldElementsMap.get(itemId);\n" +
                        "    if (element) {\n" +
                        "      const tempDiv = document.createElement(\"div\");\n" +
                        "      let updatedItemHtml = String.raw`%2$s`;\n" +
                        "      updatedItemHtml = updatedItemHtml\n" +
                        "        .replace(/\\{\\{%3$s\\.([^\\}]+)\\}\\}/g, (match, prop) => item[prop] !== undefined ? item[prop] : \"\")\n" +
                        "        .replace(/\\{\\{index\\}\\}\\}/g, index);\n" +
                        "      tempDiv.innerHTML = updatedItemHtml;\n" +
                        "      element.innerHTML = tempDiv.firstElementChild.innerHTML;\n" +
                        "      if (typeof window.processDynamicContent === \"function\") {\n" +
                        "        window.processDynamicContent(element);\n" +
                        "      }\n" +
                        "      oldElementsMap.delete(itemId);\n" +
                        "    } else {\n" +
                        "      element = createNgForItemElement_%1$s(item, index);\n" +
                        "    }\n" +
                        "    fragment.appendChild(element);\n" +
                        "  });\n" +
                        "  oldElementsMap.forEach(element => {\n" +
                        "    ngForContainer_%1$s.removeChild(element);\n" +
                        "  });\n" +
                        "  while (ngForContainer_%1$s.firstChild) {\n" +
                        "    ngForContainer_%1$s.removeChild(ngForContainer_%1$s.firstChild);\n" +
                        "  }\n" +
                        "  ngForContainer_%1$s.appendChild(fragment);\n" +
                        "}\n" +
                        "document.addEventListener(\"DOMContentLoaded\", () => {\n" +
                        "  updateNgFor_%1$s(window.%4$s);\n" +
                        "});\n" +
                        "let _%4$s = window.%4$s;\n" +
                        "Object.defineProperty(window, \"%4$s\", {\n" +
                        "  get: function() { return _%4$s; },\n" +
                        "  set: function(newCollection) {\n" +
                        "    _%4$s = newCollection;\n" +
                        "    updateNgFor_%1$s(newCollection);\n" +
                        "  }\n" +
                        "});\n",
                this.uniqueId, jsInnerTemplate.replace("`", "\\`"), singular, plural
        );

        return htmlContainer + "<script>\n" + jsLogic + "</script>\n";
    }
}
