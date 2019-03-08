package week2._031_LowerAndUpperLimit;

import java.util.Scanner;

public class LowerAndUpperLimit
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First: ");
		int first = Integer.parseInt(sc.nextLine());
		
		System.out.print("Second: ");
		int second = Integer.parseInt(sc.nextLine());

		while (first <= second) {
			
			System.out.println(first);
			first++;
		}
		
	}
	
}