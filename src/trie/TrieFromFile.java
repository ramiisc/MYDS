package trie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TrieFromFile {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("center.dic"));
		TrieNode root = new TrieNode();
		TrieNode rootFile = new TrieNode();
		try {
			while (sc.hasNext()) {
				String s = sc.next();
				// System.out.println(s);
				TrieNode.insert(root, s);
			}
			FileOutputStream fos = new FileOutputStream("trieOBJ");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(root);

			FileInputStream fis = new FileInputStream("trieOBJ");
			ObjectInputStream ois = new ObjectInputStream(fis);
			rootFile = (TrieNode) ois.readObject();
			ois.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("center:" + TrieNode.search(rootFile, "center"));
		System.out.println("meters:" + TrieNode.search(rootFile, "meters"));
		System.out.println("philters:" + TrieNode.search(rootFile, "philters"));
	}

}
