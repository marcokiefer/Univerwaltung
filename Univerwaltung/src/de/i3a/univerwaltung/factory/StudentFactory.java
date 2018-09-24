package de.i3a.univerwaltung.factory;

import java.util.List;
import de.i3a.univerwaltung.model.Fach;
import de.i3a.univerwaltung.model.Notenuebersicht;
import de.i3a.univerwaltung.model.Student;

public class StudentFactory implements IFactory {

	private Student mStudent;

	public StudentFactory withMatriklnummer(String matrikelnummer) {
		build();
		this.mStudent.setMatrNr(matrikelnummer);
		return this;
	}
	public StudentFactory withFachliste(List<Fach> fachliste) {
		build();
		this.mStudent.setFachliste(fachliste);
		return this;
	}
	public StudentFactory withNotenuebersicht(Notenuebersicht notenuebersicht) {
		build();
		this.mStudent.setNotenuebersicht(notenuebersicht);
		return this;
	}
	
	@Override
	public Student build() {
		if (this.mStudent == null) {
			this.mStudent = new Student();
		}
		return null;
	}

}
