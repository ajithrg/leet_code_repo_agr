package com.te.greekyants;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringByLambda {
	public static void main(String[] args) {
		String s = "sky is blue";	
		String collect = Arrays.stream(s.split(" "))
		.map(word -> new StringBuilder(word).reverse().toString())
		.collect(Collectors.joining(" "));
		System.out.println(collect);
		
		System.out.println("=========================");
		
		String reversed = s.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.reduce("", (a, b) -> b + a);
		System.out.println(reversed);
		
		System.out.println("=========================");
		
		Function<String, String> st = str -> new StringBuilder(str).reverse().toString();
		System.out.println(st.apply(s));
		
		System.out.println("=======================");
		
		String s2 = "";
		String[] word = s.split(" ");
		for(String w : word) {
			String rev = "";
			for(int i=w.length()-1 ; i>=0 ; i--) {
				rev = rev + w.charAt(i);
			}
			s2 = s2 + rev + " ";
		}
		System.out.println(s);
		System.out.println(s2);
		
	}
}
