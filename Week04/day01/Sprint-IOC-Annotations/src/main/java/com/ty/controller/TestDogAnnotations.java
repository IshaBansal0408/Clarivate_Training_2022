package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.DogDto;

public class TestDogAnnotations {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		DogDto d1 = (DogDto) aC.getBean("dogDto");
		d1.playing();
	}

}
