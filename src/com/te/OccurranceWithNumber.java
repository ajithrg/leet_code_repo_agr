package com.te;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurranceWithNumber {
	public static void main(String[] args) {
		String s = "aabbbcccc";
		String result = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			result += entry.getKey() + "" + entry.getValue();
		}
		System.out.println(result);
		
		System.out.println("=====================================");
		
		LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		String collect2 = collect.entrySet().stream().map(e -> e.getKey() + "" + e.getValue())
		.collect(Collectors.joining());
		System.out.println(collect2);
	}
}
