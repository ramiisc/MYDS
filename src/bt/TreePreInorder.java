package bt;

public class TreePreInorder {

	private static int preIndex = 0;
	
	public static int search(char arr[], int strt, int end, char value) {
	     int i;
	     for(i = strt; i <= end; i++)
	     {
	       if(arr[i] == value)
	         return i;
	     }
	     return 0;
	   }

	public static BNode construct(char[] preOrder, char[] inOrder, int start, int end) {
		if (start > end)
			return null;
		BNode root = new BNode(preOrder[preIndex]);
		preIndex++;
		if (start == end)
			return root;
//		for (int i = start; i <= end; i++) {
//			if (inOrder[i] == preOrder[preIndex]) {
//				index = i;
//				break;
//			}
//		}
		int index = search(inOrder, start,end, root.key);

		root.left = construct(preOrder, inOrder, start, index - 1);
		root.right = construct(preOrder, inOrder, index + 1, end);
		return root;

	}

	public static void preOrder(BNode root) {
		if (root == null)
			return;
		System.out.print(root.key + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrder(BNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.key + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] preOrder = { 'A', 'B', 'D', 'E', 'C', 'F' };
		char[] inOrder = { 'D', 'B', 'E', 'A', 'F', 'C' };
		BNode root = construct(preOrder, inOrder, 0, inOrder.length - 1);
		preOrder(root);
		System.out.println();
		inOrder(root);
	}

}
