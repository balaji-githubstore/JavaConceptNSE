package com.nse.exceptionhandling;

import com.nse.employee.Employee;

public class Demo4 {
	
	public static void main(String[] args) {
		
		int a=10;
		double b=20;
		String c="hello";
		
		Employee e=new Employee();
		
		Object z=a; //boxing
		z=b;
		z=c;
		z=e;
		
		String res=(String) z; //unboxing
		System.out.println(res);
		
		Object[] arr=new Object[5];
		arr[0]=10;
		arr[1]=10.2;;
		arr[3]=new Employee();
		arr[2]="hello";
	}

}
