package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MyConfigClass;
import com.ty.dto.MobileDto;

public class TestMobileSimController {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MyConfigClass.class);
		MobileDto m1 = (MobileDto) aC.getBean("mobileDto");
		m1.mobileInfo();
	}

}
