/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 1 - Task 2
 * Date:    January 17, 2020
 */

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int player = 0, flag = 1;
		do {
			System.out.print("scissors (0), rock (1), paper (2): ");
			player = sc.nextInt();
			
			if(!(player >= 0 && player <= 2))
				System.out.println("Invalid number.");
			else
				flag = 0;
		} while (flag == 1);
		
		int computer = ThreadLocalRandom.current().nextInt(0, 2 + 1);

		String itemPlayer = "";
		switch(player) {
		case 0:
			itemPlayer = "scissors";
			break;
		case 1:
			itemPlayer = "rock";
			break;
		case 2:
			itemPlayer = "paper";
			break;
		}
		
		String itemComputer = "";
		switch(computer) {
		case 0:
			itemComputer = "scissors";
			break;
		case 1:
			itemComputer = "rock";
			break;
		case 2:
			itemComputer = "paper";
			break;
		}
		
		if(player == computer)
			System.out.println("The computer is " + itemComputer + ". You are " + itemPlayer + " too. It is a draw.");
		else if(player == 0 && computer == 1 || player == 1 && computer == 2 || player == 2 && computer == 0)
			System.out.println("The computer is " + itemComputer + ". You are " + itemPlayer + ". You lost.");
		else if(player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1)
			System.out.println("The computer is " + itemComputer + ". You are " + itemPlayer + ". You won.");
	}
}
