package com.nse.employeedb;

public class PermanentEmployee extends Employee {
	private double pf = 0.12;
	public PermanentEmployee()
	{
		System.out.println("PermanentEmployee Constructor");
	}
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println(30 * 2000 * pf);
	}
}
