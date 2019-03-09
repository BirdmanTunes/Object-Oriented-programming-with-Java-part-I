package week3._055_AWordInside;

import java.util.Scanner;

public class AWordInside {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the first word: ");
		String first = sc.nextLine();
		
		System.out.print("Type the second word: ");
		String second = sc.nextLine();
		
		if (first.indexOf(second) >= 0) {
			System.out.println("The word '" + second + "' is found in the word '" + first + ".");
		} else {
			System.out.println("The word '" + second + "' is not found in the word '" + first + ".");
		}
	}
}
