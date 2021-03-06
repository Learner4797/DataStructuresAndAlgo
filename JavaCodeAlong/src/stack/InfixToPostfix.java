package stack;

import java.util.Stack;

public class InfixToPostfix {
	
	static int prec(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	public static String infixToPostfix(String exp) {
		String result = "";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			if(c=='(') {
				st.push(c);
			}else if(Character.isLetter(c)) {
				result += c;
			}else if(c==')') {
				while(!st.isEmpty() && st.peek()!='(') {
					result += st.pop();
				}
				st.pop();
			}else {
				while(!st.isEmpty() && prec(c)<=prec(st.peek())) {
					result += st.pop();
				}
				st.push(c);
			}
		}
		
		while(!st.isEmpty()) {
			if(st.peek()=='(') {
				return "Invalid Expression";
			}
			result += st.pop();
		}
		
		return result;
	}

	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		String result = infixToPostfix(exp);
		System.out.println("Result is: "+result);
	}

}
