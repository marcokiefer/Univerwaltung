package de.i3a.univerwaltung.database;

import java.util.HashMap;
import java.util.Map;

import de.i3a.univerwaltung.factory.PersonFactory;
import de.i3a.univerwaltung.factory.StudentFactory;
import de.i3a.univerwaltung.model.Person;
import de.i3a.univerwaltung.model.Student;

public class StudentTbl {
	
	private Map<String, Student> studenten = new HashMap<>();
	
	void init() {
		//PersonFactory personFactory = new PersonFactory();
		//Person person = personFactory.withName("Michi") .build();
		
		//StudentFactory studentFactory = new StudentFactory(person);
		//Student michi = studentFactory.withMatriklnummer("123452").build();
		
	}
	
	public Map getStudenten() {
		return studenten;
	}
}
