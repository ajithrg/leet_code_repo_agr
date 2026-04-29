package com.te.greekyants;

public class SubArrayWithMaximumProduct {
	public static int maximumSum(int[] nums) {
		int currentSum = nums[0];
		int maxSum = nums[0];
		
		for(int i=1 ; i<nums.length ; i++) {
			currentSum = Math.max(nums[i], nums[i]+currentSum);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
	
	public static int maximumProduct(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int result = nums[0];
		
		for(int i=1 ; i<nums.length ; i++) {
			if(nums[i]<0) {
				int temp = max;
				max = min;
				min = temp;
			}
			max = Math.max(nums[i], max * nums[i]);
			min = Math.min(nums[i], min * nums[i]);
			
			result = Math.max(result, max);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = {2, 3, -2, 4};
		System.out.println(maximumSum(nums));
		System.out.println("=================================");
		System.out.println(maximumProduct(nums));
	}
}
