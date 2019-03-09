package week3._079_NumberStatistics;

import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
       NumberStatistics stats = new NumberStatistics();
       Scanner sc = new Scanner(System.in);
       
       int even = 0;
       int odd = 0;
       
       System.out.println("Type numbers: ");
       
       while (true) {
    	   int input = Integer.parseInt(sc.nextLine());
    	   
    	   if (input < 0) {
    		   break;
    	   } else if (input % 2 == 0){
    		   stats.addNumber(input);;
    		   even += input;
    	   } else {
    		   stats.addNumber(input);;
    		   odd += input;
    	   }
       }
       System.out.println("sum: " + stats.sum());
       System.out.println("sum of even: " + even);
       System.out.println("sum of odd: " + odd);
       System.out.println("Amount: " + stats.amountOfNumbers());
       System.out.println("average: " + stats.average());
    }
}
    