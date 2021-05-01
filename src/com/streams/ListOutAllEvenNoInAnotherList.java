package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOutAllEvenNoInAnotherList {

	public static void main(String[] args) {
		
		List<Integer> al = List.of(2, 3, 66, 78, 56657, 79874, 6576, 78, 66665, 54545);
		Stream<Integer> s = al.stream();
		Stream<Integer> s1 = s.filter(b->b%2==0);
		List<Integer> abc = s1.collect(Collectors.toList());
		System.out.println(abc);
		
	}
}
