/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 3
 * Date:    February 1, 2020
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] array = {};
		
		boolean invalid = true;
		while(invalid == true) {
			try {
				System.out.print("Enter a list of numbers (ex. 24 18 64 83): ");
				array = sc.nextLine().split(" ");
				
				int[] numArray = new int[array.length];

				for(int i = 0; i < array.length; i++) {
					numArray[i] = Integer.parseInt(array[i]);
				}
				
				System.out.println("Random number: " + getRandom(numArray));
				
				invalid = false;
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a list of numbers with a single space to separate them.");							
				invalid = true;
			}
		}
		
	}
	
	public static int getRandom(int[] nums) {
		// Generates a random number; java.lang.Object > java.util.Random > java.util.concurrent.ThreadLocalRandom
		int randomNum = ThreadLocalRandom.current().nextInt(0, nums.length);
		
		return nums[randomNum];
	}
}


