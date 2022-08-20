package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.AadharDto;
import com.ty.dto.PersonDto;

public class One2OneGetAll {
	public static void main(String[] args) {
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();
		
		Query q1 = eM.createQuery("Select p from PersonDto p");
		List<PersonDto> lp = q1.getResultList();
		for(PersonDto ptemp : lp) {
			System.out.println("Person's ID : "+ptemp.getId());
			System.out.println("Person's First Name : "+ptemp.getFname());
			System.out.println("Person's Last Name : "+ptemp.getLname());
			System.out.println("Person's Gender : "+ptemp.getGender());
			System.out.println("Person's Location : "+ptemp.getLocation());
			System.out.println("Person's Phone Number : "+ptemp.getPhone());
			System.out.println();
			AadharDto atemp = ptemp.getAadhar();
			System.out.println("Person's Aadhar Id : "+atemp.getId());
			System.out.println("Person's Aadhar Number : "+atemp.getNumber());
			System.out.println("Person's Father Name : "+atemp.getFatherName());
			System.out.println("-----------------------------------------------------");
		}
	}

}
