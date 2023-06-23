package keyword;

public class Examplefinal {

	
	int x =100;
	final int y =3;
	//final int t; // must be inilized and java will insert zero later you cannnot c
	int a;
	void m1() {
		System.out.println("value of y " + y);
		System.out.println("value of x " + x);
		
		x =111;
		//y =45;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Examplefinal ef = new Examplefinal();
		ef.m1();
		System.out.println(ef.x);
	}
	

}


//question by Aman Sir: 1.Add all the number from 1 to 200 bare minimum effort
//2.Sorting of numbers
//3.Check whether a number is armstrong or not
