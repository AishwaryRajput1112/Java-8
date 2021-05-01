package com.predicate;

public class SoftwareEngineer {

	private String name;
	private boolean gf;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGf() {
		return gf;
	}
	public void setGf(boolean gf) {
		this.gf = gf;
	}
	public SoftwareEngineer(String name, boolean gf, int age) {
		super();
		this.name = name;
		this.gf = gf;
		this.age = age;
	}
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", gf=" + gf + ", age=" + age + "]";
	}
	
}
