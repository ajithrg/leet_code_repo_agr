package com.te.greekyants;

public class CountVowelsAndConstants {
	public static void main(String[] args) {
		String s = "hello world";
		int vowel = 0;
		int constants = 0;
		
		for(char ch : s.toCharArray()) {
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowel++;
				} else {
					constants++;
				}
			}
		}
		System.out.println("Vowels : " + vowel);
		System.out.println("constants: " + constants);
	}
}
