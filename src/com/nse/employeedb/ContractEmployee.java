package com.nse.employeedb;

public class ContractEmployee extends Employee {
	double perHourCost = 500;
	public ContractEmployee()
	{
		System.out.println("ContractEmployee Constructor");
	}
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println(8 * 30 * perHourCost);
	}
}
