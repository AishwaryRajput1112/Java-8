package com.invoke.lambda;

public class Test {

	public static void main(String[] args) {
		
		//1st type of call
		Demo d = new Demo();
		System.out.println(d.x(10));
		
		//2nd type of call
		I i = a -> a*a;
		System.out.println(i.x(20));
		
		
		
		
	}
}
