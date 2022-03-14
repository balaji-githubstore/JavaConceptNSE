package com.nse.loops;

public class Loops1Demo {

	public static void main(String[] args) {

		// 1 to 10
//		for (int i = 1; i <= 10; i++) 
//		{
//			System.out.println(i);
//		}

		int[] numbers = { 45, 99, 55, 12, 4, 3, 35, 85, 46, 88, 28, 98, 29 };

		int size = numbers.length;
		System.out.println(size);

		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i] == 99) {
				System.out.println("Present " + numbers[i]);
				break;
			}

		}

	}

}
