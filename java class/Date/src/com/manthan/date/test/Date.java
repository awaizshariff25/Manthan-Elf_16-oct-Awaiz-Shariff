package com.manthan.date.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
	
	public static void main(String[] args) {
		
		LocalDate id=LocalDate.now();
		System.out.println(id);
		
		LocalTime it=LocalTime.now();
		System.out.println(it);
		
		LocalDateTime idt=LocalDateTime.now();
		System.out.println(idt);
	}
}
