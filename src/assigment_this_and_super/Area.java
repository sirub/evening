package assigment_this_and_super;

public class Area extends City {
	int height;
	int breath;
	int weidth;
	int x = 60;

	Area(int zipcode, String state, int height, int breath, int weidth) {
		super(zipcode, state);
		this.height = height;
		this.breath = breath;
		this.weidth = weidth;

	}
 public void m1() {
	  int x = 80;
	 System.out.println(super.state);
	 super.m1();
	 System.out.println(this.breath);
	 System.out.println(" the value of x is:" + super.x);
	 System.out.println(this.x);
	 System.out.println(x);
	 
 }
  void m2() {
	  super.m2();
  }
  void m4() {
	  System.out.println(" I am from city m4");
	  this.m2();
  }
}
