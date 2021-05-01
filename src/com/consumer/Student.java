package com.consumer;

public class Student {

	private String name;
	private double percent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public Student(String name, double percent) {
		super();
		this.name = name;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", percent=" + percent + "]";
	}
	
}
