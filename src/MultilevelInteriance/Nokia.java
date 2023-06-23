package MultilevelInteriance;
//  a derived class inheriting base class and the derived class also act as base class for other class
// EG: A extends B , B extends c, C extends D
class Telephone {
int model;
	public void ring() {
		System.out.println("Phone is ringing");
	}
	public void camera() {
		System.out.println("I love selfie");
	}

}

public class Nokia extends Telephone {
    int price;
    String color;
   
    
    Nokia(int price, String color){
    	this.price = price;
    	this.color = color;
    	
    }
	public void game() {
		System.out.println("playing snake game");
	}
	

}

class Android extends Nokia {
 String model;
	Android(int price, String color , String model) {
		super(price, color);
		this.model = model;
	}

public void camera() {
	System.out.println("I love selfie");
}


	
}



