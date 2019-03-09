package week4._072_2_YourFirstMoneyTransfer;

public class Main {

	public static void main(String[] args) {
		
		Account mattsAccount = new Account("mattsAccount", 1000);
		Account myAccount = new Account("myAccount", 0);
		
		mattsAccount.withdrawal(100);
		myAccount.deposit(100);
		
		System.out.println(mattsAccount);
		System.out.println(myAccount);
	}
}
