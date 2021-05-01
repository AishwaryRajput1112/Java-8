package com.predicate;

public class Employee {

	private String designation;
	private double salary;
	private String city;
	private String name;
	public Employee(String designation, double salary, String city, String name) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.city = city;
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary + ", city=" + city + ", name=" + name
				+ "]";
	}
	
}
