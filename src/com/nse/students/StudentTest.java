package com.nse.students;

import com.nse.employee.Employee;

public class StudentTest {

	public static void main(String[] args) {
		
		Student.schoolName = "Global School";
//		Employee e=new Employee();

		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		
		
	
		stu1.studentName = "Jack";
		stu1.setStudentMailId("jack@gmail.com");	
		stu1.setStudentPercentage(-45.5);
		
		stu2.studentName="Peter";
		stu2.setStudentMailId("peter@gmail.com");
		
		stu2.setStudentPercentage(99);

		
		stu1.displayStudentDetail();
		stu2.displayStudentDetail();
		stu3.displayStudentDetail();
		
		String mailid=stu2.getStudentMailId();
		System.out.println(mailid);
		
		
//		Student.printStudentDetail(stu1);
//		Student.printStudentDetail(stu2);
//		Student.printStudentDetail(stu3);
		
		
	}

}
