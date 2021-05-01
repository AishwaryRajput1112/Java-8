package com.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s->System.out.println(s.toLowerCase());
		Consumer<String> c2 = s->System.out.println(s.substring(0, 5));
		c1.andThen(c2).accept("Aishwary");
		
	}
}
