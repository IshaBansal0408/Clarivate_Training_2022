package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.StudentDto;
import com.ty.dto.SubjectDto;

public class Many2ManyController {
	public static void main(String[] args) {
		StudentDto stu1 = new StudentDto();
		stu1.setsName("Bhavan");
		StudentDto stu2 = new StudentDto();
		stu2.setsName("Heena");
		StudentDto stu3 = new StudentDto();
		stu3.setsName("Paras");
		StudentDto stu4 = new StudentDto();
		stu4.setsName("Rashi");

		SubjectDto sub1 = new SubjectDto();
		sub1.setSubName("Physics");
		SubjectDto sub2 = new SubjectDto();
		sub2.setSubName("Chemistry");
		SubjectDto sub3 = new SubjectDto();
		sub3.setSubName("Biology");
		SubjectDto sub4 = new SubjectDto();
		sub4.setSubName("Computer Science");
		SubjectDto sub5 = new SubjectDto();
		sub5.setSubName("Mathematics");

		List<SubjectDto> subList = new ArrayList<SubjectDto>();
		subList.add(sub1);
		subList.add(sub3);
		subList.add(sub5);

		stu1.setSubjects(subList);

		List<SubjectDto> subList1 = new ArrayList<SubjectDto>();
		subList1.add(sub2);
		subList1.add(sub4);
		subList1.add(sub5);

		stu2.setSubjects(subList1);
		
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		eT.begin();
		eM.persist(stu1);
		eM.persist(stu2);
		eM.persist(sub1);
		eM.persist(sub2);
		eM.persist(sub3);
		eM.persist(sub4);
		eM.persist(sub5);
		eT.commit();

	}

}
