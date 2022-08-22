package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.StudentDto;

public class TestStudentSetterValueAnnotate {

	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		StudentDto s1 = (StudentDto) aC.getBean("studentDto");
		s1.display();
	}

}
