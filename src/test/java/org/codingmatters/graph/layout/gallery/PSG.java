package org.codingmatters.graph.layout.gallery;

import org.codingmatters.graph.layout.Graph;
import org.codingmatters.graph.layout.attributes.Attributes;
import org.codingmatters.graph.layout.attributes.EdgeAttributes;
import org.codingmatters.graph.layout.attributes.NodeAttributes;
import org.codingmatters.graph.layout.attributes.values.*;
import org.codingmatters.graph.layout.processor.GraphProcessing;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: nel
 * Date: 11/09/13
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public class PSG extends GallerySample {

    public static void main(String[] args) {
        generate(new PSG(args), "PSG");
    }
    
    protected PSG(String[] args) {
        super(args);
    }

    @Override
    public Graph graph() {
        return new Graph("g").directed()
                .graphAttributes(Attributes.graph()
                        .fontSize(30)
                        .labelLocalisation(VerticalLocalisation.TOP)
//                        .label("")
                        .splines()
                        .noOverlap()
                        .rankdir(Direction.major(Direction.Dir.LEFT).minor(Direction.Dir.RIGHT))
                        .aspectRatio(AspectRatioType.AUTO)
                )
                .node("state0", this.baseNodeAttributes()
                        .style(Style.NodeStyle.FILLED, Style.NodeStyle.BOLD)
                        .penwidth(5)
                        .label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #0</font></td></tr><tr><td align=\"left\" port=\"r0\">&#40;0&#41; s -&gt; &bull;e $ </td></tr><tr><td align=\"left\" port=\"r1\">&#40;1&#41; e -&gt; &bull;l '=' r </td></tr><tr><td align=\"left\" port=\"r2\">&#40;2&#41; e -&gt; &bull;r </td></tr><tr><td align=\"left\" port=\"r3\">&#40;3&#41; l -&gt; &bull;'*' r </td></tr><tr><td align=\"left\" port=\"r4\">&#40;4&#41; l -&gt; &bull;'n' </td></tr><tr><td align=\"left\" port=\"r5\">&#40;5&#41; r -&gt; &bull;l </td></tr></table>"))
                )
                .node("state1", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #1</font></td></tr><tr><td align=\"left\" port=\"r3\">&#40;3&#41; l -&gt; &bull;'*' r </td></tr><tr><td align=\"left\" port=\"r3\">&#40;3&#41; l -&gt; '*' &bull;r </td></tr><tr><td align=\"left\" port=\"r4\">&#40;4&#41; l -&gt; &bull;'n' </td></tr><tr><td align=\"left\" port=\"r5\">&#40;5&#41; r -&gt; &bull;l </td></tr></table>")))
                .node("state2", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #2</font></td></tr><tr><td align=\"left\" port=\"r4\">&#40;4&#41; l -&gt; 'n' &bull;</td><td bgcolor=\"grey\" align=\"right\">=$</td></tr></table>")))
                .node("state3", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #3</font></td></tr><tr><td align=\"left\" port=\"r5\">&#40;5&#41; r -&gt; l &bull;</td><td bgcolor=\"grey\" align=\"right\">=$</td></tr></table>")))
                .node("state4", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #4</font></td></tr><tr><td align=\"left\" port=\"r3\">&#40;3&#41; l -&gt; '*' r &bull;</td><td bgcolor=\"grey\" align=\"right\">=$</td></tr></table>")))
                .node("state5", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"black\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #5</font></td></tr><tr><td align=\"left\" port=\"r0\"><font color=\"white\">&#40;0&#41; s -&gt; e &bull;$ </font></td></tr></table>")))
                .node("state6", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #6</font></td></tr><tr><td align=\"left\" port=\"r1\">&#40;1&#41; e -&gt; l &bull;'=' r </td></tr><tr><td align=\"left\" port=\"r5\">&#40;5&#41; r -&gt; l &bull;</td><td bgcolor=\"grey\" align=\"right\">$</td></tr></table>")))
                .node("state7", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #7</font></td></tr><tr><td align=\"left\" port=\"r1\">&#40;1&#41; e -&gt; l '=' &bull;r </td></tr><tr><td align=\"left\" port=\"r3\">&#40;3&#41; l -&gt; &bull;'*' r </td></tr><tr><td align=\"left\" port=\"r4\">&#40;4&#41; l -&gt; &bull;'n' </td></tr><tr><td align=\"left\" port=\"r5\">&#40;5&#41; r -&gt; &bull;l </td></tr></table>")))
                .node("state8", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #8</font></td></tr><tr><td align=\"left\" port=\"r1\">&#40;1&#41; e -&gt; l '=' r &bull;</td><td bgcolor=\"grey\" align=\"right\">$</td></tr></table>")))
                .node("state9", this.baseNodeAttributes().label(Html.string("<table border=\"0\" cellborder=\"0\" cellpadding=\"3\" bgcolor=\"white\"><tr><td bgcolor=\"black\" align=\"center\" colspan=\"2\"><font color=\"white\">State #9</font></td></tr><tr><td align=\"left\" port=\"r2\">&#40;2&#41; e -&gt; r &bull;</td><td bgcolor=\"grey\" align=\"right\">$</td></tr></table>")))
                
                .edge("state0", "state5", this.black().label("e"))
                .edge("state0", "state6", this.black().label("l"))
                .edge("state0", "state9", this.black().label("r"))
                .edge("state0", "state1", this.grey().label("'*'"))
                .edge("state0", "state2", this.grey().label("'n'"))
                .edge("state1", "state1", this.grey().label("'*'"))
                .edge("state1", "state4", this.black().label("r"))
                .edge("state1", "state2", this.grey().label("'n'"))
                .edge("state1", "state3", this.black().label("l"))
                .edge("state6", "state7", this.grey().label("'='"))
                .edge("state7", "state8", this.black().label("r"))
                .edge("state7", "state1", this.grey().label("'*'"))
                .edge("state7", "state2", this.grey().label("'n'"))
                .edge("state7", "state3", this.black().label("l"))
                
                ;
    }

    private EdgeAttributes grey() {
        return Attributes.edge().penwidth(1).fontSize(14).fontColor(Color.named("grey28"));
    }
    
    private EdgeAttributes black() {
        return Attributes.edge().penwidth(5).fontSize(28).fontColor(Color.named("black"));
    }

    private NodeAttributes baseNodeAttributes() {
        return Attributes.node()
                .style(Style.NodeStyle.FILLED)
                .penwidth(1)
                .fillcolor(Color.named("white"))
                .fontName("Courrier New")
                .shape(Shape.MRECORD);
    }

    @Override
    public File generate() throws Exception {
        File output = this.getOutputFile("psg.png");
        GraphProcessing
                .dot(this.graph())
                .process(output)
        ;
        return output;
    }
}
