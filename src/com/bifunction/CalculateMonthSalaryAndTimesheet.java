package com.bifunction;

import java.util.function.BiFunction;

public class CalculateMonthSalaryAndTimesheet {
	
	public static void main(String[] args) {
		
		BiFunction<Employee, Timesheet, Integer> bf = (e,t)->e.getDailyWages()*t.getDays();
		Employee e = new Employee(1, "Mahadev", 10000);
		Timesheet timesheet  = new Timesheet(1, 30);
		System.out.println(bf.apply(e, timesheet));
		
	}
	
}
