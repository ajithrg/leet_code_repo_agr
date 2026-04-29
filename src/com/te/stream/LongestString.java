package com.te.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hii", "hello", "king", "program");
		
		String string = list.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(string);
	}

}
