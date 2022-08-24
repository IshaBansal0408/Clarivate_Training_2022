package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MainConfigClass;
import com.ty.dao.ProductDao;
import com.ty.dto.ProductDto;

public class TestProductGetSpecific {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MainConfigClass.class);
		ProductDao p1 = (ProductDao) aC.getBean("productDao");
		ProductDto pres = p1.getProdbyID(1);
		if (pres != null) {
			System.out.println("Product's ID : " + pres.getpID());
			System.out.println("Product's Name : " + pres.getpName());
			System.out.println("Product's Price : " + pres.getpPrice());
		}
		else {
			System.out.println("Product Not Found!");
		}
		pres = p1.getProdbyID(4);
		if (pres != null) {
			System.out.println("Product's ID : " + pres.getpID());
			System.out.println("Product's Name : " + pres.getpName());
			System.out.println("Product's Price : " + pres.getpPrice());
		}
		else {
			System.out.println("Product Not Found!");
		}

	}
}
