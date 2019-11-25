package com.manthan.junit;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	private DBUtil dbUtil;
	
	public Filter(DBUtil dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	public List<String> myFilter(){
		List<String> newList = new  ArrayList<String>();
		List<String> fromDb = dbUtil.getNames();
		
		for (String string : fromDb) {
			if(string.startsWith("A")) {
				newList.add(string);
			}
			
		}
		return newList;
	}
}
