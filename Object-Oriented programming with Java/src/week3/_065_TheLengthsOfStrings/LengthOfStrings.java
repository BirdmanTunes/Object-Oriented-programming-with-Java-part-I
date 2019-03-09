package week3._065_TheLengthsOfStrings;

import java.util.ArrayList;

public class LengthOfStrings {

	public static void main(String[] args) {

	    ArrayList<String> list = new ArrayList<String>();
	    list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    ArrayList<Integer> lengths = length(list);

	    System.out.println("The lengths of the Strings: " + lengths);

	}
	
	public static ArrayList<Integer> length(ArrayList<String> list){
		
		ArrayList<Integer> lenghts = new ArrayList<Integer>();
		for (String word:list) {
			lenghts.add(word.length());
		}
		return lenghts;
	}

}
