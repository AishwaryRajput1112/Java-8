package com.streams;

import java.util.List;
import java.util.function.Consumer;

public class Count {
	public static void main(String[] args) {
		
		Consumer<String> c = str->System.out.println(str);
		List<String> l = List.of("Mahadev", "Shiva", "Bholenath", "Shankar", "Maheshwar");
		int length = (int) l.stream().filter(s->s.length()>=9).count();
		System.out.println(length);
	}

}
