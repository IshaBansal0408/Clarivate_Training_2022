package com.ty.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SingerDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // only for primary key ( give value automatically)
	private int id;
	private String name;
	private String location;
	private String instahandle;

	@OneToMany
	private List<SongDto> listSong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInstahandle() {
		return instahandle;
	}

	public List<SongDto> getListSong() {
		return listSong;
	}

	public void setListSong(List<SongDto> listSong) {
		this.listSong = listSong;
	}

	public void setInstahandle(String instahandle) {
		this.instahandle = instahandle;
	}

}
