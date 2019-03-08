package week1._009_Divider;

import java.util.Scanner;

public class Divider
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		double sum = (double)num1 / num2;
		
		System.out.println("Division: " + num1 + " / " + num2 + " = " + sum);

	}

}
