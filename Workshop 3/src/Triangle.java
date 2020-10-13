/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 3
 * Date:    February 1, 2020
 */

import java.util.Scanner;


public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = this.getPerimeter() / 2;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
