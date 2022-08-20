package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.StudentDto;

public class StudentController06 {
	public static void main(String[] args) {
		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");
		EntityManager eM1 = emF1.createEntityManager();
//		EntityTransaction eT1 = eM1.getTransaction();

		Query q1 = eM1.createQuery("select s from StudentDto s");
//		select * from StudentDto; (MySQL method)
//		But in Hibernate we use HQL(hibernate Query Language)
		
		List<StudentDto> l1 = q1.getResultList();
		for(StudentDto stemp : l1) {
			System.out.println("Student ID : "+stemp.getStuId());
			System.out.println("Student Name : "+stemp.getStuName());
			System.out.println("Student Phone No : "+stemp.getStuPh());
			System.out.println("Student Age : "+stemp.getStuAge());
		}
	}

}
