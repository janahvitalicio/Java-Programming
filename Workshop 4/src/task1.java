/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] randomNums = new int[100];
		randomNums[0] = 0;
		
		int[] used = new int[100];
		
		// Creates an array with 100 randomly chosen integers
		for(int i = 0; i < randomNums.length; i++) {
			boolean usedAlready = false;
			// Generates a number in the range of 5-500
			int temp = ThreadLocalRandom.current().nextInt(5, 500);

			// Checks used array to avoid duplication
			for(int j = 0; j < used.length; j++) {
				if(temp == used[j]) {
					usedAlready = true;
					break;
				}				
			}
			
			if(usedAlready == false) {
				randomNums[i] = temp;				
			}
			
		}
		
		try {
			System.out.print("Enter the index of the array (0-99): ");
			int input = sc.nextInt();
			
			if(!(input >= 0 && input <= 99)) {
				throw new Exception("Out of Bounds");
			}
			
			System.out.println("Index [" + input + "] value: " + randomNums[input]);
		}
		catch (Exception e) {
			System.out.println("Out of Bounds");
		}
		
	}

}
