package com.te;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintAllAnagramTogether {
	public static List<List<String>> anagram(String[] strs){
		Map<String, List<String>> map = new LinkedHashMap<>();
		
		for(String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(str);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(anagram(strs));
	}
}
