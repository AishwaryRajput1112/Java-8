package com.predicate;

import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		
		Integer[] arr = {10,20,40,56,87,2,7,45,81,98,89,91,43,57};
		
		Predicate<Integer> isGreaterThan10 = a->a>=10;
		Predicate<Integer> isEven = a->a%2 ==0;
		Predicate<Integer> isNotGreaterThan10 = isGreaterThan10.negate();
		
		for (int i = 0; i <arr.length; i++) {
			if(isGreaterThan10.and(isEven).test(arr[i])) {
				System.out.println("Greater than 10 - "+arr[i]);
			}else if(isNotGreaterThan10.test(arr[i])) {
				System.out.println("Less than 10 - "+arr[i]);
			}
		}
		
	}
}
