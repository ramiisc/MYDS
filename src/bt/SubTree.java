package bt;

public class SubTree {

	public static boolean matchTree(BTNode r1, BTNode r2) {
		if (r1 == null && r2 == null)
			return true;
		if ((r1 == null && r2 != null) || (r2 == null && r1 != null))
			return false;
		if (r1.key != r2.key)
			return false;
		if (!matchTree(r1.left, r2.left) || !matchTree(r2.right, r2.right))
			return false;
		return true;

	}

	public static boolean subTree(BTNode r1, BTNode r2) {
		if(r1 == null) return false;
		if(r1.key == r2.key)
			if(matchTree(r1, r2)) return true;
		if(subTree( r1.left,  r2) || subTree( r1.right,  r2)) return true;
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode r1 = BTNode.createtree();
		BTNode r2 = new BTNode(3);
		r2.left = new BTNode(6);
		r2.right = new BTNode(7);

		if (subTree(r1, r2)) {
			System.out.println("sub tree existed");
		} else {
			System.out.println("sub tree not existed");
		}

	}

}
