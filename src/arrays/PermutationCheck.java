package arrays;

public class PermutationCheck {

	public static boolean check(String  s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		boolean[] exist = new boolean[256];
		int index;
		for(int i = 0; i < s1.length(); i++) {
			index = s1.charAt(i);
			exist[s1.charAt(i)] = true;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			if(!exist[s1.charAt(i)])
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ab";
		String s2 = "ba";
		boolean flag = check(s1,s2);
		System.out.println("are permutations to each other:"+flag);
	}

}
