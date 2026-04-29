package com.te.greekyants;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static int[] productOfArray(int[] a) {
		int n = a.length;
		int[] result = new int[n];
		
		int prefix = 1;
		for(int i=0 ; i<n ; i++) {
			result[i] = prefix;
            prefix *= a[i];
		}
		
		int suffix = 1;
		for(int i=n-1 ; i>=0 ; i--) {
			result[i] *= suffix;
            suffix *= a[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(productOfArray(a)));
	}
}
