package com.ty.dto;

// Constructor Dependency Injection for Object
public class CarClassDto {
	public MusicPlayerDto musicPlayer;

	public CarClassDto(MusicPlayerDto musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

}
