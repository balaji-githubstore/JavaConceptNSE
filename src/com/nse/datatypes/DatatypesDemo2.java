package com.nse.datatypes;

public class DatatypesDemo2 {
	
	public static void main(String[] args) {
		
		// 10,20,30,40,50
		int[] numbers=new int[5]; //32 bits * 5 memory 
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
//		numbers[4]=50;
		
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		double[] salaries=new double[3]; //64*3 bits of memory 
		salaries[0]=10;
		//salaries[1]=20.2;
		//salaries[2]=30.25;
		System.out.println(salaries[0]);
		System.out.println(salaries[1]);
		System.out.println(salaries[2]);
		
		//create String array to store red, green, yellow 
		String[] colours = new String[3];
		colours[0] = "red";
		colours[1] = "yellow";
		colours[2] = "green";
		
		System.out.println(colours.length);
		System.out.println(colours[0]);
		System.out.println(colours[1]);
		System.out.println(colours[2]);
		
		int[] marks= {10,50,65,55};
		
		//size of the array
		System.out.println(marks.length);
		System.out.println(marks[0]);
		
		System.out.println("The mark of 1st student "+marks[0]);
		System.out.println("The mark of 2nd student "+marks[1]);
		
		//task 1
		char[] letters=new char[3]; //16bit *3 will be allocated
		//check default value for char
		
		//task2
		//int base=25; int height=1;
		//calculate - area of triange 
		int base=25; int height=1;
		double areaOfTriangle = (double)(base * height) / 2;
		
		System.out.println("Area of Triangle: " + areaOfTriangle);

	}
}


