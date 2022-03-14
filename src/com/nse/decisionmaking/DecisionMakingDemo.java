package com.nse.decisionmaking;

public class DecisionMakingDemo {

	public static void main(String[] args) {

		int x = -90;

		if (x > 0) {
			System.out.println("The given value is positive " + x);
		} else if (x == 0) {
			System.out.println("it's zero!!");
		} else {
			System.out.println("The given value is negative " + x);
		}

		int pageNumber = 190;

		if (pageNumber >= 100) {
			if (pageNumber <= 200) {
				System.out.println("yes! it's between 100 and 200!!");
			}
		}

		if (pageNumber >= 100 && pageNumber <= 200) {
			System.out.println("yes! it's between 100 and 200!!");
		}

		String browser = "EDGE";

		if (browser == "ff" || browser == "FF") {
			System.out.println("Launch Firefox");
		} else if (browser == "edge" || browser == "EDGE") {
			System.out.println("launch edge");
		} else {
			System.out.println("launch chrome");
		}

		int y = -20;

		if (y > 0) {
			System.out.println("Positive");
			System.out.println(y);
		}

	}
}
