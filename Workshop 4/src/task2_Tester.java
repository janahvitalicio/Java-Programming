/*
 * Name:    Janah Gabrielle Vitalicio
 * ID:      151245172
 * Email:   jgvitalicio@myseneca.ca
 * Purpose: JAC444 Workshop 4
 * Date:    February 8, 2020
 */

public class task2_Tester {

	public static void main(String[] args) {
		
		Person person = new Person("Dave Smith", "123 King St., Some City, ON, M4R 1S2", "416-123-6547", "pobject@email.com");
		Student student = new Student("Claire Crosby", "Senior");
		
		MyDate dateHired = new MyDate(2014, 07, 01);
		Employee employee = new Employee("Carson McKnight", 50000.00, "A1234", dateHired);
		
		Faculty faculty = new Faculty("Ashley Williams", "9:00AM - 5:00PM", "Professor");
		Staff staff = new Staff("June Miller", "CEO");
		
		System.out.println("---------------------------------------------------------");
		System.out.println("PERSON CLASS");
		System.out.println("---------------------------------------------------------");
		System.out.println(person.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("STUDENT CLASS");
		System.out.println("---------------------------------------------------------");
		System.out.println(student.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("EMPLOYEE CLASS");
		System.out.println("---------------------------------------------------------");
		System.out.println(employee.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("FACULTY CLASS");
		System.out.println("---------------------------------------------------------");
		System.out.println(faculty.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("STAFF CLASS");
		System.out.println("---------------------------------------------------------");
		System.out.println(staff.toString());
		System.out.println();
		System.out.println("---------------------------------------------------------");

	}

}
