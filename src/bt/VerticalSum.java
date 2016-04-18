package bt;

import java.util.HashMap;
import java.util.Map;

public class VerticalSum {
	public static HashMap< Integer, Integer> map = new HashMap< Integer, Integer>();
	public static void verticalSum(BTNode root, int col) {
		if(root  == null) return ;
		if(map.containsKey(col)) {
			int value = map.get(col);
			value = value+root.key;
			map.put(col, value);
		} else {
			map.put(col, root.key);
		}
		 verticalSum(root.left, col-1);
		 verticalSum(root.right, col+1);
		 
		
	}
	public static void main(String args[]) {
		BTNode root = BTNode.createtree();
		System.out.println("preorder:");
		BTNode.preOrderRec(root);
		System.out.println();
		verticalSum( root,  0);
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
			System.out.println("col: "+entry.getKey()+" val: "+entry.getValue());
		}
	}
}
