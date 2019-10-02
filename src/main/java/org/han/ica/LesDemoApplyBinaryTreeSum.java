package org.han.ica;

public class LesDemoApplyBinaryTreeSum implements ApplyBinaryTree<String, Integer> {
    @Override
    public Integer apply(BinaryTree<String> bt) {
        return apply(bt.root);
    }

    @Override
    public Integer apply(BinaryNode<String> node) {
        if (node.value.equals("*")){
            return apply (node.left) * apply (node.right);

        }
        if (node.value.equals("+")){
            return apply (node.left) + apply (node.right);

        }
        if (node.value.equals("-")){
            return apply (node.left) - apply (node.right);

        }
        if (node.value.equals("/")){
            return apply (node.left) / apply (node.right);

        }

        // leaf: return the number
        return Integer.valueOf(node.value);
    }
}
