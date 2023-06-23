package MultilevelInteriance;

public class MainNokia {

	public static void main(String[] args) {
		Android a = new Android(2333 , "Blue", "XYZ");
		System.out.println(a.color);
		System.out.println(a.model) ;
		System.out.println(a.price);
		a.ring();
		
		System.out.println("********************");
		
		Nokia n = new Nokia(3456 , "pink");
	//	System.out.println(n.model);
		System.out.println(n.color);
	  System.out.println(n.price);
	  n.game();
	  
	  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
	  
	  Telephone t = new Telephone();
	 t.ring();
	
		Telephone t1 = new Android(5000, "red", "cat");
		System.out.println(t1.model);
		t1.camera();
		
	}

}
