package main.java.dal.users.employees;

import javax.persistence.Entity;

@Entity
public class Admin extends Employee {

	public Admin(String firstName, String middleName, String lastName, String username, String password,
			Integer phoneNumber, String email, String employeeID) {
		super(firstName, middleName, lastName, username, password, phoneNumber, email, employeeID);
		// TODO Auto-generated constructor stub
	}

}