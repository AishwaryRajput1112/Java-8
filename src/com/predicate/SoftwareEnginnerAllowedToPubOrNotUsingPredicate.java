package com.predicate;

import java.util.function.Predicate;

public class SoftwareEnginnerAllowedToPubOrNotUsingPredicate {

	public static void main(String[] args) {
		
		SoftwareEngineer engineer1  = new SoftwareEngineer("Aishwary", false, 28);
		SoftwareEngineer engineer2  = new SoftwareEngineer("Rahul Paliwal", true, 28);
		SoftwareEngineer engineer3  = new SoftwareEngineer("Ramandeep", false, 18);
		SoftwareEngineer engineer4  = new SoftwareEngineer("Chirag", true, 30);
		SoftwareEngineer engineer5  = new SoftwareEngineer("Mayur", false, 31);
		Predicate<SoftwareEngineer>predicate = e->e.getAge()>20 && e.isGf();
		System.out.println(predicate.test(engineer5));
		System.out.println(predicate.test(engineer2));
		System.out.println(predicate.test(engineer1));
		System.out.println(predicate.test(engineer3));
		System.out.println(predicate.test(engineer4));
		
	}
}
