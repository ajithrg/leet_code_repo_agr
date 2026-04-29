package com.te;

public class FirstNonRepeatingCharacter {
	public static char firstNonRepeatingCharacter(String s) {
		int[] count = new int[256];
		
		for(int i=0 ; i<s.length() ; i++) {
			count[s.charAt(i)]++;
		}
		
		for(int i=0 ; i<s.length() ; i++) {
			if(count[s.charAt(i)]==1) {
				return s.charAt(i);
			}
		}
		return '\0';
	}
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(firstNonRepeatingCharacter(s));
	}
}
