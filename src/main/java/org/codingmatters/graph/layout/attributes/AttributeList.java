package org.codingmatters.graph.layout.attributes;

import org.codingmatters.graph.layout.attributes.values.Html;
import org.codingmatters.graph.layout.formatting.IndentedFormatter;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: nelt
 * Date: 11/08/13
 * Time: 07:24
 */
public class AttributeList {
    
    private final LinkedList<String> ordered = new LinkedList<>();
    private final HashMap<String, String> attributes = new HashMap<>();

    public void format(IndentedFormatter formatter) {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (String name : this.attributes.keySet()) {
            if(first) {
                first = false;
            } else {
                result.append(", ");
            }
            result.append(name).append(" = ").append(this.protect(this.attributes.get(name)));
        }
        formatter.append(result.toString());
    }

    private String protect(String value) {
        if(value.equals("")) return value;
        if(this.isIdentifier(value) || this.isNumeral(value)) {
            return value;
        } else if(this.isHtml(value)) {
            return "<" + value.substring(Html.DELIMITER.length(), value.length() - Html.DELIMITER.length()) + ">";
        } else {
            return this.quote(value);
        }
    }

    private boolean isHtml(String value) {
        return value.startsWith(Html.DELIMITER) && value.endsWith(Html.DELIMITER);
    }

    private String quote(String value) {
        return "\"" + value.replaceAll("\"", "\\\\\"") + "\"";
    }

    private boolean isIdentifier(String value) {
        return value.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }
    private boolean isNumeral(String value) {
        //  [-]?(.[0-9]+ | [0-9]+(.[0-9]*)? )
        return value.matches("-?[0-9]+.[0-9]*");
    }

    public AttributeList attribute(String name, String value) {
        if(this.ordered.contains(name)) {
            this.ordered.remove(name);
        }
        this.ordered.add(name);
        this.attributes.put(name, value);
        return this;
    }

    public AttributeList attribute(String name, double d) {
        return this.attribute(name, Double.toString(d));
    }


    public AttributeList attribute(String name, int d) {
        return this.attribute(name, Integer.toString(d));
    }

    public AttributeList attribute(String name, boolean b) {
        this.attribute(name, Boolean.toString(b));
        return this;
    }
}
