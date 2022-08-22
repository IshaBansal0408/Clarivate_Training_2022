package com.ty.dto;

public class SongClassDto01 {
	int id;
	int sName;
	long viewsCnt;

	public SongClassDto01(int id, int sName, long viewsCnt) {
		this.id = id;
		this.sName = sName;
		this.viewsCnt = viewsCnt;
	}

	public void display() {
		System.out.println("Id of the Song : " + this.id);
		System.out.println("Name of the song : " + this.sName);
		System.out.println("Number of Views : " + this.viewsCnt);
	}

}
