package Polymorphism;

public class Car {
 void run() {
	 System.out.println("100");
 }
}

class SportsCar extends Car{
	void run() {
		System.out.println("200");
	}
}

class SuperCar extends Car{
	void run() {
		System.out.println("300");
	}
}

class Luxury extends Car{
	void run() {
		System.out.println("400");
	}
}
