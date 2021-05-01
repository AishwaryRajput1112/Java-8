package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TotalSalaryOfEmployeeFunction {

	public static void main(String[] args) {
		Function<Employee, Integer> f = s->s.getId();
		Employee e1 = new Employee(101, "Aishwary");
		Employee e2 = new Employee(202, "Aishwary");
		Employee e3 = new Employee(90, "Aishwary");
		Employee e4 = new Employee(43, "Aishwary");
		Employee e5 = new Employee(56, "Aishwary");
		Employee e6 = new Employee(78, "Aishwary");
		List<Employee> al = new ArrayList<>();
		int totalId = 0 ;
		al.add(e6);
		al.add(e5);
		al.add(e4);
		al.add(e3);
		al.add(e2);
		al.add(e1);
		for(Employee e: al) {
			totalId+=f.apply(e);
		}
		System.out.println(totalId);
		
	}
	
}
