package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckEmptyCollectionUsingPredicate {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(130);
		Predicate<List<Integer>> p = list-> list.isEmpty();
		System.out.println(p.test(al));
		
	}

}
