package com.nse.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
	
		
		Employee emp1=new Employee();
		
		Employee emp2=new Employee();
		
		Employee emp3=new Employee();
		
		emp1.empId=1001;
		emp1.empName="Jack";
		emp1.empSalary=4500;
		emp1.companyName="NSE";
		
		
		
		System.out.println(emp1);
		System.out.println(emp1.empId);
		
		System.out.println(emp2.empId);
		
		Employee.printEmployeeDetail(emp1); //pass by reference
		
		Employee.printEmployeeDetail(emp2);
		
		Employee.printEmployeeDetail(emp3);
		
		
		
		

	}

}
