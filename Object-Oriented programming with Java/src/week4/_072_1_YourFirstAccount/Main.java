package week4._072_1_YourFirstAccount;

public class Main {
	
	public static void main(String[] args) {
		
		Account bartosAccount = new Account("Barto's account",100.00);

		bartosAccount.deposit(20);
		
		System.out.println(bartosAccount);
	}

}
