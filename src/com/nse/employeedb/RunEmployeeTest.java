package com.nse.employeedb;

public class RunEmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e=new PermanentEmployee();
		e.calculateSalary();
		
		e=new ContractEmployee();
		e.calculateSalary();
	}

}
