package com.te.stream;

import java.util.stream.Stream;

public class FirstTenOddNumber {
	public static void main(String[] args) {
		Stream.iterate(new int[] {1,3}, f -> new int[] {f[1],f[1]+3})
		.limit(10)
		.map(f -> f[0])
		.forEach(System.out::println);
	}
}
