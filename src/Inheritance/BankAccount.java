package Inheritance;

public class BankAccount {

	int balance =1;
	public BankAccount(int balance, int acc_num, int owner_name, int owner_phone_num) {
		super();
		this.balance = balance;
		this.acc_num = acc_num;
		this.owner_name = owner_name;
		this.owner_phone_num = owner_phone_num;
	}

	int acc_num;
	int owner_name;
	int owner_phone_num;

	void transfer(int acc_num) {
		System.out.println("transfarred");
	}

}
