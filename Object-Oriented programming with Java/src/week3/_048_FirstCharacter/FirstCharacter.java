package week3._048_FirstCharacter;

import java.util.Scanner;

public class FirstCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		
		System.out.println("First character: " + firstCharacter(name));

	}
	
	public static char firstCharacter(String name) {
		
		return name.charAt(0);
	}

}
