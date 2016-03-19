package bt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;

public class Serialization {
	public static void serialize(BTNode root, FileWriter fout) throws IOException {
		if(root == null) {
			fout.write('#');
			return;
		}
		fout.write(Integer.toString(root.key));
		serialize(root.left, fout);
		serialize(root.right, fout);
	}
	
	public static BTNode deserialize(FileReader fr) throws IOException {
		char c = (char) fr.read();
		if(c == '#') {
			return null;
		}
		BTNode root = new BTNode(Integer.valueOf(c+""));
		root.left =  deserialize(fr);
		root.right =  deserialize(fr);
		
		return root;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BTNode root = BTNode.createtree();
		System.out.println("traversals:");
		root.preOrderRec(root);
		System.out.println();
		root.inOrderRec(root);
		System.out.println();
		root.postOrderIterative(root);
		System.out.println();
		File file = new File("btree.txt");
		FileWriter fout = new FileWriter(file);
		serialize(root, fout);
		fout.close();
		
		FileReader fr = new FileReader(file);
		root = deserialize(fr);
		System.out.println("traversals:");
		root.preOrderRec(root);
		System.out.println();
		root.inOrderRec(root);
		System.out.println();
		root.postOrderIterative(root);
		System.out.println();

	}

}
