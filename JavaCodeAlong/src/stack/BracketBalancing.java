package stack;

import java.util.Stack;

public class BracketBalancing {

	public static void main(String[] args) {
		String s = "({[}])";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char x = s.charAt(i);
			switch(x){
				case '{':
					st.push('{');
					break;
				case '(':
					st.push('(');
					break;
				case '[':
					st.push('[');
					break;
				case '}':
					if(st.peek()=='{') {
						st.pop();
					}
					break;
				case ')':
					if(st.peek()=='(') {
						st.pop();
					}
					break;
				case ']':
					if(st.peek()=='[') {
						st.pop();
					}
					break;
			}
		}
		if(st.isEmpty()) {
			System.out.println("Balanced");
		}else System.out.println("not Balanced");

	}

}
