package com.constructor.reference;

public class Test {

	public static void main(String[] args) {
		
		I i = Sample::new;
		i.m();
		
	}
}
