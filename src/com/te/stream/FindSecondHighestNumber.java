package com.te.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		Integer integer = list.stream()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		System.out.println(integer);
	}

}
