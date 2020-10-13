/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 1 - Task 2
 * Date:    January 17, 2020
 */

import java.util.*;

public class task1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = 0;
		do {
			System.out.print("Enter year: (e.g., 2012): ");
			year = sc.nextInt();
			
			if(!(year > 0))
				System.out.println("Please enter a valid year.");
			
		} while (!(year > 0));
		
		
		int month = 0;
		do {
			System.out.print("Enter month: 1-12: ");
			month = sc.nextInt();
			
			if(!((month >= 1) && (month <= 12)))
				System.out.println("Please enter a valid month.");
			
			if(month == 1) {
				month = 13;
				year -= 1;
			}
			else if(month == 2) {
				month = 14;
				year -= 1;
			}
			
		} while (!((month >= 3) && (month <= 14)));
		
		
		int day = 0;
		do {
			System.out.print("Enter the day of the month: 1-31: ");
			day = sc.nextInt();
			
			if(!((day >= 1) && (day <= 31)))
				System.out.println("Please enter a valid day.");
			
		} while (!((day >= 1) && (day <= 31)));
		
		
		int century = year / 100;       //j
		int yearOfCentury = year % 100; //k
		
		int dayOfWeek = (day + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
		
		String result = "";
		if(dayOfWeek == 1)
			result = "Sunday";
		else if(dayOfWeek == 2)
			result = "Monday";
		else if(dayOfWeek == 3)
			result = "Tuesday";
		else if(dayOfWeek == 4)
			result = "Wednesday";
		else if(dayOfWeek == 5)
			result = "Thursday";
		else if(dayOfWeek == 6)
			result = "Friday";
		else if(dayOfWeek == 0)
			result = "Saturday";
		
		System.out.println("Day of week is " + result);
	}
}

