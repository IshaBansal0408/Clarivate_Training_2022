package com.ty.controller;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MainConfigClass;
import com.ty.dao.ProductDao;
import com.ty.dto.ProductDto;

public class TestProductUpdatenDeleteData {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MainConfigClass.class);

		ProductDto pdto1 = new ProductDto();
		pdto1.setpID(2);
		pdto1.setpName("Shampoo");
		pdto1.setpPrice(300);

		ProductDao pdao1 = (ProductDao) aC.getBean("productDao");
		int res = pdao1.insertProduct(pdto1);
		if (res != 0) {
			System.out.println(res + " Product Added Successfully!");
		} else {
			System.out.println("Product not Added.");
		}

		List<Map<String, Object>> pList = pdao1.getAllProducts();
		for (Map<String, Object> ptemp : pList) {
			System.out.println("Product's Id : " + ptemp.get("pID"));
			System.out.println("Product's Name : " + ptemp.get("pName"));
			System.out.println("Product's Price : " + ptemp.get("pPrice"));
			System.out.println("=================================================");
		}

		res = pdao1.updateProduct(pdto1, 1);
		if (res != 0) {
			System.out.println(res + " Product Updated Successfully!");
		} else {
			System.out.println("Product not Updated.");
		}

		pList = pdao1.getAllProducts();
		for (Map<String, Object> ptemp : pList) {
			System.out.println("Product's Id : " + ptemp.get("pID"));
			System.out.println("Product's Name : " + ptemp.get("pName"));
			System.out.println("Product's Price : " + ptemp.get("pPrice"));
			System.out.println("=================================================");
		}

		res = pdao1.deleteProduct(2);
		if (res != 0) {
			System.out.println(res + " Product Deleted Successfully!");
		} else {
			System.out.println("Product not Deleted.");
		}

		pList = pdao1.getAllProducts();
		for (Map<String, Object> ptemp : pList) {
			System.out.println("Product's Id : " + ptemp.get("pID"));
			System.out.println("Product's Name : " + ptemp.get("pName"));
			System.out.println("Product's Price : " + ptemp.get("pPrice"));
			System.out.println("=================================================");
		}
	}
}
