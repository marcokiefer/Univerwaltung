package de.i3a.univerwaltung.database;

import de.i3a.univerwaltung.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentPersistenzController implements IStudentPersistenzController {

	private DummyDb database;
	private List<Student> studenten;

	public StudentPersistenzController() {
		database = new DummyDb();
		database.init();
		this.studenten = database.getStudenten();
	}

	@Override
	public Student selectById(int id) {
		for (Student s : this.studenten) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;

	}

	@Override
	public Student selectByMatrikelnummer(String matrikelnummer) {
		for (Student s : studenten) {
			if (s.getMatrikelnummer() == matrikelnummer) {
				return s;
			}
		}
		return null;
	}

	@Override
	public List<Student> selectByNameVorname(String name, String vorname) {
		List<Student> result = new ArrayList<>();
		for (Student s : studenten) {
			if (s.getName().equals(name) && s.getVorname().equals(vorname)) {
				result.add(s);
			}
		}
		return result;

	}

}
