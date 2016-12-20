//Parameterized Constructor
package com.constructor;

public class PC {

	int Empid;
	String Empname;
	PC(int i,String n)
	{
		Empid=i;
		Empname=n;
	}
	void display()
	{
		System.out.println(Empid+" "+Empname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PC y=new PC(500,"Ramesh");
		y.display();

	}

}
