package com.nse.decisionmaking;

public class GradeDemo {

	public static void main(String[] args) {

		int mark = 2190;

		if (mark < 0 || mark > 100) {
			System.out.println("Provider Mark between 0 to 100");
		} else if (mark >= 90) {
			System.out.println("A");
		} else if (mark >= 80 && mark <= 89) {
			System.out.println("B");
		} else if (mark >= 60 && mark <= 79) {
			System.out.println("C");
		} else if (mark >= 45 && mark <= 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
