package week3._052_ReversingAName;

import java.util.Scanner;

public class ReversingAName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		String name = sc.nextLine();
		
		System.out.print("In reverse order: ");
		
		for (int i = name.length() - 1; i >= 0; i--) {
			
			System.out.print(name.charAt(i));
		}
	}

}
