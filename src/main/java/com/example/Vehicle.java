package com.example;

public class Vehicle {
	
	protected String brand;
	protected int year;

	Vehicle(String brand, int year){
		
		this.brand = brand;
		this.year = year;
	}
	
	public void display() {
		
		System.out.print(this.brand + " ");
		System.out.print(this.year + " ");
	}
	
	public void start() {
		
		System.out.println("The vehicle is starting");
	}
}
