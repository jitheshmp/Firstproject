//Multiple Inheritance
package com.interfac;

public class Test_AB implements A,B {
	
	public void print()
	{
		System.out.println("hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_AB obj=new Test_AB();
		obj.print();
		obj.show();
	}

}
