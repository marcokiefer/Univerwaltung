package de.i3a.univerwaltung.factory;

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
	
	
	
	
	
	@Override
	public Person build() {
		// TODO Auto-generated method stub
		if(this.mPerson == null) {
			this.mPerson = new Person();
		}
		return this.mPerson;
	}
}

