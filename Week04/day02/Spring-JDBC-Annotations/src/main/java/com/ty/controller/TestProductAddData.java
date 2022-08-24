package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MainConfigClass;
import com.ty.dao.ProductDao;
import com.ty.dto.ProductDto;

public class TestProductAddData {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MainConfigClass.class);

		ProductDto pdto1 = new ProductDto();
		pdto1.setpID(1);
		pdto1.setpName("Soap");
		pdto1.setpPrice(100);

		ProductDao pdao1 = (ProductDao) aC.getBean("productDao");
		int res = pdao1.insertProduct(pdto1);
		if(res!=0) {
			System.out.println(res + " Product Added Successfully!");
		}
		else {
			System.out.println("Product not Added.");
		}
	}

}
