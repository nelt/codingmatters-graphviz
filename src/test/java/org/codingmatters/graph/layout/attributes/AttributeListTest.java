package org.codingmatters.graph.layout.attributes;

import org.codingmatters.graph.layout.attributes.values.Html;
import org.codingmatters.graph.layout.formatting.IndentedFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nelt
 * Date: 11/08/13
 * Time: 07:25
 */
public class AttributeListTest {

    private IndentedFormatter formatter;

    @Before
    public void setUp() throws Exception {
        this.formatter = new IndentedFormatter();
    }

    @Test
    public void testEmpty() throws Exception {
        AttributeList attributes = new AttributeList();
        attributes.format(this.formatter);

        assertEquals("", this.formatter.formatted());
    }

    @Test
    public void testSingle() throws Exception {
        AttributeList attributes = new AttributeList()
                .attribute("name", "value")
                ;
        attributes.format(this.formatter);

        assertEquals("name = value", this.formatter.formatted());
    }

    @Test
    public void testDouble() throws Exception {
        double value = 12.01;
        AttributeList attributes = new AttributeList()
                .attribute("name", value)
                ;
        attributes.format(this.formatter);

        assertEquals("name = 12.01", this.formatter.formatted());
    }
    
    @Test
    public void testNegativeDouble() throws Exception {
        double value = -12.01;
        AttributeList attributes = new AttributeList()
                .attribute("name", value)
                ;
        attributes.format(this.formatter);

        assertEquals("name = -12.01", this.formatter.formatted());
    }
    
    @Test
    public void testInt() throws Exception {
        int value = 12;
        AttributeList attributes = new AttributeList()
                .attribute("name", value)
                ;
        attributes.format(this.formatter);

        assertEquals("name = 12", this.formatter.formatted());
    }

    @Test
    public void testNegativeInt() throws Exception {
        int value = -12;
        AttributeList attributes = new AttributeList()
                .attribute("name", value)
                ;
        attributes.format(this.formatter);

        assertEquals("name = -12", this.formatter.formatted());
    }

    @Test
    public void testMultiple() throws Exception {
        AttributeList attributes = new AttributeList()
                .attribute("name1", "value1")
                .attribute("name2", "value2")
                ;
        attributes.format(this.formatter);

        assertEquals("name1 = value1, name2 = value2", this.formatter.formatted());
    }

    @Test
    public void testProtectedValue() throws Exception {
        AttributeList attributes = new AttributeList()
                .attribute("name", "with space")
                ;
        attributes.format(this.formatter);
        
        assertEquals("name = \"with space\"", this.formatter.formatted());
    }
    @Test
    public void testProtectedValueWithEscape() throws Exception {
        AttributeList attributes = new AttributeList()
                .attribute("name", "with \" and space")
                ;
        attributes.format(this.formatter);
        
        assertEquals("name = \"with \\\" and space\"", this.formatter.formatted());
    }


    @Test
    public void testHtmlString() throws Exception {
        AttributeList attributes = new AttributeList()
                .attribute("name", Html.string("<table border=\"0\"><tr><td bgcolor=\"black\">&#40;5&#41; r -&gt; &bull;l </td></tr></table>"))
                ;
        attributes.format(this.formatter);

        assertEquals("name = <<table border=\"0\"><tr><td bgcolor=\"black\">&#40;5&#41; r -&gt; &bull;l </td></tr></table>>", this.formatter.formatted());
    }
}
