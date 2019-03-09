package week3._046_Average;

public class Average {

	public static void main(String[] args) {
		
		double answer = average(4, 3, 6, 1);
	    System.out.println("average: " + answer);

	}
	
	public static double average(int number1, int number2, int number3, int number4) {

		return sum(number1, number2, number3, number4) / (double)4;
	}
	
	public static int sum(int number1, int number2, int number3, int number4) {
	    
		return number1 + number2 + number3 + number4;
	}

}
