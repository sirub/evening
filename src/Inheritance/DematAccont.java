  package Inheritance;

public class DematAccont extends BankAccount {
	String exchangeName;

	void comission() {

	}

	public DematAccont(int balance, int acc_num, int owner_name, int owner_phone_num, String exchangeName) {
		super(balance, acc_num, owner_name, owner_phone_num);
		this.exchangeName = exchangeName;
	}

}
