package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.AadharDto;
import com.ty.dto.PersonDto;

public class One2OneController {
	public static void main(String[] args) {
		
		PersonDto p1 = new PersonDto();
		p1.setFname("Jiya");
		p1.setLname("Verma");
		p1.setGender("Female");
		p1.setLocation("Haridwar");
		p1.setPhone(9899674341l);
		
		AadharDto a1 = new AadharDto();
		a1.setFatherName("Ganesh");
		a1.setNumber(123487650977l);
		
		p1.setAadhar(a1);
		
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		eT.begin();
		eM.persist(p1);
		eM.persist(a1);
		eT.commit();
	}

}
