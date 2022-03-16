package com.nse.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	public String companyName;
	

	public static void printEmployeeDetail(Employee emp)
	{
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(emp.companyName);
		System.out.println("----------------------------------");
	}
	
	
}
