package com.ty.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDto {
	@Value(value="1")
	int eId;
	@Value(value="Kiran")
	String eName;
	@Value(value="950000")
	double eSalary;
	
	public void display() {
		System.out.println("Employee's Id : "+this.eId);
		System.out.println("Employee's Name : "+this.eName);
		System.out.println("Employee's Salary : "+this.eSalary);
	}
}
