package week2._034_Factorial;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Until what? ");
		
		int number = Integer.parseInt(sc.nextLine());
		int i = 1;
		int factorial = 1;
		
		while (i <= number) {
			
			factorial *= i;
			i++;
		}
		
		System.out.println("Factorial is: " + factorial);

	}

}
