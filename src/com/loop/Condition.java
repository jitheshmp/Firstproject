package com.loop;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double accBal=5000.00;
		double amt=1000.00;
		System.out.println("Welcome to SBI ATM");
		if(amt<accBal)
		{
			accBal=accBal-amt;
			System.out.println("Withdraw Success,Visit Again!!");
		}
		else
		{
			System.out.println("insufficient Balance,Try later");
		}
		System.out.println("current balance is:"+accBal);
		System.out.println("Thanks for using SBI ATM ");
	}

}
