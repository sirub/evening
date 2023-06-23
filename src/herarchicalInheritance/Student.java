package herarchicalInheritance;

public class Student extends School {
	int nofstu;
	String gender;

	Student(String location, int price, int nofstu, String gender) {
		super(location, price);
		this.nofstu = nofstu;
		this.gender = gender;
	}

	void passtest() {
		System.out.println("I am going to pass");

	}

}
