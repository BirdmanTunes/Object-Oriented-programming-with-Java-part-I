package week3._061_AmountOfItems;

import java.util.ArrayList;

public class AmountOfItems {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Ciao");
		list.add("Hello");
		System.out.println("There are this many items in the list:");
		System.out.println(countItems(list));

	}
	
	public static int countItems(ArrayList<String> list){
		
		int size = list.size();
		return size;
	}
}
