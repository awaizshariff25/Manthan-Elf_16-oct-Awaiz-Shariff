package com.manthan.date.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestA {

	public static void main(String[] args) {
		
		LocalDate id=LocalDate.now();
		
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println(dt.format(id));
	}
}
