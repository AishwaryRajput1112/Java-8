package com.bipredicate;

import java.util.function.BiPredicate;

public class SumOfTwoNumbersEvenOrOdd {
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bp = (a,b)-> (a+b)%2==0;
		System.out.println(bp.test(5, 19));
		
	}

}
