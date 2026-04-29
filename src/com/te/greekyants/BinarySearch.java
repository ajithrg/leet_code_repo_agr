package com.te.greekyants;

public class BinarySearch {
	public static int[] bubbleSort(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a.length-1-i ; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	
	public static int binarySearch(int[] a, int target) {
		int low = 0;
		int high = a.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==target) {
				return mid;
			} else if(a[mid]<=target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {1,3,4,2,5};
		bubbleSort(a);
		int target = 3;
		System.out.println(binarySearch(a, target));
	}
}
