package com.nse.oops;

class Doctor {
	public String name;
	public int docId;
	
	public void hospitalName()
	{
		System.out.println("HR HOS");
	}

	public void treatment() {
		System.out.println("treats patient for fever, cold");
	}

}

class Dentist extends Doctor {
	public void treatment() {
		System.out.println("treats patient for tooth related issues");
	}
}

class Vetenarian extends Doctor {

	public void treatment() {
		System.out.println("treating animal");
	}
}

class Xtype extends Doctor
{
	public void treatment() {
		System.out.println("own defn");
	}
	
	public void hospitalName()
	{
		System.out.println("Contract type ");
	}
}

public class InheritanceDemo2 {

	public static void payroll(Doctor d) {
		System.out.println(d.name + " gets salary ");
	}

	public static void main(String[] args) {
		
		Doctor d=new Doctor();
		d.treatment();

		Doctor obj = new Dentist();
		obj.treatment();

		Doctor obj1 = new Vetenarian();
		obj1.treatment();
		
		Doctor x= new Xtype();
		x.treatment();
		
		
		d.hospitalName();
		obj.hospitalName();
		
		x.hospitalName();
		
		InheritanceDemo2.payroll(d);
		InheritanceDemo2.payroll(obj);
		InheritanceDemo2.payroll(obj1);
	}
}
