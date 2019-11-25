package com.manthan.exception.test;

public class DaylimitException extends RuntimeException {
	
	private String message="sorry you crossed the day limit";
	public DaylimitException()
	{
		
	}
	
	public DaylimitException(String message) {
		this.message=message;
	}
	
	public String getMessage()
	{
		return message;
		
	}

}
