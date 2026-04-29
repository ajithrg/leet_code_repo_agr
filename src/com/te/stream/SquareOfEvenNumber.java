package com.te.stream;

import java.util.Arrays;
import java.util.List;

public class SquareOfEvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream().filter(n -> n%2==0)
		.map(n -> n*n).forEach(System.out::println);
	}

}
