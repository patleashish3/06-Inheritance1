package com.in1;

public class B extends A {
	public void methodB() {
		System.out.println("Child Class method");
	}
public static void main(String[] args) {
	B obj=new B();
	obj.methodA(); //calling super class method
	obj.methodB(); //calling local method
			
}
}
