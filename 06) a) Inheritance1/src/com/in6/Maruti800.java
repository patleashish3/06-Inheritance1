package com.in6;

public class Maruti800 extends Maruti {
	public Maruti800() {
		System.out.println("constructor of class Maruti800");
	}

	/*public void speed() {
		System.out.println("Max speed: 80Kmph");
	}*/

	public static void main(String[] args) {
		/*Maruti800 obj = new Maruti800();
		obj.vehicleType();
		obj.brand();
		obj.speed();*/
		
		/*Maruti m = new Maruti();
		m.speed();
		m.brand();*/
		
		Maruti800 obj = (Maruti800) new Maruti();
		obj.brand();
		
		/*Maruti obj1 = new Maruti800();
		obj1.brand();
		obj1.speed();*/
	
		
		

	}
}
