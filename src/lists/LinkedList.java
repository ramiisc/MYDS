package lists;

public class LinkedList {
	
	public static LNode createListPalindromeOdd() {
		LNode head = new LNode(1);
		LNode second = new LNode(2);
		LNode third = new LNode(3);
		LNode fourth = new LNode(4);
		LNode fifth = new LNode(3);
		LNode sixth = new LNode(2);
		LNode seventh = new LNode(1);
//		LNode eigth = new LNode(8);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
//		seventh.next = eigth;
		return head;
		
	}
	
	public static LNode createListPalindromeEven() {
		LNode head = new LNode(1);
		LNode second = new LNode(2);
		LNode third = new LNode(3);
		LNode fourth = new LNode(4);
		LNode fifth = new LNode(4);
		LNode sixth = new LNode(3);
		LNode seventh = new LNode(2);
		LNode eigth = new LNode(1);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eigth;
		return head;
		
	}
	
	public static LNode createList() {
		LNode head = new LNode(1);
		LNode second = new LNode(2);
		LNode third = new LNode(3);
		LNode fourth = new LNode(4);
		LNode fifth = new LNode(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		return head;
		
	}
	public static LNode createList(int n) {
		LNode head = null;
		LNode node;
		for(int  i = 0; i < n;i++) {
			node = new LNode((int)(Math.random() * 20));
			node.next = head;
			head = node;
		}
		return head;
	}
	
	public static LNode createListCycle() {
		LNode head = new LNode(1);
		LNode second = new LNode(2);
		LNode third = new LNode(3);
		LNode fourth = new LNode(4);
		LNode fifth = new LNode(5);
		LNode sixth = new LNode(6);
		LNode seventh = new LNode(7);
		LNode eigth = new LNode(8);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eigth;
		eigth.next = fourth;
		return head;
	}
	
	public static LNode createList(int n,int m) {
		LNode head = null;
		LNode node;
		for(int  i = 0; i < n;i++) {
			node = new LNode((int)(Math.random() * m));
			node.next = head;
			head = node;
		}
		return head;
	}
	
	public static LNode createListDup() {
		LNode head = new LNode(1);
		LNode second = new LNode(2);
		LNode third = new LNode(3);
		LNode fourth = new LNode(3);
		LNode fifth = new LNode(4);
		LNode sixth = new LNode(4);
		LNode seventh = new LNode(4);
		LNode eigth = new LNode(6);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eigth;
		return head;
		
	}
	
	public static LNode createListDupUnsort() {
		LNode head = new LNode(1);
		LNode second = new LNode(3);
		LNode third = new LNode(2);
		LNode fourth = new LNode(5);
		LNode fifth = new LNode(4);
		LNode sixth = new LNode(6);
		LNode seventh = new LNode(4);
		LNode eigth = new LNode(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eigth;
		return head;
		
	}
	
	public static void print(LNode head) {
		while(head != null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println();
	}
	
	public static int length(LNode head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head = LinkedList.createList();
		LinkedList.print(head);

	}

}
