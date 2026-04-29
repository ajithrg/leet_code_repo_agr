package com.te.greekyants;

import java.lang.annotation.Target;

public class MinimumLengthSubArrayTarget {
	public static int minimumLength(int[] a, int target) {
		int left = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		
		for(int right=0 ; right<a.length ; right++) {
			sum += a[right];
			
			while(sum>= target) {
				if(sum==target) {
					minLength = Math.min(minLength, right-left+1);
				}
				sum -= a[left];
				left++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
	public static void main(String[] args) {
		int[] a = {2,5,3,2,6};
		int target = 7;
		System.out.println(minimumLength(a, 7));
	}
}
