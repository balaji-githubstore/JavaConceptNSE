package com.nse.students;

public class Student {

	private int studentId;
	public String studentName;
	private String studentMailId;
	private double studentPercentage;
	public static String schoolName;
	private static int counter=101;

	public Student()
	{
		studentId=counter;
		counter++;
	}
	
	public void setStudentPercentage(double percentage) {
		if(percentage>=0 && percentage<=100)
		{
			studentPercentage = percentage;
		}
		else
		{
			System.out.println("Improper value so default value will be reflected!!");
		}
	}

	public double getStudentPercentage() {
		return studentPercentage;
	}

	public static void printStudentDetail(Student stu) {
		System.out.println(stu.studentId);
		System.out.println(stu.studentName);
		System.out.println(stu.getStudentMailId());
		System.out.println(stu.getStudentPercentage());
		System.out.println(Student.schoolName);
		System.out.println("****************************************");
	}

	public void displayStudentDetail() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(getStudentMailId());
		System.out.println(getStudentPercentage());
		System.out.println(Student.schoolName);
		System.out.println("****************************************");
	}

	public String getStudentMailId() {
		return studentMailId;
	}

	public void setStudentMailId(String studentMailId) {
		if(studentMailId.contains("@") && studentMailId.contains(".com"))
		{
			this.studentMailId = studentMailId;
		}
		else
		{
			System.out.println("Improper mail id!!");
		}
	}

}
