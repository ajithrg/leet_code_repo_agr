package com.te.greekyants;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practise {
	public static long convertToLong(Object value) {
		if(value==null) {
			return 0;
		}
		
		if(value instanceof Number) {
			return ((Number) value).longValue();
		}
		return Long.parseLong(value.toString());
	}
	
	public static int countOne(int num) {
		int count = 0;
		
		while(num!=0) {
			int digit = num % 10;
			if(digit==1) {
				count++;
			}
			num = num/10;
		}
		return count;
	}
	
	public String getUserName() {
		return "Arpitha";
	}
	
	public void display() {
		String name = getUserName();
		System.out.println(name);
	}
	
	public static String longestPalindromicSustring(String s) {
		String longest = "";
		
		for(int i=0 ; i<s.length() ; i++) {
			String odd = expandAroundCenter(s,i,i+1);
			if(odd.length()>longest.length()) {
				longest = odd;
			}
			
			String even = expandAroundCenter(s, i, i+1);
			if(even.length()>longest.length()) {
				longest = even;
			}
		}
		
		return longest.length() > 2 ? longest : "none";
	}
	private static String expandAroundCenter(String s, int left, int right) {
		while (left>= 0 && right <s.length() &&  s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","hii","bye","king");
		
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		
		System.out.println("==============================");
		System.out.println(longestPalindromicSustring("hellosannasmith"));
	}
}
