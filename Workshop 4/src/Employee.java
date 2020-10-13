/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class Employee extends Person {
	
	protected String office;
	protected double salary;
	protected MyDate dateHired;
	
	public Employee(String n) {
		this(n, 0, "N/A", new MyDate());
	}
	
	public Employee(String n, double s, String o, MyDate d) {
        super(n);
        this.salary = s;
        this.office = o;
        this.dateHired = d;
    }
	
	public void setOffice(String o) {
		this.office = o;
	}
	
	public String getOffice() {
		return this.office;
	}
	
	public void setSalary(double s) {
		this.salary = s;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setDateHired(MyDate d) {
		this.dateHired = d;
	}
	
	public MyDate getDateHired() {
		return this.dateHired;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nClass: " + this.getClass().getName()
				+ "\nOffice: " + this.getOffice() + "\nSalary: " + this.getSalary()
				+ "\nDate Hired: " + this.getDateHired().toString(); 
	}
}
