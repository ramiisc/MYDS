package stacks;

public class InfixToPosix {

	public static boolean isOperand(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z'))
			return true;
		return false;
	}

	public static int precendence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;

		case '*':
			return 2;

		case '/':
			return 3;
		}
		return 0;
	}

	public static String infixToPosix(char[] exp) {
		java.util.Stack<Character> stack = new java.util.Stack<Character>();
	
		int k = 0;
		for (int i = 0; i < exp.length; i++) {

			if (isOperand(exp[i])) {
				exp[k] = exp[i];
				System.out.println("operand:" + exp[i]);
				k++;
			} else if (exp[i] == '(') {
				System.out.println("push:" + exp[i]);
				stack.push((exp[i]));
			} else if (exp[i] == ')') {

				while (!stack.isEmpty() && stack.peek() != '(') {
					exp[k] = stack.pop();
					System.out.println("pop:" + exp[k]);
					k++;
				}
				if (!stack.isEmpty())
					stack.pop();
			} else {
				while (!stack.isEmpty() && precendence(exp[i]) <= precendence(stack.peek())) {
					exp[k] = stack.pop();
					System.out.println("pop:" + exp[k]);
					k++;
				}
				System.out.println("push:" + exp[i]);
				stack.push(exp[i]);

			}
		}
		while (!stack.isEmpty()) {
			exp[k] = stack.pop();
			System.out.println("pop:" + exp[k]);
			k++;
		}

		return new String(exp,0,k);

	}

	public static void main(String args[]) {
		String infix = "a+b*(c/d-e)/(f+g*h)-i";
		String posix = infixToPosix(infix.toCharArray());
		System.out.println("posix:" + posix);

	}
}
