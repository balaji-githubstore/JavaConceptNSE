package com.nse.methodsdemo;

public class MethodsDemo {

	public static void main(String[] args) {

		int radius = 10;

		double res = Area.areaOfCircle(10.2);
		System.out.println(res);

		res = Area.areaOfCircle(100);
		System.out.println(res);

		Area obj = new Area();

		res = obj.areaOfTriangle(25, 1);
		System.out.println(res);

		obj.printAreaOfSquare();

		String name = Area.getAuthorName();
		System.out.println(name);

		Area.classDescription();

	}

}
