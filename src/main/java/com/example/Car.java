package com.example;

public class Car {
	
	String Brand;
	String model;
	int year;

	Car(String Brand, String model, int year) {
		this.Brand = Brand;
		this.model = model;
		this.year = year;
	}
	
	public void display() {
		
		System.out.println(this.Brand);
		System.out.println(this.model);
		System.out.println(this.year);
	}
	
	public void start() {
		
		System.out.println(this.Brand + " "+ this.model + " is starting");
	}
	
	public void stop() {
		
		System.out.println(this.Brand + " "+ this.model + " is stopping");
	}
}
