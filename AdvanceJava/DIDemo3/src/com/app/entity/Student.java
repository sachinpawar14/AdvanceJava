package com.app.entity;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	//@Value("Sham")
	//@Value("${student.name}")
	private String name;
	//@Value("C++")
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	private String hobby;
	
	public Student()
	{
		System.out.println("Student Default");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	//@Value("Cooking")
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", interestedCourse=" + interestedCourse + ", hobby=" + hobby + "]";
	}
}
