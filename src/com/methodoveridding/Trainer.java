package com.methodoveridding;

public class Trainer extends Student {
	double salary=40000;
	String subject="Software Testing";
	
	void display()
	{
		super.display();
		System.out.println("salary of trainer:"+salary);
		System.out.println("subject:"+subject);
	}

}
