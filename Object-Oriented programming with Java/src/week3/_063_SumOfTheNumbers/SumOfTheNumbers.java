package week3._063_SumOfTheNumbers;

import java.util.ArrayList;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The sum: " + sum(list));

	    list.add(10);

	    System.out.println("the sum: " + sum(list));

	}
	
	public static int sum(ArrayList<Integer> list) {
		
		int sum = 0;
		
		for(int each : list) {
			sum += each;
		}
		return sum;
	}

}
