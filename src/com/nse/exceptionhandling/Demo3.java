package com.nse.exceptionhandling;

public class Demo3 {

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
		catch (ArithmeticException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			throw ex;
		}
		
	
		System.out.println("--end--");
	}
	
}
