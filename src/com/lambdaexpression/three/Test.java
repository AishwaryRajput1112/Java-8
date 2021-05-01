package com.lambdaexpression.three;

public class Test {

	public static void main(String[] args) {
		I i = s-> s.length();
		System.out.println(i.getLength("ABCDEFG"));
	}
}
