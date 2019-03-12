package week6._103_BirdwatchersDatabase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Database birds = new Database();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("? ");
			String input = sc.nextLine();
			String input2 = "";
			
				if (input.equalsIgnoreCase("add")) {
					System.out.print("Name: ");
					input = sc.nextLine();
					System.out.print("Latin Name: ");
					input2 = sc.nextLine();
					birds.add(new Bird(input, input2));
				} else if (input.equalsIgnoreCase("obs")) {
					System.out.println("What was observed? ");
					input = sc.nextLine();
					birds.observed(input);
				} else if (input.equalsIgnoreCase("stats")) {
					birds.stats();
				} else if (input.equalsIgnoreCase("show")) {
					System.out.println("What? ");
					input = sc.nextLine();
					birds.show(input);
				} else if (input.equalsIgnoreCase("quit")) {
					break;
				}
		}
		System.out.println("Goodbye!");
	}
}
