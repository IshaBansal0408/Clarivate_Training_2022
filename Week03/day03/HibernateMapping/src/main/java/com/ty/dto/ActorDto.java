 package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActorDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // only for primary key ( give value automatically)
	private int aId;
	private String aName;
	private String aRole;

	@ManyToOne
	private MovieDto movie;
	
	public MovieDto getMovie() {
		return movie;
	}

	public void setMovie(MovieDto movie) {
		this.movie = movie;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaRole() {
		return aRole;
	}

	public void setaRole(String aRole) {
		this.aRole = aRole;
	}

}
