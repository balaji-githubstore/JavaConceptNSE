package com.nse.employeedb;

public abstract class Employee {

	private int empId;
	private String empName;
	private String empType; 
	
	public Employee()
	{
		System.out.println("Employee Constructor");
	}
	
	
	public String getEmployeeName()
	{
		return empName;
	}
	
	public abstract void calculateSalary();	
}




