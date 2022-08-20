package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.StudentDto;

public class StudentController02 {

	public static void main(String[] args) {

		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");
		EntityManager eM1 = emF1.createEntityManager();
		EntityTransaction eT1 = eM1.getTransaction();

		StudentDto s1 = new StudentDto();
		s1.setStuId(1);
		s1.setStuName("Geeta");
		s1.setStuAge(14);
		s1.setStuPh(1234887976);

		eT1.begin(); //begin transaction
		eM1.persist(s1); //store data
		eT1.commit();	//commit the changes
	}

}
