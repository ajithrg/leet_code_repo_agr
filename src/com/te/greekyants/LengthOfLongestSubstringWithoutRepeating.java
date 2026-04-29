package com.te.greekyants;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringWithoutRepeating {
	public static int longest(String s) {
		int maxLength = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int end = 0 ; end<s.length() ; end++) {
			char currentIndex = s.charAt(end);
			
			while(map.containsKey(currentIndex) && map.get(currentIndex)>=start) {
				start = map.get(currentIndex)+1;
			}
			map.put(currentIndex, end);
			maxLength = Math.max(maxLength, end-start+1);
		}
		return maxLength;
	}
	public static void main(String[] args) {
		String s = "abcabcdef";
		System.out.println(longest(s));
	}
}
