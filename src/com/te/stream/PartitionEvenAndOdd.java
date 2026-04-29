package com.te.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenAndOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i -> i%2 ==0));
		System.out.println(collect);
	}
}
