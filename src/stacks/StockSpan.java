package stacks;

import java.util.Stack;

public class StockSpan {

	public static void stockSpanStack1(int[] stock, int[] s) {
		Stack<Integer> stack = new Stack<Integer>();
		s[0] = 1;
		stack.push(0);
		int count = 1;
		int j;
		for (int i = 1; i < stock.length; i++) {

			while (!stack.isEmpty() && stock[i] >= stock[stack.peek()]) {
				j = stack.pop();
				count = s[j] + count;
			}
			s[i] = count;
			stack.push(i);
			count = 1;
		}
	}
	
	public static void stockSpanStack2(int[] stock, int[] s) {
		Stack<Integer> stack = new Stack<Integer>();
		s[0] = 1;
		stack.push(0);
		int j;
		for (int i = 1; i < stock.length; i++) {

			while (!stack.isEmpty() && stock[i] >= stock[stack.peek()]) {
				stack.pop();
			}
			s[i] = (stack.isEmpty()?(i+1):(i-stack.peek()));
			stack.push(i);
		}
	}

	public static void stockSpan(int[] stock, int[] s) {

		s[0] = 1;
		int j;
		int count;
		for (int i = 1; i < stock.length; i++) {
			j = i - 1;
			count = 1;
			while (j >= 0 && stock[i] >= stock[j]) {
				count++;
				j--;
			}
			s[i] = count;
		}
		// for (int i = 0; i < s.length; i++) {
		// System.out.print(s[i]+" ");
		// }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock[] = {100, 80, 60, 90, 60, 75, 85,110};
		int s[] = new int[stock.length];
		stockSpan(stock, s);

		for (int i = 0; i < stock.length; i++) {
			System.out.print(stock[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ",");
		}
		System.out.println();
		stockSpanStack1(stock, s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ",");
		}
		System.out.println();
		stockSpanStack2(stock, s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ",");
		}
	}

}
