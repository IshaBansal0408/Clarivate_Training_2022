package com.ty.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentController {
	public static void main(String[] args) {

		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");

		System.out.println("EntityManagerFactory successfully created!");
		System.out.println("The object is : " + emF1);

		
	}

}
