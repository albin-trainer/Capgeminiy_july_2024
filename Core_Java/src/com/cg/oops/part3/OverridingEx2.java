package com.cg.oops.part3;
public class OverridingEx2 {
public static void main(String[] args) {
	Car c= new Car();
	driving(c);
	System.out.println("---------");
	driving(new Bike());
}
 static void driving(Vehicle v) {
	 v.drive();//decides @runtime which method to invoke
 }
}
class Vehicle{
	void drive() {
		System.out.println("Driving a vehicle");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Driving a car");
	}
}
class Bike extends Vehicle{
	void drive() {
		System.out.println("Driving a bike");
	}
}