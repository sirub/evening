package evening;

public class Variable {
 //global variable
	int x = 1000;  
   int y = 345;
   int z;
	
	
	public static void main(String[] args) {
		// Local Variable
		int x = 34;
		x=54;
		System.out.println(x);
		m1(4);
		m2(23,2555);
		
	}
public static void m1(int x) {
	System.out.println(x);
}

 static void m2 (int y , int z) {
	System.out.println(y);
	
	
}
}
