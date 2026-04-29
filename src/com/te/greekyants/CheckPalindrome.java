package com.te.greekyants;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "";
		
		for(int i=s2.length()-1 ; i>=0 ; i--) {
			s2 = s2 + s1.charAt(i);
		}
		
		if(s1.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
	}

}
