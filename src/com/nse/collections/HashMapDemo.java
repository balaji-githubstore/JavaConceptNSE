package com.nse.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> rowMap1=new HashMap<String, String>();
		
		rowMap1.put("firstname", "john");
		rowMap1.put("age","78");
		rowMap1.put("salary", "9000");
		rowMap1.put("firstname", "peter");
		
		System.out.println(rowMap1.get("firstname"));
		System.out.println(rowMap1.get("age"));
		System.out.println(rowMap1.get("salary"));
		
		//rowMap1.remove("age");
		
		
		
		for(String key : rowMap1.keySet())
		{
			System.out.println(key);
			System.out.println(rowMap1.get(key));
		}
	
	}
}
