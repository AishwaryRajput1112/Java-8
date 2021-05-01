package com.method.references;

public class MethodReferenceDemos {
	
	public void m() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		MethodReferenceDemos demos = new MethodReferenceDemos();
		Interf i = demos::m;
		i.m();
	}

}
