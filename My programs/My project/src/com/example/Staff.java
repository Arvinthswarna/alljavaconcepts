package com.example;

import com.employee.*;

public class Staff extends Employee {
	public static void main(String[] args) {
		Employee e = new Employee();
		//System.out.println(e.employee_id);
       // System.out.println(e.employee_name);
        Staff s1 = new Staff();
        System.out.println(s1.employee_number);
        System.out.println(s1.employee_notice);
	}
	

}
