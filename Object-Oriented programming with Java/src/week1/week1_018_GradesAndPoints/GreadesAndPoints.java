package week1_018_GradesAndPoints;

import java.util.Scanner;

public class GreadesAndPoints
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the points [0-60]: ");
		
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.println("");
		
		if (grade >= 0 && grade < 30) {
			System.out.println("Grade : failed");
		} else if (grade > 29 && grade < 35) {
			System.out.println("Grade: 1");
		} else if (grade > 34 && grade < 40) {
			System.out.println("Grade: 2");
		} else if (grade > 39 && grade < 45) {
			System.out.println("Grade: 3");
		} else if (grade > 44 && grade < 50) {
			System.out.println("Grade: 4");
		} else if (grade > 49) {
			System.out.println("Grade: 5");
		}

	}

}