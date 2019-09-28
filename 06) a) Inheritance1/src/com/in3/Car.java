package com.in3;

public class Car extends Vehicle {
	String modelType;

	public void showDetail() {
		vehicleType = "car";
		// accessing vehicle class member
		modelType = "sports";
		System.out.println(modelType + "" + vehicleType);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.showDetail();
	}

}
