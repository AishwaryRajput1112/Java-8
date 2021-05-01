package com.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudntInfoBasedOnGrades {

	public static void main(String[] args) {
		
		// Student info
		//grade based on marks
		//Student details where marks>=60
		Student s1 = new Student("Aishwary", 56);
		Predicate<Student> secondDivision = a->a.getPercent()>=60 && a.getPercent()<70;
		Predicate<Student> thirdDivision = a->a.getPercent()<=60 && a.getPercent()>50;
		Predicate<Student> firstDivision = a->a.getPercent()>60;
		Function<Student, String> grades = a->{
			if(firstDivision.test(a)) {
				return "A";
			}else if(secondDivision.test(a)) {
				return "B";
			}else {
				return "C";
			}
		};
		Consumer<Student>c = a->System.out.println(a);
		//Student details
		System.out.println("Student details");
		c.accept(s1);
		//Student grades 
		System.out.println("Grades "+grades.apply(s1));
		
		
	}
}
