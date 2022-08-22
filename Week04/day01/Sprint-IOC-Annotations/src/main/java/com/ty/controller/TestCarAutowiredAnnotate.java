package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.CarDto;

public class TestCarAutowiredAnnotate {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		CarDto c1 = (CarDto) aC.getBean("carDto");
		c1.musicPlayer.playMusic();
	}

}
