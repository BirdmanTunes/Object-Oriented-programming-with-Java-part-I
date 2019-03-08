package week2._035_SumOfPowers;

import java.util.Scanner;

public class SumOfPowers
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Until what? ");
		
		int number = Integer.parseInt(sc.nextLine());
		int i = 1;
		int result = 1;
		
		while (i <= number) {
			
			result += (int)Math.pow(2, i);
			i++;
		}
		
		System.out.println("The result is: " + result);

	}

}
