package com.nse.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> mapCompany1=new HashMap<Integer, String>();
		mapCompany1.put(101,"john");
		mapCompany1.put(102, "peter");
		
		System.out.println(mapCompany1.get(102));
		
		HashMap<Integer, String> mapCompany2=new HashMap<Integer, String>();
		mapCompany2.put(1001,"lal");
		mapCompany2.put(1002, "paul");
		
		System.out.println(mapCompany2.get(1002));
		
		ArrayList<HashMap<Integer, String>> lists=new ArrayList<HashMap<Integer, String>>();
		
		lists.add(mapCompany1);
		lists.add(mapCompany2);
		
		System.out.println(lists.get(0).get(101));
		System.out.println(lists.get(1).get(1001));
	}
}



