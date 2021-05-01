package com.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class GetRandomNameUsingSupplier {

	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			String[] arr ={"aish","raj","mahadev","shiva","bholenath"};
				Random r = new Random();
				int randomno = r.nextInt(arr.length);
				return arr[randomno];
		};
		System.out.println(s.get());
		
	}
}
