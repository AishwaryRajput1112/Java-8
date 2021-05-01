package com.streams;

import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(10,5,425,2,6579,78,5,3224,76,2,343,65,7457,4,12,4);
		Integer[] ii = l.stream().map(i->i/2).toArray(Integer[]::new);
		for (Integer integer : ii) {
			System.out.println(integer);
		}
	}
}
