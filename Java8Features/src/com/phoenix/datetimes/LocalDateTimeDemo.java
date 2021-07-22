package com.phoenix.datetimes;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate date1 = LocalDate.of(2030, 12, 31);
		System.out.println(date1);
		
		LocalTime lt =	LocalTime.now();
		System.out.println(lt);
		
		LocalTime lt1 =	LocalTime.of(12, 32,56);
		System.out.println(lt1);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	
		LocalDateTime ldt1 = LocalDateTime.of(date, lt);
		System.out.println(ldt1);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);

		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
	
		Set<String> zones = ZoneId.getAvailableZoneIds();
//		zones.stream()
//			.sorted()
//				.forEach(System.out :: println);
	
		Set<String> zones1 = ZoneId.getAvailableZoneIds();
		zones1.stream()
			.sorted()
			.filter(z -> z.startsWith("I") || z.startsWith("America"))
				.forEach(System.out :: println);
	
		ZoneId zn = ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt, zn);
		System.out.println(zdt1);
	
	
	}

}
