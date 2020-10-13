/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 9
 * Date:    April 6, 2020
 */

import java.util.*;

public class Task3 {
	// Global variable hash set to be manipulated by two tasks (T1 and T2)
	public static Set<Integer> hashSet = new HashSet<>();

	public static void main(String[] args) {
		// Creates two threads
		Thread thread1 = new Thread(new T1());
		Thread thread2 = new Thread(new T2());
		
		// Starts threads
		thread1.start();
		thread2.start();
	}
	
	// Creates hash set filled with numbers
	static class T1 implements Runnable {
		@Override
		public void run() {
			for(int i = 0; i < 5000000; i++) {
				// Adds a new number to the set every second
				hashSet.add(i);					
			}
		}
	}
	
	// Obtains an iterator for the set
	static class T2 implements Runnable {
		@Override
		public void run() {
			try {
				// Traverses the set back and forth through the
				// iterator every second
				while(true) {
					Iterator<Integer> iterator = hashSet.iterator();
					while(iterator.hasNext()) {
						iterator.next();
					}
				}
			} catch (Exception e) {
				// Displays expected ConcurrentModificationException
				System.out.println(e);
			}
			
		}
	}

}
