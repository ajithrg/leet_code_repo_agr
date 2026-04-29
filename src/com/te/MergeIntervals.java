package com.te;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public static int[][] mergeIntervals(int[][] intervals){
		if(intervals.length<1) {
			return intervals;
		}
		
		Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
		List<int[]> merged = new ArrayList<>();
		for(int[] interval : intervals) {
			if(merged.isEmpty() || merged.get(merged.size()-1)[1]<interval[0]) {
				merged.add(interval);
			} else {
				merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);
	}
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4},{8,9},{5,6}};
		System.out.println(Arrays.deepToString(mergeIntervals(a)));

	}
}
