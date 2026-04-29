package com.te.greekyants;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {
	public static String minWindows(String s, String target) {
		if(s.length()<target.length()) return "";
		
		Map<Character, Integer> map = new HashMap<>();
		for(char ch : target.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		int left = 0, right = 0;
		int required = target.length();
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		
		while(right< s.length()) {
			char ch = s.charAt(right);
			
			if(map.containsKey(ch)) {
				if(map.get(ch)>0) {
					required--;
				}
				map.put(ch, map.get(ch)-1);
			}
			
			while(required==0) {
				if(right-left + 1 < minLength) {
					minLength = right - left + 1;
					start = left;
				}
				char leftChar = s.charAt(left);
				
				if(map.containsKey(leftChar)) {
					map.put(leftChar, map.get(leftChar) + 1);
					if(map.get(leftChar)>0) {
						required++;
					}
				}
				left++;
			}
			right++;
		}
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
	}
	public static void main(String[] args) {
        String s = "ABECDCABCOD";
        String t = "ABC";

        System.out.println(minWindows(s, t));
	}
}
