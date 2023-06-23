package Methodoverriding;

public class overriding {
public static void main(String[] args) {
	A a = new B();
	a.m1(3);
}
}

class A{
void m1(int x)	{
	System.out.println("m1 from A");
	System.out.println(x);
}
}

class B extends A{
	void m1(int x) {
		System.out.println("m1 from B");
		System.out.println(x);
	}
	
}

// Create 4 different methods one for public one for private one for protected and one for default and showcase how we can use it on the same class on the same pacakage and on different package.
// Create a class called Car class with airbag, breaks, headlights methods and create another class called Super car and inherit the features of the car class
// find out factirial of 5

