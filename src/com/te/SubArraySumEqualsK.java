package com.te;

import java.util.LinkedHashMap;
import java.util.Map;

public class SubArraySumEqualsK {
	public static int subArray(int[] a, int k) {
		int sum = 0, count = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(0, 1);
		for(int num : a) {
			sum += num;
			if(map.containsKey(sum-k)) {
				count += map.get(sum-k);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a = {1,1,1};
		int k = 2;
		System.out.println(subArray(a, k));
	}
}
