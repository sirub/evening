package Constructor;
//Create a Car class with 4 attributes Color, Price, Wheels, Airbags. 
//Create a Constructor of 3 paramters and demonstrate the use of this keyword


public class Car {

	static String Color;
	static int price;
	static int wheels;
	static boolean airbags;
	
	Car(String Color , int price , int wheels) {
		this.Color = Color;
		this.price = price;
		this.wheels = wheels;
	}
	
	static void run() {
		
		System.out.println(Color);
		System.out.println(price);
		 
		
	}
}
