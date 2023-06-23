package herarchicalInheritance;
// One class serve as a super class for more than one subclass. EG: A extend B , A extends C , A extends D
public  class School {
	String location;
	int price;
	
	School(String location, int price){
		this.location = location;
		this.price = price;
	}
  int learn(int a , int price) {
	return a + price;
	
}
 }
 
class Teacher extends School {
  int salary;
  String subject;
	Teacher(String location, int price, int salary , String sub) {
		super(location, price);
		this.salary = salary;
		subject = sub;
	}
	
	void teaching () {
		System.out.println("I love teaching math");
	}
	
}

//Create a class City with a constrictor and 3 methods. 
// create a another class called area which is going to inherit the City class. 
//Show the use of. this keyword
//use super keyword in consturcyor

