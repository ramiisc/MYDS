package stacks;

public class ReverseStack {
	
	public static void bottomInsert(java.util.Stack< Integer> stack, int num) {
		if(stack.isEmpty()) {
			stack.push(num);
			return;
		}
		int element = stack.pop();
		bottomInsert(stack,num);
		stack.push(element);
	}
	
	public static void reverse(java.util.Stack< Integer> stack) {
		if(!stack.isEmpty()) {
			int element = stack.pop();
			reverse(stack);
			bottomInsert(stack,element);
		}
		
	}

	public static void main(String[] args) {
		java.util.Stack< Integer> stack = new java.util.Stack< Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		//4,3,2,1
		System.out.println("stack:"+stack);
		reverse(stack);
		System.out.println("stack:"+stack);

	}

}
