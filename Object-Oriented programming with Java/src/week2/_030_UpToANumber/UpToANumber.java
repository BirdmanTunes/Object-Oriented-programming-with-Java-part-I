package week2._030_UpToANumber;

import java.util.Scanner;

public class UpToANumber
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Up to what number? ");
		
		int number = Integer.parseInt(sc.nextLine());
		int i = 1;
		
		while (i <= number) {
			
			System.out.println(i);
			i++;
		}

	}

}
