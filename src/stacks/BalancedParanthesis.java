package stacks;

public class BalancedParanthesis {
	
	public static boolean evaluate(String exp) {
		java.util.Stack<Character> stack = new java.util.Stack<Character>();
		char c;
		for (int i = 0; i < exp.length(); i++) {
			c = exp.charAt(i);
			if ( c == '(') {
				stack.push(c);
			} else if ( c == '{') {
				stack.push(c);
			} else if ( c == '[') {
				stack.push(c);
			} else if ( c == '(') {
				stack.push(c);
			} else if( c == ')'){
				if(stack.isEmpty())
					return false;
				if(stack.pop() != '(') return false;
			} else if( c == '}'){
				if(stack.isEmpty())
					return false;
				if(stack.pop() != '{') return false;
			} else if( c == ']'){
				if(stack.isEmpty())
					return false;
				if(stack.pop() != '[') return false;
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "[()]{}{[()()]()}";
		String s2 = "[(])";
		boolean result = evaluate(s1);
		System.out.println("s1:" + result);
		result = evaluate(s2);
		System.out.println("s2:" + result);

	}

}
