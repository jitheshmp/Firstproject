//Method Overloading with Changing the datatype
package com.method;

public class Demo2 {
	
	void Sum(int a,double b)
	{
		System.out.println(a+b);
	}
	void Sum(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj=new Demo2();
		obj.Sum(10, 20.33);
		obj.Sum(14.433, 15.233);
	}

}
