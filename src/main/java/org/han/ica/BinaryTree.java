package org.han.ica;

public class BinaryTree<T> {
	public BinaryNode<T> root;
	
	public BinaryTree(BinaryNode<T> root){
		this.root = root;
	}
	
	// Niet static 18.11:
	public int nrOfLeaves(){
		return root.nrOfLeaves();
	}
	
	public int nrOfOneNullChilds(){
		return root.nrOfOneNullChilds();
	}
	
	public int nrOfTwoChilds(){
		return root.nrOfTwoChilds();
	}
}
