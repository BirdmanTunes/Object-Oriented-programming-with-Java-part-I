package week2._036_LoopsEndingAndRemembering;

import java.util.Scanner;

public class Loops
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int counter = 0;
		int even = 0;
		int odd = 0;
		
		System.out.println("Type numbers:");
		
		while(true) {
			
			int input = Integer.parseInt(sc.nextLine());
				
				if (input < 0) {
					break;
				} else {
					if (input % 2 == 0) {
						even++;
					} else {
						odd++;
					}
					sum += input;
					counter++;
					
				}
		}
		
		double average = (double)sum / counter; 
		
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is: " + sum);
		System.out.println("How many numbers: " + counter);
		System.out.println("Average: " + average);
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);

	}

}
