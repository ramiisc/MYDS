package stacks;

public class SortStack {

	public static void insert(java.util.Stack< Integer> stack, int num) {
		if(stack.isEmpty()) {
			stack.push(num);
			return;
		}
		if(num > stack.peek()) {
			int element = stack.pop();
			insert(stack,num);
			stack.push(element);
		} else {
			stack.push(num);
		}
	}
	
	public static void sort(java.util.Stack< Integer> stack) {
		if(!stack.isEmpty()) {
			int element = stack.pop();
			sort(stack);
			insert(stack,element);
		}
		
	}

	public static void main(String[] args) {
		java.util.Stack< Integer> stack = new java.util.Stack< Integer>();
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		stack.push(1);
		stack.push(40);
		//4,3,2,1
		System.out.println("stack:"+stack);
		sort(stack);
		System.out.println("stack:"+stack);

	}
}
