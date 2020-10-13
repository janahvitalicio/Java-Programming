/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class Staff extends Employee {
	
	protected String title;
	
	public Staff(String n) {
		this(n, "N/A");
	}
	
	public Staff(String n, String t) {
		super(n);
		this.title = t;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nClass: " + this.getClass().getName()
				+ "\nTitle: " + this.getTitle(); 
	}
	
}
