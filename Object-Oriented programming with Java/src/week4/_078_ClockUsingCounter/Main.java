package week4._078_ClockUsingCounter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(sc.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(sc.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            Thread.sleep(1000);
            seconds.next();
            	if (seconds.getValue() == 0) {
            		minutes.next();
            		if (minutes.getValue() == 0) {
            			hours.next();
            		}
            	}
            i++;
        }
	}

}
