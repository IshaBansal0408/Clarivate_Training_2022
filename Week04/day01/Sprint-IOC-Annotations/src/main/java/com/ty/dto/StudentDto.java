package com.ty.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDto {

	int rollNo;

	@Value(value = "1")
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println("Student's Roll Number : "+this.rollNo);
	}
}
