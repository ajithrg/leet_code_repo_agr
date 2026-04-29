package com.te;

public class ContainerWithMostWater {
	public static int containerWithMostWater(int[] a) {
		int low = 0;
		int high = a.length-1;
		int maxWater = 0;
		
		while(low<=high) {
			int currentArea = Math.min(a[low], a[high])*(high-low);
			maxWater = Math.max(maxWater, currentArea);
			if(a[low]<=a[high]) {
				low++;
			} else {
				high--;
			}
		}
		return maxWater;
	}
	public static void main(String[] args) {
		int[] a = {1,8,6,2,5,4,8,3,7};
		System.out.println(containerWithMostWater(a));
	}
}
