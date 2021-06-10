package de.chaot.webApp.domain;

import lombok.Data;

/**
 * Domain model for a person.
 */
@Data
public class Person {

	private String firstName = "defaultValue";
	
	private String lastName = "defaultValue";
}
