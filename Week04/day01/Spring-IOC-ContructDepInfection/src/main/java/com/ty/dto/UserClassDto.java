package com.ty.dto;

public class UserClassDto {
	int uId;
	String uName;
	long uPhone;

	public UserClassDto(int uId, String uName, long uPhone) {
		this.uId = uId;
		this.uName = uName;
		this.uPhone = uPhone;
	}

	public void display() {
		System.out.println("User's Id : " + this.uId);
		System.out.println("User's Name : " + this.uName);
		System.out.println("User's Phone Number : " + this.uPhone);
		System.out.println("-------------------------------------------------");
	}

}
