package com.te;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.text.AbstractDocument;

public class Practise {
	public static int[] bubbleSort(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a.length-1-i ; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	
	public static int[] selectionSort(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		return a;
	}
	
	public static int[] insertionSort(int[] a) {
		for(int i=0 ; i<a.length ; i++) {
			int m = i;
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[m]<a[j]) {
					m = j;
				}
				int temp = a[m];
				a[m] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,4,2,5};
		System.out.println(Arrays.toString(bubbleSort(a)));
		System.out.println("====================================");
		System.out.println(Arrays.toString(selectionSort(a)));
		System.out.println("====================================");
		System.out.println(Arrays.toString(insertionSort(a)));
		System.out.println("=====================================");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		Map<String, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(num -> (num%2==0) ? "even" : "odd"));
	    System.out.println(collect);
	}
}
