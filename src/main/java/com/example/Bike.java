package com.example;

public class Bike extends Vehicle{

	private boolean hasCarrier;
	
	Bike(String brand, int year, boolean hasCarrier) {
		
		super(brand, year); //parent constructor
		this.hasCarrier = hasCarrier;
	}

	public void carrierInfo() {
		
		System.out.print(this.hasCarrier);
		System.out.println();
	}
	
	public void start() {
		
		System.out.println("Bike is starting");
	}
}
