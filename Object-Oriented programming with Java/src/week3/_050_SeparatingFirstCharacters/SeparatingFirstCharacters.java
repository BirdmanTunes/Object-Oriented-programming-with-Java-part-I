package week3._050_SeparatingFirstCharacters;

import java.util.Scanner;

public class SeparatingFirstCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		
		for (int i = 0; i < 3; i++) {
			
			if (name.length() > 2) {
				
				System.out.println((i + 1) + ". character: " + name.charAt(i));
			}
		}
	}
}
