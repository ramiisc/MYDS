package stacks;

public class Stack {
	int top;
	int capacity;
	int arr[];
	
	Stack() {
		top = -1;
		capacity = 20;
		arr = new int[capacity];
	}
	
	Stack(int capacity) {
		top = -1;
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public boolean isFull() {
		if(top == arr.length -1) 
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) 
			return true;
		return false;
	}
	
	public void push(int n) {
		if(isFull())  {
			System.out.println("stack overflow");
			return;
		}
		arr[++top] = n;
		
	}
	
	public int pop() {
		int n;
		if(isEmpty())  {
			System.out.println("stack underflow");
			return Integer.MIN_VALUE;
		}
		n = arr[top];
		top--;
		return n;
		
	}
	
	public int peek() {
		int n;
		if(isEmpty())  {
			System.out.println("stack underflow");
			return Integer.MIN_VALUE;
		}
		n = arr[top];
		return n;
	}
	
	public static void main(String args[]) {
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		s.push(6);
		
		System.out.println("poped element:"+s.pop());
		System.out.println("poped element:"+s.pop());
		System.out.println("poped element:"+s.pop());
		System.out.println("poped element:"+s.pop());
		System.out.println("poped element:"+s.pop());
		System.out.println("poped element:"+s.pop());
		
	}

}
