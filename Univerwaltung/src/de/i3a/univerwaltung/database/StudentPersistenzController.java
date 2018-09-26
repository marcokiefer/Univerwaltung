package de.i3a.univerwaltung.database;

import java.util.ArrayList;
import java.util.List;

import de.i3a.univerwaltung.controller.IStudentPersistenceController;
import de.i3a.univerwaltung.model.Student;

public class StudentPersistenzController implements IStudentPersistenceController{

	private DummyDb database;
	private List<Student> students;
	
	public StudentPersistenzController() {
		database = new DummyDb();
		database.init();
		this.students = database.getStudenten();
	}
	
	@Override
	public Student selectById(int id) {
		for (Student s : this.students) {
			if(s.getID() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public Student selectByMatrikelnummer(String matrikelnummer) {
		for (Student s : this.students) {
			if(s.getMatrNr() == matrikelnummer) {
				return s;
			}
		}
		return null;
	}

	@Override
	public List<Student> selectByNameVorname(String name, String vorname) {
		List<Student> result = new ArrayList<>();
		for (Student s : this.students) {
			if(s.getName().equals(name) && s.getVorname().equals(vorname)) {
				result.add(s);
			}
		}
		return result;
	}



}
