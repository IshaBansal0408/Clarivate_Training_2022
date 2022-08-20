package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.ActorDto;
import com.ty.dto.MovieDto;

public class Many2OneGetAll {
	public static void main(String[] args) {
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();

		Query q1 = eM.createQuery("Select a from ActorDto a");
		List<ActorDto> la = q1.getResultList();
		
		for(ActorDto atemp:la) {
			System.out.println("Actor's Id : "+atemp.getaId());
			System.out.println("Actor's Name : "+atemp.getaName());
			System.out.println("Actor's Role : "+atemp.getaRole());
			MovieDto mtemp = atemp.getMovie();
			System.out.println();
			System.out.println("Movie's Id : "+mtemp.getmId());
			System.out.println("Movie's Name : "+mtemp.getmName());
			System.out.println("Movie's Rating : "+mtemp.getmRating());
			System.out.println("Movie's Year : "+mtemp.getmYear());
			System.out.println("-------------------------------------------");
		}
		
	}

}
