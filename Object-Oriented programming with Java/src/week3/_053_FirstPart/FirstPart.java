package week3._053_FirstPart;

import java.util.Scanner;

public class FirstPart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a word: ");
		String name = sc.nextLine();
		
		System.out.print("Length of the first part: ");
		int firstPart = Integer.parseInt(sc.nextLine());
		
		String first = name.substring(0, firstPart);
		
		System.out.print("Result: " + first);
	}
}
