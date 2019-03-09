package week3._054_EndPart;

import java.util.Scanner;

public class EndPart {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a word: ");
		String name = sc.nextLine();
		
		System.out.print("Length of the first part: ");
		int firstPart = Integer.parseInt(sc.nextLine());
		
		String first = name.substring(firstPart - 1);
		
		System.out.print("Result: " + first);
	}

}
