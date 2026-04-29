package com.te;

public class LeftAndRightRotationOfString {
	public static String leftRotation(String s, int k) {
		String str = s.substring(k) + s.substring(0,k);
		return str;
	}
	
	public static String rightRotation(String s, int k) {
		return leftRotation(s, s.length()-k);
	}
	public static void main(String[] args) {
		String s = "hello";
		int k = 2;
		System.out.println(leftRotation(s, k));
		System.out.println("==========================");
		System.out.println(rightRotation(s, k));
	}
}
