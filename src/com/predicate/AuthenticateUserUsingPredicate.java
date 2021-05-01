package com.predicate;

import java.util.function.Predicate;

public class AuthenticateUserUsingPredicate {

	public static void main(String[] args) {
		User user2 = new User("Mahadev", "Kailasha");
		User user3 = new User("Bholenath", "kripa");
		User user4 = new User("Mahakaal", "Shamshaan");
		User user5 = new User("Natraj", "Tandav");
		Predicate<User> p = u->u.getUsername().equals("Mahadev") && u.getPassword().equals("Kailasha");
		System.out.println(p.test(user5));
		
		
	}
}
