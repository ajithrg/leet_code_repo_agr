package com.te;

public class IsomorphicOrNot {
	public static String isomorphic(String s) {
		String ans = "";
		int c = 1;
		
		for(int i=0 ; i<s.length()-1 ; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			} else {
				ans += c;
				c = 1;
			}
		}
		ans = ans + c;
		return ans;
	}
	public static void main(String[] args) {
		String s1 = "small";
		String s2 = "king";
		s1 = isomorphic(s1);
		s2 = isomorphic(s2);
		if(s1.equals(s2)) {
			System.out.println("Isomorphic");
		} else {
			System.out.println("not");
		}
	}
}
