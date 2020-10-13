/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 3
 * Date:    February 1, 2020
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	private static DecimalFormat df1 = new DecimalFormat("#.#");
	private static DecimalFormat df4 = new DecimalFormat("#.####");
	
	public Complex() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public Complex(double rp) {
		this.realPart = rp;
		this.imaginaryPart = 0;
	}
	
	public Complex(double rp, double ip) {
		this.realPart = rp;
		this.imaginaryPart = ip;
	}
	
	public double getRealPart() {
		return realPart;
	}
	
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public void add(Complex other) {
		double realSum = this.getRealPart() + other.getRealPart();
		
		double imaginarySum = this.getImaginaryPart() + other.getImaginaryPart();
		
		System.out.println("(" + this.getRealPart() + " + " + this.getImaginaryPart() + ") + ("
				+ other.getRealPart() + " + " + other.getImaginaryPart() + "i) = "
				+ realSum + " + " + imaginarySum + "i");
	}
	
	public void subtract(Complex other) {
		double realDiff = this.getRealPart() - other.getRealPart();
		
		double imaginaryDiff = this.getImaginaryPart() - other.getImaginaryPart();
		
		System.out.println("(" + this.getRealPart() + " + " + this.getImaginaryPart() + ") - ("
				+ other.getRealPart() + " + " + other.getImaginaryPart() + "i) = "
				+ realDiff + " + " + imaginaryDiff + "i");
	}
	
	public void multiply(Complex other) {
		double realProd = this.getRealPart() * other.getRealPart() - this.getImaginaryPart() * other.getImaginaryPart();
		
		double imaginaryProd = this.getImaginaryPart() * other.getRealPart() + this.getRealPart() * other.getImaginaryPart();
		
		System.out.println("(" + this.getRealPart() + " + " + this.getImaginaryPart() + ") * ("
				+ other.getRealPart() + " + " + other.getImaginaryPart() + "i) = "
				+ realProd + " + " + imaginaryProd + "i");
	}
	
	public void divide(Complex other) {
		double power = Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2);
		
		double realProd = (this.getRealPart() * other.getRealPart() + this.getImaginaryPart() * other.getImaginaryPart()) / power;
		
		double imaginaryProd = (this.getImaginaryPart() * other.getRealPart() - this.getRealPart() * other.getImaginaryPart()) / power;
		
		System.out.println("(" + this.getRealPart() + " + " + this.getImaginaryPart() + ") / ("
				+ other.getRealPart() + " + " + other.getImaginaryPart() + "i) = "
				+ df4.format(realProd) + " + " + df1.format(imaginaryProd) + "i");
	}
	
	public void absolute(Complex other) {
		double absolute = Math.sqrt(Math.pow(this.getRealPart(), 2) + Math.pow(this.getImaginaryPart(), 2));
		
		System.out.println("|(" + this.getRealPart() + " + " + this.getImaginaryPart() + "i)| = " + absolute);
	}
}
