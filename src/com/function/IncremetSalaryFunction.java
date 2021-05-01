package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IncremetSalaryFunction {
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Aish", 2000);
		Employee employee2 = new Employee(130, "Raman", 8000);
		Employee employee3 = new Employee(420, "Rahul", 3000);
		Employee employee4 = new Employee(840, "Raghav", 2000);
		Employee employee5 = new Employee(1680, "Sultana", 8000);
		List<Employee> al = List.of(employee1, employee2, employee3, employee4, employee5);
		System.out.println(al);
		List<Employee> incrementedEmployeeList = new ArrayList<>();
		Predicate<Employee> p = s-> s.getSalary()<3770;
		for (Employee employee : al) {
			if(p.test(employee)) {
				employee.setSalary(employee.getSalary()+2000);
				incrementedEmployeeList.add(employee);
			}
		}
		System.out.println(incrementedEmployeeList);
	}
	
	
	
}
