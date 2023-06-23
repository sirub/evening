package Accessmodifiersb;

import AccessModifersa.A;


public class B {
public static void main(String[] args) {
	A a = new A();
	a.m1();
	a.x = 90;
	
	//A1 a1 = new A1(); // will not be  accessible as A1 has default accessibility
	//System.out.println(a1.x); // default
}
}
