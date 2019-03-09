package week3._066_TheGreatest;

import java.util.ArrayList;

public class TheGreatest {

	public static void main(String[] args) {
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The greatest number is: " + greatest(list));
	}
	
	public static int greatest(ArrayList<Integer> list){
		
		int number = list.indexOf(0);

		for (int num:list) {
			if (num > number) {
				number = num;
			}
		}
		return number;
	}

}
