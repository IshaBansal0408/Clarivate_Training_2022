package com.ty.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobileDto {
//	CASE 1
	@Autowired
	SimDto sim;

////	CASE 2
//	@Autowired
//	public void setSim(SimDto sim) {
//		this.sim = sim;
//	}
//
////	CASE 3
//	public MobileDto(@Autowired SimDto sim) {
//		super();
//		this.sim = sim;
//	}
	
	public void mobileInfo() {
		System.out.println("Mobile is Samsung Galaxy.");
		sim.serviceProvider();
	}
}
