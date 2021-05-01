package com.consumer;

import java.util.List;
import java.util.function.Consumer;

public class DisplayMovieInfoFunction {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("Bahubali", "Prabhas", "Anushka", 150);
		Movie m2 = new Movie("Pirates of the Carribean", "Johny Depp", "Kiera Knitley", 160);
		Movie m3 = new Movie("3 Idiots", "Amir", "Kareena", 170);
		Movie m4 = new Movie("Gangs of Wasseypur", "Manoj Bajpayee", "Richa Chaddha", 150);
		List<Movie> l = List.of(m1, m2, m3, m4);
		Consumer<Movie> c = m->System.out.println(m);
		l.stream().forEach(c);
	}
}
