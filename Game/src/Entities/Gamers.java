package Entities;

import java.time.LocalDate;

public class Gamers {
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private LocalDate dateOfBirth;
	private String nationalId;
	
	
	
	public Gamers(int id, String firstName, String lastName, String username, LocalDate dateOfBirth,
			String nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}



	public int getId() {
		return id;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getUsername() {
		return username;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public String getNationalId() {
		return nationalId;
	}
}
