//method overloading with changing the number of arguments
package com.method;

public class Demo1 {
	void Sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void Sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Demo1 rv=new Demo1();
		rv.Sum(10,20);
		rv.Sum(10, 20, 30);
	}
}
