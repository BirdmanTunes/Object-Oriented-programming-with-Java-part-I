package week3._062_RemoveLast;

import java.util.ArrayList;

public class RemoveLast {
	
	public static void main(String[] args) {
		
	    ArrayList<String> programmingLanguages = new ArrayList<String>();
	    programmingLanguages.add("Pascal");
	    programmingLanguages.add("Java");
	    programmingLanguages.add("Python");
	    programmingLanguages.add("Ruby");
	    programmingLanguages.add("C++");

	    print(programmingLanguages);

	    removeLast(programmingLanguages);

	    System.out.println();  // prints an empty line

	   print(programmingLanguages);
	}
	
	public static void removeLast(ArrayList<String> list){
		
		list.remove(list.size() -  1);
	}
	
	public static void print(ArrayList<String> printed) {
	    for (String word : printed) {
	        System.out.println( word );
	    }
	}
}
