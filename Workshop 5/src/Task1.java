/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 5
 * Date:    February 15, 2020
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Task1 {
	
	public static void main (String[] args) throws Exception {
		File sourceFile = new File(args[1]);
		File destinationFile = new File(args[2]);
		
		// Check if command line arguments are configured
		if(args.length != 3) {
			System.out.println("Usage: java Task1 John filename");
			System.out.println("Arguments Length: " + args.length);
			System.exit(1);
		}
		
		// Check if file exists
		if(!sourceFile.exists()) {
			System.out.println("File does not exist.");
			System.exit(2);
		}
		
		try {
			Scanner input = new Scanner(sourceFile);

			String line = "";
			
			while(input.hasNext()) {
				line += input.nextLine();
			}
			
			// Displays original data from original file
			System.out.println(padRight("Original: ", 10) + line);
			
			// Replaces all "John" string with ""
			line = line.replaceAll(args[0], "");
			
			PrintWriter output = new PrintWriter(destinationFile);
			output.write(line);
			output.close();
			
			// Displays results from the destination file
			Scanner sc = new Scanner(destinationFile); 
			
			System.out.print(padRight("Result: ", 10));
		    while (sc.hasNextLine()) {
		    	System.out.println(sc.nextLine()); 		    	
		    }
		
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
 
	}
	
	public static String padRight(String s, int n) {
	     return String.format("%-" + n + "s", s);  
	}
}
