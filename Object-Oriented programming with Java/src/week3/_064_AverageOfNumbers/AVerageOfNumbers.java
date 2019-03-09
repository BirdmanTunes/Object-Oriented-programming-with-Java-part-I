package week3._064_AverageOfNumbers;

import java.util.ArrayList;

public class AVerageOfNumbers {
	
	public static void main(String[] args) {
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The average is: " + average(list));

	}
	
	public static double average(ArrayList<Integer> list) {
		
		return (double)sum(list) / list.size();
	}
	
	public static int sum(ArrayList<Integer> list) {
		
		int sum = 0;
		
		for(int each : list) {
			sum += each;
		}
		return sum;
	}

}
