package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.StudentDto;

public class StudentController07 {
	public static void main(String[] args) {
		EntityManagerFactory emF1 = Persistence.createEntityManagerFactory("isha");
		EntityManager eM1 = emF1.createEntityManager();

//		Position Parameters
		Query q1 = eM1.createQuery("select s from StudentDto s where s.stuName=?1");
		q1.setParameter(1, "Geeta");
		List<StudentDto> l1 = q1.getResultList();
		for (StudentDto stemp : l1) {
			System.out.println("Student ID : " + stemp.getStuId());
			System.out.println("Student Name : " + stemp.getStuName());
			System.out.println("Student Phone No : " + stemp.getStuPh());
			System.out.println("Student Age : " + stemp.getStuAge());
		}
//		Name Parameter
		q1 = eM1.createQuery("select s from StudentDto s where s.stuName=:name");
		q1.setParameter("name", "Geeta");

		l1 = q1.getResultList();
		for (StudentDto stemp : l1) {
			System.out.println("Student ID : " + stemp.getStuId());
			System.out.println("Student Name : " + stemp.getStuName());
			System.out.println("Student Phone No : " + stemp.getStuPh());
			System.out.println("Student Age : " + stemp.getStuAge());
		}
	}

}
