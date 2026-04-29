package com.te.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(
			    Arrays.asList(1,2),
			    Arrays.asList(3,4)
			);
		List<Integer> collect = list.stream().flatMap(List::stream)
		.collect(Collectors.toList());
		System.out.println(collect);
	}
}
