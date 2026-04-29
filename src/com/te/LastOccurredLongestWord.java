package com.te;

public class LastOccurredLongestWord {
	public static void main(String[] args) {
		String s = "hello hii bye king";
		String[] word = s.split(" ");
		String max = word[0];
		
		for(String ele : word) {
			if(ele.length()<=max.length()) {
				max = ele;
			}
		}
		System.out.println(max);
	}
}
