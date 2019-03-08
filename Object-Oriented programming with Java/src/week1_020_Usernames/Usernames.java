package week1_020_Usernames;

import java.util.Scanner;

public class Usernames
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String user1 = "alex";
		String pass1 = "mightyducks";
		String user2 = "emily";
		String pass2 = "cat";
		
		System.out.print("Type your username: ");
		String username = sc.nextLine();
		
		System.out.print("Type your password: ");
		String password = sc.nextLine();
		
		System.out.println("");
		
		if (username.equals(user1) && password.equals(pass1)) {
			System.out.println("You are now logged into the system!");
		} else if (username.equals(user2) && password.equals(pass2)) {
			System.out.println("You are now logged into the system!");
		} else {
			System.out.println("Your username or password was invalid!");
		}
	}
}
