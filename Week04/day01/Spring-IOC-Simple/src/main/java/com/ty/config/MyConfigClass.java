package com.ty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ty.dto.DogDto;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class MyConfigClass {
	
//	Create new object
	@Bean("dog01") //pass some attributes to the bean
	public DogDto getDog() {
		return new DogDto();
	}

}                                 
