package lists;

public class KTH {

	public static LNode kth(LNode head, int k) {
		int len = LinkedList.length(head);
		int count = len - k;
		int i = 0;
		if (count < 0) {
			System.out.println("k exceeds lenth of list");
			return null;
		}
		while (i < count) {
			head = head.next;
			i++;
		}
		return head;
	}
	
	public static LNode kpp(LNode head, int k) {
		LNode p1 = head;
		LNode p2 = head;
		int i = 0;
		if(k > LinkedList.length(head)) return null;
		while(i < k) {
			p2 = p2.next;
			i++;
		}
		while (p2 != null) {
			p2 = p2.next;
			p1 = p1.next;
		}
		return p1;
	}

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode head = LinkedList.createList();
		int k = 3;
		LinkedList.print(head);
		LNode kNode = kth(head, k);
		if (kNode != null) {
			System.out.println("k Node:" + kNode.val);
		} else {
			System.out.println("please enter proper k value");
		}
		
		 kNode = kth(head, k);
		if (kNode != null) {
			System.out.println("k Node:" + kNode.val);
		} else {
			System.out.println("please enter proper k value");
		}
	}

}
