package lists;

public class CheckCycle {

	public static boolean checkCycle(LNode head) {
		LNode fast = head;
		LNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow)
				return true;
		}
		return false;
	}

	public static LNode loopNode(LNode head) {
		LNode fast = head;
		LNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		if (fast == null || fast.next == null)
			return null;
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head = LinkedList.createListCycle();
		// LinkedList.print(head);
		if (checkCycle(head)) {
			System.out.println("Cycle:" + true);
			System.out.println("loopNode:" + loopNode(head).val);
		}

		head = LinkedList.createList(10);
		LinkedList.print(head);
		System.out.println("Cycle:" + checkCycle(head));

	}

}
