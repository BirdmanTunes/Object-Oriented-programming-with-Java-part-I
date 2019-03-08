package week1_012_SumOfTheAges;

import java.util.Scanner;

public class SumOfAges
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name1 = sc.nextLine();
		
		System.out.print("Type your age: ");
		int age1 = Integer.parseInt(sc.nextLine());

		System.out.print("Type your name: ");
		String name2 = sc.nextLine();
		
		System.out.print("Type your age: ");
		int age2 = Integer.parseInt(sc.nextLine());
		
		int sum = age1 + age2;
		
		System.out.println(name1 + " and " + name2 + " are " + sum + " years old in total.");
		
	}

}
