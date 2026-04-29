package com.te;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringWithoutDuplicate {
	public static int longest(String s) {
		int start = 0;
		int maxlength = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int end =0 ; end<s.length() ; end++) {
			char currentIndex = s.charAt(end);
			while(map.containsKey(currentIndex) && map.get(currentIndex)>=start) {
				start = map.get(currentIndex) + 1;
			}
			map.put(currentIndex, end);
			maxlength = Math.max(maxlength, end-start+1);
		}
		return maxlength;
	}
	public static void main(String[] args) {
		String s = "abcabcde";
		System.out.println(longest(s));
	}

}
