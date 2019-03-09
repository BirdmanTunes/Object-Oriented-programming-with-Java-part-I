package week4._082_Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
    	
    	Random rand = new Random();
        
    	int i = 0;
    	while (i < 7) {
    		int draw = 1 + rand.nextInt(39);
    		if (!containsNumber(draw)) {
    			numbers.add(draw);
    			i++;
    		} 
    	}
    		
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
