package com.te.medimpact;

public class PalindromicSubstring {
	public static String palindromicSubstring(String s) {
		String longest = "";
		
		for(int i=0 ; i<s.length() ; i++) {
			
			String odd = expandAroundCenter(s,i , i+1);
			if(odd.length() > longest.length()) {
				longest = odd;
			}
			
			String even = expandAroundCenter(s, i, i+1);
			if(even.length() > longest.length()) {
				longest = even;
			}
		}
		
		return longest.length() > 2 ? longest : "none";
	}

	private static String expandAroundCenter(String s, int left, int right) {
		while(left >= 0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
	
	public static void main(String[] args) {
		 System.out.println(palindromicSubstring("hellosannasmith")); // sannas
	     System.out.println(palindromicSubstring("abcdefgg"));        // none
	}

}
