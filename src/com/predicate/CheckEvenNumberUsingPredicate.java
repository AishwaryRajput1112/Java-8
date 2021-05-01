package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckEvenNumberUsingPredicate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Integer inputno = scanner.nextInt();
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(inputno));
	}
}
