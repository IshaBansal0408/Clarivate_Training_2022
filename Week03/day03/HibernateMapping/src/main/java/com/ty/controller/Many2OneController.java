package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.ActorDto;
import com.ty.dto.MovieDto;

public class Many2OneController {
	public static void main(String[] args) {
		
		MovieDto mov1 = new MovieDto();
		mov1.setmName("Uncharted");
		mov1.setmRating(8);
		mov1.setmYear(2022);
		
		ActorDto a1 = new ActorDto();
		a1.setaName("Tom  Holland");
		a1.setaRole("Nathan Drake");
		ActorDto a2 = new ActorDto();
		a2.setaName("Mark Wahlberg");
		a2.setaRole("Victor Sullivan");
		ActorDto a3 = new ActorDto();
		a3.setaName("Antonio Banderas");
		a3.setaRole("Santiago Moncada");
		ActorDto a4 = new ActorDto();
		a4.setaName("Steven Waddington");
		a4.setaRole("The Scotsman");
		
		a1.setMovie(mov1);
		a2.setMovie(mov1);
		a3.setMovie(mov1);
		a4.setMovie(mov1);
		
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		eT.begin();
		eM.persist(mov1);
		eM.persist(a1);
		eM.persist(a2);
		eM.persist(a3);
		eM.persist(a4);
		eT.commit();
		
	}

}
