package com.ty.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarDto {
	@Autowired
	public MusicPlayerDto musicPlayer;

	public CarDto(MusicPlayerDto musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

}
