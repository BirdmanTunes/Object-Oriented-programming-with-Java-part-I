package week2._033_SumBetweenTwo;

import java.util.Scanner;

public class SumBetweenTwo
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First: ");
		int first = Integer.parseInt(sc.nextLine());
		
		System.out.print("Second: ");
		int second = Integer.parseInt(sc.nextLine());
		
		int sum = 0;

		while (first <= second) {
			
			sum += first;
			first++;
		}
		
		System.out.println("The sum is: " + sum);

	}

}
