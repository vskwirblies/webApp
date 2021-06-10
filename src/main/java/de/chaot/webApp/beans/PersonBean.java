package de.chaot.webApp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.chaot.webApp.domain.Person;
import lombok.Data;

/**
 * A simple bean.
 * @author valentin
 *
 */
@Named
@SessionScoped
@Data
public class PersonBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6726724510294936543L;
	
	private List<Person> persons;
	
	@PostConstruct
    public void init() {
		this.persons = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setFirstName("Hugo");
		p1.setLastName("Müller");

		Person p2 = new Person();
		p2.setFirstName("Sven");
		p2.setLastName("Meyer");
		
		this.persons.add(p1);
		this.persons.add(p2);
    }

}
