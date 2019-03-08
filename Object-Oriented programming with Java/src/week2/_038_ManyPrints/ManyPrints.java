package week2._038_ManyPrints;

import java.util.Scanner;

public class ManyPrints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many?");
		
		int number = Integer.parseInt(sc.nextLine());
		int i = 0;
		
		while (i < number) {
			printText();
			i++;
		}
	}
	
	public static void printText() {
		
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}

}
