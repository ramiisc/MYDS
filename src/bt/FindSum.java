package bt;

public class FindSum {

	public static  void findSum(BTNode node, int sum, int[] path, int level) {
		if (node == null) {
			return;
		}
		/* Insert current node into path. */
		path[level] = node.key;

		/* Look for paths with a sum that ends at this node. */
		int t = 0;
		for (int i = level; i >= 0; i--) {
			t += path[i];
			if (t == sum) {
				print(path, i, level);
			}
		}

		/* Search nodes beneath this one. */
		findSum(node.left, sum, path, level + 1);
		findSum(node.right, sum, path, level + 1);

		/*
		 * Remove current node from path. Not strictly necessary, since we would
		 * ignore this value, but it's good practice.
		 */
		path[level] = Integer.MIN_VALUE;
	}

	public static void findSum(BTNode node, int sum) {
		int depth = depth(node);
		System.out.println("depth:"+depth);
		int[] path = new int[depth];
		findSum(node, sum, path, 0);
		System.out.println("final array contents");
		for (int i = 0; i <= depth - 1; i++) {
			System.out.print(path[i] + " ");
		}
	}

	public static void print(int[] path, int start, int end) {

		for (int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}

	public static  int depth(BTNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(depth(node.left), depth(node.right));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = BTNode.createtree();
		findSum(root,11);

	}

}
