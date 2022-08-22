package com.ty.dao;

import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.dto.StudentDto;

@Component
public class StudentDao {
	@Autowired
	EntityManagerFactory eMF;

	public void saveStudent(StudentDto student) {
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		eT.begin();
		eM.persist(student);
		eT.commit();
	}

	public void getAllStudent() {

		EntityManager eM = eMF.createEntityManager();
		Query q1 = eM.createQuery("Select s from StudentDto s");
		List<StudentDto> listStudent = q1.getResultList();
		for (StudentDto stemp : listStudent) {
			System.out.println("Student's Roll No : " + stemp.getsRollNo());
			System.out.println("Student's Name : " + stemp.getsName());
			System.out.println("Student's Marks: " + stemp.getMarks());
			System.out.println("----------------------------------------------");
		}

	}

	public void deleteStudent(StudentDto student) {
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		eT.begin();
		Query q1 = eM.createQuery("Delete from StudentDto s where s.sRollNo=?1");
		q1.setParameter(1, student.getsRollNo());
		q1.executeUpdate();
		eT.commit();
	}

	public void updateStudent(StudentDto student, String nName) {
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		eT.begin();
		Query q1 = eM.createQuery("Update StudentDto s set s.sName=:n where s.sRollNo=?1");
		q1.setParameter("n", nName);
		q1.setParameter(1, student.getsRollNo());
		q1.executeUpdate();
		eT.commit();

	}

}
