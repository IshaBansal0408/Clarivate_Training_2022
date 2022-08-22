package com.ty.dto;

public class TrainerDto {
	private int tId;
	private String tName;
	private String tTopic;

	public void settName(String tName) {
		this.tName = tName;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public void settTopic(String tTopic) {
		this.tTopic = tTopic;
	}

	public void display() {
		System.out.println("Trainer ID : " + this.tId);
		System.out.println("Trainer Name : " + this.tName);
		System.out.println("Trainer Topic : " + this.tTopic);
	}

}
