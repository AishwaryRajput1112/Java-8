package com.bifunction;

public class Timesheet {

	private int eid;
	private int days;
	public Timesheet(int eid, int days) {
		super();
		this.eid = eid;
		this.days = days;
	}
	@Override
	public String toString() {
		return "Timesheet [eid=" + eid + ", days=" + days + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
}
