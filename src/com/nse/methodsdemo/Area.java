package com.nse.methodsdemo;

public class Area {
	
	public static double areaOfCircle(double r) {
		double area = 3.14 * r * r;
		return area;
	}

	public double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}

	public static String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	public static void classDescription()
	{
		System.out.println("this class contains all area related formulae!!");
	}
	
	public void printAreaOfSquare()
	{
		
	}
	
	
}
