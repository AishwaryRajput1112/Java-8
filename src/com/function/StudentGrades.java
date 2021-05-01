package com.function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrades {

	public static void main(String[] args) {
		Student s1 = new Student("Aishwary", 70);
		Student s2 = new Student("Sanjeev", 46);
		Student s3 = new Student("Rahul", 65);
		Student s14 = new Student("Rohan", 59);
		Predicate<Student> A = s->s.getPercent()>=70;
		Predicate<Student> B = s->s.getPercent()>60 && s.getPercent()<70;
		Predicate<Student> C = s->s.getPercent()<60;
		Function<Student, String> f = s->{
			if(A.test(s)) {
				return "A";
			}if(B.test(s)) {
				return "B";
			}else {
				return "C";
			}
		};
		List<Student> al = new ArrayList();
		al.add(s1); al.add(s2); al.add(s3); al.add(s14);

		for (Student st : al) {
			System.out.println(f.apply(st));
		}
		
		
		
	}
}
