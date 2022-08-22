package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MyConfigClass;
import com.ty.dto.DogDto;

public class TestDogController {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MyConfigClass.class);
		DogDto d1 = (DogDto) aC.getBean("dog01");
		d1.play();
	}

}
