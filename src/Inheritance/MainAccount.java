package Inheritance;

public class MainAccount {

	public static void main(String[] args) {
		DematAccont dm = new DematAccont(100, 2300, 4566, 5670, "prem");
		
		System.out.println(dm.balance);
		dm.transfer(2);
		
		System.out.println(dm.exchangeName);
		dm.comission();
		
	}
}
