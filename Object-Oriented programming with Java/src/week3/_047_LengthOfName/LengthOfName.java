package week3._047_LengthOfName;

import java.util.Scanner;

public class LengthOfName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		
		System.out.println("Number of characters: " + name.length());
	}

}
