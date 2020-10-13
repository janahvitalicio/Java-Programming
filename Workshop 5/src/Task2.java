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
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		
		// Check if command line arguments are configured
		if(args.length != 1) {
			System.out.println("Usage: java Task2 Test.java");
			System.out.println("Arguments Length: " + args.length);
			System.exit(1);
		}
		
		// Check if file exists
		if(!file.exists()) {
			System.out.println("File does not exist.");
			System.exit(2);
		}
		
		
		try {
			// Stores data file
			ArrayList<String> tempArrayList = new ArrayList<>();
			
			// Temporary string variables for manipulating the data
			String s1 = "";
			String s2 = "";
			
			// Read data from the file
			try ( Scanner input = new Scanner(file); ) {
				// Convert the Java source code from the next-line brace style to
				// the end-of-line brace style
				s1 = input.nextLine();
				while (input.hasNext()) {
					s2 = input.nextLine();
					// If the ending of the current string/line is not {,
					// then add it to the tempArrayList
					if(!(s2.charAt(s2.length() - 1) == '{')) {
						tempArrayList.add(s1);
						s1 = s2;
					}
					// Otherwise concatenate a space and a brace at the end of the current string
					else {
						String temp = s1 + " {";
						tempArrayList.add(temp);
						s1 = input.nextLine();
					}
				}
				tempArrayList.add(s1);
			}
			
			// Write the tempArrayList to the file
			try ( PrintWriter output = new PrintWriter(file); ) {
				// Traverse through the tempArrayList and write every element (string) to the file
				for (int i = 0; i < tempArrayList.size(); i++) {
					output.println(tempArrayList.get(i));
				}
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		
	}
}
