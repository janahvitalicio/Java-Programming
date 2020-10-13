/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 3
 * Date:    February 1, 2020
 */

import java.util.Scanner;

public class TriangleTester extends Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] array = {};
		
		Triangle tr = new Triangle();
		
		boolean invalid = false;
		
		while(invalid == false) {
			try {
				System.out.print("Enter three sides of the triangle (ex. 18 30 24): ");
				array = sc.nextLine().split(" ");
				
				if(array.length > 3) {
					throw new Exception("error");
				}
				
				int[] threeSides = new int[3];

				for(int i = 0; i < 3; i++) {
					threeSides[i] = Integer.parseInt(array[i]);
				}
				
				double s1 = threeSides[0];
				double s2 = threeSides[1];
				double s3 = threeSides[2];
				
				tr = new Triangle(s1, s2, s3);
				
				invalid = true;
				
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter three sides of the triangle with a single space to separate them.");
				invalid = false;
			}
		}
		
		boolean invalidColor = false;
		while(invalidColor == false) {
			try {
				System.out.print("Enter a color: ");
				String input = sc.next();
				char[] inputArr = input.toCharArray();
				
				for(int i = 0; i < inputArr.length; i++) {
					if(!(inputArr[i] >= 'a' && inputArr[i] <= 'z')) {
						throw new Exception("error");
					}
				}
				
				invalidColor = true;
				
				tr.setColor(input);
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a color.");
				invalidColor = false;
			}
		}
		
		boolean invalidInput = false;
		while(invalidInput == false) {
			try {
				System.out.print("Enter 'T' (filled) or 'F' (not filled): ");
				char input = sc.next().charAt(0);
				
				input = Character.toUpperCase(input);
				
				if(!(input == 'T' || input == 'F')) {
					throw new Exception("error");
				}

				
				invalidInput = true;
				
				boolean isFilled = true;
				
				if(input == 'F') {
					isFilled = false;
				}
				
				tr.setFilled(isFilled);
				
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a 'T' or 'F'.");
				invalidInput = false;
			}
		}

		System.out.println("Triangle area: " + tr.getArea());
		System.out.println("Triangle perimeter: " + tr.getPerimeter());
		System.out.println("Triangle color: " + tr.getColor());
		System.out.print("Triangle is ");
		
		if(tr.isFilled()) {
			System.out.print("filled.");
		}
		else {
			System.out.println("not filled.");
		}
	}

}
