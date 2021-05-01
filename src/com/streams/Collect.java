package com.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		
		Consumer<String> c = str->System.out.println(str);
		List<String> l = List.of("Mahadev", "Shiva", "Bholenath", "Shankar", "Maheshwar");
		List<String>lengthStream = l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
		lengthStream.forEach(System.out::println);
		
		List<String>uppercaseStream = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		uppercaseStream.forEach(System.out::println);
	}
}
