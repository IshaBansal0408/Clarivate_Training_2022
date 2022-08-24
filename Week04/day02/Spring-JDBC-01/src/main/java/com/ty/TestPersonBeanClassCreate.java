package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonBeanClassCreate {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspringjdbc.xml");
		PersonBeanClass p1 =  (PersonBeanClass) aC.getBean("emp01");
		p1.createTable();
	}
}
