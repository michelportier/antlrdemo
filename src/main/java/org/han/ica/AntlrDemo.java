package org.han.ica;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AntlrDemo {

    public static void main(String[] args) {
        String input = "1+3+80*2-25";


        CharStream cs = CharStreams.fromString(input);
        ExpressionsLexer lexer = new ExpressionsLexer(cs);
        TokenStream tokens = new CommonTokenStream(lexer);

        ExpressionsParser parser = new ExpressionsParser(tokens);

        ParseTree tree = parser.expression();

        ExpressionsReader reader = new ExpressionsReader();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(reader,tree);

        BinaryTree<String> result = reader.getAst();

        ApplyBinaryTree applyTree = new LesDemoApplyBinaryTreeSum();
        System.out.println("Som "+applyTree.apply(result.root));
    }
}
