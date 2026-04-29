package com.te;

public class TrappingOfRainWater {
	public static int rainWater(int[] a) {
		int low = 0;
		int high = a.length-1;
		int leftmax =0, rightmax = 0, trappedWater = 0;
		
		while(low<=high) {
			if(a[low]<=a[high]) {
				if(a[low]>=leftmax) {
					leftmax = a[low];
				} else {
					trappedWater += leftmax - a[low];
				}
				low++;
			} else {
				if(a[high]>=rightmax) {
					rightmax = a[high];
				} else {
					trappedWater += rightmax - a[high];
				}
				high--;
			}
		}
		return trappedWater;
	}
	public static void main(String[] args) {
		int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(rainWater(a));
		
	}
}
