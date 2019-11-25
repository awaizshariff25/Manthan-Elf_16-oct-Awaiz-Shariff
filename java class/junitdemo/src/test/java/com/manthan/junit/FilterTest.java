package com.manthan.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class FilterTest {

	@Test
	void testMyFilter() {
		
		DBUtil db = mock(DBUtil.class);
		
		Filter f = new Filter(db);
		
		when(db.getNames()).thenReturn(Arrays.asList("Amit","Priya","Bhanu","Awaiz","Arun"));
		
		List<String> myList = f.myFilter();
		
		assertEquals(3, myList.size());
		
	}

}
