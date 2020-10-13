/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 9
 * Date:    April 6, 2020
 */

import java.util.concurrent.*;

public class Task2 {
	// Integer wrapper object to hold sum
	private static Integer sum = 0;
	
	public static void main(String[] args) {
		// Creates a thread pool of 1000 running threads
		ExecutorService exec = Executors.newFixedThreadPool(1000);
		
		// Creates 1000 threads
		for(int i = 0; i < 1000; i++) {
			exec.execute(new Runnable() {
				// Adds 1 to sum
				public void run() {
					sum++;
				}
			});
			
		}
		
		// Shuts down executor to stop threads from running
		exec.shutdown();
		
		// Output results
		System.out.println("Sum = " + sum);
	}
	
}
