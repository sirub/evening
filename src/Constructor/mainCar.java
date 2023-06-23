package Constructor;

public class mainCar {

	public static void main(String[] args) {
		
		Car c = new Car("Blue" , 3400 , 4);
		System.out.println(c.Color);
		System.out.println(c.wheels);
		c.run();
		
		System.out.println("*************");
		
		Car c1 = new Car("Red", 2500, 5);
		System.out.println(Car.Color);
		System.out.println(Car.wheels);
		Car.run();

	}

}
