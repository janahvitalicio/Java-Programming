/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class task4 {

	public static void main(String[] args) {
		final int SIZE = 9;
		
		// Title
		System.out.println("          Multiplication Table");
		
		// Header
        System.out.format("      ");
        for(int i = 1; i <= SIZE; i++ ) {
        	System.out.print(i + "   ");
        }
        System.out.println("\n------------------------------------------");
        
        // Nested for loop: For every run of the outer loop, the index of the inner
        //                  loop is multiplied by the index of the outer loop and is
        //                  printed for (SIZE) times.
        for(int i = 1; i <= SIZE; i++) {
        	System.out.print(i + " |");
            for(int j = 1; j <= SIZE; j++) {
            	// Prints out number with padding
                System.out.format("%4d", i * j);
            }
            
            System.out.print("\n");
        }

	}
}
