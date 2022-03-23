package com.nse.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId)
	{
		
		this.empId=empId;
		System.out.println("Browser launch");
		System.out.println("Object created!!");
	}
	public Employee(double empId)
	{
		
	}
	public Employee(int empId,double b)
	{
		
	}
	public Employee(double a,int b)
	{
		
	}
	
//	public static void printEmployeeDetail(Employee emp)
//	{
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
//		System.out.println(emp.empSalary);
//		System.out.println(Employee.companyName);
//		System.out.println("----------------------------------");
//	}
	
	public void printEmployeeDetail()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("----------------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee(105);
		return e;
	}
	
}

