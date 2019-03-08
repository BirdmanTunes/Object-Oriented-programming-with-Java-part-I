package week1_010_CalculatingTheCircumference;

import java.util.Scanner;

public class Circumference
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the radius: ");
		
		int radius = Integer.parseInt(sc.nextLine());
		
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("Circumference of the circle: " + circumference);

	}

}
