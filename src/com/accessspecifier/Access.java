package com.accessspecifier;

public class Access {
	public void test1()
	{
		System.out.println("public test1()");
	}
	protected void test2()
	{
		System.out.println("protected test2()");
	}
	void test3()
	{
		System.out.println("test3()");
	}
	private void test4()
	{
		System.out.println("Private test4()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access y=new Access();
		y.test4();

	}

}
