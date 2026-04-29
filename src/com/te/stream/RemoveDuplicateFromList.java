package com.te.stream;

import java.util.Arrays;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		int[] a = {1,2,2,2,3,4,5};
		Object[] array = Arrays.stream(a).boxed().distinct().toArray();
		System.out.println(Arrays.toString(array));
	}

}
