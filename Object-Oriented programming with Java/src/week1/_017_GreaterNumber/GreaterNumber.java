package week1._017_GreaterNumber;

import java.util.Scanner;

public class GreaterNumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		
		int number1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Type the second number: ");
		
		int number2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		
		if (number1 > number2) {
			System.out.println("Greater number: " + number1);
		} else if (number1 < number2) {
			System.out.println("Greater number: " + number2);
		} else {
			System.out.println("The numbers are equal!");
		}

	}

}
