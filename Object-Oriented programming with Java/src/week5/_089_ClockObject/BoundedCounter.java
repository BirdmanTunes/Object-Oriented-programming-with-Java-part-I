package week5._089_ClockObject;

public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
    	value++;
    	if (value > upperLimit) 
    		value = 0;
    }
    
    public int getValue() {
    	return value;
    }
    
    public void setValue(int newValue) {
    	value = newValue;
    }

    public String toString() {
    	
    	if (value < 10) {
    		return "0" + value;
    	} else {
    		return "" + value;
    	}
    }
}
    
