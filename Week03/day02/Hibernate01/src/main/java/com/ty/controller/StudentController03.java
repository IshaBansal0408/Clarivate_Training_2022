package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.StudentDto;

public class StudentController03 {
	public static void main(String[] args) {
		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");
		EntityManager eM1 = emF1.createEntityManager();

		// (<class>,<primaryKey>)
		StudentDto sf1 = eM1.find(StudentDto.class, 1);
		if (sf1 != null) {
			System.out.println("Student Name => " + sf1.getStuName());
		} else {
			System.out.println("Not Found");
		}
	}
}
