package com.function;

import java.util.function.Function;

public class ReturnLengthOfString {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("Aishwary"));
	}
}
