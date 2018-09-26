package de.i3a.univerwaltung.factory;

import java.util.Date;
import java.util.List;

import de.i3a.univerwaltung.model.Adresse;
import de.i3a.univerwaltung.model.Dozent;
import de.i3a.univerwaltung.model.Fach;

public class DozentFactory implements IFactory{
	private Dozent mDozent;
	
	public DozentFactory withName(String name) {
		build();
		this.mDozent.setName(name);
		return this;
	}
	public DozentFactory withVorname(String vorname) {
		build();
		this.mDozent.setName(vorname);
		return this;
	}
	public DozentFactory withID(int id) {
		build();
		this.mDozent.setID(id);
		return this;
	}
	public DozentFactory withTitel(String titel) {
		build();
		this.mDozent.setTitel(titel);
		return this;
	}
	public DozentFactory withGeschlecht(String geschlecht) {
		build();
		this.mDozent.setGeschlecht(geschlecht);
		return this;
	}
	public DozentFactory withDate(Date geburtsdatum) {
		build();
		this.mDozent.setGeburtsdatum(geburtsdatum);
		return this;
	}
	public DozentFactory withAdresse(Adresse adresse) {
		build();
		this.mDozent.setAdresse(adresse);
		return this;
	}
	public DozentFactory withMitarbeiterNr(String mitarbeiterNr) {
		build();
		this.mDozent.setMitarbeiterNr(mitarbeiterNr);
		return this;
	}
	public DozentFactory withFachliste(List<Fach> fachliste) {
		build();
		this.mDozent.setFachliste(fachliste);
		return this;
	}
	public DozentFactory withGrad(String grad) {
		build();
		this.mDozent.setGrad(grad);
		return this;
	}
	
	@Override
	public Dozent build() {
		if (this.mDozent == null) {
			this.mDozent = new Dozent();
		}
		return null;
	}
}
