package bt;

public class CheckBalance {

	public static int checkBalance(BTNode root) {
		if (root == null)
			return 0;

		int leftHeight = checkBalance(root.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = checkBalance(root.right);
		if (rightHeight == -1)
			return -1;

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = BTNode.createtreeNonBalanced();
		if (checkBalance(root) == -1) {
			System.out.println("not balanced");
		} else {
			System.out.println("balanced");
		}

	}

}
