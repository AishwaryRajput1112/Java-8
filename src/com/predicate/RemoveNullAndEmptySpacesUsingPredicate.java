package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullAndEmptySpacesUsingPredicate {

	public static void main(String[] args) {
		
		String[]arr = {"Aishwary", "Somnath" , "Shambhu" ,null, "Kamdev", " " , "Harihar" , "Narayan","Bhole"};
		List spaces = new ArrayList();
		Predicate<String> nonEmptyString = s->s.trim().length()!=0;
		Predicate<String> removeNull = s->s!=null;
		for (int i = 0; i < arr.length; i++) {
			if(removeNull.and(nonEmptyString).test(arr[i])) {
				spaces.add(arr[i]);
			}
			
		}
		System.out.println(spaces);
 
		
	}
}
