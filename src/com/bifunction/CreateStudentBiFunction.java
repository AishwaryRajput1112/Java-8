package com.bifunction;

import java.util.function.BiFunction;

public class CreateStudentBiFunction {

	public static void main(String[] args) {
		
		BiFunction<String, Integer, Student> bf = (name,rno)->{
			return new Student(rno,name);
		};
		System.out.println(bf.apply("Aish", new Integer(10)));
		
	}
}
