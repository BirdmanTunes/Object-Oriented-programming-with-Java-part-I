package week1_014_APositiveNumber;

import java.util.Scanner;

public class PositiveNumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		
		if (number > 0) {
			System.out.println("The number is positive.");
		} else {
			System.out.println("The number not positive.");
		}

	}

}
