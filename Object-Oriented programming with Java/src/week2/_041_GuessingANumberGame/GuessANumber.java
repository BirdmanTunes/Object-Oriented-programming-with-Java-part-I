package week2._041_GuessingANumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int draw = drawNumber();
		
		int guesses = 0;
		
		System.out.println(draw);

		while (true) {
			
			System.out.print("Guess a number: ");
			int guess = Integer.parseInt(sc.nextLine());
				
				if (guess < draw) {
					guesses++;
					System.out.println("The number is greater, guesses made: " + guesses);
				} else if (guess > draw) {
					guesses++;
					System.out.println("The number is lesser, guesses made: " + guesses);
				} else {
					System.out.println("Congratulations, your guess is correct!");
					break;
				}
				
		}
		
		

	}
	
    private static int drawNumber() {
    	
        return new Random().nextInt(101);
    }

}
