package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.AadharDto;
import com.ty.dto.PersonDto;

public class One2OneBiGetAll {
	public static void main(String[] args) {
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();

		Query q1 = eM.createQuery("Select p from PersonDto p");
		List<PersonDto> pList = q1.getResultList();
		for (PersonDto ptemp : pList) {
			System.out.println("Person's Id : " + ptemp.getId());
			System.out.println("Person's First Name : " + ptemp.getFname());

			AadharDto atemp = ptemp.getAadhar();
			System.out.println("Person's Aadhar Number : " + atemp.getNumber());

		}

		System.out.println("--------------------------------------------------------");

		q1 = eM.createQuery("Select a from AadharDto a");
		List<AadharDto> aList = q1.getResultList();
		for (AadharDto atemp : aList) {

			System.out.println("Person's Aadhar Number : " + atemp.getNumber());

			PersonDto ptemp = atemp.getPerson();
			System.out.println("Person's Id : " + ptemp.getId());
			System.out.println("Person's First Name : " + ptemp.getFname());

		}
	}

}
