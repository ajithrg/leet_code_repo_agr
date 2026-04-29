package com.te;

public class MovesZeroToLeft {
	public static void main(String[] args) {
		int[] a = {0,1,0,1,0,2,3,4,5,0,0};
		for(int ele : a) {
			if(ele == 0) {
				System.out.print(ele + " ");
			}
		}
		for(int ele : a) {
			if(ele!=0) {
				System.out.print(ele + " ");
			}
		}
	}
}
