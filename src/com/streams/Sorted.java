package com.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		
		List<String> l = List.of("Mahadev", "Shiva", "Bholenath", "Shankar", "Maheshwar");
		List<String>normalSort = l.stream().sorted().collect(Collectors.toList());
		List<String>customSort = l.stream().sorted((a,b)->{
			return -a.compareTo(b);
		}).collect(Collectors.toList());
		System.out.println("Custom" +customSort);
		System.out.println("Normal" +normalSort);
		
	}
}
