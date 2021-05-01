package com.joda.date.and.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaTimeLibraryAllConcepts {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		int mm = date.getMonthValue(); 
		int dd = date.getDayOfMonth();
		int yyyy = date.getYear();
		int hh = time.getHour();
		int m = time.getMinute();
		int sec = time.getSecond();
		int nns = time.getNano();
		
		int mm2 = localDateTime.getMonthValue(); 
		int dd2 = localDateTime.getDayOfMonth();
		int yyyy2 = localDateTime.getYear();
		int hh2 = localDateTime.getHour();
		int m2 = localDateTime.getMinute();
		int sec2 = localDateTime.getSecond();
		int nns2 = localDateTime.getNano();
		
		LocalDateTime manualDate = LocalDateTime.of(1992, Month.DECEMBER, 11, 12, 12, 12);
		System.out.println(manualDate);
		LocalDate birth = LocalDate.of(1992, Month.DECEMBER, 11);
		System.out.println(birth);
		LocalDate approxDeath = LocalDate.of(1992+60, Month.DECEMBER, 11);
		System.out.println(approxDeath);
		Period period = Period.between(birth, approxDeath);
		System.out.println(period.getYears());
		
		Period p2 = Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear()+40,12, 12));
		System.out.println(p2);
		
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/LosAngles"));
		
		System.out.println(zonedDateTime);
		
		
		
		
	}

}
