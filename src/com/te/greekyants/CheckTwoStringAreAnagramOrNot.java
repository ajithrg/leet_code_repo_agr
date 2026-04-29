package com.te.greekyants;

import java.util.Arrays;

public class CheckTwoStringAreAnagramOrNot {
	public static boolean angram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a, b);
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		
		int[] count = new int[256];
		
		for(char c : s1.toCharArray()) {
			count[c - 'a']++;
		}
		
		for(char c : s2.toCharArray()) {
			count[c - 'a']--;
		}
		
		for(int num : count) {
			if(num!=0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		System.out.println(angram(s1, s2));
		System.out.println("======================");
		System.out.println(isAnagram(s1, s2));
	}
}
