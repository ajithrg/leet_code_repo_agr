package com.te;

import java.util.Arrays;

public class ProductExceptSelf {
	public static int[] productSelf(int[] a) {
		int n = a.length;
		int[] result = new int[n];
		
		int preffix = 1;
		for(int i=0 ; i<n ; i++) {
			result[i] = preffix;
			preffix *= a[i];
		}
		
		int suffix = 1;
		for(int i=n-1 ; i>=0 ; i--) {
			result[i] *= suffix;
			suffix *= a[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println(Arrays.toString(productSelf(a)));
	}
}
