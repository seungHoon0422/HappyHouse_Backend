package com.house.model;

public class InterestDto {
	private String userid;
	private int aptCode;
	
	public InterestDto(String userid, int aptCode) {
		this.userid = userid;
		this.aptCode = aptCode;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getAptCode() {
		return aptCode;
	}
	public void setAptCode(int aptCode) {
		this.aptCode = aptCode;
	}
	
	
}