package com.in6a;

public class Main {
	public static void main(String[] args) {

	}

	class Employee extends User {
		String specialization;

	}

	class User {
		String name;
		int age;
		long ph;
	}

class Manager extends User {
	String department;{
	
		
		
  Employee e1=new Employee();
  e1.name="Candid";
  e1.age=22;
  e1.ph=1234567891;
  e1.specialization="Java";
  Manager m1=new Manager();
  m1.name="Java";
		  m1.age=25;
		  m1.ph=3457891;
		  

	}
}
}
