package org.han.ica;

public class BinaryNode<T> {
	public T value;
	BinaryNode<T> left;
	BinaryNode<T> right;
	
	public BinaryNode(T value){
		this.value = value;
	}
	
	public void printPreOrder(){
		System.out.println(value.toString());
		if (left != null){
			left.printPreOrder();
		}
		if (right != null){
			right.printPreOrder();
		}
	}

	public int nrOfLeaves() {
		if (left==null && right==null)
			return 1;
		
		int result = 0;
		
		if (left!=null){
			result += left.nrOfLeaves();
		}
		if (right!=null){
			result += right.nrOfLeaves();
		}
		
		return result;
	}
	
	public int nrOfOneNullChilds(){
		if (left==null && right==null)
			return 0;
		if (left!=null && right==null)
			return 1 + left.nrOfOneNullChilds();
		if (left==null && right!=null)
			return 1 + right.nrOfOneNullChilds();
		
		return left.nrOfOneNullChilds() + right.nrOfOneNullChilds();
		
	}
	
	public int nrOfTwoChilds(){
		if (left==null && right==null)
			return 0;
		if (left!=null && right==null)
			return left.nrOfTwoChilds();
		if (left==null && right!=null)
			return right.nrOfTwoChilds();
		
		return 1 + left.nrOfOneNullChilds() + right.nrOfOneNullChilds();
		
	}
}
