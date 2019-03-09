package week3._58_RecurringWord;

import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words= new ArrayList<String>();
		
		while (true) {
			
			System.out.print("Type a word: ");
			String word = sc.nextLine();
			
			if (words.contains(word)) {
				System.out.println("You gave the word " + word + " twice.");
			} else {
				words.add(word);
			}
		}
	}
}
