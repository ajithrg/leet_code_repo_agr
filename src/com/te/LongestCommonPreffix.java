package com.te;

public class LongestCommonPreffix {
	public static String longestCommonPreffix(String[] strs) {
		if(strs==null || strs.length==0) return "";
		String preffix = strs[0];
		
		for(int i=1 ; i<strs.length ; i++) {
			while(strs[i].indexOf(preffix)!=0) {
				preffix = preffix.substring(0, preffix.length()-1);
				
				if(preffix.isEmpty()) {
					return "";
				}
			}
		}
		return preffix;
	}
	public static void main(String[] args) {
        String[] input = {"fly", "flower", "flight"};
        System.out.println(longestCommonPreffix(input));
	}
}
