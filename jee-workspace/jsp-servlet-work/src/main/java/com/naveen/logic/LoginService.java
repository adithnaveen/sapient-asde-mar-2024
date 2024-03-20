package com.naveen.logic;

import java.util.Arrays;
import java.util.List;

import com.naveen.beans.Employee;

public class LoginService {
	List<String> employees; 

	// assuming you are connecting with dao layer 
	
	public List<Employee> getEmployees() {
		return  
		Arrays.asList(new Employee(101, "Harish", 1234), 
				 new Employee(102, "Vinayak", 1000), 
				 new Employee(103, "Sivam", 2000),
				 new Employee(104, "Sanyam", 2200),
				 new Employee(105, "Vedant", 3322)
				 ); 
	}
}
