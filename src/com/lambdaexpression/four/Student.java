package com.lambdaexpression.four;

public class Student {

	private int eid;
	private String name;
	private String ssn;
	
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
}
