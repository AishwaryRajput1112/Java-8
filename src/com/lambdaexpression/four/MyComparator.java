package com.lambdaexpression.four;

import java.util.Comparator;

@SuppressWarnings({ "rawtypes", "hiding" })
public class MyComparator<Employee> implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student i1 =(Student)o1;
		Student i2 =(Student)o2;
		if(i1.getEid()<i2.getEid()) {
			return +1;
		}else if(i1.getEid()>i2.getEid()) {
			return -1;
		}
		return i1.getName().compareTo(i2.getName());
	}

	
}
