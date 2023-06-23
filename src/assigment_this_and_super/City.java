package assigment_this_and_super;

//Create a class City with a constrictor and 3 methods. 
//create a another class called area which is going to inherit the City class. 
//Show the use of. this keyword
//use super keyword in consturcyor
public class City {

	int zipcode;
	String state;
	int x= 68;

	City(int zipcode, String state) {

		this.zipcode = zipcode;
		this.state = state;

	}

	public void m1() {
		
		System.out.println("I am from class m1 car");
		
	}

	void m2() {
		System.out.println(this.state);
		m3();
	}

	void m3() {
		System.out.println("I am m3");
		
	}
}
