package com.functionalInterface;

@FunctionalInterface
public interface P {

	public void m1();
	
	default int m2(int x) {
		return x*x;
	}
	
	static void m3() {
		System.out.println("Static method-----");
	}
	
	
}
