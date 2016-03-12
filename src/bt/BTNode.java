package bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import bst.BSTNode;

public class BTNode {
	public int key;
	public BTNode left;
	public BTNode right;

	public BTNode(int key) {
		super();
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}

	public static void preOrderRec(BTNode root) {
		if (root == null)
			return;
		System.out.print(root.key);
		System.out.print(" ");
		preOrderRec(root.left);
		preOrderRec(root.right);
	}
	
	public static void preOrderIteration(BTNode root) {
		Stack<BTNode> stack = new Stack<BTNode>();
		while(true) {
			while(root != null) {
				System.out.print(root.key);
				System.out.print(" ");
				stack.push(root);
				root = root.left;
			}
			if(stack.isEmpty()) break;
			root = stack.pop();
			root = root.right;
		}
	}
	
	public static void inOrderIteration(BTNode root) {
		Stack<BTNode> stack = new Stack<BTNode>();
		while(true) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			if(stack.isEmpty()) break;
			root = stack.pop();
			System.out.print(root.key);
			System.out.print(" ");
			root = root.right;
		}
	}
	
	public static void inOrderRec(BTNode root) {
		if (root == null)
			return;
		inOrderRec(root.left);
		System.out.print(root.key);
		System.out.print(" ");
		inOrderRec(root.right);
	}
	
	public static void postOrderRec(BTNode root) {
		if (root == null)
			return;
		postOrderRec(root.left);
		postOrderRec(root.right);
		System.out.print(root.key);
		System.out.print(" ");

	}
	
	public static void postOrderRecWithTwoStacks(BTNode root) {
		Stack<BTNode> s1 = new Stack<BTNode>();
		Stack<BTNode> s2 = new Stack<BTNode>();
		if(root == null) return;
		s1.push(root);
		while(!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if(root.left != null) {
				s1.push(root.left);
			}
			if(root.right != null) {
				s1.push(root.right);
			}
		}
		while(!s2.isEmpty()) {
			root = s2.pop();
			System.out.print(root.key);
			System.out.print(" ");
		}
 
	}
	
	public static void levelOrder(BTNode root) {
		if(root == null) {
			System.out.println(root);
			return;
		}
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			root = queue.remove();
			System.out.print(root.key);
			System.out.print(" ");
			if(root.left != null) {
				queue.add(root.left);
			}
			if(root.right != null) {
				queue.add(root.right);
			}

		}

 	}
	
	public static BTNode createtree() {
		BTNode root = new BTNode(1);
		root.left =  new BTNode(2);
		root.right =  new BTNode(3);
		root.left.left =  new BTNode(4);
		root.left.right =  new BTNode(5);
		root.right.left =  new BTNode(6);
		root.right.right =  new BTNode(7);
		return root;
	}
	
	public static BTNode createtreeNonBalanced() {
		BTNode root = new BTNode(1);
		root.left =  new BTNode(2);
		root.right =  new BTNode(3);
		root.left.left =  new BTNode(4);
		root.left.right =  new BTNode(5);
		root.right.left =  new BTNode(6);
		root.right.right =  new BTNode(7);
		root.right.right.right =  new BTNode(8);
		root.right.right.right.right =  new BTNode(9);
		return root;
	}
	
	public static int height(BTNode root) {
		if(root == null) return 0;
		
	int leftHeight =  height(root.left);
	int rightHeight =  height(root.right);
	return Math.max(leftHeight, rightHeight)+1;
	}
	
	public static void main(String args[]) {
		BTNode root =  BTNode.createtree();
		System.out.println("preorder:");
		preOrderRec(root);
		System.out.println();
		preOrderIteration(root);
		System.out.println();
		System.out.println("inorder:");
		inOrderRec(root);
		System.out.println();
		inOrderIteration(root);
		System.out.println();
		System.out.println("postorder:");
		postOrderRec(root);
		System.out.println();
		postOrderRecWithTwoStacks(root);
		System.out.println();
		System.out.println("levelOrder:");
		levelOrder(root);
	}

	
}
