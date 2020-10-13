/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class task3 {
	
    public static void main(String[] args) {
    
        for (int i = 1; i <= 8; i++) { 
        	// Prints spaces for triangle formation
        	int numSpaces = 32 - i * 4;
            for (int j = 0; j < numSpaces; j++) {
            	System.out.print(" ");            	
            }
            
            // First half of the pyramid
            for (int k = 0; k < i; k++) {
                int num = (int)Math.pow(2, k);
                printAlignment(num);
                System.out.print(num);
            }
            
			// Second half of the pyramid
			for (int l = i - 2; l >= 0; l--) {
				int num = (int)Math.pow(2, l);
			    printAlignment(num);
			    System.out.print(num);
			}
			
			System.out.print("\n");
        }

    }
    
    public static void printAlignment(int num) {
    	// Prints spaces for padding the numbers
        if(num > 99) {
        	System.out.print(" ");
        }
        else if(num > 9) {
        	System.out.print("  ");
        }
        else {
        	System.out.print("   ");
        }
    }

}
