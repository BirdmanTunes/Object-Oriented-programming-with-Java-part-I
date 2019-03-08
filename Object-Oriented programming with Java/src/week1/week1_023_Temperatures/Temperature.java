package week1_023_Temperatures;

import java.util.Scanner;

public class Temperature
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Type value: ");
			double value = Double.parseDouble(sc.nextLine());
			
			if (value > -31 && value < 41)
				Graph.addNumber(value);
		}
		

	}

}
