package lists;

public class Sum {

	public static void append(LNode head, int n) {
		LNode node = head;
		System.out.println("diff:" + n);
		while (head.next != null) {
			head = head.next;
		}

		for (int i = 0; i < n; i++) {
			head.next = new LNode(0);
			head = head.next;
		}
	}

	public static LNode sum(LNode head1, LNode head2) {
		int len1 = LinkedList.length(head1);
		int len2 = LinkedList.length(head2);
		int carry = 0, digit = 0, total = 0;
		System.out.println("len1:" + len1);
		System.out.println("len2:" + len2);
		if (len1 > len2) {
			append(head2, len1 - len2);
		} else {
			append(head1, len2 - len1);
		}
		LinkedList.print(head1);
		LinkedList.print(head2);

		LNode head3 = null;
		LNode runner = null;
		while (head1 != null) {
			total = carry + head1.val + head2.val;
			digit = total % 10;
			carry = total / 10;

			if (head3 == null) {
				head3 = new LNode(digit);
				runner = head3;
			} else {
				runner.next = new LNode(digit);
				runner = runner.next;

			}
			head1 = head1.next;
			head2 = head2.next;
		}

		return head3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head1 = LinkedList.createList(5, 10);
		LNode head2 = LinkedList.createList(3, 10);
		LinkedList.print(head1);
		LinkedList.print(head2);
		LNode head3 = sum(head1, head2);

		LinkedList.print(head3);

	}

}
