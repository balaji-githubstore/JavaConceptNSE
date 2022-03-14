package com.nse.datatypes;

public class DatatypesDemo {

	public static void main(String[] args) {

		byte a = 100;
		short b = 100;
		int c = 100;
		
		c=a; //implicit conversion // will not lead to data loss
		c=b; 
		
		// percentage - 0 to 100
		// 1000 students --> byte --> 8*1000 = 8000 bits of memory
		// 1000 students --> int -->32*1000=32000 bits of memory

		// 24000 bits of memeory can be saved

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int result = a + b;
		System.out.println(result);

		result = a - b;
		System.out.println(result);

		long d = 787878787887L;

		float e = 10.0f;

		double f = 10.0;

		char letter = '%';
		boolean check = true;

		System.out.println(check);
		System.out.println(letter);

		int radius = 10;

		double res = 3.14 * radius * radius;
		System.out.println(res);

		double x = 10;
		int y = 3;

		double output = x / y;
		System.out.println(output);
		
		float data1 = 10.0f;

		double data2 = 10.123456789;
		System.out.println(data2);
		
//		data2=data1; //34 bit to 64 bit //implicit conversion
		
		data1=(float) data2; //double to float // 64 to 32 bit //explicit conversion // data loss
		
		System.out.println(data1);
		
		
		int xx=10;
		int yy=3;
		
		double zz=xx/(double)yy; // int to double //32 to 64 bit
		
		System.out.println(zz);
		
		System.out.println(xx%yy); //gives remainder // mod operator 
		

		String name="balaji"; //6*16 bits 
		
		System.out.println(name.charAt(1));
		
		System.out.println(22/(double)7);
		
	}

}
