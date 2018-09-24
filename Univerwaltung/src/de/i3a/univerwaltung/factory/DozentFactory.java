package de.i3a.univerwaltung.factory;

import java.util.List;

import de.i3a.univerwaltung.model.Dozent;
import de.i3a.univerwaltung.model.Fach;

public class DozentFactory extends PersonFactory implements IFactory{

	private Dozent mDozent;
	
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
