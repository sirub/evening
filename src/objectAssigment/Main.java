package objectAssigment;

public class Main {

	public static void main(String[] args) {

		Bank_Account b = new Bank_Account("Saving", 2000, "male", 2345678l);
		b.create();
		System.out.println(b.accnumber);
		System.out.println(b.acctype);
		System.out.println(b.gender);
		System.out.println(b.minideposit);
		
		System.out.println("_______________________");
		
		Customer c = new Customer();
		System.out.println(c.age);
		System.out.println(c.name);
		System.out.println(c.number);
		
		System.out.println("__________________");
		
		Bank ba = new Bank("business", 235 ,"chase");
		
		System.out.println(ba.employee);
		System.out.println(ba.name);
		System.out.println(ba.type);
		
			
		
	}

}
