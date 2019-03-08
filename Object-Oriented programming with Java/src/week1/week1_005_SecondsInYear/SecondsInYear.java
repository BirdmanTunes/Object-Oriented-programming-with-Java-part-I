package week1_005_SecondsInYear;

public class SecondsInYear
{

	public static void main(String[] args)
	{
		int daysInYear = 365;
		int hoursInDays = 24;
		int minutesInHour = 60;
		int secondsInMinute = 60;
		
		int secondsInYear = daysInYear * hoursInDays * minutesInHour * secondsInMinute;
		
		System.out.println("There are " + secondsInYear + " seconds in a year");

	}

}
