package bst;

import bt.BTNode;

public class CreateBSTSortedArray {

	public static BTNode createBST(int[] a, int l, int r) {
		if (l > r)
			return null;
		int m = (l + r) / 2;
		BTNode root = new BTNode(a[m]);
		root.left = createBST(a, l, m - 1);
		root.right = createBST(a, m + 1, r);
		return root;

	}
	public static BTNode createBST() {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		BTNode root = createBST(a,  0,  a.length-1);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		BTNode root = createBST(a,  0,  a.length-1);
		
		System.out.println("preorder:");
		BTNode.preOrderRec(root);
		System.out.println();
		System.out.println("inorder:");
		BTNode.inOrderRec(root);
	}

}
