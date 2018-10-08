package de.i3a.univerwaltung.factory;

import de.i3a.univerwaltung.model.Adresse;

public class AdresseFactory implements IFactory {
	
	private Adresse mAdresse;
	
	public AdresseFactory withId(int id) {
		build();
		this.mAdresse.setId(id);
		return this;
	}
	
	public AdresseFactory withStrasse(String strasse) {
		build();
		this.mAdresse.setStrasse(strasse);
		return this;
	}
	
	public AdresseFactory withHausnummer(String hausnummer) {
		build();
		this.mAdresse.setHausnummer(hausnummer);
		return this;
	}
	
	public AdresseFactory withPlz(String plz) {
		build();
		this.mAdresse.setPlz(plz);
		return this;
	}
	
	public AdresseFactory withOrt(String ort) {
		build();
		this.mAdresse.setOrt(ort);
		return this;
	
	}
	
	@Override
	public Adresse build() {
		// TODO Auto-generated method stub
		if(this.mAdresse == null) {
			this.mAdresse = new Adresse();
		}
		return this.mAdresse;
	}

}
