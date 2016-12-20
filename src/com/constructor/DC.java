//Default Constructor
package com.constructor;


public class DC {

	String Department;
	int Empid;
	String Empname;
	 void display()
	 {
		System.out.println(Empid+" "+Empname+" "+Department); 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DC x=new DC();
		x.display();
	}

}
