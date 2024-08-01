package com.cg.oops.part5;
public class InterfaceDemo {
public static void main(String[] args) {
Drive driver=getCarForDrive("Nano");
	driver.gear();
}
static  Drive getCarForDrive(String car) {
	if(car.equals("Audi"))
		return new Audi();
	else
		return new Nano();
}
}
interface Drive{
	void gear();//public abstract void gear();
}
class Audi implements Drive{
	public void gear() {
		System.out.println("Audi car's gear activated");
	}
}
class Nano implements Drive{
	public void gear() {
		System.out.println("Nano car's gear activated");
	}
}