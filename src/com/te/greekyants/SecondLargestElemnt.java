package com.te.greekyants;

public class SecondLargestElemnt {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int max1 = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length ; i++) {
			if(a[i]>max1) {
				max1 = a[i];
			}
		}
		
		int max2 = Integer.MIN_VALUE;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]>max2 && a[i]!=max1) {
				max2 = a[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}
