package bst;

import java.util.LinkedList;
import java.util.Queue;

public class BSTNode {
	public int key;
	public BSTNode left;
	public BSTNode right;

	public BSTNode(int key) {
		super();
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public static BSTNode insert(BSTNode root, int key) {
		if (root == null)
			return root = new BSTNode(key);
		else if (key <= root.key) {
			if (root.left == null) {
				root.left = new BSTNode(key);
			} else {
				insert(root.left, key);
			}
		} else if (key > root.key) {
			if (root.right == null) {
				root.right = new BSTNode(key);
			} else {
				insert(root.right, key);
			}
		}

		return root;
	}
	public static void levelOrder(BSTNode root) {
		if(root == null) {
			System.out.println(root);
			return;
		}
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			root = queue.remove();
			System.out.println(root.key);
			if(root.left != null) {
				queue.add(root.left);
			}
			if(root.right != null) {
				queue.add(root.right);
			}

		}

 	}

	public static BSTNode search1(BSTNode root, int key) {
		if (root == null || root.key == key)
			return root;
		if (key <= root.key) {
			return search1(root.left, key);
		}
		return search1(root.right, key);
	}
	
	public static BSTNode search2(BSTNode root, int key) {
		if (root == null)
			return root;
		if(root.key == key) {
			return root;
		}
		if (key <= root.key) {
			return search2(root.left, key);
		}
		
			return search2(root.right, key);
	}

	public static void main(String args[]) {
		BSTNode root = null;
		root = insert(root, 5);
		System.out.println(root.key);
		insert(root, 3);
		insert(root, 2);
		insert(root, 4);
		insert(root, 7);
		insert(root, 6);
		insert(root, 8);
		System.out.println(root.key);
		levelOrder(root);
		BSTNode node;
		int key = 4;
		node = search1(root, key);
		if(node == null) {
			System.out.println("not found");
		} else {
			System.out.println("found : " + node.key);
		}
		
		node = search2(root, key);
		if(node == null) {
			System.out.println("not found");
		} else {
			System.out.println("found : " + node.key);
		}
	}

}
