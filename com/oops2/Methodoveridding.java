package com.oops2;
class Vehicle{
	public void run( ) {
		System.out.println("Inside Vehicle run method");
	}
}

class Truck extends Vehicle {
	public void run() {
		System.out.println("Inside Truck run method");
	}
	
}
class Bike extends Vehicle {
	public void run() {
		System.out.println(" Inside bike run method");
	}
	
}

public class Methodoveridding {
	public static void main(String [] args) {
		Vehicle vehicle;
		vehicle =new Truck();
		vehicle.run();
		vehicle = new Bike();
		vehicle.run();
		
	}

}
