package com.manthan.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator c;
	
	@BeforeEach
	public void createObj() {
		c = new Calculator();
	}
	
	@Test
	public void testAdd() {		
		int res = c.add(20, 10);
		assertEquals(30, res);
	}
	
	@Test
	public void testDiv() {
		int res = c.div(25, 5);
		assertEquals(5, res);
	}
	
	@Test
	@Disabled
	public void testDivException() {
		assertThrows(ArithmeticException.class, ()->c.div(10, 0));
	}

}// end of class
