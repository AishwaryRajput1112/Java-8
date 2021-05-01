package com.supplier;

import java.util.function.Supplier;

public class GenerateRandomPassoword {

	public static void main(String[] args) {
		
		//Length should be 8
		//2,4,6,8 digits only
		//1357 uppercase + @#$
		Supplier<String> s = ()->{
		Supplier<Integer> random = ()->(int)Math.random()*10;
		String symbols ="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
		String pass="";
		Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*29));
			for (int i = 0; i < 8; i++) {
				if(i%2==0) {
					pass = pass+random.get();
				}else {
					pass = pass + c.get();
				}
			}
			return pass;
		};
		System.out.println(s.get());
	}
}
