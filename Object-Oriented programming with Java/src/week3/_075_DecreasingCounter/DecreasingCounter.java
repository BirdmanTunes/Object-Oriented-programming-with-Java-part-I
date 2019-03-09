package week3._075_DecreasingCounter;

public class DecreasingCounter {
	
    private int value;   // object variable that remembers the value of the counter
    private int initial;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        initial = value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }
    
    // decreases by 1 until 0
    public void decrease() {
    	if (value > 0)
    		value--;
    }
    
   public void reset() {
	   value = 0;
   }
   
   public void setInitial() {
	   value = initial;
   }
}
    
