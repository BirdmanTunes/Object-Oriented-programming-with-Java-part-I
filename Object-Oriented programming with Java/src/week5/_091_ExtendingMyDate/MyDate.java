package week5._091_ExtendingMyDate;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }
    
    public void advance() {
       day++;
        if (day > 30) {
            day = 1;
            month++;
            if (month > 12) {
                year++;
                month = 1;
            }
        }
    }
    
    public void advance(int numberOfDays) {
    	for (int i = 0; i < numberOfDays; i++) {
    		advance();
    	}
    }
    
    public  MyDate afterNumberOfDays(int days) {
    	MyDate newMyDate = new MyDate(day, month, year);
    	newMyDate.advance(days);
    	return newMyDate;
    }
}