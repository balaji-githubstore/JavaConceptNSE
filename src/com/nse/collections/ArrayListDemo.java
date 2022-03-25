package com.nse.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
		System.out.println(colors.size());
		
		System.out.println(colors.get(1));
		
		colors.remove("yellow");
		
		System.out.println(colors);
		
		System.out.println(colors.size());
		
		for(String color : colors)
		{
			System.out.println(color);
		}
	}

}
