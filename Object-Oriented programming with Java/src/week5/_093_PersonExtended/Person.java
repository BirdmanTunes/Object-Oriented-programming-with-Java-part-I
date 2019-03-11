package week5._093_PersonExtended;

import java.util.Calendar;

public class Person {
	
    private String name;
    private MyDate birthday;
    private MyDate currentDate = new MyDate(Calendar.getInstance().get(Calendar.DATE),
									Calendar.getInstance().get(Calendar.MONTH) + 1,  // January is 0 so we add one
									Calendar.getInstance().get(Calendar.YEAR));

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
    	this.name=name;
    	this.birthday = birthday;
    }
    
    public Person(String name) {
    	this.name = name;
    	this.birthday = currentDate;
    }

    public int age() {
        return birthday.differenceInYears(currentDate);
    }
    
    boolean olderThan(Person compared) {
    	return birthday.earlier(compared.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
}