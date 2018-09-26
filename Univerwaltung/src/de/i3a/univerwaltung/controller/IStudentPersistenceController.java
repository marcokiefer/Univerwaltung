package de.i3a.univerwaltung.controller;

import de.i3a.univerwaltung.model.Student;

public interface IStudentPersistenceController {
	
	Student selectById(int id);
	
	Student selectByMatrikelnummer(String matrikelnummer);
	
	Student selectByNameVorname(String name, String vorname);

}
