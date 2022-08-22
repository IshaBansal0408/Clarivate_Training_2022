package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext01 {
	public static void main(String[] args) {
//		Create an Application context object
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		PenClass01 p1 = (PenClass01) applicationContext.getBean("mypen01");
		p1.write();
	}

}
