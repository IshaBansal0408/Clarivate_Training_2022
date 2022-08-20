package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // only for primary key ( give value automatically)
	private int mId;
	private String mName;
	private double mRating;
	private double mYear;

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public double getmRating() {
		return mRating;
	}

	public void setmRating(double mRating) {
		this.mRating = mRating;
	}

	public double getmYear() {
		return mYear;
	}

	public void setmYear(double mYear) {
		this.mYear = mYear;
	}

}
