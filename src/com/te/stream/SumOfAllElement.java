package com.te.stream;

import java.util.Arrays;

public class SumOfAllElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int sum = Arrays.stream(a).boxed().mapToInt(Integer::valueOf)
		.sum();
		System.out.println(sum);
	}

}
