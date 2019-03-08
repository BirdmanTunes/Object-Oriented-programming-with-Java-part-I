package week1_016_EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		
		if (number % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}

	}

}
