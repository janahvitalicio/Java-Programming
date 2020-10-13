/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 3
 * Date:    February 1, 2020
 */

import java.util.Date;

public class GeometricObject extends Object{
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String newColor, boolean newFilled) {
		dateCreated = new Date();
		color = newColor;
		filled = newFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean newFilled) {
		filled = newFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "color is " + color + ", filled is " + filled +
				", created on " + dateCreated;
	}
	
}