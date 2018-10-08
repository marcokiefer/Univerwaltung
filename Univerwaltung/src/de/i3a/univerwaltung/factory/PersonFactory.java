package de.i3a.univerwaltung.factory;

import java.util.Date;
import de.i3a.univerwaltung.model.Adresse;
import de.i3a.univerwaltung.model.Person;

public class PersonFactory implements IFactory {

	private Person mPerson;

	public PersonFactory withName(String name) {
		build();
		this.mPerson.setName(name);
		return this;
	}

	public PersonFactory withVorname(String vorname) {
		build();
		this.mPerson.setName(vorname);
		return this;
	}

	public PersonFactory withId(int id) {
		build();
		this.mPerson.setId(id);
		return this;
	}

	public PersonFactory withGeburtsdatum(Date gebDatum) {
		build();
		this.mPerson.setGebDatum(gebDatum);
		return this;
	}

	public PersonFactory withAdresse(Adresse adresse) {
		build();
		this.mPerson.setAdresse(adresse);
		return this;
	}

	public PersonFactory withTitel(String titel) {
		build();
		this.mPerson.setTitel(titel);
		return this;
	}

	public PersonFactory withGeschlecht(String geschlecht) {
		build();
		this.mPerson.setGeschlecht(geschlecht);
		return this;
	}

	@Override
	public Person build() {
		// TODO Auto-generated method stub
		if (this.mPerson == null) {
			this.mPerson = new Person();
		}
		return this.mPerson;
	}
}
