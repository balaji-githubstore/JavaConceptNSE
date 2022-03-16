package com.nse.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="NSE";
		
		Employee emp1=new Employee();
		
		Employee emp2=new Employee();
		
		Employee emp3=new Employee();
		
		emp1.empId=1001;
		emp1.empName="Jack";
		emp1.empSalary=4500;
	
		
		emp2.empId=1002;
		emp2.empName="Peter";
		emp2.empSalary=5000;


		
		Employee.printEmployeeDetail(emp1); //pass by reference
		
		Employee.printEmployeeDetail(emp2);
		
		Employee.printEmployeeDetail(emp3);
		
		
		
		

	}

}
