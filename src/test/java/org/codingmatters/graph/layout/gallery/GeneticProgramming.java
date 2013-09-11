package org.codingmatters.graph.layout.gallery;

import org.codingmatters.graph.layout.Graph;
import org.codingmatters.graph.layout.attributes.Attributes;
import org.codingmatters.graph.layout.processor.GraphProcessing;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: nel
 * Date: 09/09/13
 * Time: 08:48
 * To change this template use File | Settings | File Templates.
 */
public class GeneticProgramming extends GallerySample {

    
    public static void main(String[] args) {
        generate(new GeneticProgramming(args), "genetic programming");
    }

    public GeneticProgramming(String[] args) {
        super(args);
    }


    @Override
    public Graph graph() {
        return new Graph("")
                .graphAttributes(Attributes.graph()
                        .label("((+ (* (X) (- (- (X) (X)) (X))) (% (+ (X) (X)) (COS (- (X) (X))))) (EXP (* (X) (X))) (+ (% (EXP (SIN (+ (X) (X)))) (SIN (* (X) (EXP (* (X) (X)))))) (* (X) (X))) (% (EXP (% (X) (% (X) (X)))) (EXP (SIN (X)))))")
                )
                .subgraph(new Graph("cluster01")
                        .graphAttributes(Attributes.graph()
                                .label("(+ (* (X) (- (- (X) (X)) (X))) (% (+ (X) (X)) (COS (- (X) (X)))))")
                        )
                        .node("n002", Attributes.node().label("+"))
                        .edge("n002", "n003")
                        .node("n003", Attributes.node().label("*"))
                        .edge("n003", "n004")
                        .node("n004", Attributes.node().label("X"))
                        .edge("n003", "n005")
                        .node("n005", Attributes.node().label("-"))
                        .edge("n005", "n006")
                        .node("n006", Attributes.node().label("-"))
                        .edge("n006", "n007")
                        .node("n007", Attributes.node().label("X"))
                        .edge("n006", "n008")
                        .node("n008", Attributes.node().label("X"))
                        .edge("n005", "n009")
                        .node("n009", Attributes.node().label("X"))
                        .edge("n002", "n010")
                        .node("n010", Attributes.node().label("%"))
                        .edge("n010", "n011")
                        .node("n011", Attributes.node().label("+"))
                        .edge("n011", "n012")
                        .node("n012", Attributes.node().label("X"))
                        .edge("n011", "n013")
                        .node("n013", Attributes.node().label("X"))
                        .edge("n010", "n014")
                        .node("n014", Attributes.node().label("COS"))
                        .edge("n014", "n015")
                        .node("n015", Attributes.node().label("-"))
                        .edge("n015", "n016")
                        .node("n016", Attributes.node().label("X"))
                        .edge("n015", "n017")
                        .node("n017", Attributes.node().label("X"))
                )
                .subgraph(new Graph("cluster17")
                        .graphAttributes(Attributes.graph().label("(EXP (* (X) (X)))"))
                        .node("n018", Attributes.node().label("EXP"))
                        .edge("n018", "n019")
                        .node("n019", Attributes.node().label("*"))
                        .edge("n019", "n020")
                        .node("n020", Attributes.node().label("X"))
                        .edge("n019", "n021")
                        .node("n021", Attributes.node().label("X"))
                )
                .subgraph(new Graph("cluster21")
                        .graphAttributes(Attributes.graph().label("(+ (% (EXP (SIN (+ (X) (X)))) (SIN (* (X) (EXP (* (X) (X)))))) (* (X) (X)))"))
                        .node("n022", Attributes.node().label("+"))
                        .edge("n022", "n023")
                        .node("n023", Attributes.node().label("%"))
                        .edge("n023", "n024")
                        .node("n024", Attributes.node().label("EXP"))
                        .edge("n024", "n025")
                        .node("n025", Attributes.node().label("SIN"))
                        .edge("n025", "n026")
                        .node("n026", Attributes.node().label("+"))
                        .edge("n026", "n027")
                        .node("n027", Attributes.node().label("X"))
                        .edge("n026", "n028")
                        .node("n028", Attributes.node().label("X"))
                        .edge("n023", "n029")
                        .node("n029", Attributes.node().label("SIN"))
                        .edge("n029", "n030")
                        .node("n030", Attributes.node().label("*"))
                        .edge("n030", "n031")
                        .node("n031", Attributes.node().label("X"))
                        .edge("n030", "n032")
                        .node("n032", Attributes.node().label("EXP"))
                        .edge("n032", "n033")
                        .node("n033", Attributes.node().label("*"))
                        .edge("n033", "n034")
                        .node("n034", Attributes.node().label("X"))
                        .edge("n033", "n035")
                        .node("n035", Attributes.node().label("X"))
                        .edge("n022", "n036")
                        .node("n036", Attributes.node().label("*"))
                        .edge("n036", "n037")
                        .node("n037", Attributes.node().label("X"))
                        .edge("n036", "n038")
                        .node("n038", Attributes.node().label("X"))
                )
                .subgraph(new Graph("cluster38")
                        .graphAttributes(Attributes.graph().label("(% (EXP (% (X) (% (X) (X)))) (EXP (SIN (X))))"))
                        .node("n039", Attributes.node().label("%"))
                        .edge("n039", "n040")
                        .node("n040", Attributes.node().label("EXP"))
                        .edge("n040", "n041")
                        .node("n041", Attributes.node().label("%"))
                        .edge("n041", "n042")
                        .node("n042", Attributes.node().label("X"))
                        .edge("n041", "n043")
                        .node("n043", Attributes.node().label("%"))
                        .edge("n043", "n044")
                        .node("n044", Attributes.node().label("X"))
                        .edge("n043", "n045")
                        .node("n045", Attributes.node().label("X"))
                        .edge("n039", "n046")
                        .node("n046", Attributes.node().label("EXP"))
                        .edge("n046", "n047")
                        .node("n047", Attributes.node().label("SIN"))
                        .edge("n047", "n048")
                        .node("n048", Attributes.node().label("X"))
                )
                ;
    }

    @Override
    public File generate() throws Exception {
        File output = this.getOutputFile("genetic-programming.png");
        GraphProcessing
                .dot(this.graph())
                .process(output)
        ;
        return output;
    }
}
