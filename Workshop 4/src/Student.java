/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class Student extends Person {
	
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	
	private String status;
	
	public Student(String n) {
		super(n);
	}
	
	public Student(String n, String s) {
		super(n);
		this.status = s;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setStatus(String s) {
		this.status = s;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nClass: " + this.getClass().getName()
				+ "\nStatus: " + this.getStatus(); 
	}
	
}
