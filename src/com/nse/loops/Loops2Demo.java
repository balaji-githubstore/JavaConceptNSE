package com.nse.loops;

import java.util.ArrayList;

public class Loops2Demo {

	public static void main(String[] args) {
		
		int[] numbers = { 24,45, 99, 55, 12, 4, 3, 35, 85, 46, 88, 28, 98, 29 };
		
		for(int val : numbers)
		{
			if(val==99)
			{
				System.out.println(val);
				break;
			}
			
		}
		
		

		String[] colors= {"red","blue","green","yellow"};
		
		for(String x : colors )
		{
			System.out.println(x);
		}
		
	}

}
