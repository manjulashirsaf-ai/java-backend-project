package com.example;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("Any Vehicle", 1900);
		Vehicle car = new CarVehicle("Sienna", 2014, 4);
		Vehicle bike = new Bike("Bike", 2024, false);
		
		Vehicle vehicle2 = new CarVehicle("Sienna", 2014, 4);
		if (vehicle2 instanceof CarVehicle) {
		    CarVehicle car1 = (CarVehicle) vehicle2;  // ✅ This works
		    car1.start();
			car1.display();
			car1.showdoors();
		}
		
		Bike bike1 = new Bike("Mountain Bike", 2026, true);
		
		vehicle.start();
		vehicle.display();
		
		car.start();
		car.display();
		
		bike.start();
		bike.display();
		
		bike1.start();
		bike1.display();
		bike1.carrierInfo();
	}
}
