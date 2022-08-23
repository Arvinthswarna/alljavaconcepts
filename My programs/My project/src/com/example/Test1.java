package com.example;

public class Test1{
	static int num = 20;
	static final int num1=300;
	static int res = 50;
	static {
		System.out.println("msg from static block");
		num = num + 30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("msg from main");
		System.out.println("value is: " + num);
		num = 30;
		System.out.println(num);
		//num1 = 40;
		System.out.println(Test1.res);
		

	}

}
