package de.i3a.univerwaltung.factory;

import java.util.Date;

import de.i3a.univerwaltung.model.Adresse;
import de.i3a.univerwaltung.model.Person;

public class PersonFactory implements IFactory{
	
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
	public PersonFactory withID(int id) {
		build();
		this.mPerson.setID(id);
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
	public PersonFactory withDate(Date geburtsdatum) {
		build();
		this.mPerson.setGeburtsdatum(geburtsdatum);
		return this;
	}
	public PersonFactory withAdresse(Adresse adresse) {
		build();
		this.mPerson.setAdresse(adresse);
		return this;
	}
	
	@Override
	public Person build() {
		if(this.mPerson == null) {
			this.mPerson = new Person();
		}
		return this.mPerson;
	}
}

