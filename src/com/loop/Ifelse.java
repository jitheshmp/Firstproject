package com.loop;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Marks=95;
		char Grade;
		if(Marks>=90)
		{
			Grade='A';
		}
		else if(Marks>=80)
		{
			Grade='B';
		}
		else if(Marks>=70)
		{
			Grade='C';
		}
		else if(Marks>=60)
		{
			Grade='D';
		}
		else
		{
			Grade='F';
		}
		System.out.println("Grade="+Grade);

	}

}
