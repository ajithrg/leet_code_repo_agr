package com.te.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullValues {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("king", "queen" , null, "abc");
		
		List<String> collect = list.stream().filter(Objects::nonNull)
		.collect(Collectors.toList());
		System.out.println(collect);
	}

}
