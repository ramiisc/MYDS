package lists;

public class RemoveDupSorted {
	
	public static LNode removeDup(LNode head) {
		LNode current = head;
		while(current != null && current.next != null) {
			if(current.val == current.next.val) {
				current.next = current.next.next;
			} else {
			current = current.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head = LinkedList.createListDup();
		LinkedList.print(head);
		removeDup(head);
		LinkedList.print(head);

	}

}
