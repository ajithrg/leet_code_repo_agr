package com.te;

public class MinAndMaxLengthInTargetSum {
	public static int minLength(int[] a, int target) {
		int sum= 0;
		int minLength = Integer.MAX_VALUE;
		int left = 0;
		
		for(int right=0 ; right<a.length ; right++) {
			sum += a[right];
			
			while(sum>=target) {
				if(sum==target) {
					minLength = Math.min(target, right-left+1);
				}
				sum -= a[left];
				left++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0:minLength;
	}
	
	public static int maxLength(int[] a, int target) {
		int sum = 0;
		int left = 0;
		int maxLength = 0;
		
		for(int right = 0 ; right<a.length ; right++) {
			sum += a[right];
			
			while(sum>target) {
				sum -= a[left];
				left++;
			}
			
			if(sum==target) {
				maxLength = Math.max(maxLength, right-left+1);
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		int[] a = {2,5,3,2,8,9};
		int target = 7;
		System.out.println(minLength(a, target));
		System.out.println("======================================");
		System.out.println(maxLength(a, target));
	}
}
