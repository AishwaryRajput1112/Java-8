package com.lambdaexpression.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student e1 = new Student();
		e1.setEid(1346);
		e1.setName("Bholenath");
		e1.setSsn("40008845");
		Student e2 = new Student();
		e2.setEid(12);
		e2.setName("Maheshwar");
		e2.setSsn("40007856");
		Student e3 = new Student();
		e3.setEid(400);
		e3.setName("Chandrashekhar");
		e3.setSsn("40005533");
		Student e4 = new Student();
		e4.setEid(400);
		e4.setName("Shivaaaa");
		e4.setSsn("40005533");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list, new MyComparator<Student>());
		System.out.println(list);
	}
}
