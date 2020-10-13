/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 2
 * Date:    January 25, 2020
 */

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Bank of words
		String[] words = {"write", "that", "program", "apple", "computer", "java", "programming"};
		
		//Continue game
		boolean continueGame = true;
		
		while(continueGame == true) {
			//Generates random number
			int randomNum = ThreadLocalRandom.current().nextInt(0, 6 + 1);
			
			boolean endgame = false;
			boolean playerWon = false;
			
			int misses = 0;
			
			String word = words[randomNum];
			//Convert the word to char array for traversing
			char[] wordChar = word.toCharArray();
			
			//Convert the word to char array, for manipulation
			char[] hiddenWord = word.toCharArray();
			
			//Hide the word using asterisks
			for(int i = 0; i < word.length(); i++) {
				hiddenWord[i] = '*';
			}
			
			while(endgame == false) {
				//Validated whether the input is valid
				boolean validLetter = false;
				char guess = '\0';
				
				//Ask user for their guess (1 character only)
				while(validLetter == false) {
					System.out.print("(Guess) Enter a letter in word ");
					for(int i = 0; i < word.length(); i++) {
						System.out.print(hiddenWord[i]);
					}
					System.out.print(" > ");

					guess = sc.next().charAt(0);
					guess = Character.toLowerCase(guess);
					
					if(guess >= 'a' && guess <= 'z') {
						validLetter = true;
					}
					else {
						System.out.println("Invalid input. Please enter a letter.");
					}
				}

				boolean miss = false;
				boolean correct = false;
				boolean guessedAlready = false;
				
				for(int i = 0; i < word.length(); i++) {
					if(guess == hiddenWord[i]) {
						guessedAlready = true;
						i = word.length();
					}
					else if (guess == wordChar[i]) {
						hiddenWord[i] = guess;
						correct = true;
					}
					else {
						miss = true;
					}
				}
				
				if(miss == true && correct == false && guessedAlready == false) {
					System.out.println(guess + " is not in the word. Try again.");
					misses++;
				}
				else if(guessedAlready == true) {
					System.out.println(guess + " is already in the word!");
				}
				
				for(int i = 0; i < word.length(); i++) {
					if(hiddenWord[i] != '*') {
						endgame = true;
						playerWon = true;
					}
					else {
						endgame = false;
						i = word.length();
					}
				}
				
			} //end of while loop
			
			if(playerWon == true) {
				System.out.println("The word is " + word + ". You missed " + misses + " time(s).");
				System.out.print("Do you want to guess another word? Enter y or n > ");
				char playAgain = sc.next().charAt(0);
				playAgain = Character.toLowerCase(playAgain);
				if(playAgain == 'n') {
					continueGame = false;
					System.out.println("Thanks for playing!");
				}
			}
			
		} //end of continueGame while loop
		
	}

}
