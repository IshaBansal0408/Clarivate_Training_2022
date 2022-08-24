package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MainConfigClass;
import com.ty.dao.ProductDao;

public class TestProductTableCreate {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MainConfigClass.class);
		ProductDao p1 = (ProductDao) aC.getBean("productDao");
		p1.createTable();
	}

}
