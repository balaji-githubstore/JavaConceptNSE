package com.nse.students;

public class Student {
	
	public int studentId;
	public String studentName;
	public String studentMailId;
	public double studentPercentage;
	public static String schoolName;
	
	
	public static void printStudentDetail(Student stu)
	{
		System.out.println(stu.studentId);
		System.out.println(stu.studentName);
		System.out.println(stu.studentMailId);
		System.out.println(stu.studentPercentage);
		System.out.println(Student.schoolName);
		System.out.println("****************************************");
	}
	
	

}
