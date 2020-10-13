/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class Person {
	
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	public Person(String n) {
		this.name = n;
	}
	
	public Person(String n, String a, String p, String e) {
		this.name = n;
		this.address = a;
		this.phone = p;
		this.email = e;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setPhone(String p) {
		this.phone = p;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nClass: " + this.getClass().getName()
				+ "\nAddress: " + this.getAddress() + "\nPhone: " + this.getPhone()
				+ "\nEmail: " + this.getEmail(); 
	}

}
