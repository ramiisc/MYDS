package arrays;

import java.util.Hashtable;

public class Unique {
	public static boolean unique1(String s) {
		boolean[] exist = new boolean[256];
		for (int c : s.toCharArray()) {
			if (exist[c] == true) {
				return false;
			}
			exist[c] = true;
		}
		return true;
	}
	
	public static boolean unique2(String s) {
		Hashtable table = new Hashtable();
		for (char c : s.toCharArray()) {
			if (table.containsKey(c)) {
				return false;
			}
			table.put(c, true);
		}
		return true;
	}
	
	public static void main(String args[]) {
		String s = "abcd";
		System.out.println("Unique:"+unique1(s));
		System.out.println("Unique:"+unique2(s));
	}
}
