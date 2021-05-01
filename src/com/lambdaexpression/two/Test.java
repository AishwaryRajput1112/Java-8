package com.lambdaexpression.two;

public class Test {

	public static void main(String[] args) {
		
		I i = (int a,int b)-> {return  a+b; };
		System.out.println(i.add(10, 20));
		
		I i2 = (a, b)-> {return  a+b; };
		System.out.println(i2.add(130, 20));
		
		I i3 = (a, b)->  a+b ;
		System.out.println(i3.add(66, 20));
	}
}
