package de.i3a.univerwaltung.database;

import java.util.HashMap;
import java.util.Map;

import de.i3a.univerwaltung.factory.StudentFactory;
import de.i3a.univerwaltung.model.Student;



public class StudentTbl {

	private Map<String, Student> studenten = new HashMap<>();
	
	void init() {
		StudentFactory factory = new StudentFactory();
		Student stud1 = (Student) factory.withMatriklnummer("1234523").withName("Müller").build();
		
		this.studenten.put(stud1.getMatrNr(), stud1);
		
		// this.studenten.put(stud1.getMatrNr(), stud2);
		// this.studenten.put(stud1.getMatrNr(), stud3);
		// this.studenten.put(stud1.getMatrNr(), stud4);
		// this.studenten.put(stud1.getMatrNr(), stud5);
		
	}
	
	public Map getStudenten() {
		return studenten;
	}
	

}
