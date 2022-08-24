package com.ty;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonBeanClassGetAll {

	public static void main(String[] args) {
		
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspringjdbc.xml");
		PersonBeanClass p1 = (PersonBeanClass) aC.getBean("emp01");
		
		List<Map<String, Object>> eList = p1.getAllPerson();
		for(Map<String, Object> etemp: eList) {
			System.out.println("Employee's ID : "+etemp.get("empID"));
			System.out.println("Employee's Name : "+etemp.get("empName"));
			System.out.println("Employee's Salary : "+etemp.get("empSalary"));
			System.out.println("---------------------------------------------------");
		}

	}
}
