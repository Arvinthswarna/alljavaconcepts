package com.example;

import accessmodifiers.*;


public class Test33 extends Test3 {
	// protected modifier can be acccessible outside the package when extends is used
	
	public static void main(String[] args) {
		
		Test33 obj = new Test33();
		System.out.println(obj.num);
	
	}
	}
