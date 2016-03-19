package lists;

public 
class LNode {
	public int val;
	public LNode next;
	
	public LNode(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public LNode getNext() {
		return next;
	}
	public void setNext(LNode next) {
		this.next = next;
	}
	
}
