package de.i3a.univerwaltung.database;

import de.i3a.univerwaltung.model.Student;
import java.util.List;

public interface IStudentPersistenzController {

	Student selectById(int id);

	Student selectByMatrikelnummer(String matrikelnummer);

	List<Student> selectByNameVorname(String name, String vorname);

}
