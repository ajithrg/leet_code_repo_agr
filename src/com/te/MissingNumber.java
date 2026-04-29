package com.te;

public class MissingNumber {
	public static int missingNumber(int[] a) {
		int left = 0, right = a.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2;
			if(a[mid]!=mid+1) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left + 1;
	}
	public static void main(String[] args) {
		int[] a = {1,2,4,5};
		System.out.println(missingNumber(a));
	}
}
