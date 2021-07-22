package com.phoenix.datetimes;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 15-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.of(1885, 1, 12);
		System.out.println(date);
	
	DateTimeFormatter formatter =  DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	DateTimeFormatter formatter1 =  DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	DateTimeFormatter formatter2 =  DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	DateTimeFormatter formatter3 =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	
	String formattedDate = date.format(formatter);
	String formattedDate1 = date.format(formatter1);
	String formattedDate2 = date.format(formatter2);
	String formattedDate3 = date.format(formatter3);
	
	System.out.println("Full:" + formattedDate);
	System.out.println("LONG:" + formattedDate1);
	System.out.println("MEDIUM:" + formattedDate2);
	System.out.println("SHORT:" + formattedDate3);
	
	//Custom Date Format
	
	DateTimeFormatter dft =
						DateTimeFormatter.ofPattern("MMM dd,yyyy");
	System.out.println("Custom Format : " + date.format(dft));
	
	LocalTime lt1 =	LocalTime.of(12, 32,56);
	System.out.println(lt1);
	
	DateTimeFormatter dft1 = 	DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
	String fmtTime =date.format(dft1);
	System.out.println(fmtTime);
	
	}

}
