package keyword;

public class ExampleThis {
	int x = 50;
	int y = 57;
	
	ExampleThis(){
		System.out.println(x);
	}
	void m1() {
		int x = 500;
		System.out.println(x);
		System.out.println(this.x);
	}
	
	void m2() {
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(x);
	}
public static void main(String[] args) {
	
	ExampleThis obj = new ExampleThis();
	obj.m1();
}
}
