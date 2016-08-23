
public class BST {
	
	BST root,left, right;
	Object object;
	
	public BST(){
		root=null;
	}
	
	public BST(Object o, BST left, BST right){
		this.object=o;
		this.left=left;
		this.right=right;
	}
//Write a BST method that takes two integers, low and high, 
//and constructs an optimally balanced BST, like an AVL
//The routine should take linear time
//(1,5) is 1,2,3,4,5, build a balanced binary search tree
	
	
	public BST BSTBuilder(int low, int high){
		if(low>high) return null;
		int mid=(low+high)/2;
		BST left= BSTBuilder(low, mid-1);
		BST right=BSTBuilder(mid+1, high);
		return new BST((Object)mid,left,right);
		
		
	}

}
