package com.nse.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
//		Employee e= Employee.getEmployeeInstance();
		
		Employee.companyName="NSE";
		
		Employee emp1=new Employee(10.2);
		Employee emp2=new Employee(102);	
		Employee emp3=new Employee(103);
		
		emp1.empId=1001;
		emp1.empName="Jack";
		emp1.empSalary=4500;
		
		emp2.empId=1002;
		emp2.empName="Peter";
		emp2.empSalary=5000;

		
//		Employee.printEmployeeDetail(emp1); //pass by reference
//		Employee.printEmployeeDetail(emp2);
//		Employee.printEmployeeDetail(emp3);
		
		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();
		
		Employee[] employees=new Employee[3];
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		
		
		
	}

}
