package week5._084_OverloadedCounter;

public class Counter {
	
	public int startingValue;
	public boolean check;
	
	public Counter(int startingValue, boolean check) {
		this.startingValue = startingValue;
		this.check = check;
	}
	
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }
	
	public int value() {
		return startingValue;
	}
	
	public void increase() {
		startingValue++;
	}
	
	public void decrease() {
		
		if(check && startingValue == 0) {
		} else {
			startingValue--;
		}
	}
	
	public void increase(int number) {
		startingValue += number;
	}
	
	public void decrease(int number) {
		if(check && startingValue - number < 0) {
			
		} else {
			startingValue -= number;
		}
	}
}
