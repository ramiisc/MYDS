package dp;

import java.util.ArrayList;

public class Permutations {
	
	public static ArrayList<String> getPerms(String s) {
		
		ArrayList<String> permutations = new  ArrayList<String>();
		if(s.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> words = getPerms(rest);
		for(String word: words) {
			for(int j = 0; j <= word.length();j++) {
				String str  = insert(word,first,j);
				permutations.add(str);
			}
		}
		return permutations;
	}
	public static String insert(String word,char c, int j) {
		String start = word.substring(0, j);
		String end = word.substring(j);
		return start+c+end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abc";
		ArrayList<String> permutations = getPerms(s);
		System.out.println("no of permutations:"+permutations.size());
		System.out.println("permutations:"+permutations);

	}

}
