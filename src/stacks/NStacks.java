package stacks;

public class NStacks {
	int CAPACITY;
	int[] top;
	int[] buffer;
	
	public NStacks(int n , int CAPACITY) {
		this.CAPACITY = CAPACITY;
		buffer = new int[n * CAPACITY];
		top = new int[n];
		for(int i = 0; i < n; i++)
			top[i] = i * CAPACITY - 1;
	}
	
	public NStacks(int n) {
		CAPACITY = 100;
		buffer = new int[n * CAPACITY];
		top = new int[n];
		for(int i = 0; i < n; i++)
			top[i] = i * CAPACITY - 1;
	}
	
	public boolean isEmpty(int stackNO) {
		if(top[stackNO] == stackNO* CAPACITY - 1) 
			return true;
		return false;
	}
	
	public boolean isFull(int stackNO) {
		if(top[stackNO] == (stackNO+1)* CAPACITY - 1) 
			return true;
		return false;
	}
	
	public void push(int stackNo, int num) {
		if(isFull(stackNo)){
			System.out.println("stackNO:"+stackNo+" Stack overfull");
			return;
		}
//		top[stackNo] = top[stackNo]+1;;
		buffer[++top[stackNo]] = num;
	}
	
	public void pop(int stackNo) {
		if(isEmpty(stackNo)){
			System.out.println("stackNO:"+stackNo+" Stack underfull");
			return;
		}
		buffer[top[stackNo]--] = Integer.MIN_VALUE;
//		top[stackNo] = top[stackNo]-1;;

	}
	
	public int peek(int stackNo) {
		if(isEmpty(stackNo)){
			System.out.println("stackNO:"+stackNo+" Stack underfull");
		}
		return buffer[top[stackNo]];

	}

	public static void main(String[] args) {
		NStacks stacks = new NStacks(2,2);
		stacks.push(0, 1);stacks.push(0, 2);stacks.push(0, 3);stacks.push(0, 4);stacks.push(0, 5);
		stacks.push(1, 5);stacks.push(1, 6);stacks.push(1, 7);stacks.push(1, 8);stacks.push(1, 9);
		System.out.println("peek : "+stacks.peek(0));
		System.out.println("peek : "+stacks.peek(1));
		stacks.pop(0);stacks.pop(0);stacks.pop(0);stacks.pop(0);stacks.pop(0);stacks.pop(0);
	}

}
