package com.in4;

public class test {
	public static void main(String[] args) {
		Car b1 = new Car();
		b1.color = 5;
		b1.setSpeed(200);
		b1.setSize(22);
		b1.CC = 1000;
		b1.gears = 5;
		System.out.println("Color of Car:" + b1.color);
		System.out.println("Speed of Car:" + b1.getSpeed());
		System.out.println("Size of Car:" + b1.getsize());
		System.out.println("CC of Car:" + b1.CC);
		System.out.println("No of gears of Car:" + b1.gears);
	}

}
