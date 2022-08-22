package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.UserClassDto;

public class UserClassController01 {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		UserClassDto u1 = (UserClassDto) aC.getBean("user01");
		u1.display();
	}

}
