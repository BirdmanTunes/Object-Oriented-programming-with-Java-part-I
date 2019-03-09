package week3._067_Variance;

import java.util.ArrayList;

public class Variance {

	public static void main(String[] args) {
		
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The variance is: " + variance(list));

	}
	
	public static double variance(ArrayList<Integer> list) {
	    
		double variance = 0;
		
		for (int num: list) {
			variance += (double)Math.pow((num - average(list)), 2);
		}
		
		return (double)variance / (list.size()-1);
	}
	
	public static int sum(ArrayList<Integer> list) {
		
		int sum = 0;
		
		for(int each : list) {
			sum += each;
		}
		return sum;
	}
	
	public static double average(ArrayList<Integer> list) {
		
		return (double)sum(list) / list.size();
	}
	

}
