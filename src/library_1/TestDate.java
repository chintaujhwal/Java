package library_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class TestDate {
	public static void main(String args[])
	{
		Calendar cal = Calendar.getInstance();
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		System.out.printf("%d-%d-%d\n",day,month,year);
		
		LocalDate today = LocalDate.now();
		LocalDate start = LocalDate.of(2020,1,1);
		
		long days = ChronoUnit.DAYS.between(start,today);
		System.out.println("days between " + start + " and " + today + " --> " + days);
	}

}
