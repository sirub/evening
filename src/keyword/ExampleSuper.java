package keyword;


class A {
	A(){
		System.out.println("hi I am A");
	}
	
}

class B extends A {
	B(){
		//this should be first statement in constructor
		// super() is only use in constructor
		super();
		System.out.println("hi I am B");
		
	}
}

public class ExampleSuper {

	public static void main(String[] args) {
		B b = new B() ;
			
			

	}

}