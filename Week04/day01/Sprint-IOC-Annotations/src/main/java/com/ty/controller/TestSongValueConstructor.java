package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.SongDto;



public class TestSongValueConstructor {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		SongDto s1 = (SongDto) aC.getBean("songDto");
		s1.display();
	}

}
