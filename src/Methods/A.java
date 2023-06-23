package Methods;

public class A {
	int a = 10;
	int b = 20;

	void m1() {
		System.out.println("I am siru");

	}

	void m2(int a) {
		System.out.println("I am siru" + a);

	}

	void m2(int a, String b) {
		System.out.println("I am siru" + a + b);

	}

	int m4() {

		return a;

	}

	int m5(int f, int g) {

		return f + g;

	}

	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj.m2(100);
		obj.m2(200, "prem");
		System.out.println(obj.m4());
		System.out.println(obj.m5(15, 5));

	}
}
