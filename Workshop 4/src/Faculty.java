/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class Faculty extends Employee {
	
	public static String INSTRUCTOR = "Instructor";
    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static String PROFESSOR = "Professor";
	
	protected String officeHours;
	protected String rank;
	
	public Faculty(String n) {
		this(n, "9:00AM - 5:00PM", "Faculty Employee");
	}
	
	public Faculty(String n, String o, String r) {
		super(n);
		this.officeHours = o;
		this.rank = r;
	}
	
	public void setOfficeHours(String o) {
		this.officeHours = o;
	}
	
	public String getOfficeHours() {
		return this.officeHours;
	}
	
	public void setRank(String r) {
		this.rank = r;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nClass: " + this.getClass().getName()
				+ "\nOffice Hours: " + this.getOfficeHours() + "\nRank: " + this.getRank(); 
	}
}
