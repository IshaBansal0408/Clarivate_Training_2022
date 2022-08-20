package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.ty.dto.SingerDto;
import com.ty.dto.SongDto;

public class One2ManyGetAll {
	public static void main(String[] args) {
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("isha");
		EntityManager eM = emF.createEntityManager();

		Query q1 = eM.createQuery("Select s from SingerDto s");
		List<SingerDto> lp = q1.getResultList();

		for (SingerDto stemp : lp) {
			System.out.println("Singer's ID : " + stemp.getId());
			System.out.println("Singer's Name : " + stemp.getName());
			System.out.println("Singer's Location : " + stemp.getLocation());
			System.out.println("Singer's Insta Handle : " + stemp.getInstahandle());
			System.out.println();
			List<SongDto> songTempList = stemp.getListSong();
			for (SongDto sotemp : songTempList) {
				System.out.println("Song's ID : " + sotemp.getId());
				System.out.println("Song's Name : " + sotemp.getSongName());
				System.out.println("Song's Release Year : " + sotemp.getSongYear());
			}
			System.out.println();
			System.out.println("---------------------------------------------------------");
		}

	}
}
