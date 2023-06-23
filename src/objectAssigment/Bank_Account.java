package objectAssigment;

public class Bank_Account {
	String acctype;
	int minideposit;
	String gender;
	long accnumber;

	Bank_Account(String w, int x, String y, long z) {
		acctype = w;
		minideposit = x;
		gender = y;
		accnumber = z;
	}

	void create() {
		System.out.println("I want to create account");
		System.out.println(acctype);
	}

}
