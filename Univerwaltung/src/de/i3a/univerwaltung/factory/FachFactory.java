package de.i3a.univerwaltung.factory;

import de.i3a.univerwaltung.model.Fach;

public class FachFactory implements IFactory{
	private Fach mFach;
	
	public FachFactory withID(int id) {
		build();
		this.mFach.setId(id);
		return this;
	}
	public FachFactory withBezeichnung(String bezeichnung) {
		build();
		this.mFach.setBezeichnung(bezeichnung);
		return this;
	}

	@Override
	public Fach build() {
		if(this.mFach == null) {
			this.mFach = new Fach();
		}
		return this.mFach;
	}

	
}
