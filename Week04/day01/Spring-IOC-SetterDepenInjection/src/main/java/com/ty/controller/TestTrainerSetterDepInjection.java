package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.dto.TrainerDto;

public class TestTrainerSetterDepInjection {
	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("myspring.xml");
		TrainerDto t1 = (TrainerDto) aC.getBean("trainer01");
		t1.display();
	}

}
