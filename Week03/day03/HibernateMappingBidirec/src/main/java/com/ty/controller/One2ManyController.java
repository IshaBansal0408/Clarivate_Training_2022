package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.SingerDto;
import com.ty.dto.SongDto;

public class One2ManyController {
	public static void main(String[] args) {
		SingerDto sing1 = new SingerDto();
		sing1.setName("Taylor Swift");
		sing1.setLocation("Nashville");
		sing1.setInstahandle("@tyalorswift");

		SongDto song1 = new SongDto();
		song1.setSongName("Look What You Made Me Do");
		song1.setSongYear(2017);

		SongDto song2 = new SongDto();
		song2.setSongName("Ready For It?");
		song2.setSongYear(2017);

		SongDto song3 = new SongDto();
		song3.setSongName("22");
		song3.setSongYear(2012);

		SongDto song4 = new SongDto();
		song4.setSongName("Back to December");
		song4.setSongYear(2010);

		List<SongDto> songList = new ArrayList<SongDto>();
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		sing1.setListSong(songList);
		
		song1.setSinger(sing1);
		song2.setSinger(sing1);
		song3.setSinger(sing1);
		song4.setSinger(sing1);

		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		eT.begin();
		eM.persist(sing1);
		eM.persist(song1);
		eM.persist(song2);
		eM.persist(song3);
		eM.persist(song4);
		eT.commit();
	}

}
