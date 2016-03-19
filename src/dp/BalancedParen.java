package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BalancedParen {

	public static Set<String> getBP(int n) {
		String single = "()";
		Set<String> bp = new HashSet<String>();
		if (n == 1) {
			bp.add(single);
			return bp;
		}
		Set<String> prevSet = getBP(n - 1);
		for (String each : prevSet) {
			for (int i = 0; i < each.length(); i++) {
				if (each.charAt(i) == '(') {
					String str = insertBefore(each, single, i);
					bp.add(str);
					str = insertAfter(each, single, i);
					bp.add(str);
				}
			}
		}
		return bp;
	}

	public static String insertBefore(String paren,String single, int i) {
		String start = paren.substring(0, i);
		String end = paren.substring(i);
		return start + single + end;
	}
	
	public static String insertAfter(String paren,String single, int i) {
		String start = paren.substring(0, i);
		String end = paren.substring(i+1);
		return start +"(" +single + end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		Set<String> BP = getBP(n);
		System.out.println("no of BP:" + BP.size());
		System.out.println("BP:" + BP);

	}

}
