package bt;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {

		// TODO Auto-generated method stub
	public static int maxWidth(BTNode root) {
		if(root == null) return 0;
		int maxWidth = 0, width = 0;
		Queue<BTNode> Q = new LinkedList<BTNode>();
		Q.add(root);
		Q.add(null);
		while(!Q.isEmpty()) {
			root = Q.remove();
			if(root == null) {
				if(maxWidth < width) {
					maxWidth = width;
				}
					width = 0;
					if(Q.isEmpty()) break;
					Q.add(null);
			} else {
				width++;
				if(root.left != null) Q.add(root.left);
				if(root.right != null) Q.add(root.right);
			}
			
		}
		return maxWidth;
	}
		
		public static void main(String args[]) {
			BTNode root = BTNode.createtree();
			System.out.println("preorder:");
			BTNode.preOrderRec(root);
			System.out.println();
			System.out.println("maxWidth: "+maxWidth(root));
			
		}


}
