package com.nse.exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		
		try
		{
			String name="bala";
			System.out.println(name.charAt(1));//new StringIndexOutOfBoundsException
			int[] arr=new int[3];
			System.out.println(arr[5]); //new ArrayIndexOutOfBoundException
			int a=10;
			int b=0;
			
			int c=a/b; //new ArithmeticException()
			
			System.out.println(c);
		}
		catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		finally {
			System.out.println("--end--");
		}
	
		
	}
	
}
