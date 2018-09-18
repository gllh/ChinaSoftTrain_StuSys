package com.cqjtu.entity;

public class Student {
   private int id;
   private String studo;
   private String name;
   private String gender;
   private int age;
   
public Student(int id, String studo, String name, String gender, int age) {
	super();
	this.id = id;
	this.studo = studo;
	this.name = name;
	this.gender = gender;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudo() {
	return studo;
}
public void setStudo(String studo) {
	this.studo = studo;
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
}
