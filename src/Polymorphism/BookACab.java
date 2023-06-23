package Polymorphism;

public class BookACab {
	public static void main(String[] args) {
		BookACab ba = new BookACab();
		Car c = new Car();
		Car c1 = new SuperCar();
		Car c2 = new Luxury();
		Car c3 = new SportsCar();
		
		ba.reachDestination(c3);
		ba.reachDestination(c2);
		
	}
	
	void reachDestination(Car c) { //type should be same to get different behaviour from different object
c.run();
	}

}
