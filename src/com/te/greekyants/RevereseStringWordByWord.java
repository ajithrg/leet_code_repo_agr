package com.te.greekyants;

public class RevereseStringWordByWord {
	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = "";
		String[] word = s1.split(" ");
		
		for(String w : word) {
			String rev = "";
			for(int i=w.length()-1 ; i>=0 ; i--) {
				rev = rev + w.charAt(i);
			}
			s2 = s2 + rev + " ";
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
