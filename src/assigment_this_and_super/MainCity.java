package assigment_this_and_super;

public class MainCity {

	public static void main(String[] args) {
		
		City c = new Area(15467, "tx", 6, 7, 8);
		
         c.m1();
         c.m2();
        
         
         Area a = new Area(12345, "ca", 4, 5, 6);
        System.out.println(a.breath);	 
         a.m4();
         a.m1();
	}

}
