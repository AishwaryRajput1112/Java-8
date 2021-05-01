package com.supplier;

import java.util.function.Supplier;

public class RandomOtp {

	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			String abc = "";
			for(int i=0;i<=6;i++) {
			 abc = abc+(int)(Math.random()*20);
			}
			 return abc;
		};
		System.out.println(s.get());
		
	}
}
