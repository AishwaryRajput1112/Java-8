package com.predicate;

import java.util.function.Predicate;

public class DisplayNamesStartingFromLetterKUsingPredicate {

	public static void main(String[] args) {
		
		String[]arr = {"Aishwary", "Somnath" , "Shambhu" , "Kamdev", "Harihar" , "Narayan","Bhole"};
		Predicate<String> p = s->s.startsWith("S");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(p.test(arr[i]));
		}
	}
}
