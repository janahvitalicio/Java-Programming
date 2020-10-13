/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 9
 * Date:    April 6, 2020
 */

import java.util.*;

public class Task4 {
	
	// Creates a synchronized set
	public static Set<Integer> hashSet = Collections.synchronizedSet(new HashSet<>());

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
					// Puts the set iterator inside a synchronized statement
					// to lock the synchronized set
					synchronized(hashSet) {
						Iterator<Integer> iterator = hashSet.iterator();
						while(iterator.hasNext()) {
							iterator.next();
						}
					}
					// Displays size to see if the synchronization works properly
					System.out.println(hashSet.size()); 
					// Puts the threads to sleep to slow down the output
					Thread.sleep(500); 
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}

}
