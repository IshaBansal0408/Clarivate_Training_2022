package com.ty.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StudentDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sID;
	private String sName;

	@ManyToMany
	private List<SubjectDto> subjects;

	public int getsID() {
		return sID;
	}

	public List<SubjectDto> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDto> subjects) {
		this.subjects = subjects;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

}
