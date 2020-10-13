/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 2
 * Date:    January 25, 2020
 */

import java.util.*;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a credit card number as a long integer: ");
		long cardNumber = sc.nextLong();

		if(validateCard(cardNumber) == true) {
			System.out.println(cardNumber + " is valid");
		}
		else {
			System.out.println(cardNumber + " is invalid");
		}
	}
	
	
	private static boolean validateCard(long cardNumber) {
		if(isPrefix(cardNumber) == true) {
			int single = sumSingleDigits(cardNumber);
			int odd = sumOddDigits(cardNumber);
			System.out.println("single: " + single + " odd: " + odd);
			
			int sum = single + odd;
			
			if(sum % 10 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;			
		}
	}
	
	
	private static int sumSingleDigits(long cardNumber) {
		int[] numArray = convertNumArray(cardNumber);

		numArray = reverseArray(numArray, numArray.length);
		
		int sum = 0;
		
		for(int i = 1; i < numArray.length; i += 2) {
			sum += singleTwoDigits(numArray[i]);
		}
		
		return sum;
	}
	
	
	private static int[] convertNumArray(long cardNumber) {
		String num = Long.toString(cardNumber);
		int[] array = new int[num.length()];
		
		for(int i = 0; i < num.length(); i++) {
			array[i] = num.charAt(i) - '0';
		}
		
		return array;
	}
	
	
	private static int[] reverseArray (int array[], int size) {
		int[] temp = new int[size];
		
		int j = size;
		
		for(int i = 0; i < size; i++) {
			temp[j - 1] = array[i];
			j = j - 1;
		}
		
		return temp;
	}

	
	private static int singleTwoDigits(int num) {
		int number = num * 2;
		
		if(number < 10) {
			return number;
		}
		else {
			String temp = Integer.toString(number);
			int first = Character.getNumericValue(temp.charAt((0)));
			int second = Character.getNumericValue(temp.charAt((1)));
			int sum = first + second;
			return sum;
		}
	}
	
	
	private static int sumOddDigits(long cardNumber) {
		int[] numArray = convertNumArray(cardNumber);

		numArray = reverseArray(numArray, numArray.length);
		
		int sum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			if(((i + 1) % 2) != 0) {
				sum += numArray[i];
			}
		}
		
		return sum;
	}
	
	
	private static boolean isPrefix(long cardNumber) {
		int prefix = 0;
		
		int[] arr = convertNumArray(cardNumber);
		prefix = arr[0];
		
		if(arr[0] == 3 && arr[1] == 7) {
			prefix = 37;
		}
		
		if (prefix == 4 || prefix == 5 || prefix == 37 || prefix == 6) {
			return true;			
		}
		else {
			return false;			
		}
	}
	
	
	private static int getNumDigits(long cardNumber) {
		String temp = Long.toString(cardNumber);
		
		int num = temp.length();
		
		return num;
	}
	
}

