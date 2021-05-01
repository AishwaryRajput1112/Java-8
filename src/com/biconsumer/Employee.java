package com.biconsumer;

public class Employee {

	private int eid;
	private String name;
	private int dailyWages;
	private int salary;
	public Employee(int eid, String name, int dailyWages) {
		super();
		this.eid = eid;
		this.name = name;
		this.dailyWages=dailyWages;
	}
	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dailyWages=" + dailyWages + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDailyWages() {
		return dailyWages;
	}
	public void setDailyWages(int dailyWages) {
		this.dailyWages = dailyWages;
	}
	
	


	
}
