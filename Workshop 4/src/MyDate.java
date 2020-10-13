/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	// Creates an object for the current date
	public MyDate() {
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	// Creates an object with a specified elapsed time
	public MyDate(long elapsedTime) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	// Creates an object with the specified year, month, and day
	public MyDate(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	// Sets a new date for the object using the elapsed time
	public void setDate(long elapsedTime) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public String toString() {
		String monthName = "";
		if(month < 1)
			monthName = "January";
		else if(month < 2) 
			monthName = "February";
		else if(month < 3)
			monthName = "March";
		else if(month < 4) 
			monthName = "April";
		else if(month < 5)
			monthName = "May";
		else if(month < 6)
			monthName = "June";
		else if(month < 7)
			monthName = "July";
		else if(month < 8)
			monthName = "August";
		else if(month < 9)
			monthName = "September";
		else if(month < 10)
			monthName = "October";
		else if(month < 11)
			monthName = "November";
		else if(month < 12)
			monthName = "December";
		
		return monthName + " " + day + ", " + year; 
	}

}
