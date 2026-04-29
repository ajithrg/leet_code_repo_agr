package com.te.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		
		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println("=======================================");
		
		int[] result = new int[a.length + b.length];
		
		int k = 0;
		for(int x : a) {
			result[k++] = x;
		}
		
		for(int x : b) {
			result[k++] = x;
		}
		
		for(int num : result) {
			System.out.print(num + " ");
		}
	}

}
