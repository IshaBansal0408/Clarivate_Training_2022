package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.EmployeeDto;

public class TestEmployeeValueAnnotate {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		EmployeeDto e1 = (EmployeeDto)aC.getBean("employeeDto");
		e1.display();
	}

}
