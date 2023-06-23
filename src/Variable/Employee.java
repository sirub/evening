package Variable;

public class Employee {
	int age;
	long number;
	String name;

	Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String args[]) {
		Employee c = new Employee(23, "siru");
		int x = c.age;
		System.out.println(x);
	}

}
