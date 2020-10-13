/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 8
 * Date:    April 2, 2020
 */

import java.util.*;
import java.io.*;

public class Task1 {
	public static void main(String[] args) throws Exception {
		// Create a hash set
	    Set<String> vowelSet = new HashSet<>();

	    // Add vowels to the set
	    vowelSet.add("A");
	    vowelSet.add("E");
	    vowelSet.add("I");
	    vowelSet.add("O");
	    vowelSet.add("U");
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter a text file name: ");
	    File file = new File(sc.next());
	    
	    // Check if file exists
 		if(!file.exists()) {
 			System.out.println("File does not exist.");
 			System.exit(1);
 		}
 		
 		Scanner input = new Scanner(file);
 		String words = "";
		
		while(input.hasNext()) {
			words += input.nextLine();
		}
		
		// Remove non-alphabetical characters
		String newWords = words.replaceAll("[^a-zA-Z]", "");
		char[] wordsArr = newWords.toCharArray();
		
		// Counters
		int vowelsCount = 0;
		int consonantsCount = 0;
		// For checking consonants
		boolean isConsonant = false;
		
		// Iterate through the characters
		for(int i = 0; i < wordsArr.length; i++) {
			// Compare each character to each vowel in the set and add to the counters
			for(String v: vowelSet) {
				String s = Character.toString(wordsArr[i]);
				isConsonant = false;
				if(s.equalsIgnoreCase(v)) {
					vowelsCount++;
					break;
				}
				else if(!s.equalsIgnoreCase(v)){
					isConsonant = true;
				}
			}		
			if(isConsonant == true) {
				consonantsCount++;
			}
		}
		
		// Display results
		System.out.println("Vowels Count: " + vowelsCount);
		System.out.println("Consonants Count: " + consonantsCount);
	}
	
}
