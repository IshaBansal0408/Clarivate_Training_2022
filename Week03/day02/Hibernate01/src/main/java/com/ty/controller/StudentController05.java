package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.StudentDto;

public class StudentController05 {
	public static void main(String[] args) {
		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");
		EntityManager eM1 = emF1.createEntityManager();
		EntityTransaction eT1 = eM1.getTransaction();
		
		StudentDto sf1 = eM1.find(StudentDto.class, 1);
		
		eT1.begin(); // begin transaction
		eM1.remove(sf1); // remove data
		eT1.commit(); // commit the changes
	}

}
