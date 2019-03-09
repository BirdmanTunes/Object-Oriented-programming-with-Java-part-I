package week3._071_SmartCombining;

import java.util.ArrayList;

public class SmartCombining {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);

		list2.add(4);
		list2.add(10);
		list2.add(3);

		smartCombine(list1, list2);

		System.out.println(list1); // prints [4, 3, 5, 10, 7]

		System.out.println(list2); // prints [5, 10, 7]

	}
	
	public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
		
		for (int each: second) {
			if (!first.contains(each)) {
				first.add(each);
			}
		}
	}
}
