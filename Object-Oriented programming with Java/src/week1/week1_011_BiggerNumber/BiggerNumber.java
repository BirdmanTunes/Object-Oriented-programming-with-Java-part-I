package week1_011_BiggerNumber;

import java.util.Scanner;

public class BiggerNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int biggest = Math.max(num1, num1);
		
		System.out.println("The bigger number of the two numbers given was: " + biggest);
		
	}

}
