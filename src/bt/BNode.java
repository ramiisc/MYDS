package bt;

public class BNode {
	public char key;
	public BNode left;
	public BNode right;
	public char getKey() {
		return key;
	}
	public void setKey(char key) {
		this.key = key;
	}
	public BNode(char key) {
		super();
		this.key = key;
	}
	public BNode getLeft() {
		return left;
	}
	public void setLeft(BNode left) {
		this.left = left;
	}
	public BNode getRight() {
		return right;
	}
	public void setRight(BNode right) {
		this.right = right;
	}
	

}
