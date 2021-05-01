package com.streams;

import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		List<String> l = List.of("Mahadev", "Shiva", "Bholenath", "Shankar", "Maheshwar");
		String s = l.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(s);
		
		String s2 = l.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(s2);
	}
}
