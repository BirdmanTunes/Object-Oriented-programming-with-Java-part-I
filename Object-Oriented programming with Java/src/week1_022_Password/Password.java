package week1_022_Password;

import java.util.Scanner;

public class Password
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String pass = "carrot";
		
		while (true) {
			System.out.print("Type the password: ");
			String password = sc.nextLine();
			
			if (password.equals(pass)) {
				System.out.println("Right");
				System.out.println("");
				System.out.println("The secret is banana!");
				break;
			} else {
				System.out.println("Wrong!");
			}
		}
	}

}
