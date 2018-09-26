package de.i3a.univerwaltung.controller;

import java.util.List;

import de.i3a.univerwaltung.model.Student;

public interface IStudentPersistenceController {
	
	Student selectById(int id);
	
	Student selectByMatrikelnummer(String matrikelnummer);
	
	List<Student> selectByNameVorname(String name, String vorname);

}
