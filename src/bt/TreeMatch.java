package bt;

public class TreeMatch {
	
	public static boolean matchTree(BTNode r1,BTNode r2) {
		if(r1 == null && r2 == null) return true;
		if((r1 == null && r2 != null) ||(r2 == null && r1 != null) ) return false;
		if(r1.key != r2.key) return false;
		if(!matchTree(r1.left,r2.left) || !matchTree(r2.right,r2.right)) return false;
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode r1 = BTNode.createtree();
		BTNode r2 = BTNode.createtree();
//		BTNode r2 = new BTNode(2);
//		r2.left =  new BTNode(4);
//		r2.right =  new BTNode(5);
		
		if(matchTree(r1,r2)) {
			System.out.println("trees are matched");
		} else {
			System.out.println("trees are not matched");
		}

	}

}
