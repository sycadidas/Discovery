package com.common.dto;

public class User {
	private String username;//用户名
	private String password;//密码
	private String age;//年龄
	private String gender;//性别
	private Boolean isVIP;//是否为会员
	private String au;
	
	
	public String getAu() {
		return au;
	}
	public void setAu(String au) {
		this.au = au;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Boolean getIsVIP() {
		return isVIP;
	}
	public void setIsVIP(Boolean isVIP) {
		this.isVIP = isVIP;
	}
	
}
