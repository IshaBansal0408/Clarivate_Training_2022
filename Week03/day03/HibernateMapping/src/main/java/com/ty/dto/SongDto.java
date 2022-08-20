package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SongDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // only for primary key ( give value automatically)
	private int id;
	private String songName;
	private double songYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public double getSongYear() {
		return songYear;
	}

	public void setSongYear(double songYear) {
		this.songYear = songYear;
	}

}
