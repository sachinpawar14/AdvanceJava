package com.app.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String userName;
	private String password;
	private String email;
	private String gender;
	private String age;
	private String terms;
	
	public Employee()
	{}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", password=" + password + ", email=" + email + ", gender=" + gender
				+ ", age=" + age + ", terms=" + terms + "]";
	}
	
	
	
	

}
