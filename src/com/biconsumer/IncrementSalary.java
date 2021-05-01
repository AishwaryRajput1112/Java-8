package com.biconsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IncrementSalary {
//Increment salary and create employee using function
	public static void main(String[] args) {
		
		BiFunction<String, Integer, Employee> bf = (a,b)->{
			return new Employee(a, b);
		};
		System.out.println(bf.apply("Siyaram", 1000));
		
		BiConsumer<Employee, Double> bc = (emp,sal)->{
		//	emp.getSalary() = emp.getSalary()+sal;
		};
		
	}
}
