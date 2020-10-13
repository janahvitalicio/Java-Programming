/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 1 - Task 2
 * Date:    January 17, 2020
 */

import java.util.*;
import java.text.DecimalFormat;

public class task2 {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double balance = sc.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = sc.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double interest = sc.nextDouble();
		
		double monthlyInterestRate = interest / 1200;
		double n = numberOfYears * 12;
		
		double monthlyPayment = monthlyInterestRate * balance / (1 - 1 / Math.pow(1 + monthlyInterestRate, n)); 
		
		System.out.println("Monthly Payment: " + df2.format(monthlyPayment));
		System.out.println("Total Payment: " + df2.format(monthlyPayment * n));
		
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + df2.format(interest) + "\t\t"
					+ df2.format(principal) + "\t\t" + df2.format(balance));
		}
	}
}
