package org.han.ica;

public class LesDemo {

    // 1 * 2 * 3, zou 6 uit moeten komen...

    public static void main(String[] args) {

        BinaryNode<String> plusNode = new BinaryNode<String>("+");
        BinaryNode<String> multNode = new BinaryNode<String>("*");

        BinaryNode<String> mn4 = new BinaryNode<String>("4");
        BinaryNode<String> mn5 = new BinaryNode<String>("5");
        BinaryNode<String> mn6 = new BinaryNode<String>("6");

        multNode.left = mn4;
        multNode.right = mn6;
        plusNode.left = multNode;
        plusNode.right = mn5;

//        BinaryNode<String> multNode1 = new BinaryNode<String>("*");
//        BinaryNode<String> multNode2 = new BinaryNode<String>("*");
//
//        BinaryNode<String> mn1 = new BinaryNode<String>("1");
//        BinaryNode<String> mn2 = new BinaryNode<String>("2");
//        BinaryNode<String> mn3 = new BinaryNode<String>("3");
//
//        multNode2.left = mn1;
//        multNode2.right = mn2;
//        multNode1.left = multNode2;
//        multNode1.right = mn3;

        BinaryTree<String> bt = new BinaryTree<>(plusNode);
        ApplyBinaryTree applyTree = new LesDemoApplyBinaryTreeSum();
        System.out.println("Som "+applyTree.apply(bt.root));

    }


}
