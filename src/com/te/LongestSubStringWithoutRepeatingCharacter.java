package com.te;

public class LongestSubStringWithoutRepeatingCharacter {
	public static String longest(String s) {
		String longest = "";
		String occurance = "";
		
		for(int i=0 ; i<s.length() ; i++) {
			occurance = "" + s.charAt(i);
			for(int j=i+1 ; j<s.length() ; j++) {
				if(occurance.indexOf(s.charAt(j))==-1) {
					occurance += s.charAt(j);
				} else {
					break;
				}
			}
			if(occurance.length()>longest.length()) {
				longest = occurance;
			}
		}
		return longest;
	}
	public static void main(String[] args) {
		String s = "abcabcdef";
		System.out.println(longest(s));
	}
}
