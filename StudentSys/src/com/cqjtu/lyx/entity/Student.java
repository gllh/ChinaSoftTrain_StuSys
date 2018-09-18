package com.cqjtu.lyx.entity;

public class Student {
	
	private int id;
	private String stuno;
	private String name;
	private String gender;
	private int age;
	private String major;
	
	public Student(int id, String stuno, String name, String gender, int age,String major) {
		super();
		this.id = id;
		this.stuno = stuno;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
