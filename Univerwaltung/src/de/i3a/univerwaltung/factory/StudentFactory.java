package de.i3a.univerwaltung.factory;

import de.i3a.univerwaltung.model.Student;

public class StudentFactory implements IFactory {

	private Student mStudent;

	public StudentFactory withMatriklnummer(String matrikelnummer) {
		build();
		this.mStudent.setName(matrikelnummer);
		return this;
	}

	@Override
	public Object build() {
		if (this.mStudent == null) {
			this.mStudent = new Student();
		}
		return null;
	}

}
