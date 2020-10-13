/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 3
 * Date:    February 1, 2020
 */

import java.util.Scanner;

public class ComplexTester extends Complex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Complex first = new Complex();
		Complex second = new Complex();
		
		String[] tempFirst = {};
		
		boolean invalidFirst = true;
		while(invalidFirst == true) {
			try {
				System.out.print("Enter the first complex number: ");
				tempFirst = sc.nextLine().split(" ");
				
				if(tempFirst.length > 2) {
					throw new Exception("error");
				}
				
				double[] numbers = new double[tempFirst.length];
				
				for(int i = 0; i < tempFirst.length; i++) {
					numbers[i] = Double.parseDouble(tempFirst[i]);
				}
				
				first = new Complex(numbers[0], numbers[1]);
				
				invalidFirst = false;
			} catch (Exception e) {
				System.out.println("Invalid input. Please try again.");
				invalidFirst = true;
			}
		}
		
		String[] tempSecond = {};
		
		boolean invalidSecond = true;
		while(invalidSecond == true) {
			try {
				System.out.print("Enter the second complex number: ");
				
				tempSecond = sc.nextLine().split(" ");
				
				if(tempSecond.length > 2) {
					throw new Exception("error");
				}
				
				double[] numbersSecond = new double[tempSecond.length];
				
				for(int i = 0; i < tempSecond.length; i++) {
					numbersSecond[i] = Double.parseDouble(tempSecond[i]);
				}
				
				second = new Complex(numbersSecond[0], numbersSecond[1]);
				
				invalidSecond = false;
			} catch (Exception e) {
				System.out.println("Invalid input. Please try again.");
				invalidSecond = true;
			}
		}

		first.add(second);
		first.subtract(second);
		first.multiply(second);
		first.divide(second);
		first.absolute(second);
	}

}
