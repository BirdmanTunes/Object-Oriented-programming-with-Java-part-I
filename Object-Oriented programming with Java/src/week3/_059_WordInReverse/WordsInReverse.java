package week3._059_WordInReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words= new ArrayList<String>();
		
		while (true) {
			
			System.out.print("Type a word: ");
			String word = sc.nextLine();
			
			if (word.isEmpty()) {
				break;
			} else {
				words.add(word);
			}
		}
		
		Collections.reverse(words);
		
		System.out.println("You typed the following words: ");
		
		for (String allNames: words) {
			System.out.println(allNames);
		}
	}
}
