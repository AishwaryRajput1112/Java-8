package com.anonymousinnerclass;

public class Test {

	public static void main(String[] args) {
		
		I i = new I() {
			public void m() {
				System.out.println("Hii");
			}
		};
		i.m();
		
		//With Lambda
		I i2 = ()->System.out.println("Hello");
		i2.m();
		
	}
	
}
