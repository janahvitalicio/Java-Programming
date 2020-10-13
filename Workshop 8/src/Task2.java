/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 8
 * Date:    April 2, 2020
 */

import java.io.File;
import java.util.*;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		
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
		
		
	    // Create a TreeMap to store words and its count
	    Map<String, Integer> wordMap = new TreeMap<>();
	    
	    String[] newWords = words.split("[ \\n\\v\\f\\t\\r\\\"\\'.,;:!?()]");
	    for (int i = 0; i < newWords.length; i++) {
	    	int count = 0;
	    	String word = newWords[i].toLowerCase();
	      
	    	if (word.length() > 0) {
	    		if(wordMap.containsKey(word)) {
	    			// Get value of the key (word) from the map (wordMap)
	    			count = wordMap.get(word);
	    			count++;
	    			// Put the key (word) and its value (count) in the map (wordMap)
	    			wordMap.put(word, count);
	    		}
	    		else {
	    			wordMap.put(word, 1);
	    		}
	      }
	    }

	    // Display word and its count for each element
	    for (Entry<String, Integer> pair : wordMap.entrySet()) {
	        System.out.println(pair.getKey() + "\t" +  pair.getValue());
	    }
	    
	}

}


