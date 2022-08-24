package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonBeanClassInsert {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspringjdbc.xml");
		PersonBeanClass p1 = (PersonBeanClass) aC.getBean("emp01");
		int res = p1.insertPerson();
		if(res!=0) {
			System.out.println(res + " rows affected!");
		}
		else {
			System.out.println("Data not inserted.");
		}
	}

}
