package com.function;

import java.util.function.Function;

public class RemoveSpacesUsingFunction {

	public static void main(String[] args) {
		
		Function<String, String>f = s->s.replaceAll(" ", "");
		System.out.println(f.apply("jsgda  df ds fds fd sfd"));
	}
}
