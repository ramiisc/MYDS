package lists;

public class LessGreatX {

	public static LNode lessGreat(LNode head, int x) {
		LNode less = null;
		LNode great = null;
		LNode node;

		while (head != null) {
			node = head;
			head = head.next;

			if (node.val < x) {
				node.next = less;
				less = node;
			} else {
				node.next = great;
				great = node;
			}
		}
		node = less;
		LinkedList.print(less);
		LinkedList.print(great);
		if(less == null) return great;
		while (node.next != null) {
			node = node.next;
		}
		node.next = great;
		return less;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head = LinkedList.createList(10);
		LinkedList.print(head);
		int x = 15;
		head = lessGreat(head, x);
		LinkedList.print(head);

	}

}
