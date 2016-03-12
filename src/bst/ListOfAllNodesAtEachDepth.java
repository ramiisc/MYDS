package bst;

import java.util.ArrayList;
import java.util.LinkedList;

import bt.BTNode;

public class ListOfAllNodesAtEachDepth {
	
	public static ArrayList<LinkedList<BTNode>> getListAtEachDepth(BTNode root) {
		LinkedList<BTNode> parent = new LinkedList<BTNode>();
		LinkedList<BTNode> current  = new LinkedList<BTNode>();
		ArrayList<LinkedList<BTNode>> depth = new ArrayList<LinkedList<BTNode>>();
		parent.add(root);
		depth.add(parent);
		while (true) {
			for (BTNode node : parent) {
				if(node.left != null)
				current.add(node.left);
				
				if(node.right != null)
				current.add(node.right);
			}
			depth.add(current);
			parent = current;
			current = new LinkedList<BTNode>();
			if(parent.isEmpty()) break;
		}
		
		return depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = CreateBSTSortedArray.createBST();
		ArrayList<LinkedList<BTNode>> depths = getListAtEachDepth( root);
		
		for(LinkedList<BTNode> list: depths) {
			for(BTNode node : list) {
				System.out.print(node.key+" ");
			}
			System.out.println();
		}

	}

}
