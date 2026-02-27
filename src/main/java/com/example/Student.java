package com.example;

public class Student {

	private String name;
	private int age;
	private double GPA;
	
	protected Student(String name, int age, double GPA) {
		this.name = name;
		this.age = age;
		this.GPA = GPA;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getGrade() {
		return this.GPA;
	}
	
	public void display() {
		System.out.println(this.name + " " + this.age + " " + this.GPA);
	}
}
