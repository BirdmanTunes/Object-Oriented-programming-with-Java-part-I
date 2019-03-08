package week1._019_AgeCheck;

import java.util.Scanner;

public class AgeCheck
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		
		if (age >= 0 && age < 121) {
			System.out.println("Ok.");
		} else {
			System.out.println("Impossible!");
		}

	}

}
