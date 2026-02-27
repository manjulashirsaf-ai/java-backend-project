package com.example;

public class CarVehicle extends Vehicle {

	private int doors;
	
	CarVehicle(String brand, int year, int doors) {
		
		super(brand, year); //parent constructor
		this.doors = doors;
	}
	
	public void showdoors() {
		
		System.out.print(this.doors);
		System.out.println();
	}
	
	public void start() {
		
		System.out.println("Car is starting");
	}
}
