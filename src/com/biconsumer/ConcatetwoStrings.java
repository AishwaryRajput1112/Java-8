package com.biconsumer;

import java.util.function.BiConsumer;

public class ConcatetwoStrings {

	public static void main(String[] args) {
		
		BiConsumer<String, String> abc = (s1,s2)->System.out.println(s1.concat(s2));
		abc.accept("Mahadev", "Mahakal");
		
	}
}
