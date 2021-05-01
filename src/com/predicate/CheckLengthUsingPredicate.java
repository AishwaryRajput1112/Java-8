package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckLengthUsingPredicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Predicate<String> p = s->s.length()<5?true:false;
		System.out.println(p.test(input));
	}

}
