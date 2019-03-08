package week1_008_Adder;

import java.util.Scanner;

public class Adder
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int sum = num1 + num2;
		
		System.out.println("Sum of the numbers: " + sum);
	}

}
