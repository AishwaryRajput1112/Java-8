package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagementSystemUsingPredicateJoining {
	public static void main(String[] args) {
		List<Employee> managerList = new ArrayList<>();
		List<Employee> employeesFromBangalore = new ArrayList<>();
		List<Employee> employeeHavingSalaryLessThan20000 = new ArrayList<>();
		List<Employee> managersHavingSalaryLessThan20000 = new ArrayList<>();
		List<Employee> employeesWithoutManagerDesignation = new  ArrayList<>();
		List<Employee> managersFromBangaloreHavingSalaryLessThan20000 = new  ArrayList<>();
		Predicate<Employee> p1 = e->e.getDesignation().equals("Manager");
		Predicate<Employee> p2 = e->e.getCity().equals("Bangalore");
		Predicate<Employee> p3 = e->e.getSalary()<20000;
		Predicate<String> p4 = Predicate.isEqual("CEO");
		Predicate<Employee> p5 = p1.negate();
		
		for(Employee e : getEmployees()) {
			if(p1.test(e)) {
				managerList.add(e);
			}if(p2.test(e)) {
				employeesFromBangalore.add(e);
			}if(p3.test(e)) {
				employeeHavingSalaryLessThan20000.add(e);
			}if(p1.and(p3).test(e)) {
				managersHavingSalaryLessThan20000.add(e);
			}if(p5.test(e)) {
				employeesWithoutManagerDesignation.add(e);
			}if(p1.and(p2).and(p3).test(e)) {
				managersFromBangaloreHavingSalaryLessThan20000.add(e);
			}if(p4.test(e.getDesignation())) {
				System.out.println("CEO"  +e.getName());
			}
		}
		
		System.out.println(managerList.size() +"managerList" + managerList);
		System.out.println(employeesFromBangalore.size() + "employeesFromBangalore" +employeesFromBangalore);
		System.out.println(employeeHavingSalaryLessThan20000.size() +"employeeHavingSalaryLessThan20000" +employeeHavingSalaryLessThan20000);
		System.out.println(managersHavingSalaryLessThan20000 + "managersHavingSalaryLessThan20000"+ managersHavingSalaryLessThan20000);
		System.out.println(employeesWithoutManagerDesignation.size() + "employeesWithoutManagerDesignation"+employeesWithoutManagerDesignation);
		System.out.println(managersFromBangaloreHavingSalaryLessThan20000.size() +"managersFromBangaloreHavingSalaryLessThan20000"+managersFromBangaloreHavingSalaryLessThan20000);
	}
	
	static List<Employee> getEmployees() {
		List<Employee> allEmployees = new ArrayList<>();
		Employee e1 = new Employee("Developer", 15000, "Pune", "Aishwary");
		Employee e2 = new Employee("Manager", 15000, "Bangalore", "Rahul");
		Employee e3 = new Employee("CEO", 6000, "Bangalore", "Raman");
		Employee e4 = new Employee("Developer", 10000, "Pune", "Chirag");
		Employee e5 = new Employee("Manager", 10000, "Pune", "Mayur");
		Employee e6 = new Employee("Developer", 9000, "Bangalore", "Naresh");
		Employee e7 = new Employee("Manager", 17000, "Bangalore", "Pratik");
		Employee e8 = new Employee("Developer", 20000, "Pune", "Sameer");
		Employee e9 = new Employee("Tester", 20000, "Pune", "Subbo");
		Employee e10 = new Employee("Cobol", 30000, "Pune", "Viren");
		allEmployees.add(e10);
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		allEmployees.add(e5);
		allEmployees.add(e6);
		allEmployees.add(e7);
		allEmployees.add(e8);
		allEmployees.add(e9);
		return allEmployees;
	}
}
