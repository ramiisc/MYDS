package lists;

import java.util.Stack;

public class CheckPalindrome {
	
	private static boolean checkPalindrome(LNode head) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		LNode slow = head;
		LNode fast = head;
		
		while(fast != null && fast.next != null) {
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null && fast.next == null) {
			slow = slow.next;
		}
		while(slow != null) {
			if(stack.pop() != slow.val) return false;
			slow = slow.next;
		}
		return true;
	}

	public static void main(String[] args) {
		LNode head = LinkedList.createListPalindromeOdd();
		LinkedList.print(head);
		System.out.println("Palindrome:" + checkPalindrome(head));
		
		head = LinkedList.createListPalindromeEven();
		LinkedList.print(head);
		System.out.println("Palindrome:" + checkPalindrome(head));

		head = LinkedList.createList(10);
		LinkedList.print(head);
		System.out.println("Palindrome:" + checkPalindrome(head));

	}

}
