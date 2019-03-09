package week3._057_Words;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {

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
		
		System.out.println("You typed the following words: ");
		
		for (String allNames: words) {
			System.out.println(allNames);
		}
	}
}
