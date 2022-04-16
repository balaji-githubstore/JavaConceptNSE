package com.nse.oops;

class Father {
	public int fAge=65;
	public Father(int fAge)
	{
		this.fAge=fAge;
		System.out.println("FATHER!!");
	}
	public void fatherStyle() {
		System.out.println("Father style");
	}
}

class Son extends Father {
	public int sAge=25;
	
	public Son(int sAge,int fAge)
	{
		super(fAge);
		this.sAge=sAge;
		System.out.println("SON!!");
	}
	
	public void sonStyle() {
		System.out.println("son style");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		Son s=new Son(20, 60);
		s.fatherStyle();
		s.sonStyle();
		
		System.out.println(s.fAge);
		System.out.println(s.sAge);
		
		
	}
}
