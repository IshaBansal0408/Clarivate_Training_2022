package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.StudentDto;

public class StudentController04 {
	public static void main(String[] args) {
		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");
		EntityManager eM1 = emF1.createEntityManager();
		EntityTransaction eT1 = eM1.getTransaction();

		StudentDto sf1 = eM1.find(StudentDto.class, 1);
		sf1.setStuName("Harish");

		eT1.begin(); // begin transaction
		eM1.merge(sf1); // update data
		eT1.commit(); // commit the changes
	}

}
