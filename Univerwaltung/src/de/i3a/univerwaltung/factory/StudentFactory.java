package de.i3a.univerwaltung.factory;

import java.util.Date;
import java.util.List;

import de.i3a.univerwaltung.model.Adresse;
import de.i3a.univerwaltung.model.Fach;
import de.i3a.univerwaltung.model.Notenuebersicht;
import de.i3a.univerwaltung.model.Student;

public class StudentFactory implements IFactory {

	private Student mStudent;

	public StudentFactory withName(String name) {
		build();
		this.mStudent.setName(name);
		return this;
	}

	public StudentFactory withVorname(String vorname) {
		build();
		this.mStudent.setName(vorname);
		return this;
	}

	public StudentFactory withId(int id) {
		build();
		this.mStudent.setId(id);
		return this;
	}

	public StudentFactory withDate(Date gebDatum) {
		build();
		this.mStudent.setGebDatum(gebDatum);
		return this;
	}

	public StudentFactory withAdresse(Adresse adresse) {
		build();
		this.mStudent.setAdresse(adresse);
		return this;
	}

	public StudentFactory withTitel(String titel) {
		build();
		this.mStudent.setTitel(titel);
		return this;
	}

	public StudentFactory withGeschlecht(String geschlecht) {
		build();
		this.mStudent.setGeschlecht(geschlecht);
		return this;
	}

	public StudentFactory withMatrikelnummer(String matrikelnummer) {
		build();
		this.mStudent.setMatrikelnummer(matrikelnummer);
		return this;
	}

	public StudentFactory withFaecher(List<Fach> faecher) {
		build();
		this.mStudent.setFaecher(faecher);
		return this;
	}

	public StudentFactory withNotenuebersicht(Notenuebersicht notenuebersicht) {
		build();
		this.mStudent.setNotenuebersicht(notenuebersicht);
		return this;
	}

	@Override
	public Student build() {
		// TODO Auto-generated method stub
		if (this.mStudent == null) {
			this.mStudent = new Student();
		}

		return this.mStudent;
	}

}