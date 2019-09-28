package com.in5;

public class Z extends Y {
	public void methodZ() {
		System.out.println("Class Z method");
	}

	public static void main(String[] args) {
		Z obj = new Z();
		obj.methodX();// calling grand parent class method
		obj.methodY();// calling parent class method
		obj.methodZ();// calling local method
	}

}
