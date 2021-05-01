package com.lambdaexpression.five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(400);
		list.add(2003);
		list.add(1);
		list.add(567);
		list.add(800);
		list.add(57);
		list.add(833);
		list.add(988);
		list.add(420);
		list.add(355);
		//1st method
//		Collections.sort(list, new MyComparator());
		System.out.println(list);
		
		//2nd method
		
		  Collections.sort(list, (a,b)->{ if(a<b) { return 1 ; }else if(a>b) { return
		  -1; }else { return 0; } });
		 
		System.out.println(list);
		
		//3rd method
		Collections.sort(list, (a,b) -> a>b?1 : a<b? -1 : 0);
		System.out.println(list);
		
	}
}
