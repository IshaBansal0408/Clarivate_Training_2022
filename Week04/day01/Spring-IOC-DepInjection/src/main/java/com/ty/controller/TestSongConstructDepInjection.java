package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.SongClassDto01;

public class TestSongConstructDepInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		SongClassDto01 s1 = (SongClassDto01) applicationContext.getBean("song01");
		s1.display();

	}

}
