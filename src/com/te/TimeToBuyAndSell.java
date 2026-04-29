package com.te;

public class TimeToBuyAndSell {
	public static int timeToBuyAndSell(int[] a) {
		int buy = a[0];
		int maxProfit = 0;
		
		for(int i=1 ; i<a.length ; i++) {
			if(buy>a[i]) {
				buy = a[i];
			} else if(a[i]-buy > maxProfit) {
				maxProfit = a[i]-buy;
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int[] a = {7,1,5,3,6,4};
		System.out.println(timeToBuyAndSell(a));
	}
}
