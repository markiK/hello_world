import java.util.Date;

public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;

	public Employee(String fN, String lN, Date dateOfBirth, Date dateOfHire) {
		firstName = fN;
		lastName = lN;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
	}

	public String toString() {
		return "Name of employee: " + firstName + ", "
				+ "Surname of employee: " + lastName + ", " + "Date of birth: "
				+ birthDate + ", " + "Date of hire: " + hireDate + ". ";
	}
}
