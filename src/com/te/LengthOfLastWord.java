package com.te;

public class LengthOfLastWord {
	public static int longest(String s) {
		if(s==null || s.trim().isEmpty()){
			return 0;
		}
		
		String[] word = s.trim().split("\\s+ ");
		for(int i=word.length-1 ; i>=0 ; i--) {
			if(!word[i].isEmpty()) {
				return word[i].length();
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(longest(s));
	}
}
