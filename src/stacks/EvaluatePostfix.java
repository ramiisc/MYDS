package stacks;

public class EvaluatePostfix {

	public static boolean isOperand(char c) {
		if (c >= '0' && c <= '9')
			return true;
		return false;
	}

	public static int evaluate(String exp) {
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		char c;
		int op1, op2, result;
		for (int i = 0; i < exp.length(); i++) {
			c = exp.charAt(i);
			if (isOperand(c)) {
				stack.push(c - '0');
			} else {
				switch (c) {
				case '*':
					op1 = Integer.valueOf(stack.pop());
					op2 = Integer.valueOf(stack.pop());
					result = op2 * op1;
					stack.push(result);  
					break;
					
				case '+':
					op1 = Integer.valueOf(stack.pop());
					op2 = Integer.valueOf(stack.pop());
					result = op2 + op1;
					stack.push(result);  
					break;
					
				case '-':
					op1 = Integer.valueOf(stack.pop());
					op2 = Integer.valueOf(stack.pop());
					result = op2 - op1;
					stack.push(result);   
					break;
					
				case '/':
					op1 = Integer.valueOf(stack.pop());
					op2 = Integer.valueOf(stack.pop());
					result = op2 / op1;
					stack.push(result);  
					break;
					
				}
			}
		}
		result = stack.pop();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String postfix = "231*+9-";
		int result = evaluate(postfix);
		System.out.println("Result:" + result);

	}

}
