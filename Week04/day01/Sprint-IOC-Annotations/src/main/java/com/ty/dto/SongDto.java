package com.ty.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SongDto {
	String sName;

	public SongDto(@Value(value = "There's Nothing Holding Me Back") String sName) {
		super();
		this.sName = sName;
	}

	public void display() {
		System.out.println("Name of the Song is : " + this.sName);
	}

}
