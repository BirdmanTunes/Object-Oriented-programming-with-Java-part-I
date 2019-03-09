package week4._079_NumberStatistics;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
    	sum += number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
    	return (double)sum / amountOfNumbers;
    }
}
    