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
		for (int i = 0; i < s.length(); i++) {
			index = s.charAt(i) - 'a';
			if (t.links[index] == null) {
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
		for (int i = 0; i < s.length(); i++) {
			index = s.charAt(i) - 'a';
			if (t.links[index] == null) {
				return false;
			}
			t = t.links[index];
		}
		if (!t.isEnd)
			return false;
		return true;
	}

	public static boolean delete(TrieNode root, int i, String s) {
		if (i < s.length()+1) {
			
			if (i == s.length()) {
				if (root.isEnd) {
					root.isEnd = false;
				}else {
					return false;
				}
				root.count--;
				if (root.count < 0)
					root = null;
				return true;
			}
//			System.out.println("i:" + i);
//			System.out.println("character:" + s.charAt(i));
			int index = s.charAt(i) - 'a';
			if (root.links[index] != null) {
				if (delete(root.links[index], ++i, s)) {
					root.count--;
					if (root.count < 0)
						root = null;
					return true;
				}
			}
			return false;
		}

		return false;
	}

	public static void delete(TrieNode root, String s) {
		if (search(root, s)) {
			delete(root, 0, s);
			System.out.println("successfully deleted:" + s);
		} else {
			System.out.println("not found:" + s);
		}
	}

	public static void main(String args[]) {
		TrieNode root = new TrieNode();
//		insert(root, "car");
		insert(root, "care");
		insert(root, "career");
		insert(root, "bat");
		insert(root, "batsman");
		insert(root, "ape");
		insert(root, "append");
		System.out.println("career:" + search(root, "career"));
		System.out.println("batsman:" + search(root, "batsman"));
		System.out.println("append:" + search(root, "append"));
		System.out.println("appen:" + search(root, "appen"));
		System.out.println("delete career:" + delete(root, 0,"career"));
		// delete(root,"care");
		System.out.println("career:" + search(root, "career"));
		System.out.println("care:" + search(root, "care"));
		System.out.println("cam:" + search(root, "cam"));
		System.out.println("delete cam:" + delete(root, 0,"cam"));
		System.out.println("delete car:" + delete(root, 0,"car"));
		System.out.println("care:" + search(root, "care"));

	}

}
