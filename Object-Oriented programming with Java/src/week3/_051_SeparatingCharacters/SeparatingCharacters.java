package week3._051_SeparatingCharacters;

import java.util.Scanner;

public class SeparatingCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
				
			System.out.println((i + 1) + ". character: " + name.charAt(i));
		}
	}
}
