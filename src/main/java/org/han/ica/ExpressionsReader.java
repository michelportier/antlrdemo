package org.han.ica;

import java.util.Stack;

public class ExpressionsReader extends ExpressionsBaseListener {

    private Stack<BinaryNode<String>> stack = new Stack<>();


    public BinaryTree<String> getAst(){
        return new BinaryTree(stack.peek());
    }

    @Override
    public void exitExpression(ExpressionsParser.ExpressionContext ctx) {
        if(ctx.getChildCount()==1) {
            BinaryNode<String> node = new BinaryNode(ctx.getChild(0).getText());
            stack.push(node);
        }

        // NODE
        if(ctx.getChildCount()==3) {
            BinaryNode<String> node = new BinaryNode(ctx.getChild(1).getText());
            node.right = stack.pop();
            node.left = stack.pop();
            stack.push(node);
        }
    }
}
