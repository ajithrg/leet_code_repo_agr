package com.te.greekyants;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddGroup {
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<String, List<Integer>> collect = list.stream()
        .collect(Collectors.groupingBy(n -> (n%2==0) ? "even" : "odd"));
        System.out.println(collect);
        
        System.out.println("=================================");
        
        Map<Boolean, List<Integer>> collect2 = list.stream()
        .collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println(collect2);
	}

}
