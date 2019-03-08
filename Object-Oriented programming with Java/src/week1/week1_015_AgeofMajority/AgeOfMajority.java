package week1_015_AgeofMajority;

import java.util.Scanner;

public class AgeOfMajority
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		
		if (age > 17) {
			System.out.println("You have reached the age of majority!");
		} else {
			System.out.println("You have not reached the age of majority yet!");
		}

	}

}
