package week3._049_LastCharacter;

import java.util.Scanner;

public class LastCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		
		System.out.println("First character: " + lastCharacter(name));

	}
	
	public static char lastCharacter(String name) {
		
		return name.charAt(name.length() - 1);
	}

}
