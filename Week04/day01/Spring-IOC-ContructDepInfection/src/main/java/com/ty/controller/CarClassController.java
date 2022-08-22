package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.CarClassDto;

public class CarClassController {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		CarClassDto car1 = (CarClassDto) aC.getBean("car01");
		car1.musicPlayer.playMusic();
	}

}
