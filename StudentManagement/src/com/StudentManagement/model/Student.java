package com.StudentManagement.model;
;

public class Student {

	
	String name;
	int age;
	String dpt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dpt=" + dpt + "]";
	}
	public Student(String name, int age, String dpt) {
		super();
		this.name = name;
		this.age = age;
		this.dpt = dpt;
	}
	
	public Student(){}
}
