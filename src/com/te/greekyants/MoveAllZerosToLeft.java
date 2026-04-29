package com.te.greekyants;

public class MoveAllZerosToLeft {
	public static void main(String[] args) {
		int[] a = {1,2,0,0,0,3,4,0};
		for(int ele : a) {
			if(ele==0) {
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
