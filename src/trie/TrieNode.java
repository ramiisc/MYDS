package trie;

public class TrieNode {
	public static int ALPHABETSIZE = 27;
	public int count;
	public boolean isEnd;
	public TrieNode links[];
	public TrieNode() {
		links = new TrieNode[ALPHABETSIZE];
	}
	
	public static void insert(TrieNode root, String s) {
		TrieNode t = root;
		int index;
		for(int i =0; i < s.length();i++){
			index = s.charAt(i) - 'a';
			if(t.links[index] == null) {
				t.links[index] = new TrieNode();
			}
			t.count++;
			t = t.links[index];
		}
		t.count++;
		t.isEnd = true;
	}
	
	public static boolean search(TrieNode root, String s) {
		TrieNode t = root;
		int index;
		for(int i =0; i < s.length();i++){
			index = s.charAt(i) - 'a';
			if(t.links[index] == null) {
				return false;
			}
			t = t.links[index];
		}
		if(!t.isEnd) return false;
		return true;
	}
	
	public static void main(String args[]) {
		TrieNode root = new TrieNode();
		insert(root, "car");
		insert(root, "career");
		insert(root, "bat");
		insert(root, "batsman");
		insert(root, "ape");
		insert(root, "append");
		System.out.println("career:" + search(root,"career"));
		System.out.println("batsman:" + search(root,"batsman"));
		System.out.println("append:" + search(root,"append"));
		System.out.println("appen:" + search(root,"append"));
		
	}
	

}
