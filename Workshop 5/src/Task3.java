/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 5
 * Date:    February 15, 2020
 */

import java.util.Scanner;
import java.io.File;

public class Task3 {

	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		
		// Check if command line arguments are configured
		if(args.length != 1) {
			System.out.println("Usage: java Task3 filename");
			System.out.println("Arguments Length: " + args.length);
			System.exit(1);
		}
		
		// Check if file exists
		if(!file.exists()) {
			System.out.println("File does not exist.");
			System.exit(2);
		}
		
		try {
			Scanner input = new Scanner(file);
			
			String line = "";
			
			// Initialize variables
			int charCount = 0;
			int wordCount = 0;
			int lineCount = 0;
			
			while(input.hasNext()) {
				// Count lines
				lineCount++;
				
				// Store a line in a string and goes to the next line
				line = input.nextLine();
				
				// Count all characters of a line
				charCount += line.length();
				
				// Count all words of a line using split method
				String[] wordList = line.split(" ");
				wordCount += wordList.length;
			}
			
			// Display results
			System.out.println("Char Count: " + charCount);
			System.out.println("Word Count: " + wordCount);
			System.out.println("Line Count: " + lineCount);
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}

}
