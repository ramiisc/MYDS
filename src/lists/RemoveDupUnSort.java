package lists;

import java.util.HashMap;

public class RemoveDupUnSort {
	
	public static LNode removeDup(LNode head) {
		HashMap<Integer, Boolean> table = new HashMap<Integer, Boolean>();
		LNode current  = head;
		table.put(current.val, true);
		while(current.next != null) {
			if(table.containsKey(current.next.val)) {
				current.next = current.next.next;
			}else {
				table.put(current.next.val, true);
				current = current.next;
			}
		}
		return head;
	}
	
	public static LNode removeDupIte(LNode head) {
		LNode current  = head;
		LNode runner;
		while(current != null) {
			runner = current;
			while(runner.next != null) {
				if(current.val == runner.next.val) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return head;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head = LinkedList.createListDupUnsort();
		LinkedList.print(head);
		removeDup(head);
		LinkedList.print(head);

	}

}
