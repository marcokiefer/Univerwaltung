package de.i3a.univerwaltung.factory;

import de.i3a.univerwaltung.model.Fach;

public class FachFactory implements IFactory {

	private Fach mFach;

	public FachFactory withId(int id) {
		this.mFach.setId(id);
		return this;
	}
	
	public FachFactory withBezeichnung(String bezeichnung) {
		this.mFach.setBezeichnung(bezeichnung);
		return this;
	}
	
	@Override
	public Fach build() {
		// TODO Auto-generated method stub
		if (this.mFach == null) {
			this.mFach = new Fach();

		}
		return this.mFach;
	}

}
