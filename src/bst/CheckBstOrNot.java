package bst;

import bt.BTNode;

public class CheckBstOrNot {
	
	public static boolean checkBST(BTNode root) {
		if(root == null) return true;
		if(root.left != null && root.key < root.left.key  ) return false;
		if(root.right != null &&root.key > root.right.key) return false;
		if(!checkBST(root.left) || !checkBST(root.right) ) return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = CreateBSTSortedArray.createBST();
		System.out.println("is BST:"+ checkBST(root));
		 root = BTNode.createtree();
		 System.out.println("is BST:"+ checkBST(root));

	}

}
