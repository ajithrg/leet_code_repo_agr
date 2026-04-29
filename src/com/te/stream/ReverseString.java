package com.te.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	public static void main(String[] args) {
		String s = "hello world";
		String collect = Arrays.stream(s.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
		.collect(Collectors.joining(" "));
		System.out.println(collect);
		
		System.out.println("================================");
		
		String collect2 = IntStream.range(0, s.length())
		.mapToObj(s1 -> s.charAt(s.length()-1-s1))
		.map(String::valueOf)
		.collect(Collectors.joining(""));
		System.out.println(collect2);
		}

}
