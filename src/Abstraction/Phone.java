package Abstraction;

//Create a abstract class called Phone with 3 abstract method and create a interface named Smartphone with 3 methods and implement them in a class called user class.
public abstract class Phone {

	abstract void camera();

	abstract void volume();

	abstract void theme();

	public void off() {
		System.out.println("I do power off");
	}
}

class user extends Phone implements Smartphone {

	@Override
	void camera() {

		System.out.println("My camera is on");
	}

	@Override
	void volume() {

		System.out.println("turn on volume");
	}

	@Override
	void theme() {
		System.out.println("I make black theme");

	}

	@Override
	public void service() {

		System.out.println("I take t-moblie");
	}

	@Override
	public void ram() {

		System.out.println("I take 16gb ram");
	}

	@Override
	public void rom() {

		System.out.println("I take 128 gb rom");
	}

}
