/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 2
 * Date:    January 25, 2020
 */

import java.util.*;
import java.text.DecimalFormat;

public class task2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		df.setGroupingUsed(false);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		String size = sc.nextLine();
		
		String[] temp = size.split(" ");
		int[] arr = new int[temp.length];
		
		int rowSize = 0;
		int columnSize = 0;
		for(int i = 0; i < temp.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		rowSize = arr[0];
		columnSize = arr[1];
		
		double[][] array2D = new double[rowSize][columnSize];
		String[] tempArray = {};
		
		System.out.println("Enter the array: ");
		
		String[] tokens = {};
		for(int i = 0; i < rowSize; i++) {
			tokens = sc.nextLine().split(" ");
			for(int j = 0; j < columnSize; j++) {
				array2D[i][j] = Double.parseDouble(tokens[j]);
			}
		}
		
		Location largest = locateLargest(array2D);
		
		System.out.println("The location of the largest element is " + df.format(largest.maxValue) +
				" at (" + df.format(largest.row) + ", " + df.format(largest.column) + ")");
	}
	

	public static class Location {
		public double row;
		public double column;
		public double maxValue;
		
		public Location(double row, double column, double maxValue) {
			this.row = row;
			this.column = column;
			this.maxValue = maxValue;
		}
	}
	
	
	public static Location locateLargest(double[][] a) {
		Location largest = new Location(0, 0, 0);
		
		for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            if (a[i][j] > largest.maxValue) { 
	            	largest.maxValue = a[i][j]; 
	                largest.row = i;
	                largest.column = j;
	            }
	        }
	    }
		
		return largest;
	}

}
