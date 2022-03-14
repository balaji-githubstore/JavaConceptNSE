package com.nse.students;

public class StudentTest {

	public static void main(String[] args) {

		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();

		stu1.studentId = 1001;
		stu1.studentName = "Jack";
		stu1.studentMailId = "jack@gmail.com";
		stu1.studentPercentage = 45.2;
		stu1.schoolName = "Global School";
		
		stu2.studentId=1002;
		stu2.studentName="Peter";
		stu2.studentMailId = "peter@gmail.com";
		stu2.studentPercentage = 85.2;
		stu2.schoolName = "Global school";
		

		Student.printStudentDetail(stu1);
		
		Student.printStudentDetail(stu2);

		Student.printStudentDetail(stu3);
	}

}
