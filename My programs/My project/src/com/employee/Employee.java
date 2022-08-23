package com.employee;

public class Employee {
	
	private int employee_id = 856389;
	String employee_name = "Sriraksha";
	protected int employee_number = 10;
	public int employee_notice = 4;
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("Employee ID is : " + e.employee_id);
		System.out.println(e.employee_name);
		System.out.println(e.employee_number);
		System.out.println(e.employee_notice);
		
	}

}
