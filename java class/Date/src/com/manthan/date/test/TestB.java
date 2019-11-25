package com.manthan.date.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestB {

	public static void main(String[] args) {
		
		LocalDateTime idt= LocalDateTime.now();
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy h:m a");
		
		String res=df.format(idt);
		
		System.out.println(res);
		
	}
}
