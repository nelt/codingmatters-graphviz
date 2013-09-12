package org.codingmatters.graph.layout.attributes.values;

/**
 * Created with IntelliJ IDEA.
 * User: nel
 * Date: 12/09/13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
public class Html {

    public static final String DELIMITER = "_____HTML____";

    static public String string(String str) {
        return DELIMITER + str + DELIMITER;
    }
}
