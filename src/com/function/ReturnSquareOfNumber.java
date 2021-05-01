package com.function;

import java.util.function.Function;

public class ReturnSquareOfNumber {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n-> n*n;
		System.out.println(f.apply(8));
	}
}
