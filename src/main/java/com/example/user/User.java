package com.example.user;

public class User {

	private int userId;
	private String full_name;
	private String mob_num;
	private String pan_num;

	public User(int userId, String full_name, String mob_num, String pan_num) {

		this.userId = userId;
		this.full_name = full_name;
		this.mob_num = mob_num;
		this.pan_num = pan_num;

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getMob_num() {
		return mob_num;
	}

	public void setMob_num(String mob_num) {
		this.mob_num = mob_num;
	}

	public String getPan_num() {
		return pan_num;
	}

	public void setPan_num(String pan_num) {
		this.pan_num = pan_num;
	}

}