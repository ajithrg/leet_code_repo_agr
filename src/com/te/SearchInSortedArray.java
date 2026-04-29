package com.te;

public class SearchInSortedArray {
	public static int search(int[] a, int target) {
		int low = 0;
		int high = a.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==target) {
				return mid;
			}
			if(a[low]<=a[mid]) {
				if(a[low]<=target && target<=a[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if(a[mid]<=target && target<=a[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(a, target));
	}
}
