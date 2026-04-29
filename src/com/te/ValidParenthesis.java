package com.te;

import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			} else if(ch==')' || ch=='}' || ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char pop = stack.pop();
				if((ch=='}' && pop!='{') || (ch==']' && pop!='[') || (ch==')' && ch=='(')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String s = "({})[]";
		System.out.println(isValid(s));
	}
}
