package evening;

public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		c.color = "red";
		c.engine = 1000;
		System.out.println(c.color);
		System.out.println(c.engine);

		Car c1 = new Car();
		c1.run();
		c1.color = "blue";
		c1.engine = 1000;
		System.out.println(c1.color);
		System.out.println(c1.engine);

		Car c2 = new Car();
		c2.run();
		c2.color = "white";
		c2.engine = 1000;
		System.out.println(c2.color);
		System.out.println(c2.engine);

	}

}
