package com.te.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		int[] array = IntStream.range(0, a.length)
		.map(i -> a[a.length-1-i])
		.toArray();
		System.out.println(Arrays.toString(array));
	}

}
